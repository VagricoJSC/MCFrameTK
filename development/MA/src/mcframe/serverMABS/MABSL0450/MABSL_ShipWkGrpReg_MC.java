package mcframe.serverMABS.MABSL0450;

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
import mcframe.serverMABS.MABSL0450.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ShipWkGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ShipWkGrpReg_MC extends MABSL_ShipWkGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipWkGrp_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業グループマスタの登録前のチェックを行います。<br>
	 */
	public class ShipWkGrp_UpdChk01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ShipWkGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.ship_wk_grp_cd())){
					msgList.add(new MCMessage(r, ShipWkGrp_UpdChk01_DtlR.$ship_wk_grp_cd, MABCL0306, 
									getLabel(r, ShipWkGrp_UpdChk01_DtlR.$ship_wk_grp_cd), r.ship_wk_grp_cd(), toDispGUIIndex(r)));
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
	 * ShipWkGrp_Upd01オペレーション.<p>
	 *
	 * 出荷作業グループマスタの登録を行います。<br>
	 */
	public class ShipWkGrp_Upd01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkJdg_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業判定マスタの登録前のチェックを行います。<br>
	 */
	public class ShipWkJdg_UpdChk01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkJdg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkJdg_Upd01オペレーション.<p>
	 *
	 * 出荷作業判定マスタの登録を行います。<br>
	 */
	public class ShipWkJdg_Upd01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkJdg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業グループマスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	public class ShipWkGrpLcl_UpdChk01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkGrpLcl_Upd01オペレーション.<p>
	 *
	 * 出荷作業グループマスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class ShipWkGrpLcl_Upd01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkGrp_DelChk01オペレーション.<p>
	 *
	 * 出荷作業グループマスタ、出荷作業判定マスタの削除前のチェックを行います。<br>
	 */
	public class ShipWkGrp_DelChk01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkGrp_Del01オペレーション.<p>
	 *
	 * 出荷作業グループマスタ、出荷作業判定マスタの削除を行います。<br>
	 */
	public class ShipWkGrp_Del01 extends MABSL_ShipWkGrpReg_MC_A.ShipWkGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			
			if (list.createRow() instanceof MAM_SHIP_WK_JDG_R) {
				dbDelLcl(builder, list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ShipWkGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doItLcl() {
			super.doItLcl();
		}

		@Override
		protected java.util.List<java.lang.String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_SET_ITM");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}
		@Override
		protected java.util.List<java.lang.String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SHIP_WK_JDG_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_SHIP_WK_R ship_wk1 = MAM_SHIP_WK_R.create("SHIP_WK1");
			MAM_SHIP_WK_JDG_R t = MAM_SHIP_WK_JDG_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(ship_wk1, t.ship_wk_cd.eq(ship_wk1.ship_wk_cd));
			builder.addSelect(ship_wk1.ship_wk_nm);
		}
		
		@Override
		protected void down_SELECT_SET_ITM_c1_0(MCList<Srch01_Rslt2R> dest,
				MCList<MAM_SHIP_WK_JDG_R> src) {
			super.down_SELECT_SET_ITM_c1_0(dest, src);
			
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_ShipWkGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ShipWkGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}