package mcframe.serverMABC.MABCL0860;

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
import mcframe.serverMABC.MABCL0860.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_StdcostReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_StdcostReg_MC extends MABCL_StdcostReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Stdcost_UpdChk01オペレーション.<p>
	 *
	 * 標準単価マスタの登録前のチェックを行います。<br>
	 */
	public class Stdcost_UpdChk01 extends MABCL_StdcostReg_MC_A.Stdcost_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					Stdcost_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			// 標準単価小数部有効桁数
			MCNumber upriDecPlace = getUpriDecPlace().upri_dec_place();
			
			for (Stdcost_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				r.setNumberNE(Stdcost_UpdChk01_DtlR.$upri_dec_place, upriDecPlace);
				msgList.addAll(checkDecPlace(r, Stdcost_UpdChk01_DtlR.$dec_place, Stdcost_UpdChk01_DtlR.$std_qty));
				msgList.addAll(checkDecPlace(r, Stdcost_UpdChk01_DtlR.$upri_dec_place, Stdcost_UpdChk01_DtlR.$std_upri));
				if (!isNull(r.sub_upri1())){
					msgList.addAll(checkDecPlace(r, Stdcost_UpdChk01_DtlR.$upri_dec_place, Stdcost_UpdChk01_DtlR.$sub_upri1));
				}
				if (!isNull(r.sub_upri2())){
					msgList.addAll(checkDecPlace(r, Stdcost_UpdChk01_DtlR.$upri_dec_place, Stdcost_UpdChk01_DtlR.$sub_upri2));
				}
				if (!isNull(r.sub_upri3())){
					msgList.addAll(checkDecPlace(r, Stdcost_UpdChk01_DtlR.$upri_dec_place, Stdcost_UpdChk01_DtlR.$sub_upri3));
				}
			}
			return msgList;
		}
		
		// 標準単価小数部有効桁数を取得
		protected MAM_CUR_R getUpriDecPlace() {
			MAM_CUR_R curR = MAM_CUR_R.create();
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder curR_bldr = MCQueryApiBuilder.create(t);
			curR_bldr.addWhereWithAnd(t.cur_cd.eq(bind("1")), getCo().base_cur_cd());
			dbSelect("MABCL0860_MAM_CUR_S01", curR, curR_bldr);
			return curR;
		}
	}
	/**
	 * Stdcost_Upd01オペレーション.<p>
	 *
	 * 標準単価マスタの登録を行います。<br>
	 */
	public class Stdcost_Upd01 extends MABCL_StdcostReg_MC_A.Stdcost_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Stdcost_DelChk01オペレーション.<p>
	 *
	 * 標準単価マスタの削除前のチェックを行います。<br>
	 */
	public class Stdcost_DelChk01 extends MABCL_StdcostReg_MC_A.Stdcost_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					Stdcost_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * Stdcost_Del01オペレーション.<p>
	 *
	 * 標準単価マスタの削除を行います。<br>
	 */
	public class Stdcost_Del01 extends MABCL_StdcostReg_MC_A.Stdcost_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準単価マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_StdcostReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);

			cond.setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_STDCOST__R) {
				dbcCustomizeSub(builder);
			}
		}

		private void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_STDCOST__R t = MAM_STDCOST__R.create(builder.getBaseDbcAlias());
			MAVM_RD_WG_R wg2 = MAVM_RD_WG_R.create("WG2");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(wg2.prAll()).from(wg2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(wg2.wg_cd))))));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(exists(subQuery().select(wg2.prAll()).from(wg2)
						.where(value(0).eq(value(0))
								.and(t.wg_cd.eq(wg2.wg_cd)))));
			}

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_STDCOST__R.$ITM1);
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			// 品目区分、品目区分詳細
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);

			// 期をwhere句に追加しています。
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));

			// 基準単位情報をselect句に追加しています
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAVM_ITM_UNIT_R itm_unit1 = MAVM_ITM_UNIT_R.create("ITM_UNIT1");
			builder.addLeftOuterJoin(itm_unit1,
					itm1.itm_cd.eq(itm_unit1.itm_cd)
							.and(itm1.itm_sub1.eq(itm_unit1.itm_sub1))
							.and(itm1.itm_sub2.eq(itm_unit1.itm_sub2))
							.and(itm1.itm_sub3.eq(itm_unit1.itm_sub3))
							.and(itm1.unit_cd.eq(itm_unit1.unit_cd)));
			builder.addLeftOuterJoin(unit1, itm1.unit_cd.eq(unit1.unit_cd));
			builder.addSelect(itm1.unit_cd);
			builder.addSelect(unit1.unit_nm);
			builder.addSelect(itm_unit1.dec_place);

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

			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			MAM_CUR_R cur1 = MAM_CUR_R.create("CUR1");
			builder.addInnerJoin(cur1, cur1.cur_cd.eq(bind("base_cur_cd")));
			builder.addSelect(cur1.cur_cd);
			builder.addSelect(cur1.cur_nm);
			builder.addSelect(cur1.upri_dec_place);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 標準単価マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_StdcostReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 標準単価マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_StdcostReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}