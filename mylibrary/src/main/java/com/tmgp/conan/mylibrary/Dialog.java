package com.tmgp.conan.mylibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Dialog
{
	public static void dialog(Context context, String title, String content, String oneButton, String twoButton, final ifOnclick it)
	{
		AlertDialog.Builder ad = new AlertDialog.Builder(context);
		ad.setTitle(title);
		ad.setMessage(content);
		ad.setPositiveButton(oneButton, new DialogInterface.OnClickListener()
			{
				@Override
				public void onClick(DialogInterface p1, int p2)
				{
					// TODO: Implement this method
					it.oneButtonClick(p1, p2);
				}
			});
		ad.setNegativeButton(twoButton, new DialogInterface.OnClickListener()
			{
				@Override
				public void onClick(DialogInterface p1, int p2)
				{
					// TODO: Implement this method
					it.twoButtonClick(p1, p2);
				}
			});
		ad.show();
	}

	public interface ifOnclick
	{
		void oneButtonClick(DialogInterface DialogInterface对象, int 不知道这参数有啥用);
		void twoButtonClick(DialogInterface DialogInterface对象, int 不知道这参数有啥用);
	}

}
