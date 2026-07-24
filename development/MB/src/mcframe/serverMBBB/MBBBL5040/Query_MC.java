package mcframe.serverMBBB.MBBBL5040;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBBL5040_MBT_JOURNAL_SND_IF_Query_I01
	 */
	static MCQueryPlan MBBBL5040_MBT_JOURNAL_SND_IF_I01() {
		MBT_JOURNAL_SND_IF_R S0 = MBT_JOURNAL_SND_IF_R.create();
		MBT_JOURNAL_R S1_T = MBT_JOURNAL_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL5040_MBT_JOURNAL_SND_IF_Query_I01")
					.insert(S0)
					.columns(
						S0.data_lno,
						S0.data_no,
						S0.exe_sts_typ,
						S0.data_crud_typ,
						S0.ext_sys_cd,
						S0.jnl_grp_no,
						S0.ac_ym,
						S0.ac_if_typ,
						S0.slip_cnt_id,
						S0.jnl_no,
						S0.jnl_no_seq,
						S0.dc_typ,
						S0.ac_slip_dt,
						S0.ac_dt,
						S0.slip_no,
						S0.slip_seq_no,
						S0.dpt_cd,
						S0.ac_cd,
						S0.sub_ac_cd,
						S0.project_cd,
						S0.summary_cd0,
						S0.summary_cd1,
						S0.summary_cd2,
						S0.summary_cd3,
						S0.summary_cd4,
						S0.summary_cd5,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_nm,
						S0.bp_typ,
						S0.bp_cd,
						S0.base_unit_qty,
						S0.base_unit_cd,
						S0.base_cur_upri,
						S0.base_cur_sum_amt,
						S0.base_cur_amt,
						S0.base_cur_tax_amt,
						S0.base_cur_cd,
						S0.trd_cur_upri,
						S0.trd_cur_sum_amt,
						S0.trd_cur_amt,
						S0.trd_cur_tax_amt,
						S0.trd_cur_cd,
						S0.ptax_cur_upri,
						S0.ptax_cur_sum_amt,
						S0.ptax_cur_amt,
						S0.ptax_cur_tax_amt,
						S0.ptax_cur_cd,
						S0.tax_typ,
						S0.tax_cd,
						S0.foreign_flg,
						S0.xrate,
						S0.xrate_cd,
						S0.ptax_xrate,
						S0.ptax_xrate_cd,
						S0.iv_no,
						S0.bill_no,
						S0.slo_no,
						S0.po_no,
						S0.usr_cd,
						S0.cls_jnl_typ,
						S0.alloc_jnl_flg,
						S0.spot_flg,
						S0.sttl_schd_dt,
						S0.sttl_cd,
						S0.bank_ac_cd,
						S0.other_ac_cd,
						S0.other_sub_ac_cd,
						S0.other_dpt_cd,
						S0.abstract1,
						S0.abstract2,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3,
						S0.sub_char4,
						S0.sub_char5,
						S0.sub_char6,
						S0.sub_char7,
						S0.sub_char8,
						S0.sub_char9,
						S0.sub_char10,
						S0.sub_num1,
						S0.sub_num2,
						S0.sub_num3,
						S0.sub_dt1,
						S0.sub_dt2,
						S0.sub_dt3
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO.value())),
							decode(
								S1_T.ac_if_typ,
								value(MAC_AC_IF_TYP.GL.value()),
								bind("data_no1"),
								value(MAC_AC_IF_TYP.AP.value()),
								bind("data_no2"),
								value(MAC_AC_IF_TYP.AR.value()),
								bind("data_no3"),
								nullValue()
							),
							bind("exe_sts_typ"),
							bind("data_crud_typ"),
							bind("ext_sys_cd"),
							S1_T.jnl_grp_no,
							S1_T.ac_ym,
							S1_T.ac_if_typ,
							S1_T.slip_cnt_id,
							S1_T.jnl_no,
							S1_T.jnl_no_seq,
							S1_T.dc_typ,
							S1_T.ac_slip_dt,
							S1_T.ac_dt,
							S1_T.slip_no,
							S1_T.slip_seq_no,
							S1_T.dpt_cd,
							S1_T.ac_cd,
							S1_T.sub_ac_cd,
							S1_T.project_cd,
							S1_T.summary_cd0,
							S1_T.summary_cd1,
							S1_T.summary_cd2,
							S1_T.summary_cd3,
							S1_T.summary_cd4,
							S1_T.summary_cd5,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.itm_nm,
							S1_T.bp_typ,
							S1_T.bp_cd,
							S1_T.base_unit_qty,
							S1_T.base_unit_cd,
							S1_T.base_cur_upri,
							S1_T.base_cur_sum_amt,
							S1_T.base_cur_amt,
							S1_T.base_cur_tax_amt,
							S1_T.base_cur_cd,
							S1_T.trd_cur_upri,
							S1_T.trd_cur_sum_amt,
							S1_T.trd_cur_amt,
							S1_T.trd_cur_tax_amt,
							S1_T.trd_cur_cd,
							S1_T.ptax_cur_upri,
							S1_T.ptax_cur_sum_amt,
							S1_T.ptax_cur_amt,
							S1_T.ptax_cur_tax_amt,
							S1_T.ptax_cur_cd,
							S1_T.tax_typ,
							S1_T.tax_cd,
							S1_T.foreign_flg,
							S1_T.xrate,
							S1_T.xrate_cd,
							S1_T.ptax_xrate,
							S1_T.ptax_xrate_cd,
							S1_T.iv_no,
							S1_T.bill_no,
							S1_T.slo_no,
							S1_T.po_no,
							S1_T.usr_cd,
							S1_T.cls_jnl_typ,
							S1_T.alloc_jnl_flg,
							S1_T.spot_flg,
							S1_T.sttl_schd_dt,
							S1_T.sttl_cd,
							S1_T.bank_ac_cd,
							S1_T.other_ac_cd,
							S1_T.other_sub_ac_cd,
							S1_T.other_dpt_cd,
							S1_T.abstract1,
							S1_T.abstract2,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.sub_char4,
							S1_T.sub_char5,
							S1_T.sub_char6,
							S1_T.sub_char7,
							S1_T.sub_char8,
							S1_T.sub_char9,
							S1_T.sub_char10,
							S1_T.sub_num1,
							S1_T.sub_num2,
							S1_T.sub_num3,
							S1_T.sub_dt1,
							S1_T.sub_dt2,
							S1_T.sub_dt3
						)
						.from(S1_T)
						.where(
							S1_T.jnl_grp_no.eq(bind("jnl_grp_no"))
						)
					)
			);
	}
}