package mcframe.serverMABS.MABSL0830;

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
import mcframe.serverMABS.MABSL0830.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL5090.MAUCL_StEndYmUtil;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_SplnItmConf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_SplnItmConf_MC extends MABSL_SplnItmConf_MC_A{
	//FMCB CUSTOM START

	/**
	 * SplnItmConf_UpdChk01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの登録前のチェックを行います。<br>
	 */
	public class SplnItmConf_UpdChk01
			extends MABSL_SplnItmConf_MC_A.SplnItmConf_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);

			for (MCConstRow row : up) {
				if (!(row instanceof SplnItmConf_UpdChk01_DtlR)) {
					continue;
				}
				SplnItmConf_UpdChk01_DtlR r = (SplnItmConf_UpdChk01_DtlR) row;

				if (r.del_flg()) {
					continue;
				}

				// 条件付必須チェック
				if (!isNullOrNullVal(r.spln_itm_cd())) {
					msgList.addAll(check(r, SplnItmConf_UpdChk01_DtlR.$calc_rate,
							new FXUCL_RequiredValidater()));
				}

				if (isNullOrNullVal(r.spln_itm_cd()) && !isNullOrNullVal(r.dpt_cd())) {
					msgList.add(new MCMessage(r, SplnItmConf_UpdChk01_DtlR.$dpt_cd,
							MABSL0197, toDispGUIIndex(r)));
				}

				if (!isNull(r.lot_qty())) {
					if (isNull(r.upri_unit_cd())) {
						msgList.add(
								new MCMessage(r, SplnItmConf_UpdChk01_DtlR.$upri_unit_cd,
										MABSL0139, toDispGUIIndex(r)));
					}
					else {
						msgList.addAll(
								checkDecPlace(r, SplnItmConf_UpdChk01_DtlR.$dec_place,
										SplnItmConf_UpdChk01_DtlR.$lot_qty));
					}
				}
			}

			return msgList;
		}
	}

	/**
	 * SplnItmConf_DelChk01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの削除前のチェックを行います。<br>
	 */
	public class SplnItmConf_DelChk01
			extends MABSL_SplnItmConf_MC_A.SplnItmConf_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_SplnItmConf_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SPLN_ITM_CONF_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_SPLN_ITM_CONF_R.$ITM1);
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAVM_ITM_UNIT_R itm_unit1 = MAVM_ITM_UNIT_R.create("ITM_UNIT1");

			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addSelect(itm_unit1.dec_place);

			MAM_SPLN_ITM_CONF_R t = MAM_SPLN_ITM_CONF_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.st_ym.lte(bind(Srch01_CndR.$ym))
					.and(t.end_ym.gte(bind(Srch01_CndR.$ym))));
			builder.addWhereWithCutOffAnd(t.st_ym.gte(bind(Srch01_CndR.$st_ym_fr)));
			builder.addWhereWithCutOffAnd(t.st_ym.lte(bind(Srch01_CndR.$st_ym_to)));
			builder.addWhereWithCutOffAnd(t.end_ym.gte(bind(Srch01_CndR.$end_ym_fr)));
			builder.addWhereWithCutOffAnd(t.end_ym.lte(bind(Srch01_CndR.$end_ym_to)));

			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addLeftOuterJoin(itm_unit1,
					t.itm_cd.eq(itm_unit1.itm_cd)
					.and(t.itm_sub1.eq(itm_unit1.itm_sub1))
					.and(t.itm_sub2.eq(itm_unit1.itm_sub2))
					.and(t.itm_sub3.eq(itm_unit1.itm_sub3))
					.and(t.upri_unit_cd.eq(itm_unit1.unit_cd)));

			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			if (!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if (!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if (!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if (!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if (!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if (!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if (!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if (!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if (!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if (!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));

			MAM_SPLN_ITM_R spln_itm1 = MAM_SPLN_ITM_R.create(MAM_SPLN_ITM_CONF_R.$SPLN_ITM1);
			if (!isNull(up0().spln_itm_grp_nm1())) {
				MAM_ITM_GRP_R spln_ig1 = MAM_ITM_GRP_R.create("SPLN_IG1");
				builder.addLeftOuterJoin(spln_ig1,
						spln_itm1.itm_grp_cd1.eq(spln_ig1.itm_grp_cd)
						.and(spln_ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig1.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm1)));
			}
			if (!isNull(up0().spln_itm_grp_nm2())) {
				MAM_ITM_GRP_R spln_ig2 = MAM_ITM_GRP_R.create("SPLN_IG2");
				builder.addLeftOuterJoin(spln_ig2,
						spln_itm1.itm_grp_cd2.eq(spln_ig2.itm_grp_cd)
						.and(spln_ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig2.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm2)));
			}
			if (!isNull(up0().spln_itm_grp_nm3())) {
				MAM_ITM_GRP_R spln_ig3 = MAM_ITM_GRP_R.create("SPLN_IG3");
				builder.addLeftOuterJoin(spln_ig3,
						spln_itm1.itm_grp_cd3.eq(spln_ig3.itm_grp_cd)
						.and(spln_ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig3.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm3)));
			}
			if (!isNull(up0().spln_itm_grp_nm4())) {
				MAM_ITM_GRP_R spln_ig4 = MAM_ITM_GRP_R.create("SPLN_IG4");
				builder.addLeftOuterJoin(spln_ig4,
						spln_itm1.itm_grp_cd4.eq(spln_ig4.itm_grp_cd)
						.and(spln_ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig4.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm4)));
			}
			if (!isNull(up0().spln_itm_grp_nm5())) {
				MAM_ITM_GRP_R spln_ig5 = MAM_ITM_GRP_R.create("SPLN_IG5");
				builder.addLeftOuterJoin(spln_ig5,
						spln_itm1.itm_grp_cd5.eq(spln_ig5.itm_grp_cd)
						.and(spln_ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig5.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm5)));
			}
			if (!isNull(up0().spln_itm_grp_nm6())) {
				MAM_ITM_GRP_R spln_ig6 = MAM_ITM_GRP_R.create("SPLN_IG6");
				builder.addLeftOuterJoin(spln_ig6,
						spln_itm1.itm_grp_cd6.eq(spln_ig6.itm_grp_cd)
						.and(spln_ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig6.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm6)));
			}
			if (!isNull(up0().spln_itm_grp_nm7())) {
				MAM_ITM_GRP_R spln_ig7 = MAM_ITM_GRP_R.create("SPLN_IG7");
				builder.addLeftOuterJoin(spln_ig7,
						spln_itm1.itm_grp_cd7.eq(spln_ig7.itm_grp_cd)
						.and(spln_ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig7.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm7)));
			}
			if (!isNull(up0().spln_itm_grp_nm8())) {
				MAM_ITM_GRP_R spln_ig8 = MAM_ITM_GRP_R.create("SPLN_IG8");
				builder.addLeftOuterJoin(spln_ig8,
						spln_itm1.itm_grp_cd8.eq(spln_ig8.itm_grp_cd)
						.and(spln_ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig8.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm8)));
			}
			if (!isNull(up0().spln_itm_grp_nm9())) {
				MAM_ITM_GRP_R spln_ig9 = MAM_ITM_GRP_R.create("SPLN_IG9");
				builder.addLeftOuterJoin(spln_ig9,
						spln_itm1.itm_grp_cd9.eq(spln_ig9.itm_grp_cd)
						.and(spln_ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig9.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm9)));
			}
			if (!isNull(up0().spln_itm_grp_nm10())) {
				MAM_ITM_GRP_R spln_ig10 = MAM_ITM_GRP_R.create("SPLN_IG10");
				builder.addLeftOuterJoin(spln_ig10,
						spln_itm1.itm_grp_cd10.eq(spln_ig10.itm_grp_cd)
						.and(spln_ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						spln_ig10.itm_grp_nm.like(bind(Srch01_CndR.$spln_itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd1.like(bind(Srch01_CndR.$spln_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd2.like(bind(Srch01_CndR.$spln_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd3.like(bind(Srch01_CndR.$spln_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd4.like(bind(Srch01_CndR.$spln_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd5.like(bind(Srch01_CndR.$spln_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd6.like(bind(Srch01_CndR.$spln_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd7.like(bind(Srch01_CndR.$spln_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd8.like(bind(Srch01_CndR.$spln_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd9.like(bind(Srch01_CndR.$spln_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					spln_itm1.itm_grp_cd10.like(bind(Srch01_CndR.$spln_itm_grp_cd10)));

		}

		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_SPLN_ITM_CONF_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.dec_place(r_src.getNumberNE("dec_place"));
			r_dest.itm_typ(r_src.getStringNE("itm_typ"));
			r_dest.itm_typ_d_cd(r_src.getStringNE("itm_typ_d_cd"));
			r_dest.itm_typ_d_nm(r_src.getStringNE("itm_typ_d_nm"));
		}
	}

	/**
	 * SplnItmConf_Upd01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの登録を行います。<br>
	 */
	public class SplnItmConf_Upd01 extends MABSL_SplnItmConf_MC_A.SplnItmConf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected String[] getUpdatableKeys() {
			// 開始年月key項目を更新できるため
			return new String[] {
					"st_ym"
			};
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			// 重複期間チェック
			if (isStEndDt(dbc.createRow())) {
				for (R r : dbc) {
					MAUCL_StEndYmUtil.checkStEndYmValid(r, getBaseKey(r), getMsgList());

					if (r instanceof MAM_SPLN_ITM_CONF_R) {
						// 計画品目重複チェック
						checkDupItm((MAM_SPLN_ITM_CONF_R) r);
					}
				}
			}
		}


		protected boolean isStEndDt(MCDBContainer cond) {
			return MAUCL_StEndYmUtil.isStEndYm(cond);
		}

		protected String[] getBaseKey(MCDBContainer cond) {
			return MAUCL_StEndYmUtil.getBaseKey(cond);
		}

		/**
		 * ある年月において、１つの品目が複数の計画品目に属していないかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkDupItm(MAM_SPLN_ITM_CONF_R r) {
			MAM_SPLN_ITM_CONF_R t = MAM_SPLN_ITM_CONF_R.create("T");
			int i = execDbCount("MABSL0830_MAM_SPLN_ITM_CONF_S01", t,
					t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3")))
					.and(t.spln_itm_cd.neq(bind("spln_itm_cd")))
					.and(not(t.end_ym.lt(bind("st_ym"))))
					.and(not(t.st_ym.gt(bind("end_ym")))),
					r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_SPLN_ITM_CONF_R.$st_ym, MABSL0140,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispGUIIndex(r)));
			}
		}
	}

	/**
	 * SplnItmConf_Del01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの削除を行います。<br>
	 */
	public class SplnItmConf_Del01 extends MABSL_SplnItmConf_MC_A.SplnItmConf_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_SplnItmConf_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 販売計画品目構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_SplnItmConf_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}