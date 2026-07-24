package mcframe.serverMABS.MABSL0860;

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
import mcframe.serverMABS.MABSL0860.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_RsrcLocReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_RsrcLocReg_MC extends MABSL_RsrcLocReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RsrcLoc_UpdChk01オペレーション.<p>
	 *
	 * 場所別資源マスタの登録前のチェックを行います。<br>
	 */
	public class RsrcLoc_UpdChk01 extends MABSL_RsrcLocReg_MC_A.RsrcLoc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.mfg_loc_cd())),
					RsrcLoc_UpdChk01_DtlR.$mfg_loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * RsrcLoc_Upd01オペレーション.<p>
	 *
	 * 場所別資源マスタの登録を行います。<br>
	 */
	public class RsrcLoc_Upd01 extends MABSL_RsrcLocReg_MC_A.RsrcLoc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RsrcLoc_DelChk01オペレーション.<p>
	 *
	 * 場所別資源マスタの削除前のチェックを行います。<br>
	 */
	public class RsrcLoc_DelChk01 extends MABSL_RsrcLocReg_MC_A.RsrcLoc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.mfg_loc_cd())),
					RsrcLoc_DelChk01_DtlR.$mfg_loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * RsrcLoc_Del01オペレーション.<p>
	 *
	 * 場所別資源マスタの削除を行います。<br>
	 */
	public class RsrcLoc_Del01 extends MABSL_RsrcLocReg_MC_A.RsrcLoc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 場所別資源マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_RsrcLocReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_RSRC_LOC_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
						
			/* DAC対応 */
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_RSRC_LOC_R.$LOC1);
			MAM_RSRC_LOC_R t = MAM_RSRC_LOC_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
					.where( t.mfg_loc_cd.eq(S1RD_LOC1.loc_cd) )));

			builder.addWhereWithCutOffAnd(loc1.wg_cd.like(bind(Srch01_CndR.$wg_cd)));
			builder.addWhereWithCutOffAnd(wg1.wg_nm.like(bind(Srch01_CndR.$wg_nm)));
			builder.addWhereWithCutOffAnd(loc1.site_cd.like(bind(Srch01_CndR.$site_cd)));
			builder.addWhereWithCutOffAnd(loc1.loc_grp_cd.like(bind(Srch01_CndR.$loc_grp_cd)));
			if(!isNull(up0().site_nm())) {
				MAM_SITE_R site1 = MAM_SITE_R.create("SITE1");
				builder.addLeftOuterJoin(site1, loc1.site_cd.eq(site1.site_cd));
				builder.addWhereWithCutOffAnd(site1.site_nm.like(bind(Srch01_CndR.$site_nm)));
			}
			if(!isNull(up0().loc_grp_nm())) {
				MAM_LOC_GRP_R loc_grp1 = MAM_LOC_GRP_R.create("LOC_GRP1");
				builder.addLeftOuterJoin(loc_grp1, loc1.loc_grp_cd.eq(loc_grp1.loc_grp_cd));
				builder.addWhereWithCutOffAnd(loc_grp1.loc_grp_nm.like(bind(Srch01_CndR.$loc_grp_nm)));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 場所別資源マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_RsrcLocReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 場所別資源マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_RsrcLocReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	protected <R extends MCDBContainer> void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		MAM_WG_R wg1 = MAM_WG_R.create("WG1");
		MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_RSRC_LOC_R.$LOC1);
		MAM_RSRC_R rsrc1 =MAM_RSRC_R.create(MAM_RSRC_LOC_R.$RSRC1);
		
		builder.addSelect(loc1.wg_cd);
		builder.addSelect(wg1.wg_nm);
		builder.addSelect(rsrc1.dec_place);
		builder.addSelect(rsrc1.rsrc_unit_nm);
		builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_RsrcLocReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);
			dbcCustomizeCommon(builder);
		}
	}

	//FMCB CUSTOM END
}