package mcframe.serverMAUA.MAUAL0010;

import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.util.MCDBUtil.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.isNull;
import static mcframe.serverMA.dbc.MABSFunction.MAPA_LOC$F_GET_LOC_ADDR;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.getEditString;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;


abstract public class MAUAL_ListLoc_MC extends MAUAL_ListItmDtl_MC {
	// -- Loc:場所(START)
	@Override
	protected void getLoc_Set(MCRow row, MCQueryApiBuilder builder , MAM_LOC_R t, MCList<?> result){
		super.getLoc_Set(row, builder, t, result);
		getLoc_addDptLocWork(row, result);
		getLoc_addSelectJoinCustom(row, builder, t, result);
		getLoc_addWhereCustom(row, builder, t, result);

	}
	
	protected void getLoc_addDptLocWork(MCRow row, MCList<?> result) {
		// 入力補助画面から起動され、原価部門、期が指定されている場合に部門構成展開ワーク情報を作成する
		if ((isNull(row.getDateNE(LocCols.$i_term)))
				|| (isNull(row.getStringNE(LocCols.$i_cost_dpt_cd)))) {
			return;
		}
		row.addStringColumn("input_dpt_flg_str", "1");
		
		MCRow r = MCRow.create();
		String procid = "MAPA_DPT_LOC$P_SET_DPT_LOC";
		String bindterm = "term";
		String bindcostdpt = "cost_dpt_cd";
		String procbinds = String.join("", ":", bindterm,", :", bindcostdpt);
		
		r.addDateColumn(bindterm, row.getDateNE(LocCols.$i_term));
		r.addStringColumn(bindcostdpt, row.getStringNE(LocCols.$i_cost_dpt_cd));
		// MAW_DPT_LOCにデータ作成
		execProc(createSqlId("MA.MAUAL0010.Loc", procid, "getLoc_addDptLocWork"),
				procid, r, procbinds);
		// MAW_DPT_LOC_YMにデータコピー
		copyDptLocToDptLocYm(r);
	}

	/**
	 * 部門場所ワーク情報を、月別部門場所ワークにデータコピーします。
	 * ただし、この処理は入力補助画面として起動され、
	 * かつ原価部門、期が指定されている場合のみ実行されます。
	 * 
	 * @param bind バインド値を格納したMCRow
	 */
	protected void copyDptLocToDptLocYm(MCRow bind) {
		MAW_DPT_LOC_YM_R dpt_loc_ym = MAW_DPT_LOC_YM_R.create();
		MAW_DPT_LOC_R t = MAW_DPT_LOC_R.create("T");
		MAW_DPT_LOC_YM_R w = MAW_DPT_LOC_YM_R.create("W");
		String sqlid = createSqlId("MA.MAUAL0010.Loc_copyDptLocToDptLocYm", dpt_loc_ym, "I01");

		MCInsert query = sql(sqlid)
			.insert(dpt_loc_ym)
			.columns(
				dpt_loc_ym.ym,
				dpt_loc_ym.dpt_cd,
				dpt_loc_ym.loc_cd)
			.query(
				subQuery()
				.selectDistinct(
					bind("term"),
					t.dpt_cd,
					t.loc_cd)
				.from(t)
				.where(
					value(0).eq(value(0))
					.and(
						notExists(
							subQuery()
							.select(value("X"))
							.from(w)
							.where(
								w.dpt_cd.eq(t.dpt_cd)
								.and(w.loc_cd.eq(t.loc_cd)))))));
		query.executeUpdate(bind);
	}

	protected void getLoc_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_LOC_R t, MCList<?> result) {
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAM_BP_R bp = MAM_BP_R.create("BP");

		// 固定のSelect句、結合の設定
		result.addStringColumn(LocCols.$i_itm_cd);
		result.addStringColumn(LocCols.$i_itm_sub1);
		result.addStringColumn(LocCols.$i_itm_sub2);
		result.addStringColumn(LocCols.$i_itm_sub3);
		result.addDateColumn(LocCols.$o_dt); // リストロジックチェックで使用
		result.addStringColumn(LocCols.$o_to_loc_cd); // リストロジックチェックで使用
		result.addStringColumn(LocCols.$o_str_ln_cd);
		result.addBooleanColumn(LocCols.$o_str_ln_cd_none_flg);
		
		builder.removeSelect(MAM_LOC_R.$wg_nm);
		builder.inactiveForeign("WG1");
		builder.addSelectNEActiveForeign(MAM_LOC_R.$wg_nm, wg.wg_nm);
		builder.addSelect(MAM_LOC_R.$loc_grp_nm, t.getColumn$(MAM_LOC_R.$loc_grp_nm));
		builder.addSelect(MAM_LOC_R.$alloc_grp_nm, t.getColumn$(MAM_LOC_R.$alloc_grp_nm));
		builder.addSelect(MAM_LOC_R.$site_nm, t.getColumn$(MAM_LOC_R.$site_nm));
		builder.removeSelect(MAM_LOC_R.$sppl_nm);
		builder.inactiveForeign("BP1");
		builder.addSelectNEActiveForeign(MAM_LOC_R.$sppl_nm, bp.bp_nm);
		builder.addSelect(MAM_LOC_R.$lg_grp_nm, t.getColumn$(MAM_LOC_R.$lg_grp_nm));
		
		builder.addLeftOuterJoin(wg, wg.wg_cd.eq(t.wg_cd));
		builder.addLeftOuterJoin(bp, bp.bp_cd.eq(t.sppl_cd).and(bp.sppl_flg.eq(value(true))));

		getLoc_addSelectJoinWk(row, builder, t, result);
		getLoc_addSelectJoinLocSub(row, builder, t, result);
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
 		// 入力補助画面からのリスト取得時
	}
	
	protected void getLoc_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAW_LOC_LL_R w = MAW_LOC_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MAW_LOC_LL_R> sd = MCList.create(MAW_LOC_LL_R.class);
		String delid = createSqlId("MA.MAUAL0010.Loc_getLoc_addSelectJoinWk", sd.createRow(), "D01");
		execDbWkDelete(delid, MAW_LOC_LL_R.create());
		String[] locCd = null;
		MCDate[] dt = null;
		String[] toLocCd = null;
		String[] itmCd = null;
		String[] itmSub1 = null;
		String[] itmSub2 = null;
		String[] itmSub3 = null;
		String insid = createSqlId("MA.MAUAL0010.Loc_getLoc_addSelectJoinWk", sd.createRow(), "I01");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(sd.createRow());
		insBuilder.setValuesAll();
		if (isSrvChk(row)) {
			String loc_is_srch_typ = row.getStringNE(LocCols.$i_loc_is_srch_typ);
			boolean containDt = row.contains(getLLBindNm(LocCols.$i_dt));
			
			locCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containDt) {
				dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_dt)));
			}
			boolean containItmCd = row.contains(getLLBindNm(LocCols.$i_itm_cd));
			if (containItmCd) {
				itmCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_itm_cd)));
			}
			boolean containItmSub1 = row.contains(getLLBindNm(LocCols.$i_itm_sub1));
			if (containItmSub1) {
				itmSub1 = (String[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_itm_sub1)));
			}
			boolean containItmSub2 = row.contains(getLLBindNm(LocCols.$i_itm_sub2));
			if (containItmSub2) {
				itmSub2 = (String[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_itm_sub2)));
			}
			boolean containItmSub3 = row.contains(getLLBindNm(LocCols.$i_itm_sub3));
			if (containItmSub3) {
				itmSub3 = (String[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_itm_sub3)));
			}
			// 区分１２：移動元場所
			if (MAC_LOC_IS_SRCH_TYP.isFR(loc_is_srch_typ)) {
				toLocCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(LocCols.$i_to_loc_cd)));
			}
			
			for (int i = 0; i < locCd.length; i++) {
				MAW_LOC_LL_R sr = MAW_LOC_LL_R.create();
				sr.loc_cd(locCd[i]);
				// 適用日が指定されている場合
				if (containDt) {
					sr.dt(dt[i]);
				}
				// 区分１２：移動元場所
				if (MAC_LOC_IS_SRCH_TYP.isFR(loc_is_srch_typ)) {
					sr.to_loc_cd(toLocCd[i]);
				}
				if (containItmCd) {
					sr.itm_cd(itmCd[i]);
				}
				if (containItmSub1) {
					sr.itm_sub1(itmSub1[i]);
				}
				if (containItmSub2) {
					sr.itm_sub2(itmSub2[i]);
				}
				if (containItmSub3) {
					sr.itm_sub3(itmSub3[i]);
				}
				sd.add(sr);
			}
			dbInsert(insid, sd, insBuilder);

			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.dt);
			builder.addSelect(w.to_loc_cd); // リストロジックチェックで使用
			builder.addSelect(w.itm_cd);
			builder.addSelect(w.itm_sub1);
			builder.addSelect(w.itm_sub2);
			builder.addSelect(w.itm_sub3);
			builder.addInnerJoin(w, w.loc_cd.eq(t.loc_cd));
		} else {
			MAW_LOC_LL_R sr = MAW_LOC_LL_R.create();
			sr.dt(row.getDateNE(LocCols.$i_dt));
			sr.to_loc_cd(row.getStringNE(LocCols.$i_to_loc_cd));
			sd.add(sr);
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.dt);
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
			
			// 品目棚・ラインマスタの検索
			getLoc_addSelectJoinItmStrLn(row, builder, t, result);
		}
	}

	protected void getLoc_addSelectJoinLocSub(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		if (hasDt(row, BpCols.$i_dt)) {
			MAW_LOC_LL_R w = MAW_LOC_LL_R.create("W");
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
						t.loc_cd,
						w.dt,
						value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
						nullValue()
					).as("zip_cd"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							nullValue()
					).as("addr1"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							nullValue()
					).as("addr2"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							nullValue()
					).as("addr3"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							nullValue()
					).as("addr4"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
					).as("tel"));
			builder.addSelect(
					MAPA_LOC$F_GET_LOC_ADDR(
							t.loc_cd,
							w.dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
					).as("fax"));
		}
	}

	protected void getLoc_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAVM_RD_LOC_R rd1 = MAVM_RD_LOC_R.create("RD1");
		MAVM_WR_LOC_R wr1 = MAVM_WR_LOC_R.create("WR1");
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAW_DPT_LOC_YM_R dpt_loc_ym = MAW_DPT_LOC_YM_R.create("W");
		MAM_BP_R bp = MAM_BP_R.create("BP");

		// 固定条件（行ごとに条件値が同じ条件）
		getLoc_addWhereByLocIsSrchTyp(row, builder, t, result, row.getStringNE(LocCols.$i_loc_is_srch_typ));
		
		// ＤＡＣの条件（WHERE句でないが、分かりやすいのでここに記述）
		if (row.getBooleanNE(LocCols.$i_rd_flg)) {
			builder.addInnerJoin(rd1, t.loc_cd.eq(rd1.loc_cd));
		}
		if (row.getBooleanNE(LocCols.$i_wr_flg)) {
			builder.addInnerJoin(wr1, t.loc_cd.eq(wr1.loc_cd));
		}

		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			// 動的条件（行ごとに条件値が異なる条件）
			getLoc_addWhereVarCondByLocIsSrchTyp(row, builder, t, result, row.getStringNE(LocCols.$i_loc_is_srch_typ));
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(
				t.wg_cd.like(bind("1")), getEditString(row, LocCols.$i_wg_cd));
		builder.addWhereWithCutOffAnd(
				wg.wg_nm.like(bind("1")), getEditString(row, LocCols.$i_wg_nm));
		builder.addWhereWithCutOffAnd(
				t.loc_cd.like(bind("1")), getEditString(row, LocCols.$i_loc_cd));
		builder.addWhereWithCutOffAnd(
				t.loc_nm.like(bind("1")), getEditString(row, LocCols.$i_loc_nm));
		builder.addWhereWithCutOffAnd(
				t.site_cd.like(bind("1")), getEditString(row, LocCols.$i_site_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn)t.getColumn$(MAM_LOC_R.$site_nm)).like(bind("1")), getEditString(row, LocCols.$i_site_nm));
		builder.addWhereWithCutOffAnd(
				t.lg_grp_cd.like(bind("1")), getEditString(row, LocCols.$i_lg_grp_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn)t.getColumn$(MAM_LOC_R.$lg_grp_nm)).like(bind("1")), getEditString(row, LocCols.$i_lg_grp_nm));
		builder.addWhereWithCutOffAnd(
				t.alloc_grp_cd.like(bind("1")), getEditString(row, LocCols.$i_alloc_grp_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn)t.getColumn$(MAM_LOC_R.$alloc_grp_nm)).like(bind("1")), getEditString(row, LocCols.$i_alloc_grp_nm));
		builder.addWhereWithCutOffAnd(
				t.loc_grp_cd.like(bind("1")), getEditString(row, LocCols.$i_loc_grp_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn)t.getColumn$(MAM_LOC_R.$loc_grp_nm)).like(bind("1")), getEditString(row, LocCols.$i_loc_grp_nm));
		builder.addWhereWithCutOffAnd(
				t.loc_mng_typ.like(bind("1")), getEditString(row, LocCols.$i_loc_mng_typ));
		builder.addWhereWithCutOffAnd(
				t.sppl_cd.like(bind("1")), getEditString(row, LocCols.$i_sppl_cd));
		builder.addWhereWithCutOffAnd(
				bp.bp_nm.like(bind("1")), getEditString(row, LocCols.$i_sppl_nm));
		if (row.getBooleanNE(LocCols.$i_no_sppl_flg)) {
			builder.addWhereWithAnd(t.sppl_cd.isNull());
		}
		builder.addWhereWithCutOffAnd(
				t.memo1.like(bind("1")), getEditString(row, LocCols.$i_memo1));
		builder.addWhereWithCutOffAnd(
				t.memo2.like(bind("1")), getEditString(row, LocCols.$i_memo2));
		builder.addWhereWithCutOffAnd(
				t.memo3.like(bind("1")), getEditString(row, LocCols.$i_memo3));
		
		// 原価部門、期が指定されている場合に部門構成展開ワーク情報を条件に付加する
		builder.addWhereWithCutOffAnd(
				bind("input_dpt_flg_str").eq(value(true))
				.and(exists(
						subQuery()
						.select(value("X"))
						.from(dpt_loc_ym)
						.where(dpt_loc_ym.loc_cd.eq(t.loc_cd)))));
	}

	protected void getLoc_addWhereByLocIsSrchTyp(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result, String loc_is_srch_typ) {
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAW_LOC_LL_R w = MAW_LOC_LL_R.create("W");

		// 検索区分に応じた条件
		// 区分０：全場所
		if (isNull(loc_is_srch_typ) || MAC_LOC_IS_SRCH_TYP.isCOMM(loc_is_srch_typ)) {
			;
		}
		// 区分１：製造ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_ALL(loc_is_srch_typ)) {
			builder.addWhereWithAnd(wg.mfg_flg.eq(value(true)));
		}
		// 区分２：物流ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isLG_WG_ALL(loc_is_srch_typ)) {
			builder.addWhereWithAnd(wg.lg_flg.eq(value(true)));
		}
		// 区分３：製造ＷＧ（絞込み）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(wg.mfg_flg.eq(value(true)));
		}
		// 区分４：販売資産
		else if (MAC_LOC_IS_SRCH_TYP.isSLS(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.SLS.value())));
		}
		// 区分５：生産資産
		else if (MAC_LOC_IS_SRCH_TYP.isPRD(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.PRD.value())));
		}
		// 区分６：社内
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNull());
		}
		// 区分７：社外
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNotNull());
		}
		// 区分８：生産資産（社内）
		else if (MAC_LOC_IS_SRCH_TYP.isPRD_HOUSE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.loc_mng_typ.eq(value(MAC_LOC_MNG_TYP.PRD.value())));
			builder.addWhereWithAnd(t.sppl_cd.isNull());
		}
		// 区分１０：社内（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNull());
		}
		// 区分１１：棚卸対象場所
		else if (MAC_LOC_IS_SRCH_TYP.isSTKTK_TGT(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.stktk_tgt_flg.eq(value(true)));
		}
		// 区分１２：移動元場所
		else if (MAC_LOC_IS_SRCH_TYP.isFR(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.loc_cd.neq(w.to_loc_cd));
			builder.addWhereWithAnd(t.wg_cd.eq(subQuery() .select(loc.wg_cd) .from(loc) .where( loc.loc_cd.eq(w.to_loc_cd) )));
		}
		// 区分１７：社内（製造ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_HOUSE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNull());
			builder.addWhereWithAnd(wg.mfg_flg.eq(value(true)));
		}
		// 区分１８：社内(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_HOUSE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNull());
		}
		// 区分１９：社外(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_OUTSIDE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNotNull());
		}
		// 区分２０：社外（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE_EQ_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_cd.isNotNull());
		}
		// 区分２１：棚・ライン対象場所
		else if (MAC_LOC_IS_SRCH_TYP.isSTR_LN(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.str_ln_tgt_flg.eq(value(true)));
		}
		// 区分２２：製造ＷＧ、物流ＷＧ
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_LG_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(wg.mfg_flg.eq(value(true)).or(wg.lg_flg.eq(value(true))));
		}
	}

	protected void getLoc_addWhereVarCondByLocIsSrchTyp(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result, String loc_is_srch_typ) {
		// 検索区分に応じた条件
		// 区分０：全場所
		if (isNull(loc_is_srch_typ) || MAC_LOC_IS_SRCH_TYP.isCOMM(loc_is_srch_typ)) {
		}
		// 区分１：製造ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_ALL(loc_is_srch_typ)) {
			builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分２：物流ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isLG_WG_ALL(loc_is_srch_typ)) {
			builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分３：製造ＷＧ（絞込み）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG(loc_is_srch_typ)) {
			builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分１０：社内（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分１３：ＷＧ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isWG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分１４：物流グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.lg_grp_cd.eq(bind("1")), row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分１５：工場・物流倉庫対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isSITE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.site_cd.eq(bind("1")), row.getStringNE(LocCols.$i_site_cd));
		}
		// 区分１６：製造場所グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLOC_GRP(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.loc_grp_cd.eq(bind("1")), row.getStringNE(LocCols.$i_loc_grp_cd));
		}
		// 区分１８：社内(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_HOUSE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.lg_grp_cd.eq(bind("1")), row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分１９：社外(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_OUTSIDE(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.lg_grp_cd.eq(bind("1")), row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分２０：社外（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE_EQ_WG(loc_is_srch_typ)) {
			builder.addWhereWithAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分２２：製造ＷＧ、物流ＷＧ
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_LG_WG(loc_is_srch_typ)) {
			builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("1")), row.getStringNE(LocCols.$i_wg_cd));
		}
	}

	// リストロジックチェック時に行ごとに条件値が異なるカラム
	public MCList<?> getLoc_SrvChk(MCRow row, MCList<?> result) {
		String loc_is_srch_typ = row.getStringNE(LocCols.$i_loc_is_srch_typ);
		// 検索区分に応じた条件
		// 区分０：全場所
		if (isNull(loc_is_srch_typ) || MAC_LOC_IS_SRCH_TYP.isCOMM(loc_is_srch_typ)) {
			;
		}
		// 区分１：製造ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_ALL(loc_is_srch_typ)) {
			if (!isNull(row.getStringNE(LocCols.$i_wg_cd))) {
				return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
			}
		}
		// 区分２：物流ＷＧ（全部）
		else if (MAC_LOC_IS_SRCH_TYP.isLG_WG_ALL(loc_is_srch_typ)) {
			if (!isNull(row.getStringNE(LocCols.$i_wg_cd))) {
				return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
			}
		}
		// 区分３：製造ＷＧ（絞込み）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG(loc_is_srch_typ)) {
			if (!isNull(row.getStringNE(LocCols.$i_wg_cd))) {
				return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
			}
		}
		// 区分１０：社内（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分１３：ＷＧ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isWG(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分１４：物流グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_lg_grp_cd, row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分１５：工場・物流倉庫対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isSITE(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_site_cd, row.getStringNE(LocCols.$i_site_cd));
		}
		// 区分１６：製造場所グループ対応場所
		else if (MAC_LOC_IS_SRCH_TYP.isLOC_GRP(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_loc_grp_cd, row.getStringNE(LocCols.$i_loc_grp_cd));
		}
		// 区分１７：社内（製造ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_HOUSE(loc_is_srch_typ)) {
		}
		// 区分１８：社内(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_HOUSE(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_lg_grp_cd, row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分１９：社外(物流G)
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP_OUTSIDE(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_lg_grp_cd, row.getStringNE(LocCols.$i_lg_grp_cd));
		}
		// 区分２０：社外（同一ＷＧ）
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE_EQ_WG(loc_is_srch_typ)) {
			return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
		}
		// 区分２２：製造ＷＧ、物流ＷＧ
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_LG_WG(loc_is_srch_typ)) {
			if (!isNull(row.getStringNE(LocCols.$i_wg_cd))) {
				return result.subList(LocCols.$o_wg_cd, row.getStringNE(LocCols.$i_wg_cd));
			}
		}
		return result;
	}

	@Override
	protected MCList<?> getLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		MCList<?> l = super.getLoc_AfterSelect(row, builder, t, result);
		// 管轄区分名の設定
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	protected void getLoc_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(LocCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(LocCols.$o_loc_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	protected MCMessage getLoc_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = null;
		String typ = row.getStringNE(LocCols.$i_loc_is_srch_typ);
		
		if (isNull(typ) || MAC_LOC_IS_SRCH_TYP.isCOMM(typ)) {
			msg = new MCMessage(MAUAL0057, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_ALL(typ)) {
			msg = new MCMessage(MAUAL0201, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isLG_WG_ALL(typ)) {
			msg = new MCMessage(MAUAL0307, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG(typ)) {
			msg = new MCMessage(MAUAL0308, row.getStringNE(LocCols.$i_wg_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isSLS(typ)) {
			msg = new MCMessage(MAUAL0309, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isPRD(typ)) {
			msg = new MCMessage(MAUAL0310, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE(typ)) {
			msg = new MCMessage(MAUAL0311, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE(typ)) {
			msg = new MCMessage(MAUAL0312, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isPRD_HOUSE(typ)) {
			msg = new MCMessage(MAUAL0313, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isHOUSE_EQ_WG(typ)) {
			msg = new MCMessage(MAUAL0314, row.getStringNE(LocCols.$i_wg_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isSTKTK_TGT(typ)) {
			msg = new MCMessage(MAUAL0315, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isFR(typ)) {
			msg = new MCMessage(MAUAL0227, row.getStringNE(LocCols.$i_to_loc_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isWG(typ)) {
			msg = new MCMessage(MAUAL0316, row.getStringNE(LocCols.$i_wg_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isLG_GRP(typ)) {
			msg = new MCMessage(MAUAL0317, row.getStringNE(LocCols.$i_lg_grp_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isSITE(typ)) {
			msg = new MCMessage(MAUAL0318, row.getStringNE(LocCols.$i_site_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isLOC_GRP(typ)) {
			msg = new MCMessage(MAUAL0319, row.getStringNE(LocCols.$i_loc_grp_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_WG_HOUSE(typ)) {
			msg = new MCMessage(MAUAL0320, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isOUTSIDE_EQ_WG(typ)) {
			msg = new MCMessage(MAUAL0395, row.getStringNE(LocCols.$i_wg_cd), info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isSTR_LN(typ)) {
			msg = new MCMessage(MAUAL0507, info);
		}
		else if (MAC_LOC_IS_SRCH_TYP.isMFG_LG_WG(typ)) {
			msg = new MCMessage(MAUAL0508, info);
		}

		return msg.setCauseRow(causeRow, causeCol);
	}

	/**
	 * 品目棚・ラインマスタを検索し、棚・ラインCDを取得します。
	 */
	protected void getLoc_addSelectJoinItmStrLn(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result) {
		MAM_ITM_STR_LN_R itm_str_ln = MAM_ITM_STR_LN_R.create("ITM_STR_LN");

		if (hasItmCnd(row)) {
			builder.addSelect(itm_str_ln.str_ln_cd);
			builder.addSelect(itm_str_ln.itm_cd);
			builder.addSelect(itm_str_ln.itm_sub1);
			builder.addSelect(itm_str_ln.itm_sub2);
			builder.addSelect(itm_str_ln.itm_sub3);
			builder.addSelect(
					cases()
					.when(t.str_ln_tgt_flg.eq(value(true)))
					.then(nvl2( itm_str_ln.str_ln_cd, value(false), value(true)))
					.otherwise(value(false)).as("str_ln_cd_none_flg"));
			builder.addLeftOuterJoin(itm_str_ln,
					itm_str_ln.gr_loc_cd.eq(t.loc_cd)
					.and(itm_str_ln.itm_cd.like(bind("itm_cd")))
					.and(itm_str_ln.itm_sub1.like(bind("itm_sub1")))
					.and(itm_str_ln.itm_sub2.like(bind("itm_sub2")))
					.and(itm_str_ln.itm_sub2.like(bind("itm_sub3"))));
			result.setString(LocCols.$i_itm_cd, row.getStringNE(LocCols.$i_itm_cd));
			result.setString(LocCols.$i_itm_sub1, row.getStringNE(LocCols.$i_itm_sub1));
			result.setString(LocCols.$i_itm_sub2, row.getStringNE(LocCols.$i_itm_sub2));
			result.setString(LocCols.$i_itm_sub3, row.getStringNE(LocCols.$i_itm_sub3));
		} else {
			builder.addSelect(value(false).as("str_ln_cd_none_flg"));
		}
	}

	/**
	 * 品目CD、枝番１～３が指定されているかチェックします。
	 */
	protected boolean hasItmCnd(MCRow row) {
		if (!isNull(row.getStringNE(LocCols.$i_itm_cd))
				&& !isNull(row.getStringNE(LocCols.$i_itm_sub1))
				&& !isNull(row.getStringNE(LocCols.$i_itm_sub2))
				&& !isNull(row.getStringNE(LocCols.$i_itm_sub3))) {
			return true;
		}
		return false;
	}
	// -- Loc:場所(END)
}
