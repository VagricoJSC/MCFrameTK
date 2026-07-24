package mcframe.serverMABC.MABCL0380;

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
import mcframe.serverMABC.MABCL0380.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.resource.MCConfig;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmLclReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmLclReg_MC extends MABCL_ItmLclReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目名称の登録前のチェックを行います。<br>
	 */
	public class ItmLcl_UpdChk01 extends MABCL_ItmLclReg_MC_A.ItmLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmLcl_UpdChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * ItmLcl_Upd01オペレーション.<p>
	 *
	 * 品目名称の登録を行います。<br>
	 */
	public class ItmLcl_Upd01 extends MABCL_ItmLclReg_MC_A.ItmLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmLcl_DelChk01オペレーション.<p>
	 *
	 * 品目名称の削除前のチェックを行います。<br>
	 */
	public class ItmLcl_DelChk01 extends MABCL_ItmLclReg_MC_A.ItmLcl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmLcl_DelChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * ItmLcl_Del01オペレーション.<p>
	 *
	 * 品目名称の削除を行います。<br>
	 */
	public class ItmLcl_Del01 extends MABCL_ItmLclReg_MC_A.ItmLcl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目名称の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmLclReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_LCL_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {

			MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");
			
			builder.setWhere(value(0).eq(value(0)));
			if (up0().reg_flg() && !up0().yet_flg()) {

				builder.addInnerJoin(itm1, t.itm_cd.eq(itm1.itm_cd)
						.and(t.itm_sub1.eq(itm1.itm_sub1))
						.and(t.itm_sub2.eq(itm1.itm_sub2))
						.and(t.itm_sub3.eq(itm1.itm_sub3)));
				builder.addWhereWithCutOffAnd(t.lcl_cd.like(bind(Srch01_CndR.$lcl_cd)));
			}
			else {
				MCTempView itmlcl1 = createTempView("ITMLCL1");
				MAM_ITM_LCL_R S1M = MAM_ITM_LCL_R.create("M");
				if (isNull(up0().lcl_cd())){
					builder.addInnerJoin(subQuery().select(S1M.prAll()).from(S1M).view(itmlcl1), t.itm_cd.eq(itmlcl1.pr("itm_cd"))
							.and(t.itm_sub1.eq(itmlcl1.pr("itm_sub1")))
							.and(t.itm_sub2.eq(itmlcl1.pr("itm_sub2")))
							.and(t.itm_sub3.eq(itmlcl1.pr("itm_sub3")))
							.and(t.lcl_cd.eq(itmlcl1.pr("lcl_cd"))));
				}
				else {
					builder.removeSelect(MAM_ITM_LCL_R.$lcl_cd);
					builder.addSelect(nvl(t.lcl_cd, value(up0().lcl_cd())).as("lcl_cd"));

					builder.addInnerJoin(subQuery().select(S1M.prAll()).from(S1M).where( S1M.lcl_cd.eq(bind(Srch01_CndR.$lcl_cd))).view(itmlcl1), t.itm_cd.eq(itmlcl1.pr("itm_cd"))
							.and(t.itm_sub1.eq(itmlcl1.pr("itm_sub1")))
							.and(t.itm_sub2.eq(itmlcl1.pr("itm_sub2")))
							.and(t.itm_sub3.eq(itmlcl1.pr("itm_sub3")))
							.and(t.lcl_cd.eq(itmlcl1.pr("lcl_cd"))));
				}
				builder.addFullOuterJoin(itm1, t.itm_cd.eq(itm1.itm_cd)
						.and(t.itm_sub1.eq(itm1.itm_sub1))
						.and(t.itm_sub2.eq(itm1.itm_sub2))
						.and(t.itm_sub3.eq(itm1.itm_sub3)));
				
				if (!up0().reg_flg() && up0().yet_flg()){
					builder.addWhereWithAnd(t.lcl_cd.isNull());
				}
				else {
					builder.addWhereWithAnd(itm1.itm_cd.isNotNull());
				}
			}
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));

			builder.addWhereWithCutOffAnd(itm1.itm_cd.like(bind(Srch01_CndR.$itm_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_sub1.like(bind(Srch01_CndR.$itm_sub1)));
			builder.addWhereWithCutOffAnd(itm1.itm_sub2.like(bind(Srch01_CndR.$itm_sub2)));
			builder.addWhereWithCutOffAnd(itm1.itm_sub3.like(bind(Srch01_CndR.$itm_sub3)));
			builder.addWhereWithCutOffAnd(t.itm_nm.like(bind(Srch01_CndR.$itm_nm)));
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$memo3)));
			
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));			
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
			
			builder.addWhereWithCutOffAnd(itm1.base_itm_nm.like(bind(Srch01_CndR.$itm_nm_std)));
			
			builder.removeSelect(MAM_ITM_LCL_R.$itm_cd);
			builder.addSelect(itm1.itm_cd);
			builder.removeSelect(MAM_ITM_LCL_R.$itm_sub1);
			builder.addSelect(itm1.itm_sub1);
			builder.removeSelect(MAM_ITM_LCL_R.$itm_sub2);
			builder.addSelect(itm1.itm_sub2);
			builder.removeSelect(MAM_ITM_LCL_R.$itm_sub3);
			builder.addSelect(itm1.itm_sub3);
			builder.addSelect(itm1.base_itm_nm.as("itm_nm_std"));
			
			builder.addSelect(decode( t.itm_cd, nullValue(), value(true), value(false)).as("yet_flg"));
			rslt.addBooleanColumn("yet_flg");
			
			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");

				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");

				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");

				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");

				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");

				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");

				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");

				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");

				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");

				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");

				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
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
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_ITM_LCL_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// ロケール名
			if (!isNull(r_src.lcl_cd())) {
				MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd", "lcl_nm");
				MCRow row = lclLst.getFirst("lcl_cd", r_src.lcl_cd());
				if (row != null) {
					r_dest.lcl_nm(row.getStringNE("lcl_nm"));
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目名称の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_ItmLclReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目名称の削除を行います。<br>
	 */
	public class Del01 extends MABCL_ItmLclReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}