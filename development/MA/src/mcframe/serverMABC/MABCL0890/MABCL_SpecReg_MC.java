package mcframe.serverMABC.MABCL0890;

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
import mcframe.serverMABC.MABCL0890.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SpecReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SpecReg_MC extends MABCL_SpecReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Spec_UpdChk01オペレーション.<p>
	 *
	 * 仕様マスタの登録前のチェックを行います。<br>
	 */
	public class Spec_UpdChk01 extends MABCL_SpecReg_MC_A.Spec_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Spec_Upd01オペレーション.<p>
	 *
	 * 仕様マスタの登録を行います。<br>
	 */
	public class Spec_Upd01 extends MABCL_SpecReg_MC_A.Spec_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SpecDesc_UpdChk01オペレーション.<p>
	 *
	 * 仕様項目マスタの登録前のチェックを行います。<br>
	 */
	public class SpecDesc_UpdChk01 extends MABCL_SpecReg_MC_A.SpecDesc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SpecLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕様名称マスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	public class SpecLcl_UpdChk01 extends MABCL_SpecReg_MC_A.SpecLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SpecLcl_Upd01オペレーション.<p>
	 *
	 * 仕様マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class SpecLcl_Upd01 extends MABCL_SpecReg_MC_A.SpecLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SpecDescLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕様項目名称マスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	public class SpecDescLcl_UpdChk01 extends MABCL_SpecReg_MC_A.SpecDescLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SpecDescLcl_Upd01オペレーション.<p>
	 *
	 * 仕様項目名称マスタの登録を行います。<br>
	 */
	public class SpecDescLcl_Upd01 extends MABCL_SpecReg_MC_A.SpecDescLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Spec_DelChk01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様名称マスタの削除前のチェックを行います。<br>
	 */
	public class Spec_DelChk01 extends MABCL_SpecReg_MC_A.Spec_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Spec_Del01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様名称マスタの削除を行います。<br>
	 */
	public class Spec_Del01 extends MABCL_SpecReg_MC_A.Spec_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			
			if (isSame(builder.getBaseDbc().tableName(),"MAM_SPEC_DESC")) {
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
	 * 仕様マスタ、仕様項目マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SpecReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doItLcl() {
			super.doItLcl();
		}

		@Override
		protected List<String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_DESC");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}
		@Override
		protected List<String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SPEC_DESC_R) {
				MAM_SPEC_DESC_R t = MAM_SPEC_DESC_R.create(builder.getBaseDbcAlias());
				MAM_SPEC_DESC_R lcl = MAM_SPEC_DESC_R.create("LCL");
				builder.addSelect(lcl.spec_desc_nm.as("spec_desc_nm_lcl"));
				builder.addLeftOuterJoin(lcl, bracket(t.spec_cd.eq(lcl.spec_cd)
						.and(t.spec_desc_cd.eq(lcl.spec_desc_cd))));
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbSelectLcl(MCQueryApiBuilder builder,
				MCList<MCRow> cond, MCList<R> rslt, MCController ctrl) {
			if (builder.getBaseDbc() instanceof MAM_SPEC_DESC_LCL_R) {
				// 仕様項目名称マスタ検索条件をセット
				setCondL(getSubOpes(SELECT_DESC).get(0).down(0));
				// 仕様項目マスタが０件なら仕様項目名称マスタを検索しない
				if (getCondL(getSubOpes(SELECT_DESC).get(0)).isEmpty()) {
					return ;
				}
			}
			super.dbSelectLcl(builder, cond, rslt, ctrl);
		}
		
		@Override
		protected void down_SELECT_DESC_c1_0(MCList<Srch01_Rslt2R> dest,
				MCList<MAM_SPEC_DESC_R> src) {
			super.down_SELECT_DESC_c1_0(dest, src);
			
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
	}
	/**
	 * SpecDesc_Upd01オペレーション.<p>
	 *
	 * 仕様項目マスタの登録を行います。<br>
	 */
	public class SpecDesc_Upd01 extends MABCL_SpecReg_MC_A.SpecDesc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕様マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_SpecReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様項目マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_SpecReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}