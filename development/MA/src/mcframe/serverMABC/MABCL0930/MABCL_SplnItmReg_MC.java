package mcframe.serverMABC.MABCL0930;

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
import mcframe.serverMABC.MABCL0930.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SplnItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SplnItmReg_MC extends MABCL_SplnItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SplnItm_UpdChk01オペレーション.<p>
	 *
	 * 販売計画品目マスタの登録前のチェックを行います。<br>
	 */
	public class SplnItm_UpdChk01 extends MABCL_SplnItmReg_MC_A.SplnItm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SplnItm_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.spln_itm_cd())){
					msgList.add(new MCMessage(r, SplnItm_UpdChk01_DtlR.$spln_itm_cd, MABCL0306, 
									getLabel(r, SplnItm_UpdChk01_DtlR.$spln_itm_cd), r.spln_itm_cd(), toDispGUIIndex(r)));
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
	 * SplnItm_Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	public class SplnItm_Upd01 extends MABCL_SplnItmReg_MC_A.SplnItm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SplnItmLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売計画品目名称マスタの登録前のチェックを行います。<br>
	 */
	public class SplnItmLcl_UpdChk01 extends MABCL_SplnItmReg_MC_A.SplnItmLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SplnItmLcl_Upd01オペレーション.<p>
	 *
	 * 販売計画品目名称マスタの登録を行います。<br>
	 */
	public class SplnItmLcl_Upd01 extends MABCL_SplnItmReg_MC_A.SplnItmLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SplnItm_DelChk01オペレーション.<p>
	 *
	 * 販売計画品目マスタ、販売計画品目名称マスタの削除前のチェックを行います。<br>
	 */
	public class SplnItm_DelChk01 extends MABCL_SplnItmReg_MC_A.SplnItm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SplnItm_Del01オペレーション.<p>
	 *
	 * 販売計画品目マスタ、販売計画品目名称マスタの削除を行います。<br>
	 */
	public class SplnItm_Del01 extends MABCL_SplnItmReg_MC_A.SplnItm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 販売計画品目マスタ、販売計画品目名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SplnItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SPLN_ITM_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		/**
		 * 品目分類ＣＤと結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_SPLN_ITM_R t = MAM_SPLN_ITM_R.create(builder.getBaseDbcAlias());
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");

			builder.addSelect(ig1.itm_grp_nm.as("itm_grp_nm1"));
			builder.addSelect(ig2.itm_grp_nm.as("itm_grp_nm2"));
			builder.addSelect(ig3.itm_grp_nm.as("itm_grp_nm3"));
			builder.addSelect(ig4.itm_grp_nm.as("itm_grp_nm4"));
			builder.addSelect(ig5.itm_grp_nm.as("itm_grp_nm5"));
			builder.addSelect(ig6.itm_grp_nm.as("itm_grp_nm6"));
			builder.addSelect(ig7.itm_grp_nm.as("itm_grp_nm7"));
			builder.addSelect(ig8.itm_grp_nm.as("itm_grp_nm8"));
			builder.addSelect(ig9.itm_grp_nm.as("itm_grp_nm9"));
			builder.addSelect(ig10.itm_grp_nm.as("itm_grp_nm10"));
			
			builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));

			builder.addWhereWithCutOffAnd(t.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(t.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
			
			builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_SPLN_ITM_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm1, r_src.getString("itm_grp_nm1"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm2, r_src.getString("itm_grp_nm2"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm3, r_src.getString("itm_grp_nm3"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm4, r_src.getString("itm_grp_nm4"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm5, r_src.getString("itm_grp_nm5"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm6, r_src.getString("itm_grp_nm6"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm7, r_src.getString("itm_grp_nm7"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm8, r_src.getString("itm_grp_nm8"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm9, r_src.getString("itm_grp_nm9"));
			r_dest.setStringNE(Srch01_Rslt1R.$itm_grp_nm10, r_src.getString("itm_grp_nm10"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 販売計画品目マスタ、販売計画品目名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_SplnItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 販売計画品目マスタ、販売計画品目名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_SplnItmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}