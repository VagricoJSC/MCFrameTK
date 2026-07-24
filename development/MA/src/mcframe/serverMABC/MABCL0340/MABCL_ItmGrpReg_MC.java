package mcframe.serverMABC.MABCL0340;

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
import mcframe.serverMABC.MABCL0340.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmGrpReg_MC extends MABCL_ItmGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目分類マスタを登録する前のチェック処理を行います。<br>
	 */
	public class ItmGrp_UpdChk01 extends MABCL_ItmGrpReg_MC_A.ItmGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.itm_grp_cd())){
					msgList.add(new MCMessage(r, ItmGrp_UpdChk01_DtlR.$itm_grp_cd, MABCL0306, 
									getLabel(r, ItmGrp_UpdChk01_DtlR.$itm_grp_cd), r.itm_grp_cd(), toDispGUIIndex(r)));
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
	 * ItmGrp_Upd01オペレーション.<p>
	 *
	 * 品目分類マスタの登録処理を行います。<br>
	 */
	public class ItmGrp_Upd01 extends MABCL_ItmGrpReg_MC_A.ItmGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目分類マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class ItmGrpLcl_UpdChk01 extends MABCL_ItmGrpReg_MC_A.ItmGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目分類マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class ItmGrpLcl_Upd01 extends MABCL_ItmGrpReg_MC_A.ItmGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmGrp_DelChk01オペレーション.<p>
	 *
	 * 品目分類マスタ、品目分類マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class ItmGrp_DelChk01 extends MABCL_ItmGrpReg_MC_A.ItmGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmGrp_Del01オペレーション.<p>
	 *
	 * 品目分類マスタ、品目分類マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class ItmGrp_Del01 extends MABCL_ItmGrpReg_MC_A.ItmGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目分類マスタ、品目分類マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目分類マスタ、品目分類マスタ(ロケール別情報)の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_ItmGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目分類マスタ、品目分類マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_ItmGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}