package mcframe.serverMSUA.MSUAL0030;

import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL;

import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloItmCols;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil;

/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@EI
public class MSUAL_List extends MSUAL_List_MC {

	protected void _setSloItmDefaultValuesToRow(MCRow row, MCRow down) {
		super._setSloItmDefaultValuesToRow(row, down);
		
		String wgCd = row.getStringNE(SloItmCols.$i_hdr_wg_cd);
		String itmCd = down.getStringNE(SloItmCols.$o_itm_cd);
		String itmSub1 = down.getStringNE(SloItmCols.$o_itm_sub1);
		String itmSub2 = down.getStringNE(SloItmCols.$o_itm_sub2);
		String itmSub3 = down.getStringNE(SloItmCols.$o_itm_sub3);
		
		// 標準販売単価マスタより定価・仕切単価を設定
		MCRow stdUpriRow = getStdSlsUpriRow(itmCd, itmSub1, itmSub2, itmSub3, wgCd);
		if (stdUpriRow != null) {
			down.setNumberNE(SloItmCols.$o_list_pri, stdUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.$upri));
			down.setNumberNE(SloItmCols.$o_wl_sale_upri, stdUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.$wl_sale_upri));
		}
		
		// 得意先販売単価マスタより単位区分・掛率を設定
		String cstCd = row.getStringNE(SloItmCols.$i_bp_cd);
		MCRow cstUpriRow = (cstCd != null) ? getCstSlsUpriRow(cstCd, itmCd, itmSub1, itmSub2, itmSub3, wgCd) : null;
		if (cstUpriRow != null) {
			String upriTyp = cstUpriRow.getStringNE(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.$upri_typ);
			down.setStringNE(SloItmCols.$o_upri_typ, upriTyp);
			down.setNumberNE(SloItmCols.$o_upri_rate, cstUpriRow.getNumberNE(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.$upri_rate));
			switch (upriTyp) {
				case "1": down.setStringNE(SloItmCols.$o_upri_typ_nm, "定価"); break;
				case "2": down.setStringNE(SloItmCols.$o_upri_typ_nm, "仕切"); break;
			}
		}

	}
	
	/**
	 * 対象の品目に紐付く定価・仕切単価を取得
	 *
	 * @return 標準販売単価マスタレコード
	 */
	public MCRow getStdSlsUpriRow(
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		String wg_cd) {

		MCRow r = MCRow.create();
		r.setStringNE("itm_cd", itm_cd);
		r.setStringNE("itm_sub1", itm_sub1);
		r.setStringNE("itm_sub2", itm_sub2);
		r.setStringNE("itm_sub3", itm_sub3);
		r.setStringNE("wg_cd", wg_cd);
		
		MCList<mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R> resultList = MCList.create(mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.class);
		mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R m1 = mcframe.serverMA.dbc.MAM_STD_SLS_UPRI_R.create("M1");
		IFMCSQL.MCDateValue stDt = mcframe.serverCore.dbc.CoreFunction.FCPA_DATE_UTIL$F_GET_TODAY1();

		sql(MAUCL_DbUtil.createSqlId(LOGIC_ID, "MAM_STD_SLS_UPRI_S01", "getStdSlsUpriRow"))
				.mainQuery()
				.select(
						m1.upri
						, m1.wl_sale_upri
				)
				.from(m1)
				.where(
						m1.itm_cd.eq(bind("itm_cd"))
						.and(m1.itm_sub1.eq(bind("itm_sub1")))
						.and(m1.itm_sub2.eq(bind("itm_sub2")))
						.and(m1.itm_sub3.eq(bind("itm_sub3")))
						.and(
								m1.wg_cd.eq(bind("wg_cd"))
								.or(m1.wg_cd.eq(value("*")))
							)
						.and(stDt.between(m1.st_dt, m1.end_dt))
				)
				.executeQuery(r, resultList);

		return resultList.isEmpty() ? null : resultList.get(0);
	}
	
	/**
	 * 対象の品目に紐付く定価・仕切単価を取得
	 *
	 * @return 得意先販売単価マスタレコード
	 */
	public MCRow getCstSlsUpriRow(
		String cst_cd,
		String itm_cd,
		String itm_sub1,
		String itm_sub2,
		String itm_sub3,
		String wg_cd) {

		MCRow r = MCRow.create();
		r.setStringNE("cst_cd", cst_cd);
		r.setStringNE("itm_cd", itm_cd);
		r.setStringNE("itm_sub1", itm_sub1);
		r.setStringNE("itm_sub2", itm_sub2);
		r.setStringNE("itm_sub3", itm_sub3);
		r.setStringNE("wg_cd", wg_cd);
		
		MCList<mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R> resultList = MCList.create(mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.class);
		mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R m1 = mcframe.serverMA.dbc.MAM_CST_SLS_UPRI_R.create("M1");
		IFMCSQL.MCDateValue stDt = mcframe.serverCore.dbc.CoreFunction.FCPA_DATE_UTIL$F_GET_TODAY1();

		sql(MAUCL_DbUtil.createSqlId(LOGIC_ID, "MAM_CST_SLS_UPRI_S01", "getCstSlsUpriRow"))
				.mainQuery()
				.select(
						m1.upri_typ
						, m1.upri_rate
				)
				.from(m1)
				.where(
						m1.cst_cd.eq(bind("cst_cd"))
						.and(m1.itm_cd.eq(bind("itm_cd")))
						.and(m1.itm_sub1.eq(bind("itm_sub1")))
						.and(m1.itm_sub2.eq(bind("itm_sub2")))
						.and(m1.itm_sub3.eq(bind("itm_sub3")))
						.and(
								m1.wg_cd.eq(bind("wg_cd"))
								.or(m1.wg_cd.eq(value("*")))
							)
						.and(stDt.between(m1.st_dt, m1.end_dt))
				)
				.executeQuery(r, resultList)
				;

		return resultList.isEmpty() ? null : resultList.get(0);
	}
	
	
	
}