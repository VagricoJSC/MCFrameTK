package mcframe.serverMABS.MABSL0210;

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
import mcframe.serverMABS.MABSL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_LotInhReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_LotInhReg_MC extends MABSL_LotInhReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * LotInhDest_UpdChk01オペレーション.<p>
	 *
	 * ロット継承先マスタを登録する前のチェックを行う<br>
	 */
	public class LotInhDest_UpdChk01 extends MABSL_LotInhReg_MC_A.LotInhDest_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					LotInhDest_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up){
				if (!(row instanceof LotInhDest_UpdChk01_DtlR)) {
					continue;
				}

				LotInhDest_UpdChk01_DtlR r = (LotInhDest_UpdChk01_DtlR) row;

				if (r.del_flg()) {
					continue ;
				}
				//　継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、子品目に有効成分対象がオンの品目のみ指定可能
				if (MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(r.lot_inh_col_typ()) && !r.par_cont_fctr_flg()) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$par_itm_cd, MABSL0502, toDispGUIIndex(r)));
				}
				// システムパラメータマスタで有効成分管理機能（CONT_FCTR_ENABLE_FLG）を無効にしている場合は、「ACT_CONT_FCTR.実際有効成分係数」は指定不可
				String flgStr = getSysParm("CONT_FCTR_ENABLE_FLG");
				if (!isSame(flgStr, "1") && MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(r.lot_inh_col_typ())) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$lot_inh_col_typ, MABSL0503, toDispGUIIndex(r)));
				}
				//　継承項目区分に「LOT_SUB_CHAR1～5.ロット予備（文字列）１～５」を指定した場合のみ、継承方法区分に「1.文字列結合」を指定可能
				if (!(MAC_LOT_INH_COL_TYP.is_enable_concat(r.lot_inh_col_typ()))
						&& MAC_LOT_INH_TYP.isCONCAT(r.lot_inh_typ())) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$lot_inh_typ, MABSL0504, toDispGUIIndex(r)));
				}
				// 継承項目区分と追加結合項目区分に同じ値は指定不可
				if (!isNull(r.add_concat_col())
						&& isSame(r.lot_inh_col_typ(), r.add_concat_col())) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$add_concat_col, MABSL0505, toDispGUIIndex(r)));
				}
				// 継承方法区分に「1.文字列結合」を指定した場合のみ、追加結合項目区分を指定可能
				if (!MAC_LOT_INH_TYP.isCONCAT(r.lot_inh_typ()) && !isNull(r.add_concat_col())) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$add_concat_col, MABSL0506, toDispGUIIndex(r)));
				}
				// 追加結合項目区分として使用できるかのチェック
				if (!isNull(r.add_concat_col())
						&& !(MAC_LOT_INH_COL_TYP.is_enable_add(r.add_concat_col()))) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$add_concat_col, MABSL0507, toDispGUIIndex(r)));
				}
				// 継承方法区分に「1.文字列結合」を指定した場合のみ、桁数超過時エラーをオンにできる
				if (!MAC_LOT_INH_TYP.isCONCAT(r.lot_inh_typ()) && r.overflow_err_flg()) {
					msgList.add(new MCMessage(r, LotInhDest_UpdChk01_DtlR.$add_concat_col, MABSL0508, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * LotInhDest_Upd01オペレーション.<p>
	 *
	 * ロット継承先マスタを登録する<br>
	 */
	public class LotInhDest_Upd01 extends MABSL_LotInhReg_MC_A.LotInhDest_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			setDelFlg();
			super.up();
		}

		/**
		 * 補完
		 */
		protected void setDelFlg() {
			for (LotInhDest_UpdChk01_DtlR r : up0()) {
				MCList<MAM_LOT_INH_SRC_R> dbc = MCList.create(MAM_LOT_INH_SRC_R.class);
				MAM_LOT_INH_SRC_R t = MAM_LOT_INH_SRC_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelectAll();
				dbc_bldr.addWhereWithAnd(t.par_itm_cd.eq(bind("1")), r.par_itm_cd());
				dbc_bldr.addWhereWithAnd(t.par_itm_sub1.eq(bind("1")), r.par_itm_sub1());
				dbc_bldr.addWhereWithAnd(t.par_itm_sub2.eq(bind("1")), r.par_itm_sub2());
				dbc_bldr.addWhereWithAnd(t.par_itm_sub3.eq(bind("1")), r.par_itm_sub3());
				dbc_bldr.addWhereWithAnd(t.bom_ptn.eq(bind("1")), r.bom_ptn());
				dbc_bldr.addWhereWithAnd(t.lot_inh_col_typ.eq(bind("1")), r.lot_inh_col_typ());
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), r.wg_cd());
				int cnt = dbSelect("MABSL0210_MAM_LOT_INH_SRC_S01", dbc, dbc_bldr);
				int cnt_del_flg_on = 0;
				for (MAM_LOT_INH_SRC_R srcR : dbc) {
					if (!isNull(srcR)) {
						if (srcR.del_flg()) {
							cnt_del_flg_on++;
						}
					}
				}
				if (cnt == cnt_del_flg_on) {
					r.del_flg(true);
				}
				else {
					r.del_flg(false);
				}
			}
		}
	}
	/**
	 * LotInhSrc_UpdChk01オペレーション.<p>
	 *
	 * ロット継承元マスタを登録する前のチェックを行う<br>
	 */
	public class LotInhSrc_UpdChk01 extends MABSL_LotInhReg_MC_A.LotInhSrc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up){
				if (!(row instanceof LotInhSrc_UpdChk01_DtlR)) {
					continue;
				}

				LotInhSrc_UpdChk01_DtlR r = (LotInhSrc_UpdChk01_DtlR) row;

				if (r.del_flg()) {
					continue ;
				}
				//　継承項目区分に「ACT_CONT_FCTR.実際有効成分係数」を指定した場合は、子品目に有効成分対象がオンの品目のみ指定可能
				if (MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(r.lot_inh_col_typ()) && !r.chd_cont_fctr_flg()) {
					msgList.add(new MCMessage(r, LotInhSrc_UpdChk01_DtlR.$chd_itm_cd, MABSL0501, toDispGUIIndex(r)));
				}
				//　親品目と同じ品目は指定不可
				if (isSame(r.par_itm_cd(), r.chd_itm_cd())
						&& isSame(r.par_itm_sub1(), r.chd_itm_sub1())
						&& isSame(r.par_itm_sub2(), r.chd_itm_sub2())
						&& isSame(r.par_itm_sub3(), r.chd_itm_sub3())) {
					msgList.add(new MCMessage(r, LotInhSrc_UpdChk01_DtlR.$chd_itm_cd, MABSL0183, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * LotInhSrc_Upd01オペレーション.<p>
	 *
	 * ロット継承元マスタを登録する<br>
	 */
	public class LotInhSrc_Upd01 extends MABSL_LotInhReg_MC_A.LotInhSrc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LotInh_DelChk01オペレーション.<p>
	 *
	 * ロット継承先マスタ、ロット継承元マスタを削除する前のチェックを行う<br>
	 */
	public class LotInh_DelChk01 extends MABSL_LotInhReg_MC_A.LotInh_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					LotInh_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * LotInh_Del01オペレーション.<p>
	 *
	 * ロット継承先マスタ、ロット継承元マスタを削除する<br>
	 */
	public class LotInh_Del01 extends MABSL_LotInhReg_MC_A.LotInh_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABSL_LotInhReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_LOT_INH_DEST_R) {
				dbcCustomizeSub_dest(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_LOT_INH_SRC_R) {
				dbcCustomizeSub_src(builder);
			}
		}
		
		protected void dbcCustomizeSub_dest(MCQueryApiBuilder builder) {

			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_LOT_INH_DEST_R t = MAM_LOT_INH_DEST_R.create(builder.getBaseDbcAlias());

			builder.setWhere(value(0).eq(value(0)));
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(bracket(t.wg_cd
						.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)))))));
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
			builder.addWhereWithCutOffAnd(t.par_itm_cd.eq(bind(Srch01_CndR.$par_itm_cd)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub1.eq(bind(Srch01_CndR.$par_itm_sub1)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub2.eq(bind(Srch01_CndR.$par_itm_sub2)));
			builder.addWhereWithCutOffAnd(
					t.par_itm_sub3.eq(bind(Srch01_CndR.$par_itm_sub3)));
			builder.addWhereWithCutOffAnd(t.bom_ptn.eq(bind(Srch01_CndR.$bom_ptn)));
			builder.addWhereWithCutOffAnd(
					t.lot_inh_col_typ.eq(bind(Srch01_CndR.$lot_inh_col_typ)));
			builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind(Srch01_CndR.$wg_cd)));
		}

		protected void dbcCustomizeSub_src(MCQueryApiBuilder builder) {

			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_LOT_INH_SRC_R t = MAM_LOT_INH_SRC_R.create(builder.getBaseDbcAlias());

			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(bracket(t.wg_cd
						.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)))))));
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

			MAVM_BOM_R bom1 = MAVM_BOM_R.create("BOM1");
			MAVM_BOM_R bom2 = MAVM_BOM_R.create("BOM2");
			MAM_ITM__R itm2 = MAM_ITM__R.create(MAM_LOT_INH_SRC_R.$ITM2);
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			MAVM_BOM_R S1BOM1S = MAVM_BOM_R.create("BOM1S");
			MAVM_BOM_R S1BOM2S = MAVM_BOM_R.create("BOM2S");
			
			builder.addSelect(itm2.itm_typ.as("chd_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("chd_itm_typ_d_cd"));
			builder.addSelect(itmtypd2.itm_typ_d_nm.as("chd_itm_typ_d_nm"));
			builder.addSelect(bom1.st_dt);
			builder.addSelect(bom2.end_dt);

			builder.addLeftOuterJoin(itmtypd2, bracket(itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd))));

			builder.addLeftOuterJoin(bom1, bracket(t.wg_cd.eq(bom1.wg_cd)
					.and(t.par_itm_cd.eq(bom1.par_itm_cd))
					.and(t.par_itm_sub1.eq(bom1.par_itm_sub1))
					.and(t.par_itm_sub2.eq(bom1.par_itm_sub2))
					.and(t.par_itm_sub3.eq(bom1.par_itm_sub3))
					.and(t.bom_ptn.eq(bom1.bom_ptn))
					.and(t.chd_itm_cd.eq(bom1.chd_itm_cd))
					.and(t.chd_itm_sub1.eq(bom1.chd_itm_sub1))
					.and(t.chd_itm_sub2.eq(bom1.chd_itm_sub2))
					.and(t.chd_itm_sub3.eq(bom1.chd_itm_sub3))
					.and(bom1.par_itm_cd.eq(bind(Srch01_CndR.$par_itm_cd)))
					.and(bom1.par_itm_sub1.eq(bind(Srch01_CndR.$par_itm_sub1)))
					.and(bom1.par_itm_sub2.eq(bind(Srch01_CndR.$par_itm_sub2)))
					.and(bom1.par_itm_sub3.eq(bind(Srch01_CndR.$par_itm_sub3)))
					.and(bom1.bom_ptn.eq(bind(Srch01_CndR.$bom_ptn)))
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
									.and(bom1.chd_itm_sub3.eq(S1BOM1S.chd_itm_sub3)))))));

			builder.addLeftOuterJoin(bom2, bracket(t.wg_cd.eq(bom2.wg_cd)
					.and(t.par_itm_cd.eq(bom2.par_itm_cd))
					.and(t.par_itm_sub1.eq(bom2.par_itm_sub1))
					.and(t.par_itm_sub2.eq(bom2.par_itm_sub2))
					.and(t.par_itm_sub3.eq(bom2.par_itm_sub3))
					.and(t.bom_ptn.eq(bom2.bom_ptn))
					.and(t.chd_itm_cd.eq(bom2.chd_itm_cd))
					.and(t.chd_itm_sub1.eq(bom2.chd_itm_sub1))
					.and(t.chd_itm_sub2.eq(bom2.chd_itm_sub2))
					.and(t.chd_itm_sub3.eq(bom2.chd_itm_sub3))
					.and(bom2.par_itm_cd.eq(bind(Srch01_CndR.$par_itm_cd)))
					.and(bom2.par_itm_sub1.eq(bind(Srch01_CndR.$par_itm_sub1)))
					.and(bom2.par_itm_sub2.eq(bind(Srch01_CndR.$par_itm_sub2)))
					.and(bom2.par_itm_sub3.eq(bind(Srch01_CndR.$par_itm_sub3)))
					.and(bom2.bom_ptn.eq(bind(Srch01_CndR.$bom_ptn)))
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
									.and(bom2.chd_itm_sub3.eq(S1BOM2S.chd_itm_sub3)))))));

			builder.addWhereWithCutOffAnd(bracket(
					bom1.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)).or(bom1.st_dt.isNull())));
			builder.addWhereWithCutOffAnd(bracket(
					bom1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)).or(bom1.st_dt.isNull())));
			builder.addWhereWithCutOffAnd(bracket(bom2.end_dt
					.gte(bind(Srch01_CndR.$end_dt_fr)).or(bom2.end_dt.isNull())));
			builder.addWhereWithCutOffAnd(bracket(bom2.end_dt
					.lte(bind(Srch01_CndR.$end_dt_to)).or(bom2.end_dt.isNull())));

			if (up0().off_del_flg() && !up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(t.del_flg, value(false)).eq(value(false)));
			}
			else if (!up0().off_del_flg() && up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(t.del_flg, value(true)).eq(value(true)));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABSL_LotInhReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABSL_LotInhReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			doDeleteDest();
		}

		/**
		 * ロット継承先マスタを削除する
		 */
		protected void doDeleteDest() {
			MCList<LotInh_DelChk01_DtlR> up0L =
					up0().groupBy(MAM_LOT_INH_SRC_R.$par_itm_cd, MAM_LOT_INH_SRC_R.$par_itm_sub1,
							MAM_LOT_INH_SRC_R.$par_itm_sub2, MAM_LOT_INH_SRC_R.$par_itm_sub3,
							MAM_LOT_INH_SRC_R.$bom_ptn, MAM_LOT_INH_SRC_R.$lot_inh_col_typ, MAM_LOT_INH_SRC_R.$wg_cd);
			for (LotInh_DelChk01_DtlR up0R : up0L) {
				MCList<MAM_LOT_INH_SRC_R> src = MCList.create(MAM_LOT_INH_SRC_R.class);
				MAM_LOT_INH_SRC_R t1 = MAM_LOT_INH_SRC_R.create("T");
				MCQueryApiBuilder src_bldr = MCQueryApiBuilder.create(t1);
				src_bldr.setSelectAll();
				src_bldr.addWhereWithAnd(t1.par_itm_cd.eq(bind("1")), up0R.par_itm_cd());
				src_bldr.addWhereWithAnd(t1.par_itm_sub1.eq(bind("1")), up0R.par_itm_sub1());
				src_bldr.addWhereWithAnd(t1.par_itm_sub2.eq(bind("1")), up0R.par_itm_sub2());
				src_bldr.addWhereWithAnd(t1.par_itm_sub3.eq(bind("1")), up0R.par_itm_sub3());
				src_bldr.addWhereWithAnd(t1.bom_ptn.eq(bind("1")), up0R.bom_ptn());
				src_bldr.addWhereWithAnd(t1.lot_inh_col_typ.eq(bind("1")), up0R.lot_inh_col_typ());
				src_bldr.addWhereWithAnd(t1.wg_cd.eq(bind("1")), up0R.wg_cd());
				int cnt = dbSelect("MABSL0210_MAM_LOT_INH_SRC_S02", src, src_bldr);
				if (cnt == 0) {
					MAM_LOT_INH_DEST_R t2 = MAM_LOT_INH_DEST_R.create("T");
					execDbDelete("MABSL0210_MAM_LOT_INH_DEST_D01", t2,
							t2.par_itm_cd.eq(bind("1"))
							.and(t2.par_itm_sub1.eq(bind("2")))
							.and(t2.par_itm_sub2.eq(bind("3")))
							.and(t2.par_itm_sub3.eq(bind("4")))
							.and(t2.bom_ptn.eq(bind("5")))
							.and(t2.lot_inh_col_typ.eq(bind("6")))
							.and(t2.wg_cd.eq(bind("7"))),
							up0R.par_itm_cd(), up0R.par_itm_sub1(), up0R.par_itm_sub2(),
							up0R.par_itm_sub3(), up0R.bom_ptn(), up0R.lot_inh_col_typ(),
							up0R.wg_cd());

				}
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 子品目展開処理を行う<br>
	 */
	public class Sprt01 extends MABSL_LotInhReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callProc();
			super.doIt();
		}

		protected void callProc() {
			MCRow bindR = MCRow.create();
			bindR.addStringColumn("PAR_ITM_CD", up0().par_itm_cd());
			bindR.addStringColumn("PAR_ITM_SUB1", up0().par_itm_sub1());
			bindR.addStringColumn("PAR_ITM_SUB2", up0().par_itm_sub2());
			bindR.addStringColumn("PAR_ITM_SUB3", up0().par_itm_sub3());
			bindR.addStringColumn("BOM_PTN", up0().bom_ptn());
			bindR.addStringColumn("WG_CD", up0().wg_cd());
			bindR.addDateColumn("BASE_DT", up0().base_dt());
			bindR.addBooleanColumn("PH_EX_FLG", true);
			bindR.addBooleanColumn("BOM_PTN_FLG", false);
			bindR.addNumberColumn("MAX_HRRCHY", MCNumber.valueOf(1));
			
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, bindR, null,
					":PAR_ITM_CD, :PAR_ITM_SUB1, :PAR_ITM_SUB2, :PAR_ITM_SUB3, "
					+ ":BOM_PTN, :WG_CD, :BASE_DT, :PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY");
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAW_BOM_EX_R) {
				dbcCustomizeSub(builder);
			}
		}
		protected  void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_ITM_R itm2 = MAM_ITM_R.create("ITM2");
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			MAW_BOM_EX_R t = MAW_BOM_EX_R.create(builder.getBaseDbcAlias());
			
			builder.addGroupByAlias(t.itm_cd, "chd_itm_cd");
			builder.addGroupByAlias(t.itm_sub1, "chd_itm_sub1");
			builder.addGroupByAlias(t.itm_sub2, "chd_itm_sub2");
			builder.addGroupByAlias(t.itm_sub3, "chd_itm_sub3");
			builder.addGroupByAlias(itm2.itm_nm, "chd_itm_nm");
			builder.addGroupByAlias(itm2.itm_typ, "chd_itm_typ");
			builder.addGroupByAlias(itm2.itm_typ_d_cd, "chd_itm_typ_d_cd");
			builder.addGroupByAlias(itmtypd2.itm_typ_d_nm, "chd_itm_typ_d_nm");
			builder.addGroupFunc(min(t.st_dt), "st_dt");
			builder.addGroupFunc(max(t.end_dt), "end_dt");
			builder.addLeftOuterJoin(itm2, bracket( itm2.itm_cd.eq(t.itm_cd)
					.and(itm2.itm_sub1.eq(t.itm_sub1))
					.and(itm2.itm_sub2.eq(t.itm_sub2))
					.and(itm2.itm_sub3.eq(t.itm_sub3))));
			builder.addLeftOuterJoin(itmtypd2, bracket( itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd))));
			
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(itm2.stk_mng_typ.eq( value(MAC_STK_MNG_TYP.MNG.value())));
			builder.addWhereWithAnd(itm2.lot_mng_typ.in( value(MAC_LOT_MNG_TYP.DUPL_ABL.value()),
					value(MAC_LOT_MNG_TYP.UNIQ.value())));

			if (MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(up0().lot_inh_col_typ())) {
				builder.addWhereWithAnd(itm2.cont_fctr_flg.eq(value(true)));
			}

			builder.addWhereWithAnd(t.bom_lvl.eq(value(1)));
			builder.addWhereWithAnd(t.byprod_flg.eq(value(false)));
			builder.addWhereWithAnd(t.inpt_ctl_typ.notIn(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
	
			MAM_LOT_INH_SRC_R S1LOTINHSRC = MAM_LOT_INH_SRC_R.create("LOTINHSRC");
			builder.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1LOTINHSRC)
					.where(value(0).eq(value(0))
							.and(S1LOTINHSRC.par_itm_cd.eq(t.par_itm_cd))
							.and(S1LOTINHSRC.par_itm_sub1.eq(t.par_itm_sub1))
							.and(S1LOTINHSRC.par_itm_sub2.eq(t.par_itm_sub2))
							.and(S1LOTINHSRC.par_itm_sub3.eq(t.par_itm_sub3))
							.and(S1LOTINHSRC.bom_ptn.eq(bind(Sprt01_CndR.$bom_ptn)))
							.and(S1LOTINHSRC.chd_itm_cd.eq(t.itm_cd))
							.and(S1LOTINHSRC.chd_itm_sub1.eq(t.itm_sub1))
							.and(S1LOTINHSRC.chd_itm_sub2.eq(t.itm_sub2))
							.and(S1LOTINHSRC.chd_itm_sub3.eq(t.itm_sub3))
							.and(S1LOTINHSRC.wg_cd.eq(t.wg_cd))
							.and(S1LOTINHSRC.lot_inh_col_typ.eq(bind(Sprt01_CndR.$lot_inh_col_typ))))));

			builder.addOrderByAsc(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
		}
		
		@Override
		protected <R extends MCDBContainer> void afterSelect(MCList<R> rslt) {
			super.afterSelect(rslt);
			rslt.setNumberNE("prio", MCNumber.ONE);
		}
	}

	//FMCB CUSTOM END
}