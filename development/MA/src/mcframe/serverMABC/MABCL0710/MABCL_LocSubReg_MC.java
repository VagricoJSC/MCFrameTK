package mcframe.serverMABC.MABCL0710;

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
import mcframe.serverMABC.MABCL0710.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_LocSubReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_LocSubReg_MC extends MABCL_LocSubReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * LocSub_UpdChk01オペレーション.<p>
	 *
	 * 場所補助マスタの登録前のチェックを行います。<br>
	 */
	public class LocSub_UpdChk01 extends MABCL_LocSubReg_MC_A.LocSub_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

	}
	/**
	 * LocSub_Upd01オペレーション.<p>
	 *
	 * 場所補助マスタの登録を行います。<br>
	 */
	public class LocSub_Upd01 extends MABCL_LocSubReg_MC_A.LocSub_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocSub_DelChk01オペレーション.<p>
	 *
	 * 場所補助マスタの削除前のチェックを行います。<br>
	 */
	public class LocSub_DelChk01 extends MABCL_LocSubReg_MC_A.LocSub_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocSub_Del01オペレーション.<p>
	 *
	 * 場所補助マスタの削除を行います。<br>
	 */
	public class LocSub_Del01 extends MABCL_LocSubReg_MC_A.LocSub_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 場所補助マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_LocSubReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_LOC_SUB_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void refIns(MCQueryApiBuilder builder) {
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_LOC_SUB_R.$LOC1);
			MAM_LOC_SUB_R locsub1 = MAM_LOC_SUB_R.create("LOCSUB1");
			MAM_DPT_R asst = MAM_DPT_R.create("ASST");
			MAM_DPT_MAP_R asst_dpt_map = MAM_DPT_MAP_R.create("ASST_DPT_MAP");
			MAM_DPT_R asst_dpt_new = MAM_DPT_R.create("ASST_DPT_NEW");
			MAM_DPT_R sls = MAM_DPT_R.create("SLS");
			MAM_DPT_MAP_R sls_dpt_map = MAM_DPT_MAP_R.create("SLS_DPT_MAP");
			MAM_DPT_R sls_dpt_new = MAM_DPT_R.create("SLS_DPT_NEW");
			MAM_DPT_R S1X = MAM_DPT_R.create("X");
			MAM_LOC_SUB_R t = MAM_LOC_SUB_R.create(builder.getBaseDbcAlias());

			builder.inactiveForeign("LOC1");
			builder.addFullOuterJoin(loc1,
					t.loc_cd.eq(loc1.loc_cd)
					.and(loc1.del_flg.eq(value(false))));
			builder.addSelect(loc1.loc_nm);

			builder.addFullOuterJoin(locsub1,
					t.loc_cd.eq(locsub1.loc_cd)
					.and(t.st_dt.eq(locsub1.st_dt))
					.and(locsub1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
					.and(locsub1.end_dt.gte(bind(Srch01_CndR.$end_dt_fr))));

			builder.addLeftOuterJoin(asst, asst.dpt_cd
					.eq(decode(locsub1.loc_cd, nullValue(), loc1.asst_dpt_cd, locsub1.asst_dpt_cd))
					.and(locsub1.loc_cd.isNull()
							.and(bind(Srch01_CndR.$st_dt_to).between(asst.st_dt, asst.end_dt))
							.or(locsub1.loc_cd.isNotNull()
									.and(t.st_dt.between(asst.st_dt, asst.end_dt)))));
			builder.addLeftOuterJoin(asst_dpt_map, 
					asst_dpt_map.old_dpt_cd.eq(decode(locsub1.loc_cd, nullValue(), loc1.asst_dpt_cd, locsub1.asst_dpt_cd))
					.and(bind("new_st_dt").between(asst_dpt_map.st_dt, asst_dpt_map.end_dt)));
			builder.addLeftOuterJoin(asst_dpt_new, 
					asst_dpt_new.dpt_cd.eq(decode(locsub1.loc_cd, nullValue(), loc1.asst_dpt_cd, locsub1.asst_dpt_cd))
					.and(bind("new_st_dt").between(asst_dpt_new.st_dt, asst_dpt_new.end_dt)));
			
			builder.addLeftOuterJoin(sls, sls.dpt_cd
					.eq(decode(locsub1.loc_cd, nullValue(), loc1.sls_dpt_cd, locsub1.sls_dpt_cd))
					.and(locsub1.loc_cd.isNull()
							.and(bind(Srch01_CndR.$st_dt_to).between(sls.st_dt,sls.end_dt))
							.or(locsub1.loc_cd.isNotNull()
									.and(t.st_dt.between(sls.st_dt, sls.end_dt)))));
			builder.addLeftOuterJoin(sls_dpt_map, 
					sls_dpt_map.old_dpt_cd.eq(decode(locsub1.loc_cd, nullValue(), loc1.sls_dpt_cd, locsub1.sls_dpt_cd))
					.and(bind("new_st_dt").between(sls_dpt_map.st_dt, sls_dpt_map.end_dt)));
			builder.addLeftOuterJoin(sls_dpt_new, 
					sls_dpt_new.dpt_cd.eq(decode(locsub1.loc_cd, nullValue(), loc1.sls_dpt_cd, locsub1.sls_dpt_cd))
					.and(bind("new_st_dt").between(sls_dpt_new.st_dt, sls_dpt_new.end_dt)));

			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(locsub1.loc_cd.isNull()
					.or(locsub1.loc_cd.eq(loc1.loc_cd)));

			builder.addWhereWithCutOffAnd(
					nvl(locsub1.loc_cd, loc1.loc_cd).like(bind(Srch01_CndR.$loc_cd)));
			builder.addWhereWithCutOffAnd(loc1.loc_nm.like(bind(Srch01_CndR.$loc_nm)));

			builder.addWhereWithCutOffAnd(
					decode(locsub1.loc_cd, nullValue(), loc1.asst_dpt_cd,
							locsub1.asst_dpt_cd).like(bind(Srch01_CndR.$asst_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(locsub1.loc_cd, nullValue(), loc1.sls_dpt_cd,
							locsub1.sls_dpt_cd).like(bind(Srch01_CndR.$sls_dpt_cd)));

			builder.addWhereWithCutOffAnd(
					decode(locsub1.loc_cd, nullValue(), loc1.asst_dpt_cd,
							locsub1.asst_dpt_cd).like(bind(Srch01_CndR.$dpt_cd))
							.or(decode(locsub1.loc_cd, nullValue(), loc1.sls_dpt_cd,
									locsub1.sls_dpt_cd).like(bind(Srch01_CndR.$dpt_cd))));

			builder.addWhereWithCutOffAnd(locsub1.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(locsub1.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(locsub1.memo3.like(bind(Srch01_CndR.$memo3)));

			if (up0().off_del_flg() && !up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(locsub1.del_flg, value(false)).eq(value(false)));
			}
			else if (!up0().off_del_flg() && up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(locsub1.del_flg, value(true)).eq(value(true)));
			}

			builder.removeSelect(MAM_LOC_SUB_R.$loc_cd);
			builder.addSelect(nvl(locsub1.loc_cd, loc1.loc_cd).as("loc_cd"));

			builder.removeSelect(MAM_LOC_SUB_R.$st_dt);
			builder.addSelect(bind("new_st_dt").as("st_dt"));
			builder.removeSelect(MAM_LOC_SUB_R.$end_dt);
			builder.addSelect(nullValue().as("end_dt"));

			builder.removeSelect(MAM_LOC_SUB_R.$asst_dpt_cd);
			builder.addSelect(nvl(asst_dpt_map.new_dpt_cd, asst_dpt_new.dpt_cd).as("asst_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery()
					.select(max(S1X.dpt_nm).as("asst_dpt_nm")).from(S1X).where(
							bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
									.and(S1X.dpt_cd.eq(nvl(asst_dpt_map.new_dpt_cd, asst_dpt_new.dpt_cd))))
					.as("asst_dpt_nm"));

			builder.removeSelect(MAM_LOC_SUB_R.$sls_dpt_cd);
			builder.addSelect(nvl(sls_dpt_map.new_dpt_cd, sls_dpt_new.dpt_cd).as("sls_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery()
					.select(max(S1X.dpt_nm).as("sls_dpt_nm")).from(S1X).where(
							bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
									.and(S1X.dpt_cd.eq(nvl(sls_dpt_map.new_dpt_cd, sls_dpt_new.dpt_cd))))
					.as("sls_dpt_nm"));

			builder.removeSelect(MAM_LOC_SUB_R.$memo1);
			builder.addSelect(locsub1.memo1);
			builder.removeSelect(MAM_LOC_SUB_R.$memo2);
			builder.addSelect(locsub1.memo2);
			builder.removeSelect(MAM_LOC_SUB_R.$memo3);
			builder.addSelect(locsub1.memo3);

			builder.removeSelect(MAM_LOC_SUB_R.$del_flg);
			builder.addSelect(value(false).as("del_flg"));
			builder.removeSelect(MAM_LOC_SUB_R.$del_usr_id);
			builder.addSelect(nullValue().as("del_usr_id"));
			builder.removeSelect(MAM_LOC_SUB_R.$del_usr_nm);
			builder.addSelect(nullValue().as("del_usr_nm"));
			builder.removeSelect(MAM_LOC_SUB_R.$del_ts);
			builder.addSelect(nullValue().as("del_ts"));
			builder.removeSelect(MAM_LOC_SUB_R.$ins_usr_id);
			builder.addSelect(nullValue().as("ins_usr_id"));
			builder.removeSelect(MAM_LOC_SUB_R.$ins_usr_nm);
			builder.addSelect(nullValue().as("ins_usr_nm"));
			builder.removeSelect(MAM_LOC_SUB_R.$ins_ts);
			builder.addSelect(nullValue().as("ins_ts"));
			builder.removeSelect(MAM_LOC_SUB_R.$ins_func_id);
			builder.addSelect(nullValue().as("ins_func_id"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_cntr);
			builder.addSelect(nullValue().as("upd_cntr"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_usr_id);
			builder.addSelect(nullValue().as("upd_usr_id"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_usr_nm);
			builder.addSelect(nullValue().as("upd_usr_nm"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_ts);
			builder.addSelect(nullValue().as("upd_ts"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_func_id);
			builder.addSelect(nullValue().as("upd_func_id"));
			builder.removeSelect(MAM_LOC_SUB_R.$upd_srv_req_no);
			builder.addSelect(nullValue().as("upd_srv_req_no"));
		}
				
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			addSelectCmn(builder);

			if (!isNull(up0().new_st_dt())) {
				refIns(builder);
			}
			else {
				MAM_LOC_SUB_R t = MAM_LOC_SUB_R.create(builder.getBaseDbcAlias());
				builder.addWhereWithCutOffAnd(
						t.asst_dpt_cd.like(bind(Srch01_CndR.$asst_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.sls_dpt_cd.like(bind(Srch01_CndR.$sls_dpt_cd)));

				builder.addWhereWithCutOffAnd(
						t.asst_dpt_cd.like(bind(Srch01_CndR.$dpt_cd))
								.or(t.sls_dpt_cd.like(bind(Srch01_CndR.$dpt_cd))));

				addJoinTableMain(builder);
			}
			MAM_DPT_R asst = MAM_DPT_R.create("ASST");
			MAM_DPT_R sls = MAM_DPT_R.create("SLS");
			builder.addWhereWithCutOffAnd(
					asst.dpt_nm.like(bind(Srch01_CndR.$asst_dpt_nm)));
			builder.addWhereWithCutOffAnd(sls.dpt_nm.like(bind(Srch01_CndR.$sls_dpt_nm)));
			builder.addWhereWithCutOffAnd(asst.dpt_nm.like(bind(Srch01_CndR.$dpt_nm))
					.or(sls.dpt_nm.like(bind(Srch01_CndR.$dpt_nm))));

			MAM_SITE_R site = MAM_SITE_R.create("SITE");
			MAM_WG_R wg = MAM_WG_R.create("WG");
			MAM_LG_GRP_R lg_grp = MAM_LG_GRP_R.create("LG_GRP");
			MAM_ALLOC_GRP_R alloc_grp = MAM_ALLOC_GRP_R.create("ALLOC_GRP");
			MAM_LOC_GRP_R loc_grp = MAM_LOC_GRP_R.create("LOC_GRP");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_LOC_SUB_R.$LOC1);
			builder.addLeftOuterJoin(site, loc1.site_cd.eq(site.site_cd));
			builder.addLeftOuterJoin(wg, loc1.wg_cd.eq(wg.wg_cd));
			builder.addLeftOuterJoin(lg_grp, loc1.lg_grp_cd.eq(lg_grp.lg_grp_cd));
			builder.addLeftOuterJoin(alloc_grp,
					loc1.alloc_grp_cd.eq(alloc_grp.alloc_grp_cd));
			builder.addLeftOuterJoin(loc_grp, loc1.loc_grp_cd.eq(loc_grp.loc_grp_cd));

			builder.addWhereWithCutOffAnd(loc1.site_cd.like(bind(Srch01_CndR.$site_cd)));
			builder.addWhereWithCutOffAnd(site.site_nm.like(bind(Srch01_CndR.$site_nm)));
			builder.addWhereWithCutOffAnd(loc1.wg_cd.like(bind(Srch01_CndR.$wg_cd)));
			builder.addWhereWithCutOffAnd(wg.wg_nm.like(bind(Srch01_CndR.$wg_nm)));
			builder.addWhereWithCutOffAnd(
					loc1.lg_grp_cd.like(bind(Srch01_CndR.$lg_grp_cd)));
			builder.addWhereWithCutOffAnd(
					lg_grp.lg_grp_nm.like(bind(Srch01_CndR.$lg_grp_nm)));
			builder.addWhereWithCutOffAnd(
					loc1.alloc_grp_cd.like(bind(Srch01_CndR.$alloc_grp_cd)));
			builder.addWhereWithCutOffAnd(
					alloc_grp.alloc_grp_nm.like(bind(Srch01_CndR.$alloc_grp_nm)));
			builder.addWhereWithCutOffAnd(
					loc1.loc_grp_cd.like(bind(Srch01_CndR.$loc_grp_cd)));
			builder.addWhereWithCutOffAnd(loc_grp.loc_grp_nm.like(bind(Srch01_CndR.$loc_grp_nm)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 場所補助マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_LocSubReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 場所補助マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_LocSubReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	protected void addSelectCmn(MCQueryApiBuilder builder) {
		// Select
		MAM_DPT_R asst = MAM_DPT_R.create("ASST");
		MAM_DPT_R sls = MAM_DPT_R.create("SLS");
		
		builder.addSelect(asst.dpt_nm.as("asst_dpt_nm"));
		builder.addSelect(sls.dpt_nm.as("sls_dpt_nm"));
	}

	protected void addJoinTableMain(MCQueryApiBuilder builder) {
		// Join
		MAM_LOC_SUB_R t = MAM_LOC_SUB_R.create(builder.getBaseDbcAlias());
		MAM_DPT_R asst = MAM_DPT_R.create("ASST");
		MAM_DPT_R sls = MAM_DPT_R.create("SLS");

		builder.addLeftOuterJoin(asst, t.asst_dpt_cd.eq(asst.dpt_cd)
				.and(t.st_dt.between(asst.st_dt, asst.end_dt)));
		builder.addLeftOuterJoin(sls, t.sls_dpt_cd.eq(sls.dpt_cd)
				.and(t.st_dt.between(sls.st_dt, sls.end_dt)));
	}
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		addSelectCmn(builder);
		addJoinTableMain(builder);
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABCL_LocSubReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder);
		}
	}

	//FMCB CUSTOM END
}