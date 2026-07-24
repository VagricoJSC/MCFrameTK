package mcframe.serverMBBB.MBBBL0400;

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
import mcframe.serverMBBB.MBBBL0400.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_CopyMaster"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_CopyMaster_MC extends MBBBL_CopyMaster_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会計マスタを取り込む。
	 */
	public class Upd01 extends MBBBL_CopyMaster_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
			throwErr(msgOpeErr());
		}

		protected void execMain() {
			MBBBL_AcMstService.AcMst_Upd01 ope = MBBBL_AcMstService.crtAcMst_Upd01();
			copy(ope.up0(), up0(), createMap_AcMst_Chk01_CndR_Upd01_CndR());
			ope.exec();
		}

		protected Map_AcMst_Chk01_CndR_Upd01_CndR<AcMst_Chk01_CndR,Upd01_CndR> createMap_AcMst_Chk01_CndR_Upd01_CndR() {
			return new Map_AcMst_Chk01_CndR_Upd01_CndR<AcMst_Chk01_CndR, Upd01_CndR>();
		}

		public class Map_AcMst_Chk01_CndR_Upd01_CndR<D extends AcMst_Chk01_CndR, S extends Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcMst_Chk01_CndR.$master_imp_typ, Upd01_CndR.$master_imp_typ);
				addColumnPathMap(AcMst_Chk01_CndR.$account_flg, Upd01_CndR.$account_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$sub_account_flg, Upd01_CndR.$sub_account_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$ac_dpt_flg, Upd01_CndR.$ac_dpt_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$bac_ac_flg, Upd01_CndR.$bac_ac_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$bank_flg, Upd01_CndR.$bank_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$bank_branch_flg, Upd01_CndR.$bank_branch_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$bank_ac_flg, Upd01_CndR.$bank_ac_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$cur_xrate_flg, Upd01_CndR.$cur_xrate_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$ac_tax_flg, Upd01_CndR.$ac_tax_flg);
				addColumnPathMap(AcMst_Chk01_CndR.$err_flg, Upd01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}