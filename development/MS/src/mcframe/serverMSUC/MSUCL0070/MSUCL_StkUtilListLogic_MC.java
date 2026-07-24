package mcframe.serverMSUC.MSUCL0070;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMSBE.MSBEL5200.MSBEL_XfrSchdService;
import mcframe.serverMSBE.MSBEL5200.XfrSchdEx_DtlR;
import mcframe.serverMSBE.MSBEL5510.MSBEL_ShipSchdDtCalcService;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

abstract public class MSUCL_StkUtilListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 支給単価マスタの支給区分と単価を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>prsppl_cd</td><td>支給先</td></tr>
	 * <tr><td>cur_cd</td><td>通貨</td></tr>
	 * <tr><td>wg_cd</td><td>ワーキンググループコード</td></tr>
	 * <tr><td>dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 支給単価マスタの支給区分と単価
	 */
	public MCRow _getProvUpri(MCRow up) {
		MAM_PROV_UPRI_R result = MAM_PROV_UPRI_R.create();
		MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.prov_typ);
		builder.addSelect(t.upri);
		builder.addSelect(t.sub_upri1);
		builder.addSelect(t.sub_upri2);
		builder.addSelect(t.sub_upri3);
		builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithAnd(t.prsppl_cd.eq(bind("prsppl_cd")));
		builder.addWhereWithAnd(t.cur_cd.eq(bind("cur_cd")));
		builder.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithAnd(bind("dt").between(t.st_dt, t.end_dt));
		dbSelect(createSqlId("MSUCL0070", t, "MSUCL_StkUtilListLogic_S01"), result, builder, up);

		return result;
	}
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 通常出荷場所のＷＧＣＤを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>lg_grp_cd</td><td>物流ＧＣＤ</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 物流標準場所のワーキンググループ
	 */
	public MCRow _getDefLocWgCd(MCRow up) {
		MCRow r = MCRow.create();

		MAM_ITM_LG_GRP_R result1 = MAM_ITM_LG_GRP_R.create();
		MAM_ITM_LG_GRP_R t1 = MAM_ITM_LG_GRP_R.create("T");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t1);
		builder.setSelect(m1.wg_cd);
		builder.addLeftOuterJoin(m1, t1.lg_def_loc_cd.eq(m1.loc_cd));
		builder.addWhereWithAnd(t1.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithAnd(t1.lg_grp_cd.eq(bind("lg_grp_cd")));
		dbSelect(createSqlId("MSUCL0070", t1, "MSUCL_StkUtilListLogic_S02"), result1, builder, up);

		MAM_LOC_R result2 = MAM_LOC_R.create();
		MAM_LOC_R t2 = MAM_LOC_R.create("T");
		builder = MCQueryApiBuilder.create(t2);
		builder.setSelect(t2.wg_cd);
		builder.addWhereWithAnd(t2.lg_grp_cd.eq(bind("lg_grp_cd")));
		builder.addWhereWithAnd(t2.lg_def_flg.eq(value(true)));
		dbSelect(createSqlId("MSUCL0070", t2, "MSUCL_StkUtilListLogic_S03"), result2, builder, up);

		r.addStringColumn("wg_cd", nvl(result1.getStringNE("wg_cd"), result2.wg_cd()));

		return 	r;
	}

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 支給税ＣＤを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>prsppl_cd</td><td>支給先ＣＤ</td></tr>
	 * <tr><td>dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 支給税ＣＤ
	 */
	public MCRow _getProvTaxCd(MCRow up) {
		MCRow r = MCRow.create();

		sql(createSqlId("MSUCL0070", "MAPA_TAX$F_GET_PROV_TAX_CD", "MSUCL_StkUtilListLogic__getProvTaxCd"))
						.mainQuery()
						.select(MAPA_TAX$F_GET_PROV_TAX_CD(
								bind("itm_cd"),
								bind("itm_sub1"),
								bind("itm_sub2"),
								bind("itm_sub3"),
								bind("prsppl_cd"),
								bind("dt"))
								.as("tax_cd"))
						.executeQuery(up, r);

		return r;
	}

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 出荷予定日時、納品予定日時を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>ship_to_id_typ</td><td>送付先識別区分</td></tr>
	 * <tr><td>ship_to_id_cd</td><td>送付先識別ＣＤ</td></tr>
	 * <tr><td>ship_to_lg_grp_cd</td><td>出荷先物流グループＣＤ</td></tr>
	 * <tr><td>ship_fr_lg_grp_cd</td><td>出荷元物流グループＣＤ</td></tr>
	 * <tr><td>ship_term_cd</td><td>出荷条件ＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * <tr><td>dlv_rqst_tm</td><td>納品希望日時</td></tr>
	 * <tr><td>ship_rqst_tm</td><td>出荷希望日時</td></tr>
	 * <tr><td>ship_inst_typ</td><td>出荷指図区分</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 出荷予定日時、納品予定日時
	 */
	public MCRow _getShipDlvSchdTm(MCRow up) {
		MCRow r = MCRow.create();
		MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
		MSW_SHIP_SCHD_DT_CALC_R calcR = op.up0().add();
		calcR.ship_to_id_typ(up.getStringNE("ship_to_id_typ"));
		calcR.ship_to_id_cd(up.getStringNE("ship_to_id_cd"));
		calcR.ship_to_lg_grp_cd(up.getStringNE("ship_to_lg_grp_cd"));
		calcR.ship_fr_lg_grp_cd(up.getStringNE("ship_fr_lg_grp_cd"));
		calcR.ship_term_cd(up.getStringNE("ship_term_cd"));
		calcR.dlv_rqst_tm(up.getDateNE("dlv_rqst_tm"));
		calcR.ship_rqst_tm(up.getDateNE("ship_rqst_tm"));
		calcR.ship_inst_typ(up.getStringNE("ship_inst_typ"));
		calcR.peg_no(MCNumber.ZERO);
		calcR.base_dt(nvl(up.getDateNE("base_dt"), getToday()));
		calcR.cl_time_chk_flg(false);
		calcR.ship_dt_chk_flg(false);
		calcR.ship_cal_cd_chk_flg(false);
		calcR.early_ship_dt_add_days_chk_flg(false);

		op.exec();
		r.addDateColumn("ship_schd_tm", op.down0().get(0).ship_schd_tm());
		r.addDateColumn("dlv_schd_tm", op.down0().get(0).dlv_schd_tm());

		return r;
	}

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 送付先識別区分、輸出完了予定日、配送先ＣＤ、を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名（IN）</th><th>説明</th></tr>
	 * <tr><td>gi_lg_grp_cd</td><td>出庫物流グループＣＤ</td></tr>
	 * <tr><td>gr_lg_grp_cd</td><td>入庫物流グループＣＤ</td></tr>
	 * <tr><td>ship_term_cd</td><td>出荷条件ＣＤ</td></tr>
	 * </table>
	 * 
	 * <table border="1">
	 * <tr><th>項目名（OUT）</th><th>説明</th></tr>
	 * <tr><td>iv_trd_flg</td><td>インボイス取引ＦＬＧ</td></tr>
	 * <tr><td>tdlv_cd</td><td>配送先ＣＤ</td></tr>
	 * <tr><td>via_dlv_typ</td><td>配送経由区分</td></tr>
	 * </table>
	 */
	public MCRow _getXfrEx(MCRow up) {
		MCRow r = MCRow.create();
		MSBEL_XfrSchdService.XfrSchd_Sprt01 op = MSBEL_XfrSchdService.crtXfrSchd_Sprt01();
		XfrSchdEx_DtlR exR = op.up0().add();
		exR.peg_no(MCNumber.ZERO);
		exR.itm_cd(up.getStringNE("itm_cd"));
		exR.itm_sub1(up.getStringNE("itm_sub1"));
		exR.itm_sub2(up.getStringNE("itm_sub2"));
		exR.itm_sub3(up.getStringNE("itm_sub3"));
		exR.gi_lg_grp_cd(up.getStringNE("gi_lg_grp_cd"));
		exR.gr_lg_grp_cd(up.getStringNE("gr_lg_grp_cd"));
		exR.ship_term_cd(nvl(up.getStringNE("ship_term_cd"), MAC_STR.NULL_VAL.value()));

		op.exec();
		MCMessagePool.getMessageList().clear();
		
		r.addBooleanColumn("iv_trd_flg", op.down0().get(0).iv_trd_flg());
		r.addStringColumn("tdlv_cd", op.down0().get(0).tdlv_cd());
		r.addStringColumn("via_dlv_typ", op.down0().get(0).via_dlv_typ());
		r.addStringColumn("ship_term_cd",op.down0().get(0).ship_term_cd());

		return r;
	}
}