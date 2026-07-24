package mcframe.serverMSBG.MSBGL0020;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBG.MSBGL0020.Query.*;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMAUC.MAUCL1060.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillDSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillDSel_MC extends MSBGL_BillDSel_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBGL_BillDSel_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MST_BILL_R billR = getBillR();
			copy(down0(), billR, createMapBill());
			Srch01_CndR up1 = Srch01_CndR.create();
			MCRow.copyall(up1, up0());

			up0().setStringNE("sls", MSC_BILL_D_TYP.SLS.value());
			executeQuery(down1(), MSBGL0020_MST_BILL_D_S01(), up0());
			down1().sort(Srch01_DtlSlsR.$sort_ord, Srch01_DtlSlsR.$bill_ym, Srch01_DtlSlsR.$bill_cl_day
					,Srch01_DtlSlsR.$act_no, Srch01_DtlSlsR.$act_seq, Srch01_DtlSlsR.$act_rev
					,Srch01_DtlSlsR.$act_d_no, Srch01_DtlSlsR.$act_d_seq
					);

			up1.setStringNE("rcv", MSC_BILL_D_TYP.RCV.value());
			executeQuery(down3(), MSBGL0020_MST_BILL_D_S01(), up1);
			down3().sort(Srch01_DtlRcvR.$sort_ord, Srch01_DtlRcvR.$bill_ym, Srch01_DtlRcvR.$bill_cl_day
					,Srch01_DtlRcvR.$act_no, Srch01_DtlRcvR.$act_seq, Srch01_DtlRcvR.$act_rev
					,Srch01_DtlRcvR.$act_d_no, Srch01_DtlRcvR.$act_d_seq
					);
			srchRcvActD();
		}

		protected MST_BILL_R getBillR() {

			MST_BILL_R billR = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(t);

			setCndForBillR(billR, billR_bldr, t);

			dbSelect("MSBGL0020_MST_BILL_S01", billR, billR_bldr, up0());

			return billR;

		}

		protected void setCndForBillR(MST_BILL_R billR, MCQueryApiBuilder billR_bldr, MST_BILL_R t) {
			// 最後に請求した請求トランの請求額を取得して前回請求額とする
			// ただし未請求のレコードしかない場合には前回請求額はゼロとする
			MAM_CUR_R cur1 = MAM_CUR_R.create("CUR1");
			billR_bldr.setSelect(decode( t.bill_cl_sts_typ, value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()), value(0), t.bill_amt).as("last_bill_amt"));
			billR_bldr.addSelect(cur1.amt_dec_place);
			billR_bldr.addLeftOuterJoin(cur1, bracket( t.trd_cur_cd.eq(cur1.cur_cd)));
			billR_bldr.setWhere(t.bill_mng_no.eq(MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO( bind("bcst_cd"), bind("bill_dpt_cd"), bind("iv_no"), bind("trd_cur_cd"), bind("wrk_no") )));
		}

		protected MapBill<Srch01_HdrR,MST_BILL_R> createMapBill() {
			return new MapBill<Srch01_HdrR, MST_BILL_R>();
		}

		public class MapBill<D extends Srch01_HdrR, S extends MST_BILL_R> extends MCRowMapper<D,S>{
			@Override
			public void copy(D dest, S src) {
				dest.last_bill_amt(nvl(src.last_bill_amt(), MCNumber.ZERO));
				dest.amt_dec_place(src.getNumber("amt_dec_place"));
			}
		}
		protected void srchRcvActD() {
			// 請求締対象となりうる前受金を取得する
			MCList<MST_RCV_ACT_D_R>
				down4 = MSBGL_ArUtil.getBillClAdvL(up0().bcst_cd(), up0().bill_dpt_cd(), up0().trd_cur_cd());
			
			// 前受金と売掛消込の入金実績明細ＮＯをもとに、入金実績を取得する
			MCList<Srch01_DtlAdvR> cndL = MCList.create(Srch01_DtlAdvR.class);
			down4.forEach(r -> {
				Srch01_DtlAdvR cndR = cndL.add();
				cndR.rcv_act_d_no(r.rcv_act_d_no());
				cndR.rcv_act_d_seq(r.rcv_act_d_seq());
			});
			down3().forEach(r -> {
				Srch01_DtlAdvR cndR = cndL.add();
				cndR.rcv_act_d_no(r.act_d_no());
				cndR.rcv_act_d_seq(r.act_d_seq());
			});
			MCList<Srch01_DtlAdvR> rcvActDL = MCList.create(Srch01_DtlAdvR.class);
			executeQuery(rcvActDL, MSBGL0020_MST_RCV_ACT_D_S01(), cndL);
			
			// 入金実績を下り電文に設定する
			MCIndexKey idx = down3().createIndex(Srch01_DtlRcvR.$act_d_no, Srch01_DtlRcvR.$act_d_seq);
			for (Srch01_DtlAdvR rcvActDR : rcvActDL) {
				Srch01_DtlRcvR d3R = down3().getFirst(idx, rcvActDR.rcv_act_d_no(), rcvActDR.rcv_act_d_seq());
				// 売掛消込分
				if (!isNull(d3R)) {
					d3R.trd_cur_amt(rcvActDR.trd_cur_amt());
					d3R.setoff_amt(rcvActDR.setoff_amt());
					d3R.setoff_tax_amt(rcvActDR.setoff_tax_amt());
					d3R.setoff_tax_cd(rcvActDR.setoff_tax_cd());
					d3R.setoff_tax_nm(rcvActDR.setoff_tax_nm());
					d3R.setoff_tax_rate(rcvActDR.setoff_tax_rate());
					d3R.bill_tax_disp_flg(rcvActDR.bill_tax_disp_flg());
				}
				// 前受金分
				else {
					down4().add(rcvActDR);
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			int rowNum = 1;
			for (Srch01_DtlSlsR r : down1()) {
				// 売上の請求明細に行番号を設定
				r.row_num(rowNum);
				rowNum++;

				//符号の反転
				r.trd_cur_amt(r.trd_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.inc_tax_amt(r.inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				r.trd_cur_upri(r.trd_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.base_cur_amt(r.base_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.base_cur_upri(r.base_cur_upri().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.base_cur_inc_tax_amt(r.base_cur_amt().add(r.base_cur_tax_amt()));
				if (!isNull(r.base_cur_dscnt_amt())) {
					r.setNumberNE(Srch01_DtlSlsR.$base_cur_dscnt_amt, r.base_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
				}

				if (!isNull(r.trd_cur_dscnt_amt())) {
					r.setNumberNE(Srch01_DtlSlsR.$trd_cur_dscnt_amt, r.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
				}
			}

			addAll(down2(), down1(), createMap_DtlSlsSubR_DtlSlsR());
		}
	}

	// Srch01_DtlSlsR ⇒ Srch01_DtlSlsSubR
	protected Map_DtlSlsSubR_DtlSlsR<Srch01_DtlSlsSubR,Srch01_DtlSlsR> createMap_DtlSlsSubR_DtlSlsR() {
		return new Map_DtlSlsSubR_DtlSlsR<Srch01_DtlSlsSubR, Srch01_DtlSlsR>();
	}
	public class Map_DtlSlsSubR_DtlSlsR<D extends Srch01_DtlSlsSubR, S extends Srch01_DtlSlsR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_DtlSlsSubR.$trd_cur_amt, Srch01_DtlSlsR.$trd_cur_amt);
			addColumnPathMap(Srch01_DtlSlsSubR.$trd_cur_tax_amt, Srch01_DtlSlsR.$trd_cur_tax_amt);
			addColumnPathMap(Srch01_DtlSlsSubR.$inc_tax_amt, Srch01_DtlSlsR.$inc_tax_amt);
			addColumnPathMap(Srch01_DtlSlsSubR.$ar_trd_grp_typ, Srch01_DtlSlsR.$ar_trd_grp_typ);
			addColumnPathMap(Srch01_DtlSlsSubR.$trd_ptn_typ, Srch01_DtlSlsR.$trd_ptn_typ);
			addColumnPathMap(Srch01_DtlSlsSubR.$bill_d_no, Srch01_DtlSlsR.$bill_d_no);
			addColumnPathMap(Srch01_DtlSlsSubR.$schd_bill_dt, Srch01_DtlSlsR.$schd_bill_dt);
			addColumnPathMap(Srch01_DtlSlsSubR.$row_num, Srch01_DtlSlsR.$row_num);
		}
	}

	//FMCB CUSTOM END
}