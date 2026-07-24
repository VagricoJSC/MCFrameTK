package mcframe.serverMSBD.MSBDL0150;

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
import mcframe.serverMSBD.MSBDL5170.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBE.MSBEL5040.*;
import java.util.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBC.MSBCL6130.*;
import static mcframe.serverMSBD.MSBDL0150.Query.*;
import static mcframe.serverMSBD.MSBDL5170.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcRetSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcRetSchdReg_MC extends MSBDL_PurcRetSchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBDL_PurcRetSchdReg_MC_A.Ins01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			setRowStatus();
			
			MSBDL_PurcRetRegService.Schd_Ins01 ope = 
					MSBDL_PurcRetRegService.crtSchd_Ins01();
			MCRow.copyall(ope.up0(), up0());
			ope.up0().amt_calc_flg(false);
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			MCRow.copyall(down0(), ope.down0());
			down1().setAll(ope.down1());
			down2().setAll(ope.down2());
			
		}
		protected void setRowStatus() {
			up0().setStatus(MCRow.CREATE);
			up1().setStatus(MCRow.CREATE);
			up2().setStatus(MCRow.CREATE);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBDL_PurcRetSchdReg_MC_A.Upd01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			MSBDL_PurcRetRegService.Schd_Upd01 ope = 
					MSBDL_PurcRetRegService.crtSchd_Upd01();
			MCRow.copyall(ope.up0(), up0());
			ope.up0().amt_calc_flg(false);
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
			down0().setAll(ope.down0());
			down1().setAll(ope.down1());
			
		}
		
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBDL_PurcRetSchdReg_MC_A.Del01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			setRowStatus();
			
			MSBDL_PurcRetRegService.Schd_Del01 ope = 
					MSBDL_PurcRetRegService.crtSchd_Del01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
		
		protected void setRowStatus() {
			up0().setStatus(MCRow.DELETE);
		}

	}
	/**
	 * Srch01オペレーション.<p>
	 * 入荷実績情報を検索する。
	 */
	public class Srch01 extends MSBDL_PurcRetSchdReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			
			int cnt = srchHdr();

			if (isSame(cnt, 0)) {
				return;
			}
			
			editUpForDtl();
			
			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}
			
			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}			
		}
		protected void editUpForDtl() {
			up0().setStringNE("ap_dpt_cd", down0().ap_dpt_cd());
		}

		protected void editUp() {

			//計上日の初期値となる運用日付を部門、住所の条件として使用する
			MCDate td = getToday();
			up0().addDateColumn("dpt_dt", td);
			up0().addDateColumn("addr_dt", td);
			
			editUpCom(up0());
		}
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBDL5170_MST_ARR_ACT_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_ARR_ACT_S02(), up0());

		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			Schd_IoR d2 = Schd_IoR.create();
			d2.setValuesByName(down1().get(0));
			down2().add(d2);
			return 1;
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			final Schd_HdrR down0 = down0();
			final MCList<Schd_DtlR> down1 = down1();
			final MCList<Schd_IoR> down2 = down2();
			if (!down0.isEmpty()) {
				callOutSrcActSprt02Service();

				MCDate d = up0().getDateNE("dpt_dt");
				down0.reg_dt(d);
				down0.pay_basis_dt(d);
				
				editXrateIfInptFlgOff(down0);
				editDownForSrch(down0, down1, 
						down1.join(
						Schd_DtlR.$ref_purc_act_d_no, down2, Schd_IoR.$ref_purc_act_d_no));
				
				for (Schd_DtlR down1R :down1) {
					MSBDL_PurcUtil.setAmtInfo(down0, down1R);
					down1R.base_purc_ac_dt(d);
				}
			}
		}

		/**
		 * 仕入実績がない場合に、入荷予定の製造指図ＮＯを元に購買区分を取得して明細に設定します。
		 */
		protected void callOutSrcActSprt02Service() {
			MSBCL_OutSrcActService.OutSrcAct_Sprt02 ope 
				= MSBCL_OutSrcActService.crtOutSrcAct_Sprt02();
			MCList<Schd_DtlR> dl = down1().subList(dr -> 
				isNull(dr.purc_ret_act_d_no()) && !isNull(dr.mfg_inst_no()));
			
			if (dl.size() <= 0) {
				return;
			}
			
			Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR,Schd_DtlR> map 
				= createMap_OutSrcAct_Sprt02_CndR_DtlR();
			map.setWith(down0());
			addAll(ope.up0(), dl, map);
			ope.exec();
			MCIndexKey k = ope.down0().createIndex(OutSrcAct_Sprt02_RsltR.$peg_no);
			dl.forEach(dr -> {
				OutSrcAct_Sprt02_RsltR r = 
						ope.down0().getFirst(k, dr.peg_no());
				dr.purc_typ(r.purc_typ());
			});
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 * 仕入実績情報を検索する。
	 */
	public class Srch02 extends MSBDL_PurcRetSchdReg_MC_A.Srch02 {
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();

			int cnt = srchHdr();
			
			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}
		}
		
		protected void editUp() {

			//計上日の初期値となる運用日付を部門、住所の条件として使用する
			MCDate td = getToday();
			up0().addDateColumn("dpt_dt", td);
			up0().addDateColumn("addr_dt", td);
			
			editUpCom(up0());
		
			if (MSC_PURC_SRCH_TGT_TYP.isPURC_ACT_NO(up0().srch_tgt_typ())) {
				up0().setStringNE("purc_act_no", up0().srch_tgt_no());
			}
			else {
				up0().setStringNE("purc_act_d_no", up0().srch_tgt_no());
			}
		}
				
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			if (isNull(up0().srch_tgt_no())) {
				return 0;
			}
			
			return executeQuery(down0(), MSBDL5170_MST_PURC_ACT_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_PURC_ACT_D_S01(), up0());

		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			return executeQuery(down2(), MSBDL5170_MST_PURC_ACT_IO_S01(), up0());

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			final Schd_HdrR down0 = down0();
			final MCList<Schd_DtlR> down1 = down1();
			final MCList<Schd_IoR> down2 = down2();
			if (!down0.isEmpty()) {
				MCDate d = up0().getDateNE("dpt_dt");
				down0.reg_dt(d);
				down0.pay_basis_dt(d);
								
				MCJoinKey<MCList<Schd_IoR>> jk = down1.join(Schd_DtlR.$ref_purc_act_d_no, down2, Schd_IoR.$ref_purc_act_d_no);
				editDownForSrch(down0, down1, jk);
				
				if (!isSame(down0.trd_cur_cd(), down0.base_cur_cd())) {
					down0.xrate_inpt_flg(true);
				}
				if (!isNull(down0.ptax_xrate())){
					if (!isSame(down0.trd_cur_cd(), down0.ptax_cur_cd())) {
						down0.ptax_xrate_inpt_flg(true);
					}
				}
				
				
				for (Schd_DtlR dr :down1) {
					if (!MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ())) {
						dr.bd_dpt_cd(null);
						dr.bd_dpt_nm(null);
						dr.bd_itm_cd(null);
						dr.bd_itm_sub1(null);
						dr.bd_itm_sub2(null);
						dr.bd_itm_sub3(null);
						dr.bd_itm_nm(null);
						dr.bd_lot_mng_typ(null);
						dr.bd_sublot_mng_typ(null);
						dr.bd_lot_no_typ(null);
						dr.bd_sublot_no_typ(null);
						dr.bd_sno1_mng_typ(null);
						dr.bd_sno2_mng_typ(null);
						dr.bd_sno3_mng_typ(null);
						dr.bd_sno4_mng_typ(null);
						dr.bd_lot_no(null);
						dr.bd_sublot_no(null);
						dr.bd_sno1(null);
						dr.bd_sno2(null);
						dr.bd_sno3(null);
						dr.bd_sno4(null);
						dr.bd_bp_cd(null);
						dr.bd_bp_nm(null);
						dr.bd_loc_cd(null);
						dr.bd_loc_nm(null);
						dr.bd_ctg_cd(null);
						dr.bd_ctg_nm(null);
						dr.bd_oper_cd(null);
						dr.bd_oper_nm(null);
						dr.bd_iv_no(null);
						dr.bd_slo_no(null);
						dr.bd_po_no(null);
					}
					if(!MAC_PURC_TYP.isPURC_ITM(dr.purc_typ())) {
						dr.repurc_obli_flg(down0.repurc_obli_flg());
						dr.outsrc_upri_typ(down0.outsrc_upri_typ());
					}
					MCList<Schd_IoR> iol = dr.getJoined(jk);
					for(Schd_IoR ir :iol) {
						dr.base_ac_dt(ir.getDateNE(MST_PROV_ACT_R.$base_ac_dt));
					}
				}
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *　仕入返品予定情報を検索する。
	 */
	public class Srch03 extends MSBDL_PurcRetSchdReg_MC_A.Srch03 {
		
		// 単票ではシンプルにdoSearchMainでDBからヘッダ、明細のデータを取得、editListMainでDBから取得したデータの加工をします
		// 定数名、時分項目、棚・ライン対象ＦＬＧの補完は親クラスで処理されるため、個々の実装は不要です。
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			
			editUp();
			
			int cnt = srchHdr();
		
			if (isSame(cnt, 0)) {
				return;
			}

			editUpForMaster();
			
			cnt = srchDtl();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				return;
			}

			cnt = srchIO();
			if (isSame(cnt, 0)) {
				down0().clearAll();
				down1().clear();
				return;
			}
			
			
		}

		protected void editUp() {
			editUpCom(up0());
		}
		
		protected void editUpForMaster() {

			//予定日を部門の結合条件として使用する
			up0().addDateColumn("dpt_dt", down0().schd_dt());
		}
		
		/**
		 * ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MSBDL0150_MST_PURC_RET_SCHD_S01(), up0());
		}

		/**
		 * 明細を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBDL5170_MST_PURC_RET_SCHD_D_S01(), up0());

		}

		/**
		 * 受払を検索する。
		 * 
		 * @return 検索件数
		 */
		protected int srchIO() {
			return executeQuery(down2(), MSBDL5170_MST_PURC_RET_SCHD_IO_S01(), up0());

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			final Schd_HdrR down0 = down0();
			final MCList<Schd_DtlR> down1 = down1();
			final MCList<Schd_IoR> down2 = down2();
			MCJoinKey<MCList<Schd_IoR>> jk = down1.join(
					Schd_DtlR.$purc_ret_schd_d_no, down2, Schd_IoR.$purc_ret_schd_d_no);
			if (!down0.isEmpty()) {
				editDownForSrch(down0, down1, 
					jk);
				
				for (Schd_DtlR dr :down1) {
					MCNumber baseCurTaxAmt = dr.base_cur_tax_amt();
					MCNumber ptaxCurTaxAmt = dr.ptax_cur_tax_amt();
					MSBDL_PurcUtil.setBaseCurInfo(down0, dr);
					MSBDL_PurcUtil.setPtaxCurInfo(down0, dr);
					
					// 基準通貨税額が設定されている場合、基準通貨税額をSQLの値で上書きし、税込金額を再計算す
					if (!isNull(baseCurTaxAmt)) {
						dr.base_cur_tax_amt(baseCurTaxAmt);
						if (dr.inc_tax_flg()) {
							dr.base_cur_amt(dr.base_cur_inc_tax_amt().subtract(dr.base_cur_tax_amt()));
						}
						else {
							dr.base_cur_inc_tax_amt(dr.base_cur_amt().add(dr.base_cur_tax_amt()));
						}
					}
					// 納税通貨税額が設定されている場合、納税通貨税額をSQLの値で上書きし、税込み金額を再計算する。
					if (!isNull(ptaxCurTaxAmt)) {
						dr.ptax_cur_tax_amt(ptaxCurTaxAmt);
						if (dr.inc_tax_flg()) {
							dr.ptax_cur_amt(dr.ptax_cur_inc_tax_amt().subtract(dr.ptax_cur_tax_amt()));
						}
						else {
							dr.ptax_cur_inc_tax_amt(dr.ptax_cur_amt().add(dr.ptax_cur_tax_amt()));
						}
					}
					
					//明細に参照入荷実績ＮＯがないので受払からコピーする
					if (isNull(dr.ref_arr_act_no())) {
						MCList<Schd_IoR> iol = dr.getJoined(jk);
						for(Schd_IoR ir : iol) {
							if (!isNull(ir.ref_arr_act_no())) {
								dr.ref_arr_act_no(ir.ref_arr_act_no());
								dr.ref_arr_act_rev(ir.ref_arr_act_rev());
							}
						}
						
					}
					if(!MAC_PURC_TYP.isPURC_ITM(dr.purc_typ())) {
						dr.repurc_obli_flg(down0.repurc_obli_flg());
						dr.outsrc_upri_typ(down0.outsrc_upri_typ());
					}
				}
			}
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBDL_PurcRetSchdReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}
		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}
		@Override
		protected void doIt() {
			setUpriInfo();
		}
		
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			MCList<Schd_DtlR> tmpL = MCList.create(Schd_DtlR.class);
			if (isNullOr(up0().sppl_cd(), up0().trd_cur_cd(), up0().reg_dt())) {
				return;
			}
			
			for (Schd_DtlR r : up1()) {
				if (!isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.trd_unit_cd(), r.trd_unit_qty(), r.purc_ret_loc_wg_cd())) {
					tmpL.add(r);
				}
			}
			
			// 単価取得対象が存在しない場合中断
			if (tmpL.size() == 0) {
				return;
			}

			// 会社情報から為替レート端数処理区分、源泉徴収税端数処理区分を取得
			up0().xrate_rnd_typ(getCo().xrate_rnd_typ());
			up0().wtax_rnd_typ(getCo().wtax_rnd_typ());
			
			setPegNo(tmpL);
			
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR,Schd_DtlR> map = createMap_PurcUtil_Srch02_DtlR_DtlR();
			map.setWith(up0());
			addAll(purcUtilSrch02.up0(), tmpL, map);
			
			purcUtilSrch02.exec();
			String[] destCols = {Schd_DtlR.$trd_cur_upri, Schd_DtlR.$trd_cur_proc_upri, Schd_DtlR.$trd_cur_onr_prov_upri, Schd_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(tmpL, destCols, purcUtilSrch02.down0(), srcCols);
			
			down0().setAll(tmpL);
		}
		
		protected Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR,Schd_DtlR> createMap_PurcUtil_Srch02_DtlR_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_DtlR<PurcUtil_Srch02_DtlR, Schd_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Schd_DtlR> extends MCRowMapper<D,S>{
			protected Schd_HdrR _hr;
			protected void setWith(Schd_HdrR hr) {
				_hr = hr;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Schd_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Schd_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Schd_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Schd_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Schd_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Schd_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Schd_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Schd_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Schd_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Schd_DtlR.$purc_ret_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Schd_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$purc_typ, Schd_DtlR.$purc_typ);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_inst_no, DtlR.$mfg_inst_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Schd_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Schd_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Schd_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Schd_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$interim_flg, Schd_DtlR.$interim_flg);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Schd_DtlR.$purc_ret_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Schd_DtlR.$base_dt); 
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sppl_cd(_hr.sppl_cd());
				dest.cur_cd(_hr.trd_cur_cd());
				dest.itmdtl_base_dt(_hr.reg_dt());
			}
		}
	}
	protected void editDownForSrch(Schd_HdrR down0, MCList<Schd_DtlR> down1, MCJoinKey<MCList<Schd_IoR>> jk) {

		editDownHdrForSrch(down0);
		
		editDownPegNo(down1, jk);

		for (Schd_DtlR dr :down1) {
			setBaseUnitQty(dr);
			dr.str_ln_cd_none_flg(MAC_STR.isNULL_VAL(dr.str_ln_cd()));
			dr.purc_cont_qty(null);//仕入有効成分は詳細から計算する
			MCList<Schd_IoR> iol = dr.getJoined(jk);
			boolean multiIo = false;
			String igdCd = null;
			boolean multiLotIo = false;
			String ilotNo = null;
			boolean multiSubLotIo = false;
			String isublotNo = null;
			
			for(Schd_IoR ir :iol) {
				setBaseUnitQty(ir);
				
				ir.str_ln_cd_none_flg(MAC_STR.isNULL_VAL(ir.str_ln_cd()));
				MSBDL_PurcUtil.setCont(ir);
				MSBDL_PurcUtil.addCont(dr, ir);
				
				setDefaultStkCd(ir);
				if (!multiIo && isNull(igdCd)) {
					dr.gd_cd(ir.gd_cd());
					dr.gd_nm(ir.gd_nm());
					igdCd = ir.gd_cd();
				}
				else if (!isSame(igdCd, ir.gd_cd())){
					dr.gd_cd(null);
					dr.gd_nm(null);
					multiIo = true;
				}
				if (!multiLotIo && isNull(ilotNo)) {
					dr.lot_no(ir.lot_no());
					ilotNo = ir.lot_no();
				}
				else if (!isSame(ilotNo, ir.lot_no())){
					dr.lot_no(null);
					multiLotIo = true;
				}
				if (!multiSubLotIo && isNull(isublotNo)) {
					dr.sublot_no(ir.sublot_no());
					isublotNo = ir.sublot_no();
				}
				else if (!isSame(isublotNo, ir.sublot_no())){
					dr.sublot_no(null);
					multiSubLotIo = true;
				}
			}
			
		}
	}
	
	protected void setDefaultStkCd(Schd_IoR r) {
		if (isNull(r.gd_cd())) {
			r.gd_cd(getDefaultFeedStkGd().gd_cd());
			r.gd_nm(getDefaultFeedStkGd().gd_nm());
		}
	}

	protected void setBaseUnitQty(Schd_DtlR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_dmn_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}

	protected void setBaseUnitQty(Schd_IoR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_dmn_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}	
	protected void editDownPegNo(MCList<Schd_DtlR> down1, MCJoinKey<MCList<Schd_IoR>> jk) {
		MCNumber dpeg = MCNumber.ONE;
		MCNumber ipeg = MCNumber.ONE;
		for (Schd_DtlR dr : down1) {
			dr.peg_no(dpeg);

			MCList<Schd_IoR> iol = dr.getJoined(jk);
			if (iol.size() > 0) {
				for (Schd_IoR ir : iol) {
					ir.dtl_peg_no(dpeg);
					ir.peg_no(ipeg);
					ipeg = ipeg.add(MCNumber.ONE);
				}
			}
			dpeg = dpeg.add(MCNumber.ONE);
		}
	}

	/**
	 * ヘッダ情報を編集します。
	 */
	protected void editDownHdrForSrch(Schd_HdrR r) {
		if (!r.isEmpty()) {
			r.base_cur_cd(getBaseCur().cur_cd());
			r.base_cur_nm(getBaseCur().cur_nm());
			
			r.ptax_cur_cd(getPtaxCur().cur_cd());
			r.ptax_cur_nm(getPtaxCur().cur_nm());

			r.xrate_rnd_typ(getCo().xrate_rnd_typ());
			r.wtax_rnd_typ(getCo().wtax_rnd_typ());
			
			if(isNull(r.ap_dpt_cd()) && r.ap_dpt_flg()) {
				r.ap_dpt_cd(r.purc_dpt_cd());
			}
		}

	}

	/**
	 * 指定フラグがfalseのレートをマスタから取得します。
	 * @param r ヘッダ
	 */
	protected void editXrateIfInptFlgOff(Schd_HdrR r) {

		if (!r.xrate_inpt_flg()) {
			r.xrate(MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.base_cur_cd(), 
					getCo().purc_xrate_cd(), r.reg_dt()));
		}
		
		if (!r.ptax_xrate_inpt_flg()) {
			r.ptax_xrate(MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), r.ptax_cur_cd(), 
				getCo().purc_xrate_cd(), r.reg_dt()));
		}
	}
	protected void editUpCom(CndR up0) {
		up0.setStringNE("base_cur_cd", getBaseCur().cur_cd());
		up0.setStringNE("ptax_cur_cd", getPtaxCur().cur_cd());
	}

	protected Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR,Schd_DtlR> createMap_OutSrcAct_Sprt02_CndR_DtlR() {
		return new Map_OutSrcAct_Sprt02_CndR_DtlR<OutSrcAct_Sprt02_CndR, Schd_DtlR>();
	}

	public class Map_OutSrcAct_Sprt02_CndR_DtlR<D extends OutSrcAct_Sprt02_CndR, S extends Schd_DtlR> extends MCRowMapper<D,S>{
		Schd_HdrR _hr;
		protected void setWith(Schd_HdrR hr) {
			_hr = hr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$peg_no, Schd_DtlR.$peg_no);
			addColumnPathMap(OutSrcAct_Sprt02_CndR.$mfg_inst_no, Schd_DtlR.$mfg_inst_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
		}
	}

	//FMCB CUSTOM END
}