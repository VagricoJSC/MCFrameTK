package mcframe.serverMAUA.MAUAL0010;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import mcframe.serverMA.dbc.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;


abstract public class MAUAL_ListDpt_MC extends MAUAL_ListBp_MC {
	// -- Dpt:部門(START)
	@Override
	protected void getDpt_Set(MCRow row, MCQueryApiBuilder builder , MAM_DPT_R t, MCList<?> result){
		super.getDpt_Set(row, builder, t, result);
		getDpt_addSelectJoinCustom(row, builder, t, result);
		getDpt_addWhereCustom(row, builder, t, result);
	}

	protected void getDpt_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder , MAM_DPT_R t, MCList<?> result) {
		MAW_DPT_LL_R w = MAW_DPT_LL_R.create("W");
		MAM_DPT_R up_lv_dpt = MAM_DPT_R.create("UP_LV_DPT");
		MAVM_USR_DPT_R m1 = MAVM_USR_DPT_R.create("M1");

		// 固定のSelect句、結合の設定	
		result.addStringColumn(DptCols.$o_usr_cd); // リストロジックチェック用
		result.addStringColumn(DptCols.$o_bcst_cd); // リストロジックチェック用
		
		builder.setDistinct();	/* 担当者部門マスタを外部結合するため、担当者未設定の時に重複レコードを拾わない為 */
		builder.addSelect(MAM_DPT_R.$wg_nm, t.getColumn$(MAM_DPT_R.$wg_nm));
		builder.addSelect(MAM_DPT_R.$dpt_lvl_nm, t.getColumn$(MAM_DPT_R.$dpt_lvl_nm));

		builder.removeSelect(MAM_DPT_R.$up_lv_dpt_nm);
		builder.inactiveForeign("DPT1");
		builder.addSelect(MAM_DPT_R.$up_lv_dpt_nm, up_lv_dpt.dpt_nm);
		
		getDpt_addSelectJoinWk(row, builder, t, result);
		builder.addLeftOuterJoin(up_lv_dpt,
				up_lv_dpt.dpt_cd.eq(t.up_lv_dpt_cd)
				.and(w.dt.between(up_lv_dpt.st_dt, up_lv_dpt.end_dt)));
		builder.addLeftOuterJoin(m1,
				t.dpt_cd.eq(m1.dpt_cd)
				.and(w.usr_cd.eq(m1.usr_cd))
				.and(w.dt.between(m1.st_dt, m1.end_dt)));

		result.addStringColumn(DptCols.$o_loc_cd);

		// 区分４：営業部門で仕入直送ＦＬＧがtrueの場合に場所コードを取得する
		if (MAC_DPT_IS_SRCH_TYP.isSLS(row.getStringNE(DptCols.$i_dpt_is_srch_typ))) {
			if (row.getBooleanNE(DptCols.$i_ddlv_sls_flg)) {
				builder.addSelect(MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE( t.dpt_cd, w.dt).as("loc_cd"));
			}
		}

		
 		// 入力補助画面からのリスト取得時
	}
	
	protected void getDpt_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder , MAM_DPT_R t, MCList<?> result) {
		MAW_DPT_LL_R w = MAW_DPT_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MAW_DPT_LL_R> sd = MCList.create(MAW_DPT_LL_R.class);
		String delId = createSqlId("MA.MAUAL0010.Dpt_getDpt_addSelectJoinWk", sd.createRow(), "D01");
		execDbWkDelete(delId, MAW_DPT_LL_R.create());
		String insId = createSqlId("MA.MAUAL0010.Dpt_getDpt_addSelectJoinWk", sd.createRow(), "I01");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(sd.createRow());
		String[] dptCd = null;
		MCDate[] dt = null;
		String[] usrCd = null;
		String[] bcstCd = null;
		if (isSrvChk(row)) {
			String dpt_is_srch_typ = row.getStringNE(DptCols.$i_dpt_is_srch_typ);
			boolean containUsr= row.contains(getLLBindNm(DptCols.$i_usr_cd));
			
			dptCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// リストロジックチェックの場合、mode_today_flgがオンの場合に運用日付をdtにセットする処理は共通処理でやっている
			dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(DptCols.$i_dt)));
			// 担当者が指定されている場合
			if (containUsr) {
				usrCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(DptCols.$i_usr_cd)));
			}
			// 区分１３：請求部門
			if (MAC_DPT_IS_SRCH_TYP.isBCST(dpt_is_srch_typ)) {
				bcstCd = (String[]) convDataArray(row.getStringNE(getLLBindNm(DptCols.$i_bcst_cd)));
			}
			
			for (int i = 0; i < dptCd.length; i++) {
				MAW_DPT_LL_R sr = MAW_DPT_LL_R.create();
				sr.dpt_cd(dptCd[i]);
				sr.dt(dt[i]);
				// 担当者が指定されている場合
				if (containUsr) {
					sr.usr_cd(usrCd[i]);
				}
				// 区分１３：請求部門
				if (MAC_DPT_IS_SRCH_TYP.isBCST(dpt_is_srch_typ)) {
					sr.bcst_cd(bcstCd[i]);
				}
				sd.add(sr);
			}
			dbInsert(insId, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.usr_cd); // リストロジックチェックで使用
			builder.addSelect(w.bcst_cd); // リストロジックチェックで使用
			builder.addInnerJoin(w, w.dpt_cd.eq(t.dpt_cd).and(w.dt.between(t.st_dt, t.end_dt)));
		} else {
			MAW_DPT_LL_R sr = MAW_DPT_LL_R.create();
			sr.dt(getDtForDpt(row));
			sr.usr_cd(row.getStringNE(DptCols.$i_usr_cd));
			sr.bcst_cd(row.getStringNE(DptCols.$i_bcst_cd));
			sd.add(sr);
			dbInsert(insId, sd, insBuilder);

			// ワークテーブルと結合したSELECT句を追加
			builder.addInnerJoin(w, w.dt.between(t.st_dt, t.end_dt));
		}
		
	}
	
	protected void getDpt_addWhereCustom(MCRow row, MCQueryApiBuilder builder , MAM_DPT_R t, MCList<?> result) {
		MAW_DPT_LL_R w = MAW_DPT_LL_R.create("W");
		MAM_DPT_R up_lv_dpt = MAM_DPT_R.create("UP_LV_DPT");
		MAVM_USR_DPT_R m1 = MAVM_USR_DPT_R.create("M1");
		MAVM_RD_DPT_R rd1 = MAVM_RD_DPT_R.create("RD1");
		MAVM_WR_DPT_R wr1 = MAVM_WR_DPT_R.create("WR1");
		MAVM_WR_WG_R wr2 = MAVM_WR_WG_R.create("WR2");

		// 固定条件（行ごとに条件値が同じ条件）
		getDpt_addWhereByDptIsSrchTyp(row, builder, t, result, row.getStringNE(DptCols.$i_dpt_is_srch_typ));
		
		// ＤＡＣの条件（WHERE句ではないが条件なのでこちらに記述）
		if (row.getBooleanNE(DptCols.$i_rd_flg)) {
			builder.addInnerJoin(rd1, rd1.dpt_cd.eq(t.dpt_cd));
		}
		if (row.getBooleanNE(DptCols.$i_wr_flg)) {
			builder.addInnerJoin(wr1, wr1.dpt_cd.eq(t.dpt_cd));
		}
		if (row.getBooleanNE(DptCols.$i_wr_wg_flg)) {
			builder.addInnerJoin(wr2, wr2.wg_cd.eq(t.wg_cd));
		}
		
		// 担当者が指定されている場合の条件
		builder.addWhereWithAnd(w.usr_cd.isNull().or(m1.usr_cd.eq(w.usr_cd)));
		
		// リストロジックチェック時は以下の条件は追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		getDpt_addWhereByDptFlg(row, builder, t, result);
		builder.addWhereWithCutOffAnd(t.dpt_cd.like(bind("1")), getEditString(row, DptCols.$i_dpt_cd));
		builder.addWhereWithCutOffAnd(t.dpt_nm.like(bind("1")), getEditString(row, DptCols.$i_dpt_nm));
		builder.addWhereWithCutOffAnd(t.wg_cd.like(bind("1")), getEditString(row, DptCols.$i_wg_cd));
		builder.addWhereWithCutOffAnd(((MCStringPermColumn)t.getColumn$(MAM_DPT_R.$wg_nm)).like(bind("1")), getEditString(row, DptCols.$i_wg_nm));
		builder.addWhereWithCutOffAnd(t.dpt_lvl_cd.like(bind("1")), getEditString(row, DptCols.$i_dpt_lvl_cd));
		builder.addWhereWithCutOffAnd(((MCStringPermColumn)t.getColumn$(MAM_DPT_R.$dpt_lvl_nm)).like(bind("1")), getEditString(row, DptCols.$i_dpt_lvl_nm));
		builder.addWhereWithCutOffAnd(t.up_lv_dpt_cd.like(bind("1")), getEditString(row, DptCols.$i_up_lv_dpt_cd));
		builder.addWhereWithCutOffAnd(up_lv_dpt.dpt_nm.like(bind("1")), getEditString(row, DptCols.$i_up_lv_dpt_nm));
		builder.addWhereWithCutOffAnd(t.new_dpt_cd.like(bind("1")), getEditString(row, DptCols.$i_new_dpt_cd));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")), getEditString(row, DptCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")), getEditString(row, DptCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")), getEditString(row, DptCols.$i_memo3));
	}

	protected void getDpt_addWhereByDptIsSrchTyp(MCRow row, MCQueryApiBuilder builder , MAM_DPT_R t, MCList<?> result, String dpt_is_srch_typ) {
		MAW_DPT_LL_R w = MAW_DPT_LL_R.create("W");
		MAM_BP_R x = MAM_BP_R.create("X");

		// 区分０：全取引先
		if (isNull(dpt_is_srch_typ) || MAC_DPT_IS_SRCH_TYP.isCOMM(dpt_is_srch_typ)) {
			// WHERE句を追加しない
		}
		// 区分１：資産管理部門
		else if (MAC_DPT_IS_SRCH_TYP.isASST(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.asst_dpt_flg.eq(value(true)));
		}
		// 区分２：債権部門
		else if (MAC_DPT_IS_SRCH_TYP.isAR(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.ar_dpt_flg.eq(value(true)));
		}
		// 区分３：債務部門
		else if (MAC_DPT_IS_SRCH_TYP.isAP(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.ap_dpt_flg.eq(value(true)));
		}
		// 区分４：営業部門
		else if (MAC_DPT_IS_SRCH_TYP.isSLS(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.sls_dpt_flg.eq(value(true)));
		}
		// 区分５：購買部門
		else if (MAC_DPT_IS_SRCH_TYP.isPURC(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.purc_dpt_flg.eq(value(true)));
		}
		// 区分６：出荷部門
		else if (MAC_DPT_IS_SRCH_TYP.isSHIP(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.ship_dpt_flg.eq(value(true)));
		}
		// 区分７：入荷部門
		else if (MAC_DPT_IS_SRCH_TYP.isARR(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.arr_dpt_flg.eq(value(true)));
		}
		// 区分８：製造部門
		else if (MAC_DPT_IS_SRCH_TYP.isMFG(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.mfg_dpt_flg.eq(value(true)));
		}
		// 区分９：需給部門
		else if (MAC_DPT_IS_SRCH_TYP.isSD(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.sd_dpt_flg.eq(value(true)));
		}
		// 区分１０：検査部門
		else if (MAC_DPT_IS_SRCH_TYP.isINSP(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.insp_dpt_flg.eq(value(true)));
		}
		// 区分１１：負担部門
		else if (MAC_DPT_IS_SRCH_TYP.isBD(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.bd_dpt_flg.eq(value(true)));
		}
		// 区分１２：債権債務負担部門
		else if (MAC_DPT_IS_SRCH_TYP.isARAPBD(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.ar_dpt_flg.eq(value(true))
					.or(t.ap_dpt_flg.eq(value(true))));
		}
		// 区分１３：請求部門
		else if (MAC_DPT_IS_SRCH_TYP.isBCST(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(t.ar_dpt_flg.eq(value(true)));
			builder.addWhereWithAnd(
					exists(subQuery()
							.select(value("X"))
							.from(x)
							.where(value(0).eq(value(0))
									.and(x.bp_cd.eq(w.bcst_cd))
									.and(x.bill_dpt_typ.eq(value(MAC_BILL_DPT_TYP.BILL.value()))
											.and(t.dpt_cd
													.eq(MAPA_BP$F_GET_BCST_DPT_CD_NE(w.bcst_cd, w.dt, value(false))))
											.or(x.bill_dpt_typ
													.neq(value(MAC_BILL_DPT_TYP.BILL.value())))
											.or(x.bill_dpt_typ.isNull())))));
		}
		// 区分１４：実行部門
		else if (MAC_DPT_IS_SRCH_TYP.isSCE(dpt_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.sls_dpt_flg.eq(value(true))
					.or(t.purc_dpt_flg.eq(value(true)))
					.or(t.ship_dpt_flg.eq(value(true)))
					.or(t.arr_dpt_flg.eq(value(true)))
					.or(t.mfg_dpt_flg.eq(value(true)))
					.or(t.sd_dpt_flg.eq(value(true)))
					.or(t.insp_dpt_flg.eq(value(true))));
		}
	}
	protected void getDpt_addWhereByDptFlg(MCRow row, MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result) {
		// コンボだったら実行しない（入力補助からしか渡されない条件項目があるかどうかで判定）
		if (!row.contains(DptCols.$i_ar_dpt_flg)) {
			return;
		}
		MCPredicate pred = value(0).eq(value(1));
		if (row.getBooleanNE(DptCols.$i_ar_dpt_flg)) {
			pred = pred.or(t.ar_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_ap_dpt_flg)) {
			pred = pred.or(t.ap_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_sls_dpt_flg)) {
			pred = pred.or(t.sls_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_purc_dpt_flg)) {
			pred = pred.or(t.purc_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_asst_dpt_flg)) {
			pred = pred.or(t.asst_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_ship_dpt_flg)) {
			pred = pred.or(t.ship_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_arr_dpt_flg)) {
			pred = pred.or(t.arr_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_mfg_dpt_flg)) {
			pred = pred.or(t.mfg_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_insp_dpt_flg)) {
			pred = pred.or(t.insp_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_bd_dpt_flg)) {
			pred = pred.or(t.bd_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_sd_dpt_flg)) {
			pred = pred.or(t.sd_dpt_flg.eq(value(true)));
		}
		if (row.getBooleanNE(DptCols.$i_non_biz_dpt_flg)) {
			pred = pred.or(
					t.asst_dpt_flg.eq(value(false))
					.and(t.ar_dpt_flg.eq(value(false)))
					.and(t.ap_dpt_flg.eq(value(false)))
					.and(t.sls_dpt_flg.eq(value(false)))
					.and(t.purc_dpt_flg.eq(value(false)))
					.and(t.ship_dpt_flg.eq(value(false)))
					.and(t.arr_dpt_flg.eq(value(false)))
					.and(t.mfg_dpt_flg.eq(value(false)))
					.and(t.sd_dpt_flg.eq(value(false)))
					.and(t.insp_dpt_flg.eq(value(false)))
					.and(t.bd_dpt_flg.eq(value(false)))
			);
		}
		builder.addWhereWithAnd(pred);

	}
	
	protected void getDpt_NullVal(
			MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(DptCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(DptCols.$o_dpt_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	protected MCMessage getDpt_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = null;
		String typ = row.getStringNE(DptCols.$i_dpt_is_srch_typ);
		String usr = row.getStringNE(DptCols.$i_usr_cd);

		if (isNull(typ) || MAC_DPT_IS_SRCH_TYP.isCOMM(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0064, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0352, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isASST(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0187, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0353, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isAR(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0216, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0354, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isAP(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0228, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0355, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isSLS(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0188, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0356, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isPURC(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0229, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0357, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isSHIP(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0237, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0358, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isARR(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0238, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0359, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isMFG(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0236, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0360, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isSD(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0239, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0361, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isINSP(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0235, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0362, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isBD(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0230, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0363, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isARAPBD(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0304, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0364, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isBCST(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0305, toYMDString(row.getDateNE(DptCols.$i_dt)), row.getStringNE(DptCols.$i_bcst_cd), info);
			}
			else {
				msg = new MCMessage(MAUAL0365, toYMDString(row.getDateNE(DptCols.$i_dt)), row.getStringNE(DptCols.$i_bcst_cd), info);
			}
		}
		else if (MAC_DPT_IS_SRCH_TYP.isSCE(typ)) {
			if (!isNull(usr)) {
				msg = new MCMessage(MAUAL0306, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
			else {
				msg = new MCMessage(MAUAL0366, toYMDString(row.getDateNE(DptCols.$i_dt)), info);
			}
		}
		
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- Dpt:部門(END)
}
