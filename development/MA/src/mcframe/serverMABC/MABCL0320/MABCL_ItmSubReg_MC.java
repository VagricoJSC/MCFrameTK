package mcframe.serverMABC.MABCL0320;

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
import mcframe.serverMABC.MABCL0320.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmSubReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmSubReg_MC extends MABCL_ItmSubReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmSub_DelChk01オペレーション.<p>
	 *
	 * 品目補助マスタの削除前のチェックを行います。<br>
	 */
	public class ItmSub_DelChk01 extends MABCL_ItmSubReg_MC_A.ItmSub_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSub_Del01オペレーション.<p>
	 *
	 * 品目補助マスタの削除を行います。<br>
	 */
	public class ItmSub_Del01 extends MABCL_ItmSubReg_MC_A.ItmSub_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目補助マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmSubReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_ITM_SUB_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void refIns(MCQueryApiBuilder builder) {

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_SUB_R.$ITM1);
			MAM_ITM_SUB_R itmsub1 = MAM_ITM_SUB_R.create("ITMSUB1");
			MAM_TAX_R tax1 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX1);
			MAM_TAX_R tax2 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX2);
			MAM_TAX_R tax3 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX3);
			MAM_SLS_ITM_GRP_R sls_itm_grp1 = MAM_SLS_ITM_GRP_R.create(MAM_ITM_SUB_R.$SLS_ITM_GRP1);
			MAM_ITM_SUB_R t = MAM_ITM_SUB_R.create(builder.getBaseDbcAlias());

			builder.inactiveForeign("ITM1");
			builder.addFullOuterJoin(itm1, t.itm_cd.eq(itm1.itm_cd)
					.and(t.itm_sub1.eq(itm1.itm_sub1))
					.and(t.itm_sub2.eq(itm1.itm_sub2))
					.and(t.itm_sub3.eq(itm1.itm_sub3))
					.and(itm1.del_flg.eq(value(false))));
			builder.addSelect(itm1.itm_nm);
			
			builder.addFullOuterJoin(itmsub1, t.itm_cd.eq(itmsub1.itm_cd)
					.and(t.itm_sub1.eq(itmsub1.itm_sub1))
					.and(t.itm_sub2.eq(itmsub1.itm_sub2))
					.and(t.itm_sub3.eq(itmsub1.itm_sub3))
					.and(t.st_dt.eq(itmsub1.st_dt))
					.and(itmsub1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
					.and(itmsub1.end_dt.gte(bind(Srch01_CndR.$end_dt_fr))));

			builder.inactiveForeign("TAX1");
			builder.addLeftOuterJoin(tax1, decode( itmsub1.itm_cd, nullValue(), itm1.sls_tax_cd, itmsub1.sls_tax_cd).eq(tax1.tax_cd));
			builder.addSelect(tax1.tax_nm.as("sls_tax_nm"));

			builder.inactiveForeign("TAX2");
			builder.addLeftOuterJoin(tax2, decode( itmsub1.itm_cd, nullValue(), itm1.purc_tax_cd, itmsub1.purc_tax_cd).eq(tax2.tax_cd));
			builder.addSelect(tax2.tax_nm.as("purc_tax_nm"));

			builder.inactiveForeign("TAX3");
			builder.addLeftOuterJoin(tax3, decode( itmsub1.itm_cd, nullValue(), itm1.prov_tax_cd, itmsub1.prov_tax_cd).eq(tax3.tax_cd));
			builder.addSelect(tax3.tax_nm.as("prov_tax_nm"));

			builder.inactiveForeign("SLS_ITM_GRP1");
			builder.addLeftOuterJoin(sls_itm_grp1, decode( itmsub1.itm_cd, nullValue(), itm1.sls_itm_grp_cd, itmsub1.sls_itm_grp_cd).eq(sls_itm_grp1.sls_itm_grp_cd));
			builder.addSelect(sls_itm_grp1.sls_itm_grp_nm);

			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(itmsub1.itm_cd.isNull()
							.or(itmsub1.itm_cd.eq(itm1.itm_cd)));
			builder.addWhereWithCutOffAnd(itmsub1.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(itmsub1.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(itmsub1.memo3.like(bind(Srch01_CndR.$memo3)));

			if (up0().off_del_flg() && !up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl( itmsub1.del_flg, value(false)).eq(value(false)));
			}
			else if (!up0().off_del_flg() && up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl( itmsub1.del_flg, value(true)).eq(value(true)));
			}
			builder.addWhereWithCutOffAnd(nvl( itmsub1.itm_cd, itm1.itm_cd).like(bind(Srch01_CndR.$itm_cd)));
			builder.addWhereWithCutOffAnd(nvl( itmsub1.itm_sub1, itm1.itm_sub1).like(bind(Srch01_CndR.$itm_sub1)));
			builder.addWhereWithCutOffAnd(nvl( itmsub1.itm_sub2, itm1.itm_sub2).like(bind(Srch01_CndR.$itm_sub2)));
			builder.addWhereWithCutOffAnd(nvl( itmsub1.itm_sub3, itm1.itm_sub3).like(bind(Srch01_CndR.$itm_sub3)));
			builder.addWhereWithCutOffAnd(itm1.itm_nm.like(bind(Srch01_CndR.$itm_nm)));

			builder.removeSelect(MAM_ITM_SUB_R.$itm_cd);
			builder.addSelect(nvl( itmsub1.itm_cd, itm1.itm_cd).as("itm_cd"));
			builder.removeSelect(MAM_ITM_SUB_R.$itm_sub1);
			builder.addSelect(nvl( itmsub1.itm_sub1, itm1.itm_sub1).as("itm_sub1"));
			builder.removeSelect(MAM_ITM_SUB_R.$itm_sub2);
			builder.addSelect(nvl( itmsub1.itm_sub2, itm1.itm_sub2).as("itm_sub2"));
			builder.removeSelect(MAM_ITM_SUB_R.$itm_sub3);
			builder.addSelect(nvl( itmsub1.itm_sub3, itm1.itm_sub3).as("itm_sub3"));

			builder.removeSelect(MAM_ITM_SUB_R.$sls_tax_cd);
			builder.addSelect(decode( itmsub1.itm_cd, nullValue(), itm1.sls_tax_cd, itmsub1.sls_tax_cd).as("sls_tax_cd"));
			builder.removeSelect(MAM_ITM_SUB_R.$purc_tax_cd);
			builder.addSelect(decode( itmsub1.itm_cd, nullValue(), itm1.purc_tax_cd, itmsub1.purc_tax_cd).as("purc_tax_cd"));
			builder.removeSelect(MAM_ITM_SUB_R.$prov_tax_cd);
			builder.addSelect(decode( itmsub1.itm_cd, nullValue(), itm1.prov_tax_cd, itmsub1.prov_tax_cd).as("prov_tax_cd"));
			builder.removeSelect(MAM_ITM_SUB_R.$sls_itm_grp_cd);
			builder.addSelect(decode( itmsub1.itm_cd, nullValue(), itm1.sls_itm_grp_cd, itmsub1.sls_itm_grp_cd).as("sls_itm_grp_cd"));
			builder.removeSelect(MAM_ITM_SUB_R.$wtax_rate);
			builder.addSelect(decode( itmsub1.itm_cd, nullValue(), itm1.wtax_rate, itmsub1.wtax_rate).as("wtax_rate"));
			builder.removeSelect(MAM_ITM_SUB_R.$memo1);
			builder.addSelect(itmsub1.memo1);
			builder.removeSelect(MAM_ITM_SUB_R.$memo2);
			builder.addSelect(itmsub1.memo2);
			builder.removeSelect(MAM_ITM_SUB_R.$memo3);
			builder.addSelect(itmsub1.memo3);
			builder.addWhereWithCutOffAnd(
					decode(itmsub1.itm_cd, nullValue(), itm1.sls_tax_cd,
							itmsub1.sls_tax_cd).like(bind(Srch01_CndR.$sls_tax_cd)));
			builder.addWhereWithCutOffAnd(
					decode(itmsub1.itm_cd, nullValue(), itm1.purc_tax_cd,
							itmsub1.purc_tax_cd).like(bind(Srch01_CndR.$purc_tax_cd)));
			builder.addWhereWithCutOffAnd(
					decode(itmsub1.itm_cd, nullValue(), itm1.prov_tax_cd,
							itmsub1.prov_tax_cd).like(bind(Srch01_CndR.$prov_tax_cd)));
			builder.addWhereWithCutOffAnd(decode(itmsub1.itm_cd, nullValue(),
					itm1.sls_itm_grp_cd, itmsub1.sls_itm_grp_cd)
							.like(bind(Srch01_CndR.$sls_itm_grp_cd)));
			builder.addWhereWithCutOffAnd(tax1.tax_nm.like(bind(Srch01_CndR.$sls_tax_nm)));
			builder.addWhereWithCutOffAnd(tax2.tax_nm.like(bind(Srch01_CndR.$purc_tax_nm)));
			builder.addWhereWithCutOffAnd(tax3.tax_nm.like(bind(Srch01_CndR.$prov_tax_nm)));
			builder.addWhereWithCutOffAnd(sls_itm_grp1.sls_itm_grp_nm.like(bind(Srch01_CndR.$sls_itm_grp_nm)));
			builder.addWhereWithCutOffAnd(
					decode(itmsub1.itm_cd, nullValue(), itm1.wtax_rate, itmsub1.wtax_rate)
							.gte(bind(Srch01_CndR.$wtax_rate_fr)));
			builder.addWhereWithCutOffAnd(
					decode(itmsub1.itm_cd, nullValue(), itm1.wtax_rate, itmsub1.wtax_rate)
							.lte(bind(Srch01_CndR.$wtax_rate_to)));

			builder.removeSelect(MAM_ITM_SUB_R.$st_dt);
			builder.addSelect(bind("new_st_dt").as("st_dt"));
			builder.removeSelect(MAM_ITM_SUB_R.$end_dt);
			builder.addSelect(nullValue().as("end_dt"));

			builder.removeSelect(MAM_ITM_SUB_R.$del_flg);
			builder.addSelect(value(false).as("del_flg"));
			builder.removeSelect(MAM_ITM_SUB_R.$del_usr_id);
			builder.addSelect(nullValue().as("del_usr_id"));
			builder.removeSelect(MAM_ITM_SUB_R.$del_usr_nm);
			builder.addSelect(nullValue().as("del_usr_nm"));
			builder.removeSelect(MAM_ITM_SUB_R.$del_ts);
			builder.addSelect(nullValue().as("del_ts"));
			builder.removeSelect(MAM_ITM_SUB_R.$ins_usr_id);
			builder.addSelect(nullValue().as("ins_usr_id"));
			builder.removeSelect(MAM_ITM_SUB_R.$ins_usr_nm);
			builder.addSelect(nullValue().as("ins_usr_nm"));
			builder.removeSelect(MAM_ITM_SUB_R.$ins_ts);
			builder.addSelect(nullValue().as("ins_ts"));
			builder.removeSelect(MAM_ITM_SUB_R.$ins_func_id);
			builder.addSelect(nullValue().as("ins_func_id"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_cntr);
			builder.addSelect(nullValue().as("upd_cntr"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_usr_id);
			builder.addSelect(nullValue().as("upd_usr_id"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_usr_nm);
			builder.addSelect(nullValue().as("upd_usr_nm"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_ts);
			builder.addSelect(nullValue().as("upd_ts"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_func_id);
			builder.addSelect(nullValue().as("upd_func_id"));
			builder.removeSelect(MAM_ITM_SUB_R.$upd_srv_req_no);
			builder.addSelect(nullValue().as("upd_srv_req_no"));
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_ITM_SUB_R t =MAM_ITM_SUB_R.create(builder.getBaseDbcAlias());
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");

			if(!isNull(up0().new_st_dt())){
				refIns(builder) ;
			}
			else {
				builder.addWhereWithCutOffAnd(t.wtax_rate.gte(bind(Srch01_CndR.$wtax_rate_fr)));
				builder.addWhereWithCutOffAnd(t.wtax_rate.lte(bind(Srch01_CndR.$wtax_rate_to)));
			}

			// Srch01、Sprt01共通
			dbcCustomizeCommon(builder);

			MAM_ITM__R itm1 =MAM_ITM__R.create(MAM_ITM_SUB_R.$ITM1); 
			// 品目区分と品目区分詳細
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			// 品目分類
			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
			// 課税のみＦＬＧ
			if (up0().tax_abl_only_flg()) {
				MAM_TAX_R tax1 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX1);
				MAM_TAX_R tax2 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX2);
				MAM_TAX_R tax3 = MAM_TAX_R.create(MAM_ITM_SUB_R.$TAX3);
				builder.addWhereWithAnd(
						tax1.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value()))
								.or(tax2.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value())))
								.or(tax3.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value()))));
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目補助マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_ItmSubReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSub_UpdChk01オペレーション.<p>
	 *
	 * 品目補助マスタの登録前のチェックを行います。<br>
	 */
	public class ItmSub_UpdChk01 extends MABCL_ItmSubReg_MC_A.ItmSub_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmSub_Upd01オペレーション.<p>
	 *
	 * 品目補助マスタの登録を行います。<br>
	 */
	public class ItmSub_Upd01 extends MABCL_ItmSubReg_MC_A.ItmSub_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目補助マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ItmSubReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABCL_ItmSubReg_MC_A.Sprt01 {
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

	/* Srch01、Sprt01共通で使用します。 */
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		// Select
		MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
		MAM_ITM__R itm1 =MAM_ITM__R.create(MAM_ITM_SUB_R.$ITM1); 

		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itm_typ_d1.itm_typ_d_nm);
		
		// Join
		builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
	}

	//FMCB CUSTOM END
}