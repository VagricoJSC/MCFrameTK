package mcframe.serverMSUC.MSUCL0040;

import mcframe.commonCore.container.MCRow;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

abstract public class MSUCL_PurcListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 品目マスタ(ロケール別情報)のロケール別情報を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>peg_no</td><td>紐付けＮＯ</td></tr>
	 * <tr><td>rqst_dlv_rqst_dt</td><td>依頼元納入希望日</td></tr>
	 * <tr><td>dlv_rqst_dt</td><td>納入予定日</td></tr>
	 * <tr><td>po_schd_dt</td><td>発注予定日</td></tr>
	 * <tr><td>purc_schd_dt</td><td>仕入予定日</td></tr>
	 * <tr><td>sppl_cd</td><td>発注先ＣＤ</td></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>mfg_loc_cd</td><td>製造場所ＣＤ</td></tr>
	 * <tr><td>maker_cd</td><td>メーカＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * <tr><td>wg_cd</td><td>ワーキンググループＣＤ（納入場所）</td></tr>
	 * <tr><td>bom_ptn</td><td>構成パタン</td></tr>
	 * <tr><td>dlv_cd</td><td>納品先ＣＤ</td></tr>
	 * <tr><td>in_to_loc_cd</td><td>納入場所ＣＤ</td></tr>
	 * <tr><td>site_cd</td><td>工場・物流倉庫ＣＤ</td></tr>
	 * <tr><td>outsrc_sppl_cd</td><td>外注発注先ＣＤ</td></tr>
	 * <tr><td>sppl_cal_cd</td><td>発注先カレンダＣＤ</td></tr>
	 * <tr><td>in_to_loc_cal_cd</td><td>納入場所カレンダＣＤ</td></tr>
	 * <tr><td>dlv_cal_cd</td><td>納品先カレンダＣＤ</td></tr>
	 * <tr><td>lg_grp_cd</td><td>物流グループＣＤ</td></tr>
	 * <tr><td>base_unit_qty</td><td>基準単位数量</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 予定日情報
	 */
	public MCRow _getSchdDt(MCRow up) {
		
		MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
		PurcUtil_Srch01_DtlR srch01DtlR = PurcUtil_Srch01_DtlR.create();
		
		srch01DtlR.peg_no(up.getNumberNE("peg_no"));
		srch01DtlR.rqst_dlv_rqst_dt(up.getDateNE("rqst_dlv_rqst_dt"));
		srch01DtlR.dlv_rqst_dt(up.getDateNE("dlv_rqst_dt"));
		srch01DtlR.po_schd_dt(up.getDateNE("po_schd_dt"));
		srch01DtlR.purc_schd_dt(up.getDateNE("purc_schd_dt"));
		srch01DtlR.sppl_cd(up.getStringNE("sppl_cd"));
		srch01DtlR.itm_cd(up.getStringNE("itm_cd"));
		srch01DtlR.itm_sub1(up.getStringNE("itm_sub1"));
		srch01DtlR.itm_sub2(up.getStringNE("itm_sub2"));
		srch01DtlR.itm_sub3(up.getStringNE("itm_sub3"));
		srch01DtlR.mfg_loc_cd(up.getStringNE("mfg_loc_cd"));
		srch01DtlR.maker_cd(up.getStringNE("maker_cd"));
		srch01DtlR.wg_cd(up.getStringNE("wg_cd"));
		srch01DtlR.bom_ptn(up.getStringNE("bom_ptn"));
		srch01DtlR.dlv_cd(up.getStringNE("dlv_cd"));
		srch01DtlR.in_to_loc_cd(up.getStringNE("in_to_loc_cd"));
		srch01DtlR.site_cd(up.getStringNE("site_cd"));
		srch01DtlR.prov_ddlv_flg(isNull(up.getStringNE("outsrc_sppl_cd")) ? false : true);
		srch01DtlR.sppl_cal_cd(up.getStringNE("sppl_cal_cd"));
		srch01DtlR.in_to_loc_cal_cd(up.getStringNE("in_to_loc_cal_cd"));
		srch01DtlR.dlv_cal_cd(up.getStringNE("dlv_cal_cd"));
		srch01DtlR.lg_grp_cd(up.getStringNE("lg_grp_cd"));
		srch01DtlR.base_unit_qty(up.getNumberNE("base_unit_qty"));
		srch01DtlR.base_dt(up.getDateNE("base_dt"));
		
		purcUtilSrch01.up0().add(srch01DtlR);		
		purcUtilSrch01.exec();
		
		if (!isNull(purcUtilSrch01.down0())) {
			return purcUtilSrch01.down0().get(0);
		}
		return MCRow.create();
	}

	/**
	 * 税ＣＤを取得します
	 * @param tax_cd
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @param sppl_cd
	 * @param base_dt
	 * @return
	 */
	public static MCRow _getPurcTaxCd(MCRow up) {
		MCRow r = MCRow.create();
		
		sql(createSqlId("MSUCL0040","MAPA_TAX$F_GET_PURC_TAX_CD","MSUCL_PurcListLogic__getPurcTaxCd"))
			.mainQuery()
				.select(MAPA_TAX$F_GET_PURC_TAX_CD(
						bind("itm_cd"),
						bind("itm_sub1"),
						bind("itm_sub2"),
						bind("itm_sub3"),
						bind("sppl_cd"),
						bind("base_dt"))
								.as("tax_cd"))
				.executeQuery(up, r);
		return r;
	}
}
