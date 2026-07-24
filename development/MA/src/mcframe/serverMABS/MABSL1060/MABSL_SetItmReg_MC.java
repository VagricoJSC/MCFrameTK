package mcframe.serverMABS.MABSL1060;

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
import mcframe.serverMABS.MABSL1060.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_SetItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_SetItmReg_MC extends MABSL_SetItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SetGrp_UpdChk01オペレーション.<p>
	 *
	 * 品揃グループマスタの登録前のチェックを行います。<br>
	 */
	public class SetGrp_UpdChk01 extends MABSL_SetItmReg_MC_A.SetGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SetGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.set_grp_cd())){
					msgList.add(new MCMessage(r, SetGrp_UpdChk01_DtlR.$set_grp_cd, MABCL0306, 
									getLabel(r, SetGrp_UpdChk01_DtlR.$set_grp_cd), r.set_grp_cd(), toDispGUIIndex(r)));
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
	 * SetGrp_Upd01オペレーション.<p>
	 *
	 * 品揃グループマスタの登録を行います。<br>
	 */
	public class SetGrp_Upd01 extends MABSL_SetItmReg_MC_A.SetGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetItm_UpdChk01オペレーション.<p>
	 *
	 * 品揃マスタの登録前のチェックを行います。<br>
	 */
	public class SetItm_UpdChk01 extends MABSL_SetItmReg_MC_A.SetItm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (SetItm_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				// 数量の小数部有効桁数チェック
				msgList.addAll(checkDecPlace(r, SetItm_UpdChk01_DtlR.$main_itm_dec_place, SetItm_UpdChk01_DtlR.$main_itm_qty));
				msgList.addAll(checkDecPlace(r, SetItm_UpdChk01_DtlR.$set_itm_dec_place, SetItm_UpdChk01_DtlR.$set_itm_qty));
			}
			return msgList;
		}
	}
	/**
	 * SetItm_Upd01オペレーション.<p>
	 *
	 * 品揃マスタの登録を行います。<br>
	 */
	public class SetItm_Upd01 extends MABSL_SetItmReg_MC_A.SetItm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品揃グループマスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	public class SetGrpLcl_UpdChk01 extends MABSL_SetItmReg_MC_A.SetGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品揃グループマスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class SetGrpLcl_Upd01 extends MABSL_SetItmReg_MC_A.SetGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetGrp_DelChk01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの削除前のチェックを行います。<br>
	 */
	public class SetGrp_DelChk01 extends MABSL_SetItmReg_MC_A.SetGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SetGrp_Del01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの削除を行います。<br>
	 */
	public class SetGrp_Del01 extends MABSL_SetItmReg_MC_A.SetGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {

			
			if (list.createRow() instanceof MAM_SET_ITM_R) {
				dbDelLcl(builder, list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}

	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_SetItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_SetItmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品揃グループマスタ、品揃マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_SetItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected List<String> getSelectLclGrpNames() {

			List<String> l = new ArrayList<String>();
			l.add("SELECT_SET_ITM");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}

		@Override
		protected List<String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_SET_GRP_R) {
				dbcCustomizeSub_SetGrp(builder);
			}
		}

		protected void dbcCustomizeSub_SetGrp(MCQueryApiBuilder builder) {
			
			MAM_SET_ITM_R S1SET_ITM1 = MAM_SET_ITM_R.create("SET_ITM1");
			MAM_ITM__R S1ITM1 = MAM_ITM__R.create("ITM1");
			MAM_ITM__R S1ITM2 = MAM_ITM__R.create("ITM2");
			MAM_SET_GRP_R t = MAM_SET_GRP_R.create(builder.getBaseDbcAlias());

			if (!isNullAnd(up0().main_itm_cd(), up0().main_itm_sub1(),
					up0().main_itm_sub2(), up0().main_itm_sub3(),
					up0().main_itm_nm(), up0().set_itm_cd(), up0().set_itm_sub1(),
					up0().set_itm_sub2(),up0().set_itm_sub3(), up0().set_itm_nm())) {
				builder.addWhereWithAnd(exists( subQuery() .select(S1SET_ITM1.prAll(), S1ITM1.prAll(), S1ITM2.prAll())
						.from( S1SET_ITM1 .leftOuterJoin(S1ITM1)
								.on( bracket( S1SET_ITM1.main_itm_cd.eq(S1ITM1.itm_cd)
								.and(S1SET_ITM1.main_itm_sub1.eq(S1ITM1.itm_sub1))
								.and(S1SET_ITM1.main_itm_sub2.eq(S1ITM1.itm_sub2))
								.and(S1SET_ITM1.main_itm_sub3.eq(S1ITM1.itm_sub3))))
						.leftOuterJoin(S1ITM2).on( bracket( S1SET_ITM1.set_itm_cd.eq(S1ITM2.itm_cd)
								.and(S1SET_ITM1.set_itm_sub1.eq(S1ITM2.itm_sub1))
								.and(S1SET_ITM1.set_itm_sub2.eq(S1ITM2.itm_sub2))
								.and(S1SET_ITM1.set_itm_sub3.eq(S1ITM2.itm_sub3)))))
						.where( S1SET_ITM1.set_grp_cd.eq(t.set_grp_cd)
								.cutoff$and(S1SET_ITM1.main_itm_cd.like(bind("main_itm_cd")))
								.cutoff$and(S1SET_ITM1.main_itm_sub1.like(bind("main_itm_sub1")))
								.cutoff$and(S1SET_ITM1.main_itm_sub2.like(bind("main_itm_sub2")))
								.cutoff$and(S1SET_ITM1.main_itm_sub3.like(bind("main_itm_sub3")))
								.cutoff$and(S1ITM1.itm_nm.like(bind("main_itm_nm")))
								.cutoff$and(S1SET_ITM1.set_itm_cd.like(bind("set_itm_cd")))
								.cutoff$and(S1SET_ITM1.set_itm_sub1.like(bind("set_itm_sub1")))
								.cutoff$and(S1SET_ITM1.set_itm_sub2.like(bind("set_itm_sub2")))
								.cutoff$and(S1SET_ITM1.set_itm_sub3.like(bind("set_itm_sub3")))
								.cutoff$and(S1ITM2.itm_nm.like(bind("set_itm_nm"))))));
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_SET_ITM_R) {
				dbcCustomizeSub_SetItm(builder);
			}
		}

		protected  void dbcCustomizeSub_SetItm(MCQueryApiBuilder builder) {
			MAM_SET_ITM_R t = MAM_SET_ITM_R.create(builder.getBaseDbcAlias());

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_SET_ITM_R.$ITM1);
			MAM_ITM__R itm2 = MAM_ITM__R.create(MAM_SET_ITM_R.$ITM2);
			builder.addLeftOuterJoin(itm1,
					t.main_itm_cd.eq(itm1.itm_cd)
					.and(t.main_itm_sub1.eq(itm1.itm_sub1))
					.and(t.main_itm_sub2.eq(itm1.itm_sub2))
					.and(t.main_itm_sub3.eq(itm1.itm_sub3)));
			builder.addLeftOuterJoin(itm2,
					t.set_itm_cd.eq(itm2.itm_cd)
					.and(t.set_itm_sub1.eq(itm2.itm_sub1))
					.and(t.set_itm_sub2.eq(itm2.itm_sub2))
					.and(t.set_itm_sub3.eq(itm2.itm_sub3)));
			
			MAM_UNIT_R unit1 = MAM_UNIT_R.create(MAM_SET_ITM_R.$UNIT1);
			MAM_UNIT_R unit2 = MAM_UNIT_R.create(MAM_SET_ITM_R.$UNIT2);
			builder.addLeftOuterJoin(unit1, t.main_itm_unit_cd.eq(unit1.unit_cd));
			builder.addLeftOuterJoin(unit2, t.set_itm_unit_cd.eq(unit2.unit_cd));
			
			MAVM_ITM_UNIT_R itm_unit1 = MAVM_ITM_UNIT_R.create("ITM_UNIT1");
			MAVM_ITM_UNIT_R itm_unit2 = MAVM_ITM_UNIT_R.create("ITM_UNIT2");
			builder.addLeftOuterJoin(itm_unit1,
					t.main_itm_cd.eq(itm_unit1.itm_cd)
					.and(t.main_itm_sub1.eq(itm_unit1.itm_sub1))
					.and(t.main_itm_sub2.eq(itm_unit1.itm_sub2))
					.and(t.main_itm_sub3.eq(itm_unit1.itm_sub3))
					.and(t.main_itm_unit_cd.eq(itm_unit1.unit_cd)));
			builder.addLeftOuterJoin(itm_unit2,
					t.set_itm_cd.eq(itm_unit2.itm_cd)
					.and(t.set_itm_sub1.eq(itm_unit2.itm_sub1))
					.and(t.set_itm_sub2.eq(itm_unit2.itm_sub2))
					.and(t.set_itm_sub3.eq(itm_unit2.itm_sub3))
					.and(t.set_itm_unit_cd.eq(itm_unit2.unit_cd)));

			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addLeftOuterJoin(itmtypd2, itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd)));

			builder.addSelect(itm1.itm_nm.as("main_itm_nm"));
			builder.addSelect(unit1.unit_nm.as("main_itm_unit_nm"));
			builder.addSelect(itm2.itm_nm.as("set_itm_nm"));
			builder.addSelect(unit2.unit_nm.as("set_itm_unit_nm"));

			builder.addSelect(itm_unit1.dec_place.as("main_itm_dec_place"));
			builder.addSelect(itm1.itm_typ.as("main_itm_typ"));
			builder.addSelect(itm1.itm_typ_d_cd.as("main_itm_typ_d_cd"));
			builder.addSelect(itmtypd1.itm_typ_d_nm.as("main_itm_typ_d_nm"));

			builder.addSelect(itm_unit2.dec_place.as("set_itm_dec_place"));
			builder.addSelect(itm2.itm_typ.as("set_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("set_itm_typ_d_cd"));
			builder.addSelect(itmtypd2.itm_typ_d_nm.as("set_itm_typ_d_nm"));
		}
		@Override
		protected void downColumnsDataLcl(java.lang.String grp) {
			super.downColumnsDataLcl(grp);
			setConstNm(down1());
		}
	}

	//FMCB CUSTOM END
}