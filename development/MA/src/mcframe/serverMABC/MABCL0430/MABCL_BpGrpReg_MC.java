package mcframe.serverMABC.MABCL0430;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0430.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpGrpReg_MC extends MABCL_BpGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpGrp_UpdChk01オペレーション.<p>
	 *
	 * 取引先分類マスタの登録前のチェックを行います。<br>
	 */
	public class BpGrp_UpdChk01 extends MABCL_BpGrpReg_MC_A.BpGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(BpGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.bp_grp_cd())){
					msgList.add(new MCMessage(r, BpGrp_UpdChk01_DtlR.$bp_grp_cd, MABCL0306, 
									getLabel(r, BpGrp_UpdChk01_DtlR.$bp_grp_cd), r.bp_grp_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * BpGrp_Upd01オペレーション.<p>
	 *
	 * 取引先分類マスタの登録を行います。<br>
	 */
	public class BpGrp_Upd01 extends MABCL_BpGrpReg_MC_A.BpGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 取引先分類名称マスタの登録前のチェックを行います。<br>
	 */
	public class BpGrpLcl_UpdChk01 extends MABCL_BpGrpReg_MC_A.BpGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpGrpLcl_Upd01オペレーション.<p>
	 *
	 * 取引先分類名称マスタの登録を行います。<br>
	 */
	public class BpGrpLcl_Upd01 extends MABCL_BpGrpReg_MC_A.BpGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpGrp_DelChk01オペレーション.<p>
	 *
	 * 取引先分類マスタ、取引先分類名称マスタの削除前のチェックを行います。<br>
	 */
	public class BpGrp_DelChk01 extends MABCL_BpGrpReg_MC_A.BpGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
//		@Override
//		protected void up_OTHER_chk0_0(MAM_BP__R r_dest, mcframe.serverMABC.MABCL0430.BpGrp_DelChk01_DtlR r_src) {
//			if(MAC_BP_GRP_TYP.isGRP1(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd1(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP2(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd2(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP3(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd3(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP4(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd4(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP5(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd5(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP6(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd6(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP7(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd7(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP8(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd8(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP9(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd9(r_src.bp_grp_cd());
//			}
//			else if(MAC_BP_GRP_TYP.isGRP10(r_src.bp_grp_typ())){
//				r_dest.bp_grp_cd10(r_src.bp_grp_cd());
//			}
//		}
	}
	/**
	 * BpGrp_Del01オペレーション.<p>
	 *
	 * 取引先分類マスタ、取引先分類名称マスタの削除を行います。<br>
	 */
	public class BpGrp_Del01 extends MABCL_BpGrpReg_MC_A.BpGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先分類マスタ、取引先分類名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先分類マスタ、取引先分類名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_BpGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先分類マスタ、取引先分類名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}