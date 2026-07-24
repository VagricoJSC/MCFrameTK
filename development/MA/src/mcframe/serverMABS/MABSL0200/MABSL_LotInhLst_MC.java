package mcframe.serverMABS.MABSL0200;

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
import mcframe.serverMABC.MABCL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_LotInhLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_LotInhLst_MC extends MABSL_LotInhLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABSL_LotInhLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_LOT_INH_DEST_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAVM_BOM_R bom1 = MAVM_BOM_R.create("BOM1");
			MAVM_BOM_R bom2 = MAVM_BOM_R.create("BOM2");
			MAM_LOT_INH_SRC_R lot_inh_src = MAM_LOT_INH_SRC_R.create("LOT_INH_SRC");
			MAM_LOT_INH_DEST_R t = MAM_LOT_INH_DEST_R.create(builder.getBaseDbcAlias());
			builder.removeSelect(MAM_LOT_INH_DEST_R.$memo1);
			builder.addSelect(t.memo1.as("dest_memo1"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$memo2);
			builder.addSelect(t.memo2.as("dest_memo2"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$memo3);
			builder.addSelect(t.memo3.as("dest_memo3"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$ins_usr_id);
			builder.addSelect(t.ins_usr_id.as("dest_ins_usr_id"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$ins_usr_nm);
			builder.addSelect(t.ins_usr_nm.as("dest_ins_usr_nm"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$ins_ts);
			builder.addSelect(t.ins_ts.as("dest_ins_ts"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$ins_func_id);
			builder.addSelect(t.ins_func_id.as("dest_ins_func_id"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_cntr);
			builder.addSelect(t.upd_cntr.as("dest_upd_cntr"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_usr_id);
			builder.addSelect(t.upd_usr_id.as("dest_upd_usr_id"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_usr_nm);
			builder.addSelect(t.upd_usr_nm.as("dest_upd_usr_nm"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_ts);
			builder.addSelect(t.upd_ts.as("dest_upd_ts"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_func_id);
			builder.addSelect(t.upd_func_id.as("dest_upd_func_id"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$upd_srv_req_no);
			builder.addSelect(t.upd_srv_req_no.as("dest_upd_srv_req_no"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$del_usr_id);
			builder.addSelect(t.del_usr_id.as("dest_del_usr_id"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$del_usr_nm);
			builder.addSelect(t.del_usr_nm.as("dest_del_usr_nm"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$del_ts);
			builder.addSelect(t.del_ts.as("dest_del_ts"));
			builder.removeSelect(MAM_LOT_INH_DEST_R.$del_flg);
			builder.addSelect(lot_inh_src.del_flg);
			builder.addSelect(lot_inh_src.chd_itm_cd);
			builder.addSelect(lot_inh_src.chd_itm_sub1);
			builder.addSelect(lot_inh_src.chd_itm_sub2);
			builder.addSelect(lot_inh_src.chd_itm_sub3);
			builder.addSelect(lot_inh_src.prio);
			builder.addSelect(lot_inh_src.memo1.as("src_memo1"));
			builder.addSelect(lot_inh_src.memo2.as("src_memo2"));
			builder.addSelect(lot_inh_src.memo3.as("src_memo3"));
			builder.addSelect(lot_inh_src.ins_usr_id.as("src_ins_usr_id"));
			builder.addSelect(lot_inh_src.ins_usr_nm.as("src_ins_usr_nm"));
			builder.addSelect(lot_inh_src.ins_ts.as("src_ins_ts"));
			builder.addSelect(lot_inh_src.ins_func_id.as("src_ins_func_id"));
			builder.addSelect(lot_inh_src.upd_cntr.as("src_upd_cntr"));
			builder.addSelect(lot_inh_src.upd_usr_id.as("src_upd_usr_id"));
			builder.addSelect(lot_inh_src.upd_usr_nm.as("src_upd_usr_nm"));
			builder.addSelect(lot_inh_src.upd_ts.as("src_upd_ts"));
			builder.addSelect(lot_inh_src.upd_func_id.as("src_upd_func_id"));
			builder.addSelect(lot_inh_src.upd_srv_req_no.as("src_upd_srv_req_no"));
			builder.addSelect(lot_inh_src.del_usr_id.as("src_del_usr_id"));
			builder.addSelect(lot_inh_src.del_usr_nm.as("src_del_usr_nm"));
			builder.addSelect(lot_inh_src.del_ts.as("src_del_ts"));
			builder.addSelect(bom1.st_dt);
			builder.addSelect(bom2.end_dt);

			builder.addInnerJoin(lot_inh_src,
					t.par_itm_cd.eq(lot_inh_src.par_itm_cd)
							.and(t.par_itm_sub1.eq(lot_inh_src.par_itm_sub1))
							.and(t.par_itm_sub2.eq(lot_inh_src.par_itm_sub2))
							.and(t.par_itm_sub3.eq(lot_inh_src.par_itm_sub3))
							.and(t.bom_ptn.eq(lot_inh_src.bom_ptn))
							.and(t.wg_cd.eq(lot_inh_src.wg_cd))
							.and(t.lot_inh_col_typ.eq(lot_inh_src.lot_inh_col_typ)));

			MAM_ITM__R itm2 = MAM_ITM__R.create("ITM2");
			builder.addLeftOuterJoin(itm2,
					lot_inh_src.chd_itm_cd.eq(itm2.itm_cd)
							.and(lot_inh_src.chd_itm_sub1.eq(itm2.itm_sub1))
							.and(lot_inh_src.chd_itm_sub2.eq(itm2.itm_sub2))
							.and(lot_inh_src.chd_itm_sub3.eq(itm2.itm_sub3)));

			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			builder.addLeftOuterJoin(itmtypd2, itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd)));

			MAVM_BOM_R S1BOM1S = MAVM_BOM_R.create("BOM1S");
			builder.addLeftOuterJoin(bom1, t.wg_cd.eq(bom1.wg_cd)
					.and(t.par_itm_cd.eq(bom1.par_itm_cd))
					.and(t.par_itm_sub1.eq(bom1.par_itm_sub1))
					.and(t.par_itm_sub2.eq(bom1.par_itm_sub2))
					.and(t.par_itm_sub3.eq(bom1.par_itm_sub3))
					.and(t.bom_ptn.eq(bom1.bom_ptn))
					.and(lot_inh_src.chd_itm_cd.eq(bom1.chd_itm_cd))
					.and(lot_inh_src.chd_itm_sub1.eq(bom1.chd_itm_sub1))
					.and(lot_inh_src.chd_itm_sub2.eq(bom1.chd_itm_sub2))
					.and(lot_inh_src.chd_itm_sub3.eq(bom1.chd_itm_sub3))
					.and(bom1.st_dt.eq(subQuery().select(min(S1BOM1S.st_dt)).from(S1BOM1S)
							.where(bom1.wg_cd.eq(S1BOM1S.wg_cd)
									.and(bom1.par_itm_cd.eq(S1BOM1S.par_itm_cd))
									.and(bom1.par_itm_sub1.eq(S1BOM1S.par_itm_sub1))
									.and(bom1.par_itm_sub2.eq(S1BOM1S.par_itm_sub2))
									.and(bom1.par_itm_sub3.eq(S1BOM1S.par_itm_sub3))
									.and(bom1.bom_ptn.eq(S1BOM1S.bom_ptn))
									.and(bom1.chd_itm_cd.eq(S1BOM1S.chd_itm_cd))
									.and(bom1.chd_itm_sub1.eq(S1BOM1S.chd_itm_sub1))
									.and(bom1.chd_itm_sub2.eq(S1BOM1S.chd_itm_sub2))
									.and(bom1.chd_itm_sub3.eq(S1BOM1S.chd_itm_sub3))))));

			MAVM_BOM_R S1BOM2S = MAVM_BOM_R.create("BOM2S");
			builder.addLeftOuterJoin(bom2, t.wg_cd.eq(bom2.wg_cd)
					.and(t.par_itm_cd.eq(bom2.par_itm_cd))
					.and(t.par_itm_sub1.eq(bom2.par_itm_sub1))
					.and(t.par_itm_sub2.eq(bom2.par_itm_sub2))
					.and(t.par_itm_sub3.eq(bom2.par_itm_sub3))
					.and(t.bom_ptn.eq(bom2.bom_ptn))
					.and(lot_inh_src.chd_itm_cd.eq(bom2.chd_itm_cd))
					.and(lot_inh_src.chd_itm_sub1.eq(bom2.chd_itm_sub1))
					.and(lot_inh_src.chd_itm_sub2.eq(bom2.chd_itm_sub2))
					.and(lot_inh_src.chd_itm_sub3.eq(bom2.chd_itm_sub3))
					.and(bom2.end_dt.eq(subQuery().select(max(S1BOM2S.end_dt))
							.from(S1BOM2S)
							.where(bom2.wg_cd.eq(S1BOM2S.wg_cd)
									.and(bom2.par_itm_cd.eq(S1BOM2S.par_itm_cd))
									.and(bom2.par_itm_sub1.eq(S1BOM2S.par_itm_sub1))
									.and(bom2.par_itm_sub2.eq(S1BOM2S.par_itm_sub2))
									.and(bom2.par_itm_sub3.eq(S1BOM2S.par_itm_sub3))
									.and(bom2.bom_ptn.eq(S1BOM2S.bom_ptn))
									.and(bom2.chd_itm_cd.eq(S1BOM2S.chd_itm_cd))
									.and(bom2.chd_itm_sub1.eq(S1BOM2S.chd_itm_sub1))
									.and(bom2.chd_itm_sub2.eq(S1BOM2S.chd_itm_sub2))
									.and(bom2.chd_itm_sub3.eq(S1BOM2S.chd_itm_sub3))))));

			builder.setWhere(value(0).eq(value(0)));

			// ワーキンググループ
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd))))));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(
						exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)))));
			}
			MAM_WG_R wg1 = MAM_WG_R.create(MAM_LOT_INH_DEST_R.$WG1);
			builder.addWhereWithCutOffAnd(wg1.wg_nm.like(bind(Srch01_CndR.$wg_nm)));

			// 適用日開始日、適用終了日
			builder.addWhereWithCutOffAnd(
					bom1.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)).or(bom1.st_dt.isNull()));
			builder.addWhereWithCutOffAnd(
					bom1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)).or(bom1.st_dt.isNull()));
			builder.addWhereWithCutOffAnd(bom2.end_dt.gte(bind(Srch01_CndR.$end_dt_fr))
					.or(bom2.end_dt.isNull()));
			builder.addWhereWithCutOffAnd(bom2.end_dt.lte(bind(Srch01_CndR.$end_dt_to))
					.or(bom2.end_dt.isNull()));

			// 親品目
			builder.addWhereWithCutOffAnd(
					t.par_itm_cd.like(bind(Srch01_CndR.$par_itm_cd)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub1.like(bind(Srch01_CndR.$par_itm_sub1)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub2.like(bind(Srch01_CndR.$par_itm_sub2)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub3.like(bind(Srch01_CndR.$par_itm_sub3)));

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_LOT_INH_DEST_R.$ITM1);
			builder.addWhereWithCutOffAnd(
					itm1.itm_nm.like(bind(Srch01_CndR.$par_itm_nm)));
			// 親品目区分、親品目区分詳細
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			builder.addSelect(itm1.itm_typ.as("par_itm_typ"));
			builder.addSelect(itm1.itm_typ_d_cd.as("par_itm_typ_d_cd"));
			builder.addSelect(itm_typ_d1.itm_typ_d_nm.as("par_itm_typ_d_nm"));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ.like(bind(Srch01_CndR.$par_itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$par_itm_typ_d_cd)));
			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$par_itm_typ_d_nm)));

			// 子品目
			builder.addWhereWithCutOffAnd(
					lot_inh_src.chd_itm_cd.like(bind(Srch01_CndR.$chd_itm_cd)));
			builder.addWhereWithCutOffAnd(
					lot_inh_src.chd_itm_sub1.like(bind(Srch01_CndR.$chd_itm_sub1)));
			builder.addWhereWithCutOffAnd(
					lot_inh_src.chd_itm_sub2.like(bind(Srch01_CndR.$chd_itm_sub2)));
			builder.addWhereWithCutOffAnd(
					lot_inh_src.chd_itm_sub3.like(bind(Srch01_CndR.$chd_itm_sub3)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_nm.like(bind(Srch01_CndR.$chd_itm_nm)));

			// 子品目区分、子品目区分詳細
			MAM_ITM_TYP_D_R itm_typ_d2 = MAM_ITM_TYP_D_R.create("ITM_TYP_D2");
			builder.addSelect(itm2.itm_nm.as("chd_itm_nm"));
			builder.addSelect(itm2.itm_typ.as("chd_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("chd_itm_typ_d_cd"));
			builder.addSelect(itm_typ_d2.itm_typ_d_nm.as("chd_itm_typ_d_nm"));
			builder.addWhereWithCutOffAnd(
					itm2.itm_typ.like(bind(Srch01_CndR.$chd_itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_typ_d_cd.like(bind(Srch01_CndR.$chd_itm_typ_d_cd)));
			builder.addLeftOuterJoin(itm_typ_d2, itm2.itm_typ.eq(itm_typ_d2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itm_typ_d2.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itm_typ_d2.itm_typ_d_nm.like(bind(Srch01_CndR.$chd_itm_typ_d_nm)));

			// ワーキンググループＣＤ、継承項目区分、構成パタン
			builder.addWhereWithCutOffAnd(t.wg_cd.like(bind(Srch01_CndR.$wg_cd)));
			builder.addWhereWithCutOffAnd(
					t.lot_inh_col_typ.like(bind(Srch01_CndR.$lot_inh_col_typ)));
			builder.addWhereWithCutOffAnd(t.bom_ptn.like(bind(Srch01_CndR.$bom_ptn)));

			// メモ１～３（継承先）
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$dest_memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$dest_memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$dest_memo3)));

			// メモ１～３（継承元）
			builder.addWhereWithCutOffAnd(
					lot_inh_src.memo1.like(bind(Srch01_CndR.$src_memo1)));
			builder.addWhereWithCutOffAnd(
					lot_inh_src.memo2.like(bind(Srch01_CndR.$src_memo2)));
			builder.addWhereWithCutOffAnd(
					lot_inh_src.memo3.like(bind(Srch01_CndR.$src_memo3)));

			// 論理削除
			if (up0().off_del_flg() && !up0().on_del_flg()) {
				builder.addWhereWithAnd(
						nvl(lot_inh_src.del_flg, value(false)).eq(value(false)));
			}
			else if (!up0().off_del_flg() && up0().on_del_flg()) {
				builder.addWhereWithAnd(
						nvl(lot_inh_src.del_flg, value(true)).eq(value(true)));
			}

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
			// 親品目分類
			if (!isNull(up0().par_itm_grp_nm1())) {
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm1)));
			}
			if (!isNull(up0().par_itm_grp_nm2())) {
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm2)));
			}
			if (!isNull(up0().par_itm_grp_nm3())) {
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm3)));
			}
			if (!isNull(up0().par_itm_grp_nm4())) {
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm4)));
			}
			if (!isNull(up0().par_itm_grp_nm5())) {
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm5)));
			}
			if (!isNull(up0().par_itm_grp_nm6())) {
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm6)));
			}
			if (!isNull(up0().par_itm_grp_nm7())) {
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm7)));
			}
			if (!isNull(up0().par_itm_grp_nm8())) {
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm8)));
			}
			if (!isNull(up0().par_itm_grp_nm9())) {
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm9)));
			}
			if (!isNull(up0().par_itm_grp_nm10())) {
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd1.like(bind(Srch01_CndR.$par_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd2.like(bind(Srch01_CndR.$par_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd3.like(bind(Srch01_CndR.$par_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd4.like(bind(Srch01_CndR.$par_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd5.like(bind(Srch01_CndR.$par_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd6.like(bind(Srch01_CndR.$par_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd7.like(bind(Srch01_CndR.$par_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd8.like(bind(Srch01_CndR.$par_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd9.like(bind(Srch01_CndR.$par_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd10.like(bind(Srch01_CndR.$par_itm_grp_cd10)));

			// 子品目分類
			if (!isNull(up0().chd_itm_grp_nm1())) {
				builder.addLeftOuterJoin(ig1, itm2.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm1)));
			}
			if (!isNull(up0().chd_itm_grp_nm2())) {
				builder.addLeftOuterJoin(ig2, itm2.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm2)));
			}
			if (!isNull(up0().chd_itm_grp_nm3())) {
				builder.addLeftOuterJoin(ig3, itm2.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm3)));
			}
			if (!isNull(up0().chd_itm_grp_nm4())) {
				builder.addLeftOuterJoin(ig4, itm2.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm4)));
			}
			if (!isNull(up0().chd_itm_grp_nm5())) {
				builder.addLeftOuterJoin(ig5, itm2.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm5)));
			}
			if (!isNull(up0().chd_itm_grp_nm6())) {
				builder.addLeftOuterJoin(ig6, itm2.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm6)));
			}
			if (!isNull(up0().chd_itm_grp_nm7())) {
				builder.addLeftOuterJoin(ig7, itm2.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm7)));
			}
			if (!isNull(up0().chd_itm_grp_nm8())) {
				builder.addLeftOuterJoin(ig8, itm2.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm8)));
			}
			if (!isNull(up0().chd_itm_grp_nm9())) {
				builder.addLeftOuterJoin(ig9, itm2.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm9)));
			}
			if (!isNull(up0().chd_itm_grp_nm10())) {
				builder.addLeftOuterJoin(ig10, itm2.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd1.like(bind(Srch01_CndR.$chd_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd2.like(bind(Srch01_CndR.$chd_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd3.like(bind(Srch01_CndR.$chd_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd4.like(bind(Srch01_CndR.$chd_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd5.like(bind(Srch01_CndR.$chd_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd6.like(bind(Srch01_CndR.$chd_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd7.like(bind(Srch01_CndR.$chd_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd8.like(bind(Srch01_CndR.$chd_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd9.like(bind(Srch01_CndR.$chd_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					itm2.itm_grp_cd10.like(bind(Srch01_CndR.$chd_itm_grp_cd10)));

		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_LOT_INH_DEST_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			putFuncName(r_dest, "dest_ins_func_id", "dest_ins_func_nm") ;
			putFuncName(r_dest, "dest_upd_func_id", "dest_upd_func_nm") ;
			putFuncName(r_dest, "src_ins_func_id", "src_ins_func_nm") ;
			putFuncName(r_dest, "src_upd_func_id", "src_upd_func_nm") ;
		}
	}

	//FMCB CUSTOM END
}