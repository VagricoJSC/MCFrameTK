package mcframe.serverMBBA.MBBAL0010;

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
import static mcframe.serverMBBA.MBBAL0010.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBAL_AprvStsSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBAL_AprvStsSrch_MC extends MBBAL_AprvStsSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 承認状況を確認する。<br>
	 */
	public class Srch01 extends MBBAL_AprvStsSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			sel();
			crtDown();
			sortDown();
		}

		/**
		 * 上り電文を編集します。
		 */
		protected void editUp() {
			up0().usr_dtl_flg_str(up0().usr_dtl_flg() ?
					MCBooleanUtil.booleanToDBString(true) : null);
		}

		/**
		 * 承認情報を検索します。
		 */
		protected void sel() {
			executeQuery(down1(), MBBAL0010_MBT_APRV_S01(), up0());
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			MCList<Srch01_Hdr1R> hdrL = down1().innerRowList(
					Srch01_Dtl1R.$hdr, Srch01_Hdr1R.class);
			String[] cols = new String[] {
				  Srch01_Hdr1R.$aprv_no
				, Srch01_Hdr1R.$aprv_no_seq
			};
			MCList<Srch01_Hdr1R>[] hdrGLArr = hdrL.groupList(cols);
			for (MCList<Srch01_Hdr1R> hdrGL : hdrGLArr) {
				Srch01_Hdr1R downR = hdrGL.get(0);
				down0().add(downR);
			}
		}

		/**
		 * 下り電文をソートします。
		 */
		protected void sortDown() {
			String[] cols0 = new String[] {
				  Srch01_Hdr1R.$aprv_func_typ
				, Srch01_Hdr1R.$aprv_no
				, Srch01_Hdr1R.$aprv_no_seq
			};
			down0().sort(cols0);
			String[] cols1 = new String[] {
				  Srch01_Dtl1R.$aprv_seq
			};
			down1().sort(cols1);
		}

	}

	//FMCB CUSTOM END
}