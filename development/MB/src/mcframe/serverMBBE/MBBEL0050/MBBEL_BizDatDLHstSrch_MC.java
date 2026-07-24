package mcframe.serverMBBE.MBBEL0050;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBE.MBBEL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMBBE.MBBEL0050.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_BizDatDLHstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_BizDatDLHstSrch_MC extends MBBEL_BizDatDLHstSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データダウンロード履歴を検索する<br>
	 */
	public class Srch01 extends MBBEL_BizDatDLHstSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srch();
		}

		protected void editUp() {
			if (up0().running_flg()) {
				up0().setStringNE("dl_sts_running", MAC_BIZ_DAT_DL_STS_TYP.RUNNING.value());
			}
			if (up0().success_flg()) {
				up0().setStringNE("dl_sts_success", MAC_BIZ_DAT_DL_STS_TYP.SUCCESS.value());
			}
			if (up0().download_flg()) {
				up0().setStringNE("dl_sts_download", MAC_BIZ_DAT_DL_STS_TYP.DOWNLOAD.value());
			}
			if (up0().error_flg()) {
				up0().setStringNE("dl_sts_error", MAC_BIZ_DAT_DL_STS_TYP.ERROR.value());
			}
			if (up0().csv_flg()) {
				up0().setStringNE("biz_dat_file_typ_csv", MAC_BIZ_DAT_FILE_TYP.CSV.value());
			}
			if (up0().excel_flg()) {
				up0().setStringNE("biz_dat_file_typ_excel", MAC_BIZ_DAT_FILE_TYP.EXCEL.value());
			}
			if (up0().screen_flg()) {
				up0().setStringNE("biz_dat_file_typ_screen", MAC_BIZ_DAT_FILE_TYP.SCREEN.value());
			}
			if (up0().report_flg()) {
				up0().setStringNE("biz_dat_file_typ_report", MAC_BIZ_DAT_FILE_TYP.REPORT.value());
			}
		}

		protected void srch() {
			executeQuery(down0(), MBBEL0050_MAT_BIZ_DAT_DL_HST_S01(), up0());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ダウンロード処理をする<br>
	 */
	public class Upd01 extends MBBEL_BizDatDLHstSrch_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			updHst();
		}

		protected void updHst() {
			MAT_BIZ_DAT_DL_HST_R dbc = MAT_BIZ_DAT_DL_HST_R.create();
			dbc.biz_dat_dl_hst_no(up0().biz_dat_dl_hst_no());
			MAT_BIZ_DAT_DL_HST_R t = MAT_BIZ_DAT_DL_HST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWaitNoFetch("MBBEL0050_MAT_BIZ_DAT_DL_HST_S01", dbc_bldr, dbc);

			dbc.dl_file_path(up0().dl_file_path());
			dbc.biz_dat_dl_sts_typ(MAC_BIZ_DAT_DL_STS_TYP.DOWNLOAD.value());
			dbc.file_bin(null);
			dbc.dl_tm(MCDate.now());
			dbc_bldr.setSet(t.biz_dat_dl_sts_typ, t.dl_file_path, t.file_bin, t.dl_tm);
			dbUpdateKey("MBBEL0050_MAT_BIZ_DAT_DL_HST_U01", dbc, dbc_bldr);
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 削除前チェック処理をする<br>
	 */
	public class Chk01 extends MBBEL_BizDatDLHstSrch_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			//　ロック、更新カウンタチェック
			msgL.addAll(lockAndCheck());
			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 */
		protected MCMessageList lockAndCheck() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_DtlR> chkL = getChkList(up0());
			if (chkL.isEmpty()) {
				return msgL;
			}

			MCList<MAT_BIZ_DAT_DL_HST_R> selectL = MCList.create(MAT_BIZ_DAT_DL_HST_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MAT_BIZ_DAT_DL_HST_R.create("T"));
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MBBEL0050_MAT_BIZ_DAT_DL_HST_S02", selectL, selectL_bldr, chkL);

			MCIndexKey idxkey = selectL.createIndex(MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_hst_no);
			for (Chk01_DtlR r : chkL) {
				MAT_BIZ_DAT_DL_HST_R selectR = selectL.getFirst(idxkey, r.biz_dat_dl_hst_no());
				msgL.addAll(checkUpdCntrNE(r, MAT_BIZ_DAT_DL_HST_R.$upd_cntr, selectR));
			}

			return msgL;
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 業務データダウンロード履歴を削除する<br>
	 */
	public class Del01 extends MBBEL_BizDatDLHstSrch_MC_A.Del01 {

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			delHst(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
			up0().sort(Chk01_DtlR.$biz_dat_dl_hst_no);
		}

		protected void callThisChk01() {
			MBBEL_BizDatDLHstSrch.Chk01 ope = MBBEL_BizDatDLHstSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void delHst(MCList<Chk01_DtlR> ls) {
			MAT_BIZ_DAT_DL_HST_R dbc = MAT_BIZ_DAT_DL_HST_R.create("T");
			execDbDeleteKey("MBBEL0050_MAT_BIZ_DAT_DL_HST_D01", dbc, ls);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	//FMCB CUSTOM END
}