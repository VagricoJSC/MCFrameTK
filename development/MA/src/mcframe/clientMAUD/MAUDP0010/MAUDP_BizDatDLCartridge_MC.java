package mcframe.clientMAUD.MAUDP0010;

import java.io.File;

import javax.swing.SwingUtilities;

import mcframe.clientCore.beans.MCMessageBox;
import mcframe.clientCore.report.MCClientReportCartridge;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.container.*;

public class MAUDP_BizDatDLCartridge_MC extends MCClientReportCartridge {
	@Override
	public File downLoadFile(MCReportInfoR infoRow, String filePath) {
		String dir = getDLFileDir(infoRow, filePath);
		String name = getDLFileName(infoRow, filePath);
		infoRow.data_file_name(name);
		try {
			return super.downLoadFile(infoRow, dir);
		}
		catch (MCException e) {
			throw new MCAppException(MAUDP0405, dir);
		}
	}

	/**
	 * ダウンロードにおけるディレクトリを取得します。
	 */
	protected String getDLFileDir(MCReportInfoR infoRow, String filePath) {
		return new File(infoRow.save_file_name()).getParent();
	}

	/**
	 * ダウンロードにおけるファイル名を取得します。
	 */
	protected String getDLFileName(MCReportInfoR infoRow, String filePath) {
		String ret = null;
		MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
				MAUDC_BizDatDLEnv.getDownDLInfo(infoRow.option());
		String dir = getDLFileDir(infoRow, filePath);
		String name = new File(infoRow.save_file_name()).getName();
		ret = name;
		if (!dlInfo.overWrite() && new File(dir, name).exists()) {
			String ext = FileInfo.getExt(name);
			for (int i = 1; ; i++) {
				ret = name.replaceAll(ext + "$", " (" + i + ")" + ext);
				if (!new File(dir, ret).exists()) {
					break;
				}
			}
		}
		infoRow.save_file_name(new File(dir, ret).getPath());
		return ret;
	}

	@Override
	public MCBinary writeDataFile(MCReportSet reportSet, String... option) {
		return null;
	}

	@Override
	public void print(String path, String file,
			String reportId, String version, String printer,
			String language, boolean preview, String... option) {
		print(null, null, null, null, false);
	}

	@Override
	public void print(String reportId, String dataFile, String formFile,
			String printer, boolean preview, String... option) {
		MCReportInfoR r = getCurrentReportInfo();
		SwingUtilities.invokeLater(() -> afterPrint(r, option));
	}

	/**
	 * 印刷の後処理を行います。
	 */
	public void afterPrint(MCReportInfoR r, String... option) {
		MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
				MAUDC_BizDatDLEnv.getDownDLInfo(r.option());

		MCOperationInfo Upd01_INFO = new MCOperationInfo("MB", "MBBEL0050", "Upd01", "000000", null);
		MCParam p = new MCParam(Upd01_INFO);
		MCRow up = MCRow.create();
		up.setStringNE("biz_dat_dl_hst_no", dlInfo.getHstNo());
		up.setStringNE("dl_file_path", new File(r.save_file_name()).getParent());
		p.setReqSrcId(dlInfo.getReqSrcId());
		p.addUpBlock(up);
		(new MAUDP_CallerNoPanel(p)).exec();
		MCMessageBox.dialog(null, getFinDLMsg(r, option));
	}

	/**
	 * ダウンロード完了メッセージを取得します。
	 */
	protected MCMessage getFinDLMsg(MCReportInfoR r, String... option) {
		MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
				MAUDC_BizDatDLEnv.getDownDLInfo(r.option());
		File f = new File(r.save_file_name());
		return new MCMessage(MAUDP0404,
				dlInfo.getFuncName(), f.getParent(), f.getName());
	}

}
