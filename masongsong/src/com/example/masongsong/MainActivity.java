package com.example.masongsong;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	String keyString = "dangdang";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(getApplicationContext(), "天门吴彦祖", 0).show();

		try {
			// 测试拿输入流读取文件
			// InputStream in = getAssets().open("classes.dex");
			// InputStreamReader isInputStreamReader = new
			// InputStreamReader(in);
			// BufferedReader br = new BufferedReader(isInputStreamReader);
			// StringBuilder sBuilder = null;
			// String str = br.readLine();
			// Toast.makeText(getApplicationContext(), str, 0).show();
			//
			// 拿到输入流
			InputStream is = getAssets().open("tangsilian.jar");
			// 拿到輸出流
			FileOutputStream fileOutputStream = new FileOutputStream(
					bulidfile());
			// 创建byte数组将文件中的数据读到byte数组中
			byte[] byte1 = new byte[is.available()];
			is.read(byte1);
			fileOutputStream.write(encrypt(byte1, keyString));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public File bulidfile() throws IOException {
		File file = new File("/mnt/sdcard/abc/wuhahah.data.data");
		if (!file.exists()) {
			file.createNewFile();
		}
		return file;
	}

	/**
	 * Description 根据键值进行加密
	 * 
	 * @param data
	 * @param key
	 *            加密键byte数组
	 * @return
	 * @throws Exception
	 */
	private static byte[] encrypt(byte[] data, String key) throws Exception {
		// 生成一个可信任的随机数源
		SecureRandom sr = new SecureRandom();

		// 从原始密钥数据创建DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key.getBytes());

		// 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(dks);

		// Cipher对象实际完成加密操作
		Cipher cipher = Cipher.getInstance("DES");

		// 用密钥初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

		return cipher.doFinal(data);
	}
}
