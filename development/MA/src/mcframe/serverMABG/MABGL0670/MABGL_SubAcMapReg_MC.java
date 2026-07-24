package mcframe.serverMABG.MABGL0670;

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
import mcframe.serverMABG.MABGL0670.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_SubAcMapReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_SubAcMapReg_MC extends MABGL_SubAcMapReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SubAcMap_UpdChk01オペレーション.<p>
	 *
	 * 補助勘定科目対応マスタの登録前のチェックを行う<br>
	 */
	public class SubAcMap_UpdChk01 extends MABGL_SubAcMapReg_MC_A.SubAcMap_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			
			for (SubAcMap_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (isSame(r.sub_flg(), false)) {
					msgList.add(new MCMessage(r, SubAcMap_UpdChk01_DtlR.$ac_cd, MABCL0307, r.ac_cd(), toDispGUIIndex(r)));
				}
			}			
			return msgList;
		}
	}
	/**
	 * SubAcMap_Upd01オペレーション.<p>
	 *
	 * 補助勘定科目対応マスタを登録する<br>
	 */
	public class SubAcMap_Upd01 extends MABGL_SubAcMapReg_MC_A.SubAcMap_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SubAcMap_DelChk01オペレーション.<p>
	 *
	 * 補助勘定科目対応マスタの削除前のチェックを行う<br>
	 */
	public class SubAcMap_DelChk01 extends MABGL_SubAcMapReg_MC_A.SubAcMap_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SubAcMap_Del01オペレーション.<p>
	 *
	 * 補助勘定科目対応マスタを削除する<br>
	 */
	public class SubAcMap_Del01 extends MABGL_SubAcMapReg_MC_A.SubAcMap_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABGL_SubAcMapReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SUB_AC_MAP_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_SUB_AC_MAP_R.$ACCOUNT1);
			
			builder.addSelect(account1.sub_flg);
			rslt.addBooleanColumn("sub_flg");
			builder.addOrderByAsc(pr("ac_cd"), pr("sub_ac_cd"), pr("st_dt"));
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	public class Sprt01 extends MABGL_SubAcMapReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABGL_SubAcMapReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABGL_SubAcMapReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}