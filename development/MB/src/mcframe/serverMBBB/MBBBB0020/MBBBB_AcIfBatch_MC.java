package mcframe.serverMBBB.MBBBB0020;

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
import mcframe.serverMBBB.MBBBL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBB_AcIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBB_AcIfBatch_MC extends MBBBB_AcIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcIf_Upd01オペレーション.<p>
	 *
	 * 会計ＩＦデータを取り込む。<br>
	 */
	public class AcIf_Upd01 extends MBBBB_AcIfBatch_MC_A.AcIf_Upd01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				postBatch();
			}
		}

		protected void postBatch() {
			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
		}

		protected void execMain() {
			MBBBL_AcIfService.AcIf_Upd01 ope = MBBBL_AcIfService.crtAcIf_Upd01();
			copy(ope.up0(), up0(), createMap_AcIf_Chk01_CndR_AcIf_Upd01_CndR());
			ope.exec();
		}

		protected void handleEx(Exception e) {
			_exceptionFlg = true;
			if (e instanceof MCAppException) {
				//正常終了と見なす
				return ;
			}
			throw new MCException(e);
		}

		protected Map_AcIf_Chk01_CndR_AcIf_Upd01_CndR<AcIf_Chk01_CndR,AcIf_Upd01_CndR> createMap_AcIf_Chk01_CndR_AcIf_Upd01_CndR() {
			return new Map_AcIf_Chk01_CndR_AcIf_Upd01_CndR<AcIf_Chk01_CndR, AcIf_Upd01_CndR>();
		}

		public class Map_AcIf_Chk01_CndR_AcIf_Upd01_CndR<D extends AcIf_Chk01_CndR, S extends AcIf_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcIf_Chk01_CndR.$ac_ym, AcIf_Upd01_CndR.$ac_ym);
				addColumnPathMap(AcIf_Chk01_CndR.$dt_fr, AcIf_Upd01_CndR.$dt_fr);
				addColumnPathMap(AcIf_Chk01_CndR.$dt_to, AcIf_Upd01_CndR.$dt_to);
				addColumnPathMap(AcIf_Chk01_CndR.$io_flg, AcIf_Upd01_CndR.$io_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$stk_flg, AcIf_Upd01_CndR.$stk_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$rcv_flg, AcIf_Upd01_CndR.$rcv_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$pay_flg, AcIf_Upd01_CndR.$pay_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$schdpay_flg, AcIf_Upd01_CndR.$schdpay_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$note_flg, AcIf_Upd01_CndR.$note_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$rerun_flg, AcIf_Upd01_CndR.$rerun_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$reget_flg, AcIf_Upd01_CndR.$reget_flg);
				addColumnPathMap(AcIf_Chk01_CndR.$err_flg, AcIf_Upd01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}