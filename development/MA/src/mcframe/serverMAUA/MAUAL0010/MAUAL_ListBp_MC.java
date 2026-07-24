package mcframe.serverMAUA.MAUAL0010;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
import static mcframe.serverMA.dbc.MABSFunction.*;
import mcframe.serverMA.dbc.*;
import static mcframe.commonCore.lang.MCBooleanUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;


import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import java.util.Optional;

abstract public class MAUAL_ListBp_MC extends MAUAL_List_MC_A {
	protected int _cstdlv_sql = 0;

	// -- Bp:取引先(START)
	@Override
	protected void getBp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		super.getBp_Set(row, builder, t, result);
		getBp_addSelectJoinCustom(row, builder, t, result);
		getBp_addWhereCustom(row, builder, t, result);
	}

	@Override
	protected MCList<?> getBp_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {
		MCList<?> sl = super.getBp_AfterSelect(row, builder, t, result);

		String bp_is_srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		// 区分１７：得意先（納品先対応）
		if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			_cstdlv_sql = 1;

			//ORで分割した条件のデータを取得
			MAM_BP_R subp = MAM_BP_R.create("T");
			MCList<MAM_BP_R> auxRslt = MCList.create(subp);
			MCQueryApiBuilder auxBuilder = MCQueryApiBuilder.create(subp);
			getBp_Set(row, auxBuilder, subp, auxRslt);
			listlogicCommon_Set(row, auxBuilder, "MA.MAUAL0010.Bp");
			MCList<MCRow> mergebinds = MCList.create(MCRow.class);
			mergebinds.add(builder.getMergeBind());
			auxBuilder.buildSelect(
					createSqlId("MA.MAUAL0010.Bp_getBp_AfterSelect", subp, "S01"))
					.executeQuery(row, mergebinds, auxRslt);

			String[] cols = auxRslt.getNameArray();
			MCIndexKey key = sl.createIndex("bp_cd");
			for (MCRow r : auxRslt) {
				if (!isNull(sl.getFirst(key, r.getString("bp_cd")))) {
					continue;
				}
				sl.add().setValuesByName(r, cols);
			}
		}

		//補完する値をキャッシュ
		bpInitCache(sl, bp_is_srch_typ);

		//補完
		for (MCRow r : sl) {
			MAM_CUR_R curR = _bpCache.get(MAM_CUR_R.class, r.getString("cur_cd"));
			MAM_TTERM_R ttm1R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd1"));
			MAM_TTERM_R ttm2R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd2"));
			MAM_TTERM_R ttm3R = _bpCache.get(MAM_TTERM_R.class,
					r.getString("cst_tterm_cd3"));
			MAM_BP_R acstR = _bpCache.get(MAM_BP_R.class, r.getString("acst_cd"));

			r.setStringNE("cur_nm", curR.cur_nm());
			r.setNumberNE("amt_dec_place", curR.amt_dec_place());
			r.setNumberNE("upri_dec_place", curR.upri_dec_place());
			r.setStringNE("cst_tterm_nm1", ttm1R.tterm_nm());
			r.setStringNE("cst_tterm_nm2", ttm2R.tterm_nm());
			r.setStringNE("cst_tterm_nm3", ttm3R.tterm_nm());
			r.setStringNE("acst_nm", acstR.bp_nm());

			if (r.getString("cntry_cd").equals(MAUCL_AppSys.getCo().cntry_cd())) {
				r.setBooleanNE("foreign_flg", false);
			}
			else {
				r.setBooleanNE("foreign_flg", true);
			}
			if (isNull(r.getString("purc_upri_req_typ"))) {
				r.setString("purc_upri_req_typ",
						MAUCL_AppSys.getCo().purc_upri_req_typ());
			}

			if (!r.getBooleanNE("onr_prsppl_flg")) {
				r.setString("outsrc_upri_typ", MAC_OUTSRC_UPRI_TYP.PROC.value());
			}
			else if (isNull(r.getString("outsrc_upri_typ"))) {
				r.setString("outsrc_upri_typ", MAUCL_AppSys.getCo().outsrc_upri_typ());
			}

			// 区分１７：得意先（納品先対応）
			if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {

				MAM_CST_USR_R mawR = _bpCache.get(MAM_CST_USR_R.class, r.getDate("st_dt"),
						r.getString("bp_cd"));
				MAM_BP_R bcstR = _bpCache.get(MAM_BP_R.class, acstR.getString("bcst_cd"));

				r.setStringNE("cst_usr_cd", mawR.getStringNE("usr_cd"));
				r.setStringNE("cst_dpt_cd", mawR.getStringNE("dpt_cd"));
				r.setStringNE("bill_cl_typ", bcstR.bill_cl_typ());
			}
		}
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			sl = getBp_NoDupList(row, builder, t, sl, BpCols.$o_def_dlv_cd);
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			sl = getBp_NoDupList(row, builder, t, sl, BpCols.$o_def_cst_cd);
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			sl = getBp_NoDupList(row, builder, t, sl, BpCols.$o_def_dlv_cd);
		}

		// マスタ専用処理
		getBp_AfterSelectMstr(row, builder, t, result, sl);

		return sl;
	}

	protected DbcCacheMap _bpCache = new DbcCacheMap();

	protected void bpInitCache(MCList<?> bindL, String bp_is_srch_typ) {
		MAM_CUR_R curDbc = MAM_CUR_R.create("T");
		MCQueryApiBuilder bpCurBuilder = MCQueryApiBuilder.create(curDbc);
		bpCurBuilder.setSelect(curDbc.cur_nm, curDbc.amt_dec_place,
				curDbc.upri_dec_place);
		_bpCache.set("MAM_CUR", bpCurBuilder, bindL, "cur_cd");

		MAM_TTERM_R ttm1Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm1Builder = MCQueryApiBuilder.create(ttm1Dbc);
		ttm1Builder.setSelect(ttm1Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm1Builder, bindL, "cst_tterm_cd1");

		MAM_TTERM_R ttm2Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm2Builder = MCQueryApiBuilder.create(ttm2Dbc);
		ttm2Builder.setSelect(ttm2Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm2Builder, bindL, "cst_tterm_cd2");

		MAM_TTERM_R ttm3Dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder ttm3Builder = MCQueryApiBuilder.create(ttm3Dbc);
		ttm3Builder.setSelect(ttm3Dbc.tterm_nm);
		_bpCache.set("MAM_TTERM", ttm3Builder, bindL, "cst_tterm_cd3");

		MAM_BP_R acstDbc = MAM_BP_R.create("T");
		MCQueryApiBuilder acstBuilder = MCQueryApiBuilder.create(acstDbc);
		acstBuilder.setSelect(acstDbc.bp_cd, acstDbc.bp_nm, acstDbc.bcst_cd,
				acstDbc.bill_cl_typ);
		acstBuilder.setWhere(acstDbc.acst_flg.eq(value(true)));

		_bpCache.set("MAM_BP", acstBuilder, bindL, "acst_cd");

		// 区分１７：得意先（納品先対応）
		if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			MAM_CST_USR_R cstUsrDbc = MAM_CST_USR_R.create("T");
			MCQueryApiBuilder cstUsrBuilder = MCQueryApiBuilder.create(cstUsrDbc);
			cstUsrBuilder.setSelect(cstUsrDbc.usr_cd, cstUsrDbc.dpt_cd, cstUsrDbc.dpt_cd,
					cstUsrDbc.st_dt);
			FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R> cache = new FXUCL_MCDbcCacheStEnd<MAM_CST_USR_R>(
					cstUsrBuilder, bindL, "bp_cd");
			_bpCache.set("MAM_CST_USR", cache);

			MAM_BP_R bcstDbc = MAM_BP_R.create("T");
			MCQueryApiBuilder bcstBuilder = MCQueryApiBuilder.create(bcstDbc);
			bcstBuilder.setWhere(bcstDbc.bcst_flg.eq(value(true)));

			_bpCache.set("MAM_BP", bcstBuilder, MCList.create(bcstDbc.createInstance()),
					"bcst_cd");
		}
	}

	protected void getBp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {

		String srchtyp = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		// MCSQLPluginリソースの設定（ヒント句設定）で使用するバインドの設定
		// 標準設定
		row.setStringNE("default_hint", "true");
		// 区分別設定
		String hintcol = Optional.ofNullable(
				MAC_BP_IS_SRCH_TYP.getNE(srchtyp))
				.map(st -> st.key()).orElse("");
		row.setStringNE(hintcol + "_hint", "true");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addNumberColumn(BpCols.$o_amt_dec_place);
		result.addNumberColumn(BpCols.$o_upri_dec_place);
		result.addBooleanColumn(BpCols.$o_foreign_flg);
		result.addDateColumn(BpCols.$o_st_dt);
		result.addDateColumn(BpCols.$o_end_dt);
		result.addStringColumn(BpCols.$o_purc_usr_cd);
		result.addStringColumn(BpCols.$o_purc_dpt_cd);
		result.addStringColumn(BpCols.$o_dlv_cd);
		result.addStringColumn(BpCols.$o_def_dlv_cd);
		result.addStringColumn(BpCols.$o_cst_usr_cd);
		result.addStringColumn(BpCols.$o_cst_dpt_cd);
		result.addStringColumn(BpCols.$o_cst_cd);
		result.addStringColumn(BpCols.$o_def_cst_cd);
		result.addBooleanColumn(BpCols.$o_edi_po_send_tgt_flg);
		result.addBooleanColumn(BpCols.$o_edi_accpt_send_tgt_flg);
		result.addStringColumn(BpCols.$o_bp_grp_nm1);
		result.addStringColumn(BpCols.$o_bp_grp_nm2);
		result.addStringColumn(BpCols.$o_bp_grp_nm3);
		result.addStringColumn(BpCols.$o_bp_grp_nm4);
		result.addStringColumn(BpCols.$o_bp_grp_nm5);
		result.addStringColumn(BpCols.$o_bp_grp_nm6);
		result.addStringColumn(BpCols.$o_bp_grp_nm7);
		result.addStringColumn(BpCols.$o_bp_grp_nm8);
		result.addStringColumn(BpCols.$o_bp_grp_nm9);
		result.addStringColumn(BpCols.$o_bp_grp_nm10);

		// Select句、結合の設定
		// _bpCacheで取得するためremove
		builder.removeSelect(MAM_BP_R.$cur_nm);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm1);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm2);
		builder.removeSelect(MAM_BP_R.$cst_tterm_nm3);
		builder.removeSelect(MAM_BP_R.$acst_nm);
		builder.removeSelect(MAM_BP_R.$bcst_nm);
		builder.removeSelect(MAM_BP_R.$ap_dpt_cd);
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cur_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm1));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm2));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$cst_tterm_nm3));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$acst_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAM_BP_R.$bcst_nm));
		
		// 取引先補助マスタから取得するためremove
		builder.removeSelect(MAM_BP_R.$zip_cd);
		builder.removeSelect(MAM_BP_R.$addr1);
		builder.removeSelect(MAM_BP_R.$addr2);
		builder.removeSelect(MAM_BP_R.$addr3);
		builder.removeSelect(MAM_BP_R.$addr4);
		builder.removeSelect(MAM_BP_R.$tel);
		builder.removeSelect(MAM_BP_R.$fax);
		builder.removeSelect(MAM_BP_R.$ap_dpt_cd);
		builder.removeSelect(MAM_BP_R.$ar_dpt_cd);
		builder.removeSelect(MAM_BP_R.$bsppl_dpt_cd);
		builder.removeSelect(MAM_BP_R.$pay_dpt_cd);
		builder.removeSelect(MAM_BP_R.$cst_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$cst_cntct_psn);
		builder.removeSelect(MAM_BP_R.$sppl_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$sppl_cntct_psn);
		builder.removeSelect(MAM_BP_R.$dlv_cntct_dpt);
		builder.removeSelect(MAM_BP_R.$dlv_cntct_psn);
		
		// Z項目を使用してselectとJoin を追加
		builder.addSelect(MAM_BP_R.$cntry_nm, t.getColumn$(MAM_BP_R.$cntry_nm));
		builder.addSelect(MAM_BP_R.$area_nm, t.getColumn$(MAM_BP_R.$area_nm));
		getBp_addSelectJoinWk(row, builder, t, result);
		getBp_addSelectJoinBpSub(row, builder, t, result);
		getBp_addSelectJoinByBpIsSrchTyp(row, builder, t, result,
				row.getStringNE(BpCols.$i_bp_is_srch_typ));

		// リストロジックチェック時 
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 入力補助画面からのリスト取得時
		setSelectJoinOfBpGrpForBp(row, builder);
	}

	protected void getBp_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MAW_BP_LL_R> dcL = MCList.create(MAW_BP_LL_R.class);
		String delId = createSqlId("MA.MAUAL0010.Bp_getBp_addSelectJoinWk",
				dcL.createRow(), "D01");
		execDbWkDelete(delId, MAW_BP_LL_R.create());
		String insId = createSqlId("MA.MAUAL0010.Bp_getBp_addSelectJoinWk",
				dcL.createRow(), "I01");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(dcL.createRow());
		insBuilder.setValuesAll();
		String[] bpCd = null;
		MCDate[] dt = null;
		String[] dlvCd = null;
		String[] cstCd = null;
		String[] bspplCd = null;
		if (isSrvChk(row)) {
			String bp_is_srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);
			boolean containDt = row.contains(getLLBindNm(BpCols.$i_dt));

			bpCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containDt) {
				dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(BpCols.$i_dt)));
			}
			// 区分１７：得意先（納品先対応）
			if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
				dlvCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(BpCols.$i_dlv_cd)));
			}
			// 区分１８：納品先（得意先対応）
			if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
				cstCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(BpCols.$i_cst_cd)));
			}
			// 区分３０：債務相殺先
			if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
				bspplCd = (String[]) convDataArray(
						row.getStringNE(getLLBindNm(BpCols.$i_bsppl_cd)));
			}

			for (int i = 0; i < bpCd.length; i++) {
				MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
				dcR.bp_cd(bpCd[i]);
				// 適用日が指定されている場合
				if (containDt) {
					dcR.dt(dt[i]);
				}
				// 区分１７：得意先（納品先対応）
				if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
					dcR.dlv_cd(dlvCd[i]);
				}
				// 区分１８：納品先（得意先対応）
				if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
					dcR.cst_cd(cstCd[i]);
				}
				// 区分３０：債務相殺先
				if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
					dcR.bsppl_cd(bspplCd[i]);
				}
				dcL.add(dcR);
			}
			dbInsert(insId, dcL, insBuilder);

			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.dlv_cd); // リストロジックチェックで使用
			builder.addSelect(w.cst_cd); // リストロジックチェックで使用
			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));
			builder.addInnerJoin(w, w.bp_cd.eq(t.bp_cd));
		}
		else {
			MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
			dcR.dlv_cd(row.getStringNE(BpCols.$i_dlv_cd));
			dcR.cst_cd(row.getStringNE(BpCols.$i_cst_cd));
			dcR.bsppl_cd(row.getStringNE(BpCols.$i_bsppl_cd));
			dcR.dt(row.getDateNE(BpCols.$i_dt));
			dcL.add(dcR);
			dbInsert(insId, dcL, insBuilder);

			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));

			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}

	/**
	 * @param row
	 * @param builder
	 * @param t
	 */
	protected void getBp_addSelectJoinBpSub(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result) {
		if (hasDt(row, BpCols.$i_dt)) {
			MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
			builder.addSelect(MAPA_BP$F_GET_AR_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("ar_dpt_cd"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value())).as("cst_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value())).as("cst_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())).as("sppl_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())).as("sppl_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("dlv_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("dlv_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BSPPL_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("bsppl_dpt_cd"));
			builder.addSelect(MAPA_BP$F_GET_PAY_DPT_CD_NE(t.bp_cd, w.dt, value(false))
					.as("pay_dpt_cd"));
		}
	}

	protected void getBp_addSelectJoinByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		MAM_BP_R baseDbc = (MAM_BP_R) builder.getBaseDbc();
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
		MAM_CST_DLV_R cst_dlv = MAM_CST_DLV_R.create("CST_DLV");
		MAM_CST_USR_R cst_usr = MAM_CST_USR_R.create("CST_USR");
		MAM_SPPL_USR_R sppl_usr = MAM_SPPL_USR_R.create("SPPL_USR");
		MAM_BP_R dlv = MAM_BP_R.create("DLV");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		MAM_BP_R asppl = MAM_BP_R.create("ASPPL");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		MAM_EDI_IF_CTL_R ifctl_po = MAM_EDI_IF_CTL_R.create("IFCTL_PO");
		MAM_EDI_IF_CTL_R ifctl_accpt = MAM_EDI_IF_CTL_R.create("IFCTL_ACCPT");
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, BpCols.$i_dt)) {
				builder.addSelect(cst_usr.usr_cd.as("cst_usr_cd"),
						cst_usr.dpt_cd.as("cst_dpt_cd"),
						nvl(cst_dlv.dlv_cd, dlv.bp_cd).as("def_dlv_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst_usr,
								cst_usr.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_usr.st_dt, cst_usr.end_dt)))
						.addLeftOuterJoin(dlv, dlv.bp_cd.eq(baseDbc.bp_cd)
								.and(dlv.dlv_flg.eq(value(true))));
			}
		}
		// 区分２：売掛先
		else if (MAC_BP_IS_SRCH_TYP.isACST(bp_is_srch_typ)) {
			builder.addSelect(MAM_BP_R.$bcst_nm, t.getColumn$(MAM_BP_R.$bcst_nm));
		}
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, BpCols.$i_dt)) {
				builder.addSelect(sppl_usr.purc_usr_cd, sppl_usr.purc_dpt_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(baseDbc.asppl_cd, w.dt, value(false))
								.as("ap_dpt_cd"))
						.addLeftOuterJoin(sppl_usr, sppl_usr.sppl_cd.eq(baseDbc.bp_cd)
								.and(w.dt.between(sppl_usr.st_dt, sppl_usr.end_dt)));
			}
			String $ediToday = "edi_today";
			row.addDateColumn($ediToday, getToday());
			builder.addSelect(cases().when(ifctl_po.if_proc_typ.isNull())
					.then(value(false)).otherwise(value(true)).as("edi_po_send_tgt_flg"));
			builder.addLeftOuterJoin(ifctl_po, t.bp_cd.eq(ifctl_po.bp_cd)
					.and(bind("edi_today").between(ifctl_po.st_dt, ifctl_po.end_dt))
					.and(ifctl_po.if_proc_typ
							.eq(value(MAC_IF_PROC_TYP.PO_SEND.value()))));
			builder.addSelect(
					cases().when(ifctl_accpt.if_proc_typ.isNull()).then(value(false))
							.otherwise(value(true)).as("edi_accpt_send_tgt_flg"));
			builder.addLeftOuterJoin(ifctl_accpt, t.bp_cd.eq(ifctl_accpt.bp_cd)
					.and(bind("edi_today").between(ifctl_accpt.st_dt, ifctl_accpt.end_dt))
					.and(ifctl_accpt.if_proc_typ
							.eq(value(MAC_IF_PROC_TYP.ACCPT_SEND.value()))));
		}
		//　区分２８：発注先_購買
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, BpCols.$i_dt)) {
				builder.addSelect(sppl_usr.purc_usr_cd, sppl_usr.purc_dpt_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(baseDbc.asppl_cd, w.dt, value(false))
								.as("ap_dpt_cd"))
						.addLeftOuterJoin(sppl_usr, sppl_usr.sppl_cd.eq(baseDbc.bp_cd)
								.and(w.dt.between(sppl_usr.st_dt, sppl_usr.end_dt)));
			}
			builder.removeSelect(MAM_BP_R.$pay_spot_flg).addSelect(bsppl.pay_spot_flg)
					.addLeftOuterJoin(asppl,
							asppl.bp_cd.eq(baseDbc.asppl_cd)
									.and(asppl.asppl_flg.eq(value(true))))
					.addLeftOuterJoin(bsppl, bsppl.bp_cd.eq(asppl.bsppl_cd)
							.and(bsppl.bsppl_flg.eq(value(true))));
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			// 日付は任意
			if (!isSrvChk(row) && hasDt(row, BpCols.$i_dt)) {
				builder.addSelect(nvl(cst_dlv.cst_cd, cst.bp_cd).as("def_cst_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.dlv_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst, cst.bp_cd.eq(baseDbc.bp_cd)
								.and(cst.cst_flg.eq(value(true))));
			}
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			// 日付は任意
			if (hasDt(row, BpCols.$i_dt)) {
				builder.addSelect(cst_usr.usr_cd.as("cst_usr_cd"))
						.addSelect(cst_usr.dpt_cd.as("cst_dpt_cd"))
						.addSelect(nvl(cst_dlv.dlv_cd, dlv.bp_cd).as("def_dlv_cd"))
						.addLeftOuterJoin(cst_dlv,
								cst_dlv.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)))
						.addLeftOuterJoin(cst_usr,
								cst_usr.cst_cd.eq(baseDbc.bp_cd)
										.and(w.dt.between(cst_usr.st_dt, cst_usr.end_dt)))
						.addLeftOuterJoin(dlv, dlv.bp_cd.eq(baseDbc.bp_cd)
								.and(dlv.dlv_flg.eq(value(true))));
			}
			builder.removeSelect(MAM_BP_R.$bill_cl_typ).addSelect(bcst.bill_cl_typ)
					.addLeftOuterJoin(acst,
							acst.bp_cd.eq(baseDbc.acst_cd)
									.and(acst.acst_flg.eq(value(true))))
					.addLeftOuterJoin(bcst, bcst.bp_cd.eq(acst.bcst_cd)
							.and(bcst.bcst_flg.eq(value(true))));
		}
		// 区分１７：得意先（納品先対応）
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			// 日付は必須
			if (_cstdlv_sql == 0) {
				builder.addLeftOuterJoin(cst_dlv, cst_dlv.cst_cd.eq(baseDbc.bp_cd)
						.and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)));
			}
		}
		// 区分１８：納品先（得意先対応）
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
			// 日付は必須
			builder.setDistinct().addLeftOuterJoin(cst_dlv, cst_dlv.dlv_cd
					.eq(baseDbc.bp_cd).and(w.dt.between(cst_dlv.st_dt, cst_dlv.end_dt)));
		}
		// 区分３０：債務相殺先
		else if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
			builder.setDistinct()
					.addInnerJoin(bcst,
							baseDbc.bcst_cd.eq(bcst.bp_cd)
									.and(bcst.bcst_flg.eq(value(true))))
					.addLeftOuterJoin(bsppl,
							bcst.ar_setoff_grp_cd.eq(bsppl.ap_setoff_grp_cd)
									.and(bsppl.bsppl_flg.eq(value(true))));
		}
	}

	protected void getBp_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		String srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);
		getBp_addWhereByBpIsSrchTyp(row, builder, t, result, srch_typ);
		if (row.getBooleanNE(BpCols.$i_foreign_flg)) {
			builder.addWhereWithCutOffAnd(t.cntry_cd.neq(bind("1")),
					MAUCL_AppSys.getCo().cntry_cd());
		}

		// リストロジックチェック時はこれ以上の条件を追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		// 債権債務先識別区分
		getBp_addWhereByBpIsSrchTyp(row, builder, t, result, MAC_DEBT_CRED_ID_TYP
				.bp_is_srch_typ(row.getStringNE(BpCols.$i_debt_cred_id_typ)));

		String bp_is_srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.rcst_cd.eq(bind("1")).or(t.bp_cd.eq(bind("1"))),
					row.getStringNE(BpCols.$i_in_rcst_cd));
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}

		// 入力補助画面の条件
		addWhereByBpFlg(row, builder);
		builder.addWhereWithCutOffAnd(t.bp_cd.like(bind("1")),
				getEditString(row, BpCols.$i_bp_cd));
		builder.addWhereWithCutOffAnd(t.bp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.ein.like(bind("1")),
				getEditString(row, BpCols.$i_ein));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm1.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm1));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm2.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm2));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm3.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm3));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm4.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm4));
		builder.addWhereWithCutOffAnd(t.cntry_cd.like(bind("1")),
				getEditString(row, BpCols.$i_cntry_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("cntry_nm")).like(bind("1")),
				getEditString(row, BpCols.$i_cntry_nm));
		builder.addWhereWithCutOffAnd(t.area_cd.like(bind("1")),
				getEditString(row, BpCols.$i_area_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("area_nm")).like(bind("1")),
				getEditString(row, BpCols.$i_area_nm));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, BpCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, BpCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, BpCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.memo4.like(bind("1")),
				getEditString(row, BpCols.$i_memo4));
		builder.addWhereWithCutOffAnd(t.memo5.like(bind("1")),
				getEditString(row, BpCols.$i_memo5));
		builder.addWhereWithCutOffAnd(t.memo6.like(bind("1")),
				getEditString(row, BpCols.$i_memo6));
		builder.addWhereWithCutOffAnd(t.memo7.like(bind("1")),
				getEditString(row, BpCols.$i_memo7));
		builder.addWhereWithCutOffAnd(t.memo8.like(bind("1")),
				getEditString(row, BpCols.$i_memo8));
		builder.addWhereWithCutOffAnd(t.memo9.like(bind("1")),
				getEditString(row, BpCols.$i_memo9));
		builder.addWhereWithCutOffAnd(t.memo10.like(bind("1")),
				getEditString(row, BpCols.$i_memo10));
		builder.addWhereWithCutOffAnd(t.memo11.like(bind("1")),
				getEditString(row, BpCols.$i_memo11));
		builder.addWhereWithCutOffAnd(t.memo12.like(bind("1")),
				getEditString(row, BpCols.$i_memo12));
		builder.addWhereWithCutOffAnd(t.memo13.like(bind("1")),
				getEditString(row, BpCols.$i_memo13));
		builder.addWhereWithCutOffAnd(t.memo14.like(bind("1")),
				getEditString(row, BpCols.$i_memo14));
		builder.addWhereWithCutOffAnd(t.memo15.like(bind("1")),
				getEditString(row, BpCols.$i_memo15));
		builder.addWhereWithCutOffAnd(t.memo16.like(bind("1")),
				getEditString(row, BpCols.$i_memo16));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, BpCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, BpCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo18.like(bind("1")),
				getEditString(row, BpCols.$i_memo18));
		builder.addWhereWithCutOffAnd(t.memo19.like(bind("1")),
				getEditString(row, BpCols.$i_memo19));
		builder.addWhereWithCutOffAnd(t.memo20.like(bind("1")),
				getEditString(row, BpCols.$i_memo20));

		// getBp_adddSelectJoinCustom でJoinされる。Joinしていないwhere句はカットオフで消去される前提。
		MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
		MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
		MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
		MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
		MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
		MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
		MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
		MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
		MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
		MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");

		builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm1));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm2));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm4));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm5));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm6));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm7));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm8));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm9));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm10));
	}

	protected void getBp_addWhereByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		MAM_BP_ITM_R bi = MAM_BP_ITM_R.create("BI");
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
		MAM_CST_DLV_R cst_dlv = MAM_CST_DLV_R.create("CST_DLV");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		// 固定条件のみ実装

		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
			if (row.contains(BpCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(BpCols.$i_cst_iv_flg)));
			}
		}
		// 区分２：売掛先
		else if (MAC_BP_IS_SRCH_TYP.isACST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.acst_flg.eq(value(true)));
		}
		// 区分３：請求先
		else if (MAC_BP_IS_SRCH_TYP.isBCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bcst_flg.eq(value(true)));
		}
		// 区分４：入金先
		else if (MAC_BP_IS_SRCH_TYP.isRCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.rcst_flg.eq(value(true)));
		}
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分６：買掛先
		else if (MAC_BP_IS_SRCH_TYP.isASPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.asppl_flg.eq(value(true)));
		}
		// 区分７：支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(true)));
		}
		// 区分８：支払先
		else if (MAC_BP_IS_SRCH_TYP.isPSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.psppl_flg.eq(value(true)));
		}
		// 区分９：与信管理先
		else if (MAC_BP_IS_SRCH_TYP.isCRED(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cred_flg.eq(value(true)));
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.dlv_flg.eq(value(true)));
		}
		// 区分１１：メーカ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.maker_flg.eq(value(true)));
		}
		// 区分１２：仕向先
		else if (MAC_BP_IS_SRCH_TYP.isDEST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.dest_flg.eq(value(true)));
		}
		// 区分１３：得意先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.cst_flg.eq(value(true)).or(t.sppl_flg.eq(value(true))));
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cst_sundry_flg.eq(value(false)));
			if (row.contains(BpCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(BpCols.$i_cst_iv_flg)));
			}
		}
		// 区分１５：配送先
		else if (MAC_BP_IS_SRCH_TYP.isTDLV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(true)));
		}
		// 区分１６：有償支給先
		else if (MAC_BP_IS_SRCH_TYP.isONR_PRSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.onr_prsppl_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.cst_flg.eq(value(true))).or(t.acst_flg.eq(value(true)))
					.or(t.bcst_flg.eq(value(true))).or(t.rcst_flg.eq(value(true)))
					.or(t.sppl_flg.eq(value(true))).or(t.asppl_flg.eq(value(true)))
					.or(t.bsppl_flg.eq(value(true))).or(t.psppl_flg.eq(value(true)))
					.or(t.cred_flg.eq(value(true))).or(t.dlv_flg.eq(value(true)))
					.or(t.maker_flg.eq(value(true))).or(t.dest_flg.eq(value(true)))
					.or(t.tdlv_flg.eq(value(true))));
		}
		// 区分１７：得意先（納品先対応）
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(bp_is_srch_typ)) {
			if (!row.getBooleanNE(BpCols.$i_cst_sundry_cntn_flg)) {
				builder.addWhereWithAnd(t.cst_sundry_flg.eq(value(false)));
			}
			if (row.contains(BpCols.$i_cst_iv_flg)) {
				builder.addWhereWithAnd(t.cst_iv_flg.eq(bind("1")),
						booleanToDBString(row.getBooleanNE(BpCols.$i_cst_iv_flg)));
			}
			if (_cstdlv_sql == 0) {
				builder.addWhereWithAnd(cst_dlv.dlv_cd.eq(w.dlv_cd));
			}
			else {
				builder.addWhereWithAnd(
						t.bp_cd.eq(w.dlv_cd).and(t.cst_flg.eq(value(true))));
			}
		}
		// 区分１８：納品先（得意先対応）
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(cst_dlv.cst_cd.eq(w.cst_cd)
					.or(t.bp_cd.eq(w.cst_cd).and(t.dlv_flg.eq(value(true)))));
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.bcst_flg.eq(value(true)));
		}
		// 区分２０：納品先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDLV_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(true)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(false)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(false)));
		}
		// 区分２１：メーカのみ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(false)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(true)));
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(false)));
		}
		// 区分２２：仕向先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDEST_ONLY(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(true)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(false)));
			builder.addWhereWithAnd(t.tdlv_flg.eq(value(false)));
		}
		// 区分２３：納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isDLV_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.dlv_flg.eq(value(true)).or(t.sppl_flg.eq(value(true))));
		}
		// 区分２４：購買内示
		else if (MAC_BP_IS_SRCH_TYP.isPURC_FRCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(bi).where(value(0).eq(value(0))
							.and(bi.bp_cd.eq(t.bp_cd)).and(bi.pf_grp_cd.isNotNull()))));
		}
		// 区分２５：請求先または入金先
		else if (MAC_BP_IS_SRCH_TYP.isBCST_RCST(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.bcst_flg.eq(value(true)).or(t.rcst_flg.eq(value(true))));
		}
		// 区分２６：得意先または納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_DLV_SPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.dlv_flg.eq(value(true))).or(t.sppl_flg.eq(value(true))));
		}
		// 区分２７：インボイス取引対象発注先ではない
		else if (MAC_BP_IS_SRCH_TYP.isNOT_SPPL_IV(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分２８：発注先_購買
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
		// 区分２９：支払予定管理先または支払先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL_PSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(
					t.bsppl_flg.eq(value(true)).or(t.psppl_flg.eq(value(true))));
		}
		// 区分３０：債務相殺先
		else if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.acst_flg.eq(value(true)));
			builder.addWhereWithAnd(
					w.bsppl_cd.eq(bsppl.bp_cd).or(w.bsppl_cd.eq(bcst.bp_cd)));
		}
		// 区分３１：得意先または発注先または請求先または支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL_BILL_BSPPL(bp_is_srch_typ)) {
			builder.addWhereWithAnd(t.cst_flg.eq(value(true))
					.or(t.sppl_flg.eq(value(true))
					.or(t.bcst_flg.eq(value(true)))
					.or(t.bsppl_flg.eq(value(true)))));
		}
	}

	protected void getBp_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(BpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(BpCols.$o_bp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	public <E extends MCRow> MCList getBp_SrvChk(MCRow inRow, MCList<E> rsltL) {
		String bp_is_srch_typ = inRow.getStringNE(BpCols.$i_bp_is_srch_typ);
		// 債権債務先識別区分
		if (!isNull(inRow.getStringNE(BpCols.$i_debt_cred_id_typ))) {
			bp_is_srch_typ = MAC_DEBT_CRED_ID_TYP
					.bp_is_srch_typ(inRow.getStringNE(BpCols.$i_debt_cred_id_typ));
		}
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
		// 区分５、１０は検索区分そのものが動的条件としてわたる場合があるため、getBp_SrvChkにも実装する
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(bp_is_srch_typ)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
					return row.getBooleanNE(BpCols.$o_sppl_flg);
				}
			});
			return subRsltL;
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(bp_is_srch_typ)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
					return row.getBooleanNE(BpCols.$o_dlv_flg);
				}
			});
			return subRsltL;
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(bp_is_srch_typ)) {
			MCList subRsltL = rsltL.subList(new MCRowMatcher<E>() {
				@Override
				public boolean match(E row) {
					// 取引先マスタの入金先ＣＤ＝引数の入金先ＣＤ
					boolean cnd1 = isSame(row.getStringNE("rcst_cd"),
							inRow.getStringNE(BpCols.$i_in_rcst_cd));
					// もしくは取引先マスタの取引先ＣＤ＝引数の入金先ＣＤ
					boolean cnd2 = isSame(row.getStringNE("bp_cd"),
							inRow.getStringNE(BpCols.$i_in_rcst_cd));
					return (cnd1 || cnd2);
				}
			});
			return subRsltL;
		}

		return rsltL;
	}

	protected MCList<?> getBp_AfterSelectMstr(MCRow row, MCQueryApiBuilder builder,
			MAM_BP_R t, MCList<?> result, MCList sl) {
		// 手入力時または存在チェック時のみ
		if (row.getBooleanNE(BpCols.$i_check_rem_flg) && isInput(row)) {
			MCRow refRow = sl.createRow();
			if (!isNull(row.getStringNE(BpCols.$i_ref_bp_cd))) {
				refRow.setStringNE(BpCols.$o_bp_cd, row.getString(BpCols.$i_ref_bp_cd));
				sl.add(refRow);
			}
		}
		else if (row.contains(getLLBindNm(BpCols.$i_check_rem_flg))) {
			String[] strs = arrayValueSplit(
					row.getStringNE(getLLBindNm(BpCols.$i_check_rem_flg)));
			String[] remFlgs = new String[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				remFlgs[i - 1] = strs[i];
			}
			String[] cd = (String[]) convDataArray(
					row.getStringNE(getLLBindNm(BpCols.$i_ref_bp_cd)));
			for (int i = 0; i < remFlgs.length; i++) {
				if (isSame(remFlgs[i], "1") && !isNull(cd[i])) {
					MCRow refRow = sl.createRow();
					refRow.setStringNE(BpCols.$o_bp_cd, cd[i]);
					sl.add(refRow);
				}
				else if (isSame(remFlgs[i], "0") && !isNull(cd[i])) {
					sl.removeAll(sl.subList(BpCols.$o_bp_cd, cd[i]));
				}
			}
		}
		return sl;
	}

	/**
	 * 検索結果にキー（取引先ＣＤ）が重複するレコードが存在している場合、
	 * 対象カラムにnullをセットした上で、重複レコードを１つにまとめたリストを返します。
	 *
	 * @param row 検索条件
	 * @param t DBコンテナ
	 * @param sl 検索結果
	 * @param tarCol 対象カラム
	 * @return 検索結果から重複を除いたリスト
	 */
	protected MCList<?> getBp_NoDupList(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t,
			MCList sl, String tarCol) {
		String keyCol = BpCols.$o_bp_cd;
		String dateCol = BpCols.$o_st_dt;
		// 一時カラムを保持した空のリストを生成
		MCList noDupList = sl.shallowClone();
		noDupList.clear();

		sl.sort(keyCol);
		MCRow pre = null;
		for (Object o : sl) {
			MCRow sr = (MCRow) o;
			if (pre != null && isSame(pre.getStringNE(keyCol), sr.getStringNE(keyCol))
					&& isSame(pre.getDateNE(dateCol), sr.getDateNE(dateCol))) {
				pre.clear(tarCol);
			}
			else {
				noDupList.add(sr);
				pre = sr;
			}
		}
		return noDupList;
	}

	protected MCMessage getBp_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		String typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		if (isNull(typ) || MAC_BP_IS_SRCH_TYP.isCOMM(typ)) {
			msg = new MCMessage(MAUAL0117, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST(typ)) {
			msg = new MCMessage(MAUAL0103, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isACST(typ)) {
			msg = new MCMessage(MAUAL0104, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isBCST(typ)) {
			msg = new MCMessage(MAUAL0105, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isRCST(typ)) {
			msg = new MCMessage(MAUAL0106, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(typ)) {
			msg = new MCMessage(MAUAL0107, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isASPPL(typ)) {
			msg = new MCMessage(MAUAL0108, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL(typ)) {
			msg = new MCMessage(MAUAL0109, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isPSPPL(typ)) {
			msg = new MCMessage(MAUAL0110, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCRED(typ)) {
			msg = new MCMessage(MAUAL0111, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDLV(typ)) {
			msg = new MCMessage(MAUAL0112, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isMAKER(typ)) {
			msg = new MCMessage(MAUAL0113, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDEST(typ)) {
			msg = new MCMessage(MAUAL0114, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL(typ)) {
			msg = new MCMessage(MAUAL0218, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(typ)) {
			msg = new MCMessage(MAUAL0260, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isTDLV(typ)) {
			msg = new MCMessage(MAUAL0261, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isONR_PRSPPL(typ)) {
			msg = new MCMessage(MAUAL0262, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(typ)) {
			String dt = toYMDString(row.getDateNE(BpCols.$i_dt));
			msg = new MCMessage(MAUAL0263, row.getStringNE(BpCols.$i_dlv_cd), dt, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(typ)) {
			String dt = toYMDString(row.getDateNE(BpCols.$i_dt));
			msg = new MCMessage(MAUAL0264, row.getStringNE(BpCols.$i_cst_cd), dt, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(typ)) {
			msg = new MCMessage(MAUAL0265, row.getStringNE(BpCols.$i_in_rcst_cd), info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDLV_ONLY(typ)) {
			msg = new MCMessage(MAUAL0266, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isMAKER_ONLY(typ)) {
			msg = new MCMessage(MAUAL0267, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDEST_ONLY(typ)) {
			msg = new MCMessage(MAUAL0268, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isDLV_SPPL(typ)) {
			msg = new MCMessage(MAUAL0269, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isPURC_FRCST(typ)) {
			msg = new MCMessage(MAUAL0270, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isBCST_RCST(typ)) {
			msg = new MCMessage(MAUAL0271, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST_DLV_SPPL(typ)) {
			msg = new MCMessage(MAUAL0348, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isNOT_SPPL_IV(typ)) {
			msg = new MCMessage(MAUAL0349, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(typ)) {
			msg = new MCMessage(MAUAL0107, info);
		}
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL_BILL_BSPPL(typ)) {
			msg = new MCMessage(MAUAL0397, info);
		}

		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- Bp:取引先(END)
	// -- BpView:取引先View(START)
	@Override
	protected void getBpView_Set(mcframe.commonCore.container.MCRow row,
			mcframe.serverCore.queryapi.MCQueryApiBuilder builder,
			mcframe.serverMA.dbc.MAVM_BP_R t,
			mcframe.commonCore.container.MCList<?> result) {
		super.getBpView_Set(row, builder, t, result);
		getBpView_addSelectJoinCustom(row, builder, t, result);
		getBpView_addWhereCustom(row, builder, t, result);
	}
	
	@Override
	protected MCList<?> getBpView_AfterSelect(MCRow row, MCQueryApiBuilder builder,
			MAVM_BP_R t, MCList<?> result) {
		MCList<?> sl = super.getBpView_AfterSelect(row, builder, t, result);

		String bp_is_srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		//補完する値をキャッシュ
		bpInitCache(sl, bp_is_srch_typ);

		//補完
		for (MCRow r : sl) {
			MAM_CUR_R curR = _bpCache.get(MAM_CUR_R.class, r.getString("cur_cd"));

			r.setStringNE("cur_nm", curR.cur_nm());

			if (r.getString("cntry_cd").equals(MAUCL_AppSys.getCo().cntry_cd())) {
				r.setBooleanNE("foreign_flg", false);
			}
			else {
				r.setBooleanNE("foreign_flg", true);
			}
		}

		return sl;
	}

	protected void getBpView_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder,
			MAVM_BP_R t, MCList<?> result) {

		String srchtyp = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		// MCSQLPluginリソースの設定（ヒント句設定）で使用するバインドの設定
		// 標準設定
		row.setStringNE("default_hint", "true");
		// 区分別設定
		String hintcol = Optional.ofNullable(
				MAC_BP_IS_SRCH_TYP.getNE(srchtyp))
				.map(st -> st.key()).orElse("");
		row.setStringNE(hintcol + "_hint", "true");

		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addNumberColumn(BpCols.$o_amt_dec_place);
		result.addNumberColumn(BpCols.$o_upri_dec_place);
		result.addBooleanColumn(BpCols.$o_foreign_flg);
		result.addDateColumn(BpCols.$o_st_dt);
		result.addDateColumn(BpCols.$o_end_dt);
		result.addStringColumn(BpCols.$o_purc_usr_cd);
		result.addStringColumn(BpCols.$o_purc_dpt_cd);
		result.addStringColumn(BpCols.$o_dlv_cd);
		result.addStringColumn(BpCols.$o_def_dlv_cd);
		result.addStringColumn(BpCols.$o_cst_usr_cd);
		result.addStringColumn(BpCols.$o_cst_dpt_cd);
		result.addStringColumn(BpCols.$o_cst_cd);
		result.addStringColumn(BpCols.$o_def_cst_cd);
		result.addBooleanColumn(BpCols.$o_edi_po_send_tgt_flg);
		result.addBooleanColumn(BpCols.$o_edi_accpt_send_tgt_flg);
		result.addStringColumn(BpCols.$o_bp_grp_nm1);
		result.addStringColumn(BpCols.$o_bp_grp_nm2);
		result.addStringColumn(BpCols.$o_bp_grp_nm3);
		result.addStringColumn(BpCols.$o_bp_grp_nm4);
		result.addStringColumn(BpCols.$o_bp_grp_nm5);
		result.addStringColumn(BpCols.$o_bp_grp_nm6);
		result.addStringColumn(BpCols.$o_bp_grp_nm7);
		result.addStringColumn(BpCols.$o_bp_grp_nm8);
		result.addStringColumn(BpCols.$o_bp_grp_nm9);
		result.addStringColumn(BpCols.$o_bp_grp_nm10);

		// Select句、結合の設定
		// _bpCacheで取得するためremove
		builder.removeSelect(MAVM_BP_R.$cur_nm);
		builder.removeSelect(MAVM_BP_R.$cst_tterm_nm1);
		builder.removeSelect(MAVM_BP_R.$cst_tterm_nm2);
		builder.removeSelect(MAVM_BP_R.$cst_tterm_nm3);
		builder.removeSelect(MAVM_BP_R.$acst_nm);
		builder.removeSelect(MAVM_BP_R.$bcst_nm);
		builder.removeSelect(MAVM_BP_R.$ap_dpt_cd);
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$cur_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$cst_tterm_nm1));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$cst_tterm_nm2));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$cst_tterm_nm3));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$acst_nm));
		builder.inactiveForeign(t.getForeignInfoByColumn(MAVM_BP_R.$bcst_nm));
		
		// 取引先補助マスタから取得するためremove
		builder.removeSelect(MAVM_BP_R.$zip_cd);
		builder.removeSelect(MAVM_BP_R.$addr1);
		builder.removeSelect(MAVM_BP_R.$addr2);
		builder.removeSelect(MAVM_BP_R.$addr3);
		builder.removeSelect(MAVM_BP_R.$addr4);
		builder.removeSelect(MAVM_BP_R.$tel);
		builder.removeSelect(MAVM_BP_R.$fax);
		builder.removeSelect(MAVM_BP_R.$ap_dpt_cd);
		builder.removeSelect(MAVM_BP_R.$ar_dpt_cd);
		builder.removeSelect(MAVM_BP_R.$bsppl_dpt_cd);
		builder.removeSelect(MAVM_BP_R.$pay_dpt_cd);
		builder.removeSelect(MAVM_BP_R.$cst_cntct_dpt);
		builder.removeSelect(MAVM_BP_R.$cst_cntct_psn);
		builder.removeSelect(MAVM_BP_R.$sppl_cntct_dpt);
		builder.removeSelect(MAVM_BP_R.$sppl_cntct_psn);
		builder.removeSelect(MAVM_BP_R.$dlv_cntct_dpt);
		builder.removeSelect(MAVM_BP_R.$dlv_cntct_psn);
		
		// Z項目を使用してselectとJoin を追加
		builder.addSelect(MAVM_BP_R.$cntry_nm, t.getColumn$(MAVM_BP_R.$cntry_nm));
		builder.addSelect(MAVM_BP_R.$area_nm, t.getColumn$(MAVM_BP_R.$area_nm));
		getBpView_addSelectJoinWk(row, builder, t, result);
		getBpView_addSelectJoinBpSub(row, builder, t, result);
		getBpView_addSelectJoinByBpIsSrchTyp(row, builder, t, result,
				row.getStringNE(BpCols.$i_bp_is_srch_typ));

		// リストロジックチェック時 
		if (isSrvChk(row)) {
			return;
		}

		// 直接入力時
		if (isInput(row)) {
			return;
		}

		// 入力補助画面からのリスト取得時
		setSelectJoinOfBpGrpForBp(row, builder);
	}

	protected void getBpView_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MAVM_BP_R t,
			MCList<?> result) {
		MAW_BP_LL_R w = MAW_BP_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MAW_BP_LL_R> dcL = MCList.create(MAW_BP_LL_R.class);
		String delId = createSqlId("MA.MAUAL0010.Bp_getBpView_addSelectJoinWk",
				dcL.createRow(), "D01");
		execDbWkDelete(delId, MAW_BP_LL_R.create());
		String insId = createSqlId("MA.MAUAL0010.Bp_getBpView_addSelectJoinWk",
				dcL.createRow(), "I01");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(dcL.createRow());
		insBuilder.setValuesAll();
		String[] bpCd = null;
		MCDate[] dt = null;
		if (isSrvChk(row)) {
			bpCd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			boolean containDt = row.contains(getLLBindNm(BpCols.$i_dt));
			
			for (int i = 0; i < bpCd.length; i++) {
				MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
				dcR.bp_cd(bpCd[i]);
				// 適用日が指定されている場合
				if (containDt) {
					dcR.dt(dt[i]);
				}
				dcL.add(dcR);
			}
			dbInsert(insId, dcL, insBuilder);

			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));
			builder.addInnerJoin(w, w.bp_cd.eq(t.bp_cd));
		}
		else {
			MAW_BP_LL_R dcR = MAW_BP_LL_R.create();
			dcR.dt(row.getDateNE(BpCols.$i_dt));
			dcL.add(dcR);
			dbInsert(insId, dcL, insBuilder);

			builder.addSelect(w.dt.as("st_dt"));
			builder.addSelect(w.dt.as("end_dt"));

			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}

	/**
	 * @param row
	 * @param builder
	 * @param t
	 */
	protected void getBpView_addSelectJoinBpSub(MCRow row, MCQueryApiBuilder builder,
			MAVM_BP_R t, MCList<?> result) {
		if (hasDt(row, BpCols.$i_dt)) {
			MAW_BP_LL_R w = MAW_BP_LL_R.create("W");
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ZIP_CD.value())), t.zip_cd).as("zip_cd"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR1.value())), t.addr1).as("addr1"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR2.value())), t.addr2).as("addr2"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR3.value())), t.addr3).as("addr3"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.ADDR4.value())), t.addr4).as("addr4"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.TEL.value())), t.tel).as("tel"));
			builder.addSelect(nvl(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.FAX.value())), t.fax).as("fax"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value())).as("cst_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value())).as("cst_cntct_psn"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("dlv_cntct_dpt"));
			builder.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, w.dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("dlv_cntct_psn"));
		}
	}

	protected void getBpView_addSelectJoinByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAVM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
	}

	protected void getBpView_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAVM_BP_R t,
			MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		String srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);
		getBpView_addWhereByBpIsSrchTyp(row, builder, t, result, srch_typ);
		if (row.getBooleanNE(BpCols.$i_foreign_flg)) {
			builder.addWhereWithCutOffAnd(t.cntry_cd.neq(bind("1")),
					MAUCL_AppSys.getCo().cntry_cd());
		}

		// リストロジックチェック時はこれ以上の条件を追加しない（get???_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		// 債権債務先識別区分
		getBpView_addWhereByBpIsSrchTyp(row, builder, t, result, MAC_DEBT_CRED_ID_TYP
				.bp_is_srch_typ(row.getStringNE(BpCols.$i_debt_cred_id_typ)));

		String bp_is_srch_typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);
		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}

		// 入力補助画面の条件
		if (!isBpFlgAllOn(row)) {
			addWhereByBpFlg(row, builder);
		}
		
		builder.addWhereWithCutOffAnd(t.bp_cd.like(bind("1")),
				getEditString(row, BpCols.$i_bp_cd));
		builder.addWhereWithCutOffAnd(t.bp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_nm));
		builder.addWhereWithCutOffAnd(t.ein.like(bind("1")),
				getEditString(row, BpCols.$i_ein));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm1.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm1));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm2.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm2));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm3.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm3));
		builder.addWhereWithCutOffAnd(t.bp_alt_nm4.like(bind("1")),
				getEditString(row, BpCols.$i_bp_alt_nm4));
		builder.addWhereWithCutOffAnd(t.cntry_cd.like(bind("1")),
				getEditString(row, BpCols.$i_cntry_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("cntry_nm")).like(bind("1")),
				getEditString(row, BpCols.$i_cntry_nm));
		builder.addWhereWithCutOffAnd(t.area_cd.like(bind("1")),
				getEditString(row, BpCols.$i_area_cd));
		builder.addWhereWithCutOffAnd(
				((MCStringPermColumn) t.getColumn$("area_nm")).like(bind("1")),
				getEditString(row, BpCols.$i_area_nm));
		builder.addWhereWithCutOffAnd(t.memo1.like(bind("1")),
				getEditString(row, BpCols.$i_memo1));
		builder.addWhereWithCutOffAnd(t.memo2.like(bind("1")),
				getEditString(row, BpCols.$i_memo2));
		builder.addWhereWithCutOffAnd(t.memo3.like(bind("1")),
				getEditString(row, BpCols.$i_memo3));
		builder.addWhereWithCutOffAnd(t.memo4.like(bind("1")),
				getEditString(row, BpCols.$i_memo4));
		builder.addWhereWithCutOffAnd(t.memo5.like(bind("1")),
				getEditString(row, BpCols.$i_memo5));
		builder.addWhereWithCutOffAnd(t.memo6.like(bind("1")),
				getEditString(row, BpCols.$i_memo6));
		builder.addWhereWithCutOffAnd(t.memo7.like(bind("1")),
				getEditString(row, BpCols.$i_memo7));
		builder.addWhereWithCutOffAnd(t.memo8.like(bind("1")),
				getEditString(row, BpCols.$i_memo8));
		builder.addWhereWithCutOffAnd(t.memo9.like(bind("1")),
				getEditString(row, BpCols.$i_memo9));
		builder.addWhereWithCutOffAnd(t.memo10.like(bind("1")),
				getEditString(row, BpCols.$i_memo10));
		builder.addWhereWithCutOffAnd(t.memo11.like(bind("1")),
				getEditString(row, BpCols.$i_memo11));
		builder.addWhereWithCutOffAnd(t.memo12.like(bind("1")),
				getEditString(row, BpCols.$i_memo12));
		builder.addWhereWithCutOffAnd(t.memo13.like(bind("1")),
				getEditString(row, BpCols.$i_memo13));
		builder.addWhereWithCutOffAnd(t.memo14.like(bind("1")),
				getEditString(row, BpCols.$i_memo14));
		builder.addWhereWithCutOffAnd(t.memo15.like(bind("1")),
				getEditString(row, BpCols.$i_memo15));
		builder.addWhereWithCutOffAnd(t.memo16.like(bind("1")),
				getEditString(row, BpCols.$i_memo16));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, BpCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo17.like(bind("1")),
				getEditString(row, BpCols.$i_memo17));
		builder.addWhereWithCutOffAnd(t.memo18.like(bind("1")),
				getEditString(row, BpCols.$i_memo18));
		builder.addWhereWithCutOffAnd(t.memo19.like(bind("1")),
				getEditString(row, BpCols.$i_memo19));
		builder.addWhereWithCutOffAnd(t.memo20.like(bind("1")),
				getEditString(row, BpCols.$i_memo20));

		// getBpView_adddSelectJoinCustom でJoinされる。Joinしていないwhere句はカットオフで消去される前提。
		MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
		MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
		MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
		MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
		MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
		MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
		MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
		MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
		MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
		MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");

		builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd1));
		builder.addWhereWithCutOffAnd(grp1.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm1));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd2));
		builder.addWhereWithCutOffAnd(grp2.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm2));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd3));
		builder.addWhereWithCutOffAnd(grp3.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm3));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd4));
		builder.addWhereWithCutOffAnd(grp4.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm4));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd5));
		builder.addWhereWithCutOffAnd(grp5.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm5));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd6));
		builder.addWhereWithCutOffAnd(grp6.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm6));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd7));
		builder.addWhereWithCutOffAnd(grp7.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm7));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd8));
		builder.addWhereWithCutOffAnd(grp8.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm8));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd9));
		builder.addWhereWithCutOffAnd(grp9.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm9));
		builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_cd10));
		builder.addWhereWithCutOffAnd(grp10.bp_grp_nm.like(bind("1")),
				getEditString(row, BpCols.$i_bp_grp_nm10));
	}

	protected void getBpView_addWhereByBpIsSrchTyp(MCRow row, MCQueryApiBuilder builder,
			MAVM_BP_R t, MCList<?> result, String bp_is_srch_typ) {
		// 固定条件のみ実装

		// 区分０：全取引先
		if (isNull(bp_is_srch_typ) || MAC_BP_IS_SRCH_TYP.isCOMM(bp_is_srch_typ)) {
			// 追加しない
		}
	}

	protected void getBpView_NullVal(MCRow row, MCList<MCRow> down) {
		if (row.getBooleanNE(BpCols.$i_mode_nullval_flg)) {
			MCRow r = down.createRow();
			r.setStringNE(BpCols.$o_bp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}
	protected MCMessage getBpView_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {
		MCMessage msg = null;
		String typ = row.getStringNE(BpCols.$i_bp_is_srch_typ);

		if (isNull(typ) || MAC_BP_IS_SRCH_TYP.isCOMM(typ)) {
			msg = new MCMessage(MAUAL0117, info);
		}

		return msg.setCauseRow(causeRow, causeCol);
	}
	
	/**
	 * 取引先フラグが全てオンか
	 */
	protected boolean isBpFlgAllOn(MCRow r) {
		String [] bpFlgCols = {
				BpCols.$i_cst_flg,
				BpCols.$i_acst_flg,
				BpCols.$i_bcst_flg,
				BpCols.$i_rcst_flg,
				BpCols.$i_dlv_flg,
				BpCols.$i_dest_flg,
				BpCols.$i_cred_flg,
				BpCols.$i_sppl_flg,
				BpCols.$i_asppl_flg,
				BpCols.$i_bsppl_flg,
				BpCols.$i_psppl_flg,
				BpCols.$i_maker_flg,
				BpCols.$i_tdlv_flg
		};
		
		for (String col :bpFlgCols) {
			if (!r.getBooleanNE(col)) {
				return false;
			}
		}
		return true;
	}
	// -- BpView:取引先View(END)
}
