package mcframe.serverMABS.MABSL0290;

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
import mcframe.serverMABS.MABSL0290.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmCompReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmCompReg_MC extends MABSL_ItmCompReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmComp_UpdChk01オペレーション.<p>
	 *
	 * 品目構成マスタの登録前のチェックを行います。<br>
	 */
	public class ItmComp_UpdChk01 extends MABSL_ItmCompReg_MC_A.ItmComp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for(MCConstRow row : up){
				
				if (!(row instanceof ItmComp_UpdChk01_DtlR)) {
					continue;
				}
				ItmComp_UpdChk01_DtlR r = (ItmComp_UpdChk01_DtlR) row;
				// 品目構成Gが未設定もしくは、通常構成FLGがFLASEの場合はチェック不要
				if(isNull(r.itm_comp_grp_cd()) || !r.def_flg()) {
					continue;
				}

				String[] cols = {ItmComp_UpdChk01_DtlR.$core_itm_cd
								,ItmComp_UpdChk01_DtlR.$core_itm_sub1
								,ItmComp_UpdChk01_DtlR.$core_itm_sub2
								,ItmComp_UpdChk01_DtlR.$core_itm_sub3
								,ItmComp_UpdChk01_DtlR.$itm_comp_grp_cd
								,ItmComp_UpdChk01_DtlR.$def_flg};
				if(up.groupList(cols).length > 1){
					MCMessage msg = new MCMessage(r, ItmComp_UpdChk01_DtlR.$def_flg, MABSL0053, 
							toDispItm(r.core_itm_cd(),r.core_itm_sub1(),r.core_itm_sub2(),r.core_itm_sub3()),
							r.itm_comp_grp_cd(), 
							toDispGUIIndex(r));
					msgList.add(msg);
				}

				msgList.addAll(checkDecPlace(r, ItmComp_UpdChk01_DtlR.$core_itm_dec_place, ItmComp_UpdChk01_DtlR.$core_itm_qty));
				msgList.addAll(checkDecPlace(r, ItmComp_UpdChk01_DtlR.$comp_itm_dec_place, ItmComp_UpdChk01_DtlR.$comp_itm_qty));
			}
			
			return msgList;
		}
	}
	/**
	 * ItmComp_Upd01オペレーション.<p>
	 *
	 * 品目構成マスタの登録を行います。<br>
	 */
	public class ItmComp_Upd01 extends MABSL_ItmCompReg_MC_A.ItmComp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmComp_DelChk01オペレーション.<p>
	 *
	 * 品目構成マスタの削除前のチェックを行います。<br>
	 */
	public class ItmComp_DelChk01 extends MABSL_ItmCompReg_MC_A.ItmComp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmComp_Del01オペレーション.<p>
	 *
	 * 品目構成マスタの削除を行います。<br>
	 */
	public class ItmComp_Del01 extends MABSL_ItmCompReg_MC_A.ItmComp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmCompReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_COMP_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			
			MAM_ITM_COMP_R t = MAM_ITM_COMP_R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");
			MAM_ITM__R itm2 = MAM_ITM__R.create("ITM2");
			MAM_UNIT_R unit2 = MAM_UNIT_R.create("UNIT2");
			MAVM_ITM_UNIT_R itm_unit1 = MAVM_ITM_UNIT_R.create("ITM_UNIT1");
			MAVM_ITM_UNIT_R itm_unit2 = MAVM_ITM_UNIT_R.create("ITM_UNIT2");
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			
			builder.addSelect(itm1.itm_typ.as("core_itm_typ"));
			builder.addSelect(itm1.itm_typ_d_cd.as("core_itm_typ_d_cd"));
			builder.addSelect(itmtypd1.itm_typ_d_nm.as("core_itm_typ_d_nm"));
			builder.addSelect(itm1.ship_unit_cd.as("core_itm_unit_cd"));
			builder.addSelect(unit2.unit_nm.as("core_itm_unit_nm"));
			builder.addSelect(itm_unit1.dec_place.as("core_itm_dec_place"));
			builder.addSelect(itm2.itm_typ.as("comp_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("comp_itm_typ_d_cd"));
			builder.addSelect(itmtypd2.itm_typ_d_nm.as("comp_itm_typ_d_nm"));
			builder.addSelect(itm_unit2.dec_place.as("comp_itm_dec_place"));
			builder.addLeftOuterJoin(unit2, bracket( itm1.ship_unit_cd.eq(unit2.unit_cd)));
			builder.addLeftOuterJoin(itm_unit1,
					bracket(t.core_itm_cd.eq(itm_unit1.itm_cd)
							.and(t.core_itm_sub1.eq(itm_unit1.itm_sub1))
							.and(t.core_itm_sub2.eq(itm_unit1.itm_sub2))
							.and(t.core_itm_sub3.eq(itm_unit1.itm_sub3))
							.and(itm1.ship_unit_cd.eq(itm_unit1.unit_cd))));
			builder.addLeftOuterJoin(itm_unit2,
					bracket(t.comp_itm_cd.eq(itm_unit2.itm_cd)
							.and(t.comp_itm_sub1.eq(itm_unit2.itm_sub1))
							.and(t.comp_itm_sub2.eq(itm_unit2.itm_sub2))
							.and(t.comp_itm_sub3.eq(itm_unit2.itm_sub3))
							.and(t.comp_itm_unit_cd.eq(itm_unit2.unit_cd))));

			builder.addLeftOuterJoin(itmtypd1, bracket( itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd))));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$core_itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$core_itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$core_itm_typ_d_nm)));

			builder.addLeftOuterJoin(itmtypd2, bracket( itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd))));
			builder.addWhereWithCutOffAnd(itm2.itm_typ.like(bind(Srch01_CndR.$comp_itm_typ)));
			builder.addWhereWithCutOffAnd(itm2.itm_typ_d_cd.like(bind(Srch01_CndR.$comp_itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd2.itm_typ_d_nm.like(bind(Srch01_CndR.$comp_itm_typ_d_nm)));

			if (!isNull(up0().core_itm_grp_nm1())) {
				MAM_ITM_GRP_R coreig1 = MAM_ITM_GRP_R.create("COREIG1");
				builder.addLeftOuterJoin(coreig1,
						bracket(itm1.itm_grp_cd1.eq(coreig1.itm_grp_cd)
								.and(coreig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())))));
				builder.addWhereWithCutOffAnd(
						coreig1.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm1)));
			}
			if (!isNull(up0().core_itm_grp_nm2())) {
				MAM_ITM_GRP_R coreig2 = MAM_ITM_GRP_R.create("COREIG2");
				builder.addLeftOuterJoin(coreig2,
						bracket(itm1.itm_grp_cd2.eq(coreig2.itm_grp_cd)
								.and(coreig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())))));
				builder.addWhereWithCutOffAnd(
						coreig2.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm2)));
			}
			if (!isNull(up0().core_itm_grp_nm3())) {
				MAM_ITM_GRP_R coreig3 = MAM_ITM_GRP_R.create("COREIG3");
				builder.addLeftOuterJoin(coreig3,
						bracket(itm1.itm_grp_cd3.eq(coreig3.itm_grp_cd)
								.and(coreig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())))));
				builder.addWhereWithCutOffAnd(
						coreig3.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm3)));
			}
			if (!isNull(up0().core_itm_grp_nm4())) {
				MAM_ITM_GRP_R coreig4 = MAM_ITM_GRP_R.create("COREIG4");
				builder.addLeftOuterJoin(coreig4,
						bracket(itm1.itm_grp_cd4.eq(coreig4.itm_grp_cd)
								.and(coreig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())))));
				builder.addWhereWithCutOffAnd(
						coreig4.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm4)));
			}
			if (!isNull(up0().core_itm_grp_nm5())) {
				MAM_ITM_GRP_R coreig5 = MAM_ITM_GRP_R.create("COREIG5");
				builder.addLeftOuterJoin(coreig5,
						bracket(itm1.itm_grp_cd5.eq(coreig5.itm_grp_cd)
								.and(coreig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())))));
				builder.addWhereWithCutOffAnd(
						coreig5.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm5)));
			}
			if (!isNull(up0().core_itm_grp_nm6())) {
				MAM_ITM_GRP_R coreig6 = MAM_ITM_GRP_R.create("COREIG6");
				builder.addLeftOuterJoin(coreig6,
						bracket(itm1.itm_grp_cd6.eq(coreig6.itm_grp_cd)
								.and(coreig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())))));
				builder.addWhereWithCutOffAnd(
						coreig6.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm6)));
			}
			if (!isNull(up0().core_itm_grp_nm7())) {
				MAM_ITM_GRP_R coreig7 = MAM_ITM_GRP_R.create("COREIG7");
				builder.addLeftOuterJoin(coreig7,
						bracket(itm1.itm_grp_cd7.eq(coreig7.itm_grp_cd)
								.and(coreig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())))));
				builder.addWhereWithCutOffAnd(
						coreig7.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm7)));
			}
			if (!isNull(up0().core_itm_grp_nm8())) {
				MAM_ITM_GRP_R coreig8 = MAM_ITM_GRP_R.create("COREIG8");
				builder.addLeftOuterJoin(coreig8,
						bracket(itm1.itm_grp_cd8.eq(coreig8.itm_grp_cd)
								.and(coreig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())))));
				builder.addWhereWithCutOffAnd(
						coreig8.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm8)));
			}
			if (!isNull(up0().core_itm_grp_nm9())) {
				MAM_ITM_GRP_R coreig9 = MAM_ITM_GRP_R.create("COREIG9");
				builder.addLeftOuterJoin(coreig9,
						bracket(itm1.itm_grp_cd9.eq(coreig9.itm_grp_cd)
								.and(coreig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())))));
				builder.addWhereWithCutOffAnd(
						coreig9.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm9)));
			}
			if (!isNull(up0().core_itm_grp_nm10())) {
				MAM_ITM_GRP_R coreig10 = MAM_ITM_GRP_R.create("COREIG10");
				builder.addLeftOuterJoin(coreig10,
						bracket(itm1.itm_grp_cd10.eq(coreig10.itm_grp_cd)
								.and(coreig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())))));
				builder.addWhereWithCutOffAnd(
						coreig10.itm_grp_nm.like(bind(Srch01_CndR.$core_itm_grp_nm10)));
			}

			if (!isNull(up0().comp_itm_grp_nm1())) {
				MAM_ITM_GRP_R compig1 = MAM_ITM_GRP_R.create("COMPIG1");
				builder.addLeftOuterJoin(compig1,
						bracket(itm2.itm_grp_cd1.eq(compig1.itm_grp_cd)
								.and(compig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())))));
				builder.addWhereWithCutOffAnd(
						compig1.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm1)));
			}
			if (!isNull(up0().comp_itm_grp_nm2())) {
				MAM_ITM_GRP_R compig2 = MAM_ITM_GRP_R.create("COMPIG2");
				builder.addLeftOuterJoin(compig2,
						bracket(itm2.itm_grp_cd2.eq(compig2.itm_grp_cd)
								.and(compig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())))));
				builder.addWhereWithCutOffAnd(
						compig2.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm2)));
			}
			if (!isNull(up0().comp_itm_grp_nm3())) {
				MAM_ITM_GRP_R compig3 = MAM_ITM_GRP_R.create("COMPIG3");
				builder.addLeftOuterJoin(compig3,
						bracket(itm2.itm_grp_cd3.eq(compig3.itm_grp_cd)
								.and(compig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())))));
				builder.addWhereWithCutOffAnd(
						compig3.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm3)));
			}
			if (!isNull(up0().comp_itm_grp_nm4())) {
				MAM_ITM_GRP_R compig4 = MAM_ITM_GRP_R.create("COMPIG4");
				builder.addLeftOuterJoin(compig4,
						bracket(itm2.itm_grp_cd4.eq(compig4.itm_grp_cd)
								.and(compig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())))));
				builder.addWhereWithCutOffAnd(
						compig4.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm4)));
			}
			if (!isNull(up0().comp_itm_grp_nm5())) {
				MAM_ITM_GRP_R compig5 = MAM_ITM_GRP_R.create("COMPIG5");
				builder.addLeftOuterJoin(compig5,
						bracket(itm2.itm_grp_cd5.eq(compig5.itm_grp_cd)
								.and(compig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())))));
				builder.addWhereWithCutOffAnd(
						compig5.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm5)));
			}
			if (!isNull(up0().comp_itm_grp_nm6())) {
				MAM_ITM_GRP_R compig6 = MAM_ITM_GRP_R.create("COMPIG6");
				builder.addLeftOuterJoin(compig6,
						bracket(itm2.itm_grp_cd6.eq(compig6.itm_grp_cd)
								.and(compig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())))));
				builder.addWhereWithCutOffAnd(
						compig6.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm6)));
			}
			if (!isNull(up0().comp_itm_grp_nm7())) {
				MAM_ITM_GRP_R compig7 = MAM_ITM_GRP_R.create("COMPIG7");
				builder.addLeftOuterJoin(compig7,
						bracket(itm2.itm_grp_cd7.eq(compig7.itm_grp_cd)
								.and(compig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())))));
				builder.addWhereWithCutOffAnd(
						compig7.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm7)));
			}
			if (!isNull(up0().comp_itm_grp_nm8())) {
				MAM_ITM_GRP_R compig8 = MAM_ITM_GRP_R.create("COMPIG8");
				builder.addLeftOuterJoin(compig8,
						bracket(itm2.itm_grp_cd8.eq(compig8.itm_grp_cd)
								.and(compig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())))));
				builder.addWhereWithCutOffAnd(
						compig8.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm8)));
			}
			if (!isNull(up0().comp_itm_grp_nm9())) {
				MAM_ITM_GRP_R compig9 = MAM_ITM_GRP_R.create("COMPIG9");
				builder.addLeftOuterJoin(compig9,
						bracket(itm2.itm_grp_cd9.eq(compig9.itm_grp_cd)
								.and(compig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())))));
				builder.addWhereWithCutOffAnd(
						compig9.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm9)));
			}
			if (!isNull(up0().comp_itm_grp_nm10())) {
				MAM_ITM_GRP_R compig10 = MAM_ITM_GRP_R.create("COMPIG10");
				builder.addLeftOuterJoin(compig10,
						bracket(itm2.itm_grp_cd10.eq(compig10.itm_grp_cd)
								.and(compig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())))));
				builder.addWhereWithCutOffAnd(
						compig10.itm_grp_nm.like(bind(Srch01_CndR.$comp_itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$core_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$core_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$core_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$core_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$core_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$core_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$core_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$core_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$core_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$core_itm_grp_cd10)));
			
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd1.like(bind(Srch01_CndR.$comp_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd2.like(bind(Srch01_CndR.$comp_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd3.like(bind(Srch01_CndR.$comp_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd4.like(bind(Srch01_CndR.$comp_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd5.like(bind(Srch01_CndR.$comp_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd6.like(bind(Srch01_CndR.$comp_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd7.like(bind(Srch01_CndR.$comp_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd8.like(bind(Srch01_CndR.$comp_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd9.like(bind(Srch01_CndR.$comp_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd10.like(bind(Srch01_CndR.$comp_itm_grp_cd10)));
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_ITM_COMP_R r_src){
			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.core_itm_typ(r_src.getStringNE("core_itm_typ"));
			r_dest.core_itm_typ_d_cd(r_src.getStringNE("core_itm_typ_d_cd"));
			r_dest.core_itm_typ_d_nm(r_src.getStringNE("core_itm_typ_d_nm"));
			r_dest.core_itm_unit_cd(r_src.getStringNE("core_itm_unit_cd"));
			r_dest.core_itm_unit_nm(r_src.getStringNE("core_itm_unit_nm"));
			r_dest.core_itm_dec_place(r_src.getNumberNE("core_itm_dec_place"));
			r_dest.comp_itm_typ(r_src.getStringNE("comp_itm_typ"));
			r_dest.comp_itm_typ_d_cd(r_src.getStringNE("comp_itm_typ_d_cd"));
			r_dest.comp_itm_typ_d_nm(r_src.getStringNE("comp_itm_typ_d_nm"));
			r_dest.comp_itm_dec_place(r_src.getNumberNE("comp_itm_dec_place"));
		}	
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目構成マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ItmCompReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmCompReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}