package mcframe.serverMSUA.MSUAL0060;

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.$LIST_LOGIC_VAL;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.getLLBindNm;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.isNull;
import static mcframe.serverMA.dbc.MABSFunction.MAPA_BP$F_GET_BP_ADDR;
import static mcframe.serverMA.dbc.MABSFunction.MAPA_LOC$F_GET_LOC_ADDR;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.getEditString;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.createSqlId;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.dbInsert;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.execDbDelete;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.execDbWkDelete;
import static mcframe.serverMS.dbc.MSFunction.*;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonMA.constant.MAC_BP_ADDR_TYP;
import mcframe.commonMA.constant.MAC_LOC_ADDR_TYP;
import mcframe.commonMA.constant.MAC_STR;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;


abstract public class MSUAL_List_MC extends MSUAL_List_MC_A {

	// -- ShipToId:送付先 (START)
	@Override
	public MCList<MCRow> getShipToId(MCRow row) {
		// 必須IN項目 ship_to_id_typに不正な値の場合に null returnする 区分の複数設定など
		if (row.contains(ShipToIdCols.$i_ship_to_id_typ)) {
			if ((isNull(row.getStringNE(ShipToIdCols.$i_ship_to_id_typ)))
					|| (row.getStringNE(ShipToIdCols.$i_ship_to_id_typ).length() > 1)) {
				return null;
			}
		}
		return super.getShipToId(row);
	}
	
	@Override
	protected void getShipToId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result) {
		super.getShipToId_Set(row, builder, t, result);
		getShipToId_addSelectJoinCustom(row, builder, t, result);
		getShipToId_addWhereCustom(row, builder, t, result);
	}

	protected void getShipToId_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result) {
		MSW_SHIP_TO_ID_LL_R w = MSW_SHIP_TO_ID_LL_R.create("W");

		// 固定のSelect句、結合の設定
		result.addStringColumn(ShipToIdCols.$o_zip_cd);
		result.addStringColumn(ShipToIdCols.$o_addr1);
		result.addStringColumn(ShipToIdCols.$o_addr2);
		result.addStringColumn(ShipToIdCols.$o_addr3);
		result.addStringColumn(ShipToIdCols.$o_addr4);
		result.addStringColumn(ShipToIdCols.$o_tel);
		result.addStringColumn(ShipToIdCols.$o_fax);
		result.addStringColumn(ShipToIdCols.$o_ship_to_cntct_dpt);
		result.addStringColumn(ShipToIdCols.$o_ship_to_cntct_psn);
		
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ZIP_CD.value()))).as("zip_cd"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR1.value()))).as("addr1"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR2.value()))).as("addr2"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR3.value()))).as("addr3"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR4.value()))).as("addr4"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.TEL.value()))).as("tel"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.FAX.value()))).as("fax"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())))
				.as("ship_to_cntct_dpt"));
		builder.addSelect(
				decode(MSC_SHIP_TO_ID_TYP$IS_LOC(w.ship_to_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.ship_to_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())))
				.as("ship_to_cntct_psn"));
		getShipToId_addSelectJoinWk(row, builder, t, result);
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getShipToId_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result) {
		MSW_SHIP_TO_ID_LL_R w = MSW_SHIP_TO_ID_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MSW_SHIP_TO_ID_LL_R ship_to_id_ll = MSW_SHIP_TO_ID_LL_R.create("T");
		MCList<MSW_SHIP_TO_ID_LL_R> sd = MCList.create(ship_to_id_ll);
		String delid = createSqlId("MS.MSUAL0060.ShipToId_addSelectJoinWk", ship_to_id_ll, "dbDelete");
		execDbWkDelete(delid, ship_to_id_ll);

		String[] ship_to_id_cd = null;
		String[] ship_to_id_typ = null;
		MCDate[] base_dt = null;
		String insid = createSqlId("MS.MSUAL0060.ShipToId_addSelectJoinWk", ship_to_id_ll, "dbInsert");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(ship_to_id_ll);
		if (isSrvChk(row)) {
			boolean containBaseDt = row.contains(getLLBindNm(ShipToIdCols.$i_base_dt));
			boolean containShiptoidtyp = row.contains(getLLBindNm(ShipToIdCols.$i_ship_to_id_typ));

			ship_to_id_cd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containBaseDt) {
				base_dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(ShipToIdCols.$i_base_dt)));
			}
			// 送付先識別区分が指定されている場合
			if (containShiptoidtyp) {
				ship_to_id_typ = (String[]) convDataArray(row.getStringNE(getLLBindNm(ShipToIdCols.$i_ship_to_id_typ)));
			}
			
			for (int i = 0; i < ship_to_id_cd.length; i++) {
				MSW_SHIP_TO_ID_LL_R sr = MSW_SHIP_TO_ID_LL_R.create();
				sr.ship_to_id_cd(ship_to_id_cd[i]);
				
				// 適用日が指定されている場合
				if (containBaseDt) {
					sr.base_dt(base_dt[i]);
				}
				// 送付先識別区分が指定されている場合
				if (containShiptoidtyp) {
					sr.ship_to_id_typ(ship_to_id_typ[i]);
				}
				sd.add(sr);
			}
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.base_dt);
			builder.addInnerJoin(w, w.ship_to_id_cd.eq(t.ship_to_id_cd));
		} else {
			MSW_SHIP_TO_ID_LL_R sr = MSW_SHIP_TO_ID_LL_R.create();
			sr.base_dt(row.getDateNE(ShipToIdCols.$i_base_dt));
			sr.ship_to_id_typ(row.getStringNE(ShipToIdCols.$i_ship_to_id_typ));
			sd.add(sr);
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}

	/**
	 * ShipToIdについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param builder 検索を行うクエリAPIビルダー
	 * @param t builderの元であるDBコンテナ
	 * @param result 検索結果を格納するリスト
	 */
	protected void getShipToId_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result) {
		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.ship_to_id_typ.eq(bind("1")),
				row.getStringNE(ShipToIdCols.$i_ship_to_id_typ));
		if (MSC_SHIP_TO_ID_TYP.isLOC(row.getStringNE(ShipToIdCols.$i_ship_to_id_typ))) {
			if (row.getBooleanNE(ShipToIdCols.$i_house_flg)) {
				builder.addWhereWithAnd(t.sppl_cd.isNull());
			}
			if (row.getBooleanNE(ShipToIdCols.$i_outside_flg)) {
				builder.addWhereWithAnd(t.sppl_cd.isNotNull());
			}
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.ship_to_id_cd.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_cd));
		builder.addWhereWithCutOffAnd(t.ship_to_id_nm.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_nm));
		builder.addWhereWithCutOffAnd(t.ship_to_id_alt_nm1.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_alt_nm1));
		builder.addWhereWithCutOffAnd(t.ship_to_id_alt_nm2.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_alt_nm2));
		builder.addWhereWithCutOffAnd(t.ship_to_id_alt_nm3.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_alt_nm3));
		builder.addWhereWithCutOffAnd(t.ship_to_id_alt_nm4.like(bind("1")),
				getEditString(row, ShipToIdCols.$i_ship_to_id_alt_nm4));
		
	}

	@Override
	protected MCList<?> getShipToId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_TO_ID_R t, MCList<?> result) {
		MCList<?> l = super.getShipToId_AfterSelect(row, builder, t, result);

		// 区分名の設定
		l.addStringColumn(MSC_SHIP_TO_ID_TYP.$NAME);
		MSC_SHIP_TO_ID_TYP.putNameNE(l, MSC_SHIP_TO_ID_TYP.$VALUE, MSC_SHIP_TO_ID_TYP.$NAME);
		return l;
	}

	protected MCMessage getShipToId_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {

		MCMessage msg = new MCMessage(MSBEL0080,
				row.getStringNE(ShipToIdCols.$i_ship_to_id_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ShipToId:送付先 (END)

	// -- DlvId:納品先 (START)
	@Override
	public MCList<MCRow> getDlvId(MCRow row) {
		// 必須IN項目 dlv_id_typに不正な値の場合に null returnする 区分の複数設定など
		if (row.contains(DlvIdCols.$i_dlv_id_typ)) {
			if (isNull(row.getStringNE(DlvIdCols.$i_dlv_id_typ))
					|| (row.getStringNE(DlvIdCols.$i_dlv_id_typ).length() > 1)) {
				return null;
			}
		}
		return super.getDlvId(row);
	}

	@Override
	protected void getDlvId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result) {
		super.getDlvId_Set(row, builder, t, result);
		getDlvId_addSelectJoinCustom(row, builder, t, result);
		getDlvId_addWhereCustom(row, builder, t, result);
	}

	protected void getDlvId_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result) {
		MSW_DLV_ID_LL_R w = MSW_DLV_ID_LL_R.create("W");
		// 固定のSelect句、結合の設定
		result.addStringColumn(DlvIdCols.$o_zip_cd);
		result.addStringColumn(DlvIdCols.$o_addr1);
		result.addStringColumn(DlvIdCols.$o_addr2);
		result.addStringColumn(DlvIdCols.$o_addr3);
		result.addStringColumn(DlvIdCols.$o_addr4);
		result.addStringColumn(DlvIdCols.$o_tel);
		result.addStringColumn(DlvIdCols.$o_fax);
		result.addStringColumn(DlvIdCols.$o_dlv_cntct_dpt);
		result.addStringColumn(DlvIdCols.$o_dlv_cntct_psn);
		
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ZIP_CD.value())))
				.as("zip_cd"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR1.value())))
				.as("addr1"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR2.value())))
				.as("addr2"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR3.value())))
				.as("addr3"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR4.value())))
				.as("addr4"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.TEL.value())))
				.as("tel"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.FAX.value())))
				.as("fax"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())))
				.as("dlv_cntct_dpt"));
		builder.addSelect(
				decode(MSC_DLV_ID_TYP$IS_LOC(w.dlv_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.dlv_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())))
				.as("dlv_cntct_psn"));

		getDlvId_addSelectJoinWk(row, builder, t, result);

		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}
	
	protected void getDlvId_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result) {
		MSW_DLV_ID_LL_R w = MSW_DLV_ID_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MSW_DLV_ID_LL_R> sd = MCList.create(MSW_DLV_ID_LL_R.class);
		MSW_DLV_ID_LL_R dlv_id_ll = MSW_DLV_ID_LL_R.create("T");
		String delid = createSqlId("MS.MSUAL0060.DlvId_addSelectJoinWk", dlv_id_ll, "dbDelete");
		execDbWkDelete(delid, dlv_id_ll);

		String[] dlv_id_cd = null;
		String[] dlv_id_typ = null;
		MCDate[] base_dt = null;
		String insid = createSqlId("MS.MSUAL0060.DlvId_addSelectJoinWk", dlv_id_ll, "dbInsert");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(dlv_id_ll);
		if (isSrvChk(row)) {
			boolean containBaseDt = row.contains(getLLBindNm(DlvIdCols.$i_base_dt));
			boolean containDlvidtyp = row.contains(getLLBindNm(DlvIdCols.$i_dlv_id_typ));

			
			dlv_id_cd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containBaseDt) {
				base_dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(DlvIdCols.$i_base_dt)));
			}
			// 送付先識別区分が指定されている場合
			if (containDlvidtyp) {
				dlv_id_typ = (String[]) convDataArray(row.getStringNE(getLLBindNm(DlvIdCols.$i_dlv_id_typ)));
			}
			
			for (int i = 0; i < dlv_id_cd.length; i++) {
				MSW_DLV_ID_LL_R sr = MSW_DLV_ID_LL_R.create();
				sr.dlv_id_cd(dlv_id_cd[i]);
				
				// 適用日が指定されている場合
				if (containBaseDt) {
					sr.base_dt(base_dt[i]);
				}
				// 送付先識別区分が指定されている場合
				if (containDlvidtyp) {
					sr.dlv_id_typ(dlv_id_typ[i]);
				}
				sd.add(sr);
			}
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.base_dt);
			builder.addInnerJoin(w, w.dlv_id_cd.eq(t.dlv_id_cd));
		} else {
			MSW_DLV_ID_LL_R sr = MSW_DLV_ID_LL_R.create();
			sr.base_dt(row.getDateNE(DlvIdCols.$i_base_dt));
			sr.dlv_id_typ(row.getStringNE(DlvIdCols.$i_dlv_id_typ));
			sd.add(sr);
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}
	/**
	 * ShipToIdについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param d ＤＢコンテナ
	 */


	protected void getDlvId_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result) {
		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}

		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.dlv_id_typ.eq(bind("1")),
				row.getStringNE(DlvIdCols.$i_dlv_id_typ));
		if (MSC_DLV_ID_TYP.isLOC(row.getStringNE(DlvIdCols.$i_dlv_id_typ))) {
			if (row.getBooleanNE(ShipToIdCols.$i_house_flg)) {
				builder.addWhereWithAnd(t.sppl_cd.isNull());
			}
			if (row.getBooleanNE(ShipToIdCols.$i_outside_flg)) {
				builder.addWhereWithAnd(t.sppl_cd.isNotNull());
			}
		}

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.dlv_id_cd.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_cd));
		builder.addWhereWithCutOffAnd(t.dlv_id_nm.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_nm));
		builder.addWhereWithCutOffAnd(t.dlv_id_alt_nm1.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_alt_nm1));
		builder.addWhereWithCutOffAnd(t.dlv_id_alt_nm2.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_alt_nm2));
		builder.addWhereWithCutOffAnd(t.dlv_id_alt_nm3.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_alt_nm3));
		builder.addWhereWithCutOffAnd(t.dlv_id_alt_nm4.like(bind("1")),
				getEditString(row, DlvIdCols.$i_dlv_id_alt_nm4));
	}

	@Override
	protected MCList<?> getDlvId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_DLV_ID_R t, MCList<?> result) {
		MCList<?> l = super.getDlvId_AfterSelect(row, builder, t, result);

		// 区分名の設定
		l.addStringColumn(MSC_DLV_ID_TYP.$NAME);
		MSC_DLV_ID_TYP.putNameNE(l, MSC_DLV_ID_TYP.$VALUE, MSC_DLV_ID_TYP.$NAME);
		return l;
	}

	protected MCMessage getDlvId_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		MCMessage msg = new MCMessage(MSBEL0081,
				row.getStringNE(DlvIdCols.$i_dlv_id_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- DlvId:納品先 (END)

	// -- ShipRqstId:出荷依頼先 (START)
	@Override
	public MCList<MCRow> getShipRqstId(MCRow row) {
		// 必須IN項目 dlv_id_typに不正な値の場合に null returnする 区分の複数設定など
		if (row.contains(ShipRqstIdCols.$i_ship_rqst_id_typ)) {
			if (isNull(row.getStringNE(ShipRqstIdCols.$i_ship_rqst_id_typ))
					|| (row.getStringNE(ShipRqstIdCols.$i_ship_rqst_id_typ).length() > 1)) {
				return null;
			}
		}
		return super.getShipRqstId(row);
	}

	@Override
	protected void getShipRqstId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result) {
		super.getShipRqstId_Set(row, builder, t, result);
		getShipRqstId_addSelectJoinCustom(row, builder, t, result);
		getShipRqstId_addWhereCustom(row, builder, t, result);
	}


	protected void getShipRqstId_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result) {
		MSW_SHIP_RQST_ID_LL_R w = MSW_SHIP_RQST_ID_LL_R.create("W");
		// 固定のSelect句、結合の設定
		result.addStringColumn(ShipRqstIdCols.$o_zip_cd);
		result.addStringColumn(ShipRqstIdCols.$o_addr1);
		result.addStringColumn(ShipRqstIdCols.$o_addr2);
		result.addStringColumn(ShipRqstIdCols.$o_addr3);
		result.addStringColumn(ShipRqstIdCols.$o_addr4);
		result.addStringColumn(ShipRqstIdCols.$o_tel);
		result.addStringColumn(ShipRqstIdCols.$o_fax);
		result.addStringColumn(ShipRqstIdCols.$o_ship_rqst_cntct_dpt);
		result.addStringColumn(ShipRqstIdCols.$o_ship_rqst_cntct_psn);
		
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ZIP_CD.value())))
				.as("zip_cd"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR1.value())))
				.as("addr1"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR2.value())))
				.as("addr2"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR3.value())))
				.as("addr3"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.ADDR4.value())))
				.as("addr4"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.TEL.value())))
				.as("tel"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
								value(MAC_BP_ADDR_TYP.FAX.value())))
				.as("fax"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true),
						nullValue(),
						decode(MSC_SHIP_RQST_ID_TYP$IS_SPPL(w.ship_rqst_id_typ),
								value(true),
								MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
										value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())),
								MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
										value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value()))))
				.as("ship_rqst_cntct_dpt"));
		builder.addSelect(
				decode(MSC_SHIP_RQST_ID_TYP$IS_LOC(w.ship_rqst_id_typ),
						value(true), nullValue(),
						decode(MSC_SHIP_RQST_ID_TYP$IS_SPPL(w.ship_rqst_id_typ),
								value(true),
								MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
										value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())),
								MAPA_BP$F_GET_BP_ADDR(t.ship_rqst_id_cd, w.base_dt,
										value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value()))))
				.as("ship_rqst_cntct_psn"));
		
		getShipRqstId_addSelectJoinWk(row, builder, t, result);
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}
	
	protected void getShipRqstId_addSelectJoinWk(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result) {
		MSW_SHIP_RQST_ID_LL_R w = MSW_SHIP_RQST_ID_LL_R.create("W");

		// ワークテーブルを作成＋結合
		MCList<MSW_SHIP_RQST_ID_LL_R> sd = MCList.create(MSW_SHIP_RQST_ID_LL_R.class);
		MSW_SHIP_RQST_ID_LL_R ship_rqst_id_ll = MSW_SHIP_RQST_ID_LL_R.create("T");
		String delid = createSqlId("MS.MSUAL0060.ShipRqstId_addSelectJoinWk", ship_rqst_id_ll, "dbDelete");
		execDbWkDelete(delid, ship_rqst_id_ll);

		String[] ship_rqst_id_cd = null;
		String[] ship_rqst_id_typ = null;
		MCDate[] base_dt = null;
		String insid = createSqlId("MS.MSUAL0060.ShipRqstId_addSelectJoinWk", ship_rqst_id_ll, "dbInsert");
		MCQueryApiBuilder insBuilder = MCQueryApiBuilder.create(ship_rqst_id_ll);
		if (isSrvChk(row)) {
			boolean containBaseDt = row.contains(getLLBindNm(ShipRqstIdCols.$i_base_dt));
			boolean containShiprqstidtyp = row.contains(getLLBindNm(ShipRqstIdCols.$i_ship_rqst_id_typ));

			ship_rqst_id_cd = (String[]) convDataArray(row.getStringNE($LIST_LOGIC_VAL));
			// 適用日が指定されている場合
			if (containBaseDt) {
				base_dt = (MCDate[]) convDataArray(row.getStringNE(getLLBindNm(ShipRqstIdCols.$i_base_dt)));
			}
			// 送付先識別区分が指定されている場合
			if (containShiprqstidtyp) {
				ship_rqst_id_typ = (String[]) convDataArray(row.getStringNE(getLLBindNm(ShipRqstIdCols.$i_ship_rqst_id_typ)));
			}
			
			for (int i = 0; i < ship_rqst_id_cd.length; i++) {
				MSW_SHIP_RQST_ID_LL_R sr = MSW_SHIP_RQST_ID_LL_R.create();
				sr.ship_rqst_id_cd(ship_rqst_id_cd[i]);
				
				// 適用日が指定されている場合
				if (containBaseDt) {
					sr.base_dt(base_dt[i]);
				}
				// 送付先識別区分が指定されている場合
				if (containShiprqstidtyp) {
					sr.ship_rqst_id_typ(ship_rqst_id_typ[i]);
				}
				sd.add(sr);
			}
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addSelect(w.base_dt);
			builder.addInnerJoin(w, w.ship_rqst_id_cd.eq(t.ship_rqst_id_cd));
		} else {
			MSW_SHIP_RQST_ID_LL_R sr = MSW_SHIP_RQST_ID_LL_R.create();
			sr.base_dt(row.getDateNE(ShipRqstIdCols.$i_base_dt));
			sr.ship_rqst_id_typ(row.getStringNE(ShipRqstIdCols.$i_ship_rqst_id_typ));
			sd.add(sr);
			dbInsert(insid, sd, insBuilder);
			
			// ワークテーブルと結合したSELECT句を追加
			builder.addLeftOuterJoin(w, value(0).eq(value(0)));
		}
	}

	/**
	 * ShipRqstIdについて、リスト取得用のWhere句を追加する
	 * @param row 検索条件
	 * @param builder 検索を行うクエリAPIビルダー
	 * @param t builderの元であるDBコンテナ
	 * @param result 検索結果を格納するリスト
	 */
	protected void getShipRqstId_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result) {
		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_typ.eq(bind("1")),
				row.getStringNE(ShipRqstIdCols.$i_ship_rqst_id_typ));
		
		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
		
		// 入力補助画面の条件
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_cd.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_cd));
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_nm.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_nm));
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_alt_nm1.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_alt_nm1));
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_alt_nm2.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_alt_nm2));
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_alt_nm3.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_alt_nm3));
		builder.addWhereWithCutOffAnd(t.ship_rqst_id_alt_nm4.like(bind("1")),
				getEditString(row, ShipRqstIdCols.$i_ship_rqst_id_alt_nm4));
		
	}

	@Override
	protected MCList<?> getShipRqstId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_SHIP_RQST_ID_R t, MCList<?> result) {
		MCList<?> l = super.getShipRqstId_AfterSelect(row, builder, t, result);

		// 区分名の設定
		l.addStringColumn(MSC_SHIP_RQST_ID_TYP.$NAME);
		MSC_SHIP_RQST_ID_TYP.putNameNE(l, MSC_SHIP_RQST_ID_TYP.$VALUE, MSC_SHIP_RQST_ID_TYP.$NAME);
		return l;
	}
	
	protected MCMessage getShipRqstId_Msg(MCRow causeRow, String causeCol, MCRow row,
			String info) {

		MCMessage msg = new MCMessage(MSBEL0109,
				row.getStringNE(ShipRqstIdCols.$i_ship_rqst_id_typ), info);
		return msg.setCauseRow(causeRow, causeCol);
	}

	// -- ShipRqstId:出荷依頼先 (END)

	// -- InToId:納入先 (START)
	@Override
	protected void getInToId_Set(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result) {
		super.getInToId_Set(row, builder, t, result);
		getInToId_addSelectJoinCustom(row, builder, t, result);
		getInToId_addWhereCustom(row, builder, t, result);
	}
	protected void getInToId_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result) {
		// 固定のSelect句、結合の設定
		result.addStringColumn(InToIdCols.$o_zip_cd);
		result.addStringColumn(InToIdCols.$o_addr1);
		result.addStringColumn(InToIdCols.$o_addr2);
		result.addStringColumn(InToIdCols.$o_addr3);
		result.addStringColumn(InToIdCols.$o_addr4);
		result.addStringColumn(InToIdCols.$o_tel);
		result.addStringColumn(InToIdCols.$o_fax);
		result.addStringColumn(InToIdCols.$o_in_to_cntct_dpt);
		result.addStringColumn(InToIdCols.$o_in_to_cntct_psn);
		
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.ZIP_CD.value()))).as("zip_cd"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.ADDR1.value()))).as("addr1"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.ADDR2.value()))).as("addr2"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.ADDR3.value()))).as("addr3"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.ADDR4.value()))).as("addr4"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.TEL.value()))).as("tel"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						MAPA_LOC$F_GET_LOC_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.FAX.value()))).as("fax"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())))
				.as("in_to_cntct_dpt"));
		builder.addSelect(
				decode(MSC_IN_TO_ID_TYP$IS_LOC(t.in_to_id_typ),
						value(true),
						nullValue(),
						MAPA_BP$F_GET_BP_ADDR(t.in_to_id_cd, bind(InToIdCols.$i_base_dt),
								value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())))
				.as("in_to_cntct_psn"));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		// 直接入力時
		if (isInput(row)) {
			return;
		}
	}

	protected void getInToId_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		builder.addWhereWithCutOffAnd(t.in_to_id_typ.eq(bind("1")),
				row.getStringNE(InToIdCols.$i_in_to_id_typ));
		builder.addWhereWithCutOffAnd(t.in_to_id_cd.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_cd));
		builder.addWhereWithCutOffAnd(t.in_to_id_nm.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_nm));
		builder.addWhereWithCutOffAnd(t.in_to_id_alt_nm1.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_alt_nm1));
		builder.addWhereWithCutOffAnd(t.in_to_id_alt_nm2.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_alt_nm2));
		builder.addWhereWithCutOffAnd(t.in_to_id_alt_nm3.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_alt_nm3));
		builder.addWhereWithCutOffAnd(t.in_to_id_alt_nm4.like(bind("1")),
				getEditString(row, InToIdCols.$i_in_to_id_alt_nm4));

		// リストロジックチェック時は以下の条件は追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}
		
		// 動的条件（行ごとに条件値が異なる条件）

		// 直接入力時は以下の条件は追加しない。冗長な結合を省き、パフォーマンスをあげるため
		if (isInput(row)) {
			return;
		}
	}

	@Override
	protected MCList<?> getInToId_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVM_IN_TO_ID_R t, MCList<?> result) {
		MCList<?> l = super.getInToId_AfterSelect(row, builder, t, result);

		// 区分名の設定
		l.addStringColumn(MSC_IN_TO_ID_TYP.$NAME);
		MSC_IN_TO_ID_TYP.putNameNE(l, MSC_IN_TO_ID_TYP.$VALUE, MSC_IN_TO_ID_TYP.$NAME);
		return l;
	}
	// -- InToId:納入先 (END)
	
	// -- StkBp:在庫取引先 (START)
	@Override
	protected void getStkBp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		super.getStkBp_Set(row, builder, t, result);
		getStkBp_addSelectJoinCustom(row, builder, t, result);
		getStkBp_addWhereCustom(row, builder, t, result);
	}
	
	protected void getStkBp_addSelectJoinCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		// DBコンテナの項目に定義されていない項目は、select時に型が不明なため、予め追加が必要
		result.addStringColumn(StkBpCols.$o_stk_bp_cd);
		result.addStringColumn(StkBpCols.$o_stk_bp_nm);
		builder.addSelect(t.bp_cd.as("stk_bp_cd"));
		builder.addSelect(t.bp_nm.as("stk_bp_nm"));
		
		// リストロジックチェック時
		if (isSrvChk(row)) {
			return;
		}
		
		// 直接入力時
		if (isInput(row)) {
			return;
		}
		
	}

	protected void getStkBp_addWhereCustom(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result) {
		// 固定条件（行ごとに条件値が同じ条件）
		
		// リストロジックチェック時はこれ以上の条件を追加しない（getXxx_SrvChkに個別に実装するため）
		if (isSrvChk(row)) {
			return;
		}		
		// 動的条件（行ごとに条件値が異なる条件）
		getStkBp_addWhereByStkIdTyp(row, builder, t, result, row.getStringNE(StkBpCols.$i_stk_id_typ));
	}

	protected void getStkBp_addWhereByStkIdTyp(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result, String stk_id_typ) {
		// 固定条件のみ実装
		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stk_id_typ)
				|| MSC_STK_ID_TYP.isCSTSTK(stk_id_typ)) {
					builder.addWhereWithAnd(t.cst_flg.eq(value(true)));
		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stk_id_typ)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
				|| MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
				|| MSC_STK_ID_TYP.isONR_PROV(stk_id_typ)) {
				builder.addWhereWithAnd(t.sppl_flg.eq(value(true)));
		}
	}

	protected void getStkBp_NullVal(MCRow row, MCList<MCRow> down) {
		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isCSTSTK(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isRNT_RCV(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isACCPT_DFCT(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isNCV_RCV(row.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isONR_PROV(row.getStringNE(StkBpCols.$i_stk_id_typ))) {
			return;
		}
		else {
			MCRow r = down.createRow();
			r.setStringNE(StkBpCols.$o_stk_bp_cd, MAC_STR.NULL_VAL.value());
			down.add(r);
		}
	}

	public MCList getStkBp_SrvChk(MCRow inRow, MCList rsltL) {
		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(inRow.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isCSTSTK(inRow.getStringNE(StkBpCols.$i_stk_id_typ))) {
				return rsltL.subList("cst_flg", true);
		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(inRow.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(inRow.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isACCPT_DFCT(inRow.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isNCV_RCV(inRow.getStringNE(StkBpCols.$i_stk_id_typ))
				|| MSC_STK_ID_TYP.isONR_PROV(inRow.getStringNE(StkBpCols.$i_stk_id_typ))) {
				return rsltL.subList("sppl_flg", true);
		}
		else {
			return rsltL;
		}
	}

	protected MCMessage getStkBp_Msg(MCRow causeRow, String causeCol, MCRow row, String info) {
		MCMessage msg = null;
		String stk_id_typ = row.getStringNE(StkBpCols.$i_stk_id_typ);
		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stk_id_typ)
				|| MSC_STK_ID_TYP.isCSTSTK(stk_id_typ)) {
					msg = new MCMessage(MSBEL0279, info);
		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(stk_id_typ)
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stk_id_typ)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(stk_id_typ)
				|| MSC_STK_ID_TYP.isNCV_RCV(stk_id_typ)
				|| MSC_STK_ID_TYP.isONR_PROV(stk_id_typ)) {
					msg = new MCMessage(MSBEL0280, info);
		}
		else {
			msg = new MCMessage(MSBEL0281, info);
		}
		return msg.setCauseRow(causeRow, causeCol);
	}
	// -- StkBp:在庫取引先 (END)
}
