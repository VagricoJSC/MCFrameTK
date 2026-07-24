package mcframe.serverMSBB.MSBBL1210;

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
import mcframe.serverMSBB.MSBBL1210.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6020.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSBB.MSBBL1210.Query.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloReg_MC extends MSBBL_SloReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Del01オペレーション.<p>
	 *
	 * 受注情報を取り消す<br>
	 */
	public class Del01 extends MSBBL_SloReg_MC_A.Del01 {

		protected MSBBL_SloRegService.Slo_Chk03 _chk03Serv = null;

		MSBBL_SloRegService.Slo_Del01 _Del01Serv = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callSloServiceChk03();
			throwCanErr();
			callSloServiceDel01();
		}

		protected void callSloServiceChk03() {

			_chk03Serv = MSBBL_SloRegService.crtSlo_Chk03();
			copyall(_chk03Serv.up0(), up0());
			_chk03Serv.up1().setAll(up1());
			_chk03Serv.exec();
		}

		protected void callSloServiceDel01() {

			_Del01Serv = MSBBL_SloRegService.crtSlo_Del01();
			copyall(_Del01Serv.up0(), _chk03Serv.down0());
			_Del01Serv.up1().setAll(_chk03Serv.down1());
			_Del01Serv.exec();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注情報を検索する<br>
	 */
	public class Srch01 extends MSBBL_SloReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			selectAll();
		}

		/**
		 * 受注情報を検索する。
		 */
		protected void selectAll() {

			getLatestSloRev(up0());
			
			//受注ヘッダの検索
			int cnt = srchSlo();
			
			if (isSame(cnt, 0)) {
				return;
			}
				
			setLatestFlg();
			
			//与信枠残高の取得
			callCredSvSrch01(down0());
			
			//受注明細の検索
			cnt = srchSloD(up0(), down0(), down1());
			
			if (isSame(cnt, 0)) {
				
				down0().clear();
				return;
			}
		}

		/**
		 * 受注ヘッダを検索する。
		 * @return 受注ヘッダ件数
		 */
		protected int srchSlo() {
			int cnt = executeQuery(down0(), MSBBL1210_MST_SLO_S01(), up0());
			
			if (cnt > 0) {
				
				if (down0().can_flg()) {
					MCMessage msg = new MCMessage(MSBBL0171);
					throw new MCAppException(msg);
				}
			}

			return cnt;
		}
		
		/**
		 * 最新フラグを設定する。
		 */
		protected void setLatestFlg() {
			
			if (isSame(down0().slo_rev(), up0().latest_slo_rev())) {
				down0().latest_flg(true);
			}
		}
		
		/**
		 * 最新受注受注改訂番号を取得する。
		 * @param cndR 検索条件
		 */
		protected void getLatestSloRev(Srch01_CndR cndR) {
		
			MST_SLO_R sloR = MST_SLO_R.create();
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloR_bldr = MCQueryApiBuilder.create(t);
			sloR_bldr.setSelect(t.slo_rev);
			dbSelectKey("MSBBL1210_MST_SLO_S01", sloR, sloR_bldr, cndR);
			
			cndR.latest_slo_rev(sloR.slo_rev());
			
			//最新のREV_NOを取得する。
			if (cndR.latest_flg() || isNull(cndR.slo_rev())) {
				
				cndR.slo_rev(sloR.slo_rev());
			}
		}

		/**
		 * 受注明細を検索する。
		 * @param cndR 検索条件
		 * @param hdr 受注ヘッダ
		 * @param dtlL 受注明細
		 * @return 受注明細件数
		 */
		protected int srchSloD(Srch01_CndR cndR, Rslt_HdrR hdr, MCList<Rslt_DtlR> dtlL) {
			int ret = executeQuery(dtlL, MSBBL1210_MST_SLO_D_S01(), cndR);
			if (ret > 0) {
				
				setCurUpriAmt(hdr, dtlL);
				
				crtSloDWk(dtlL);
				
				setAllocWaitQty(dtlL);
				
				setRemAbortAbl(dtlL);
				
				calcProfRate(hdr, dtlL);
			}
			
			return ret;
		}

		/**
		 * 取引通貨金額、基準通貨金額、納税通貨金額を設定する。
		 * @param hdr 受注ヘッダ
		 * @param dtlL 受注明細
		 */
		protected void setCurUpriAmt(Rslt_HdrR hdr, MCList<Rslt_DtlR> dtlL) {
			
			for (Rslt_DtlR dtlR : dtlL) {
				// 基準通貨に換算
				dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdr.xrate(),
						hdr.base_cur_upri_dec_place(), hdr.xrate_rnd_typ()));
				dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdr.xrate(),
						hdr.base_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
				dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdr.xrate(),
						hdr.base_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
				dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdr.xrate(),
						hdr.base_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
				
				// 納税通貨に換算
				if (!isNull(hdr.ptax_cur_cd())) {
					dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdr.ptax_xrate(),
							hdr.ptax_cur_upri_dec_place(), hdr.xrate_rnd_typ()));
					dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdr.ptax_xrate(),
							hdr.ptax_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
					dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdr.ptax_xrate(),
							hdr.ptax_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
					dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdr.ptax_xrate(),
							hdr.ptax_cur_amt_dec_place(), hdr.xrate_rnd_typ()));
				}
			}

			hdr.trd_cur_amt(dtlL.sum(Rslt_DtlR.$trd_cur_amt));
			hdr.trd_cur_inc_tax_amt(dtlL.sum(Rslt_DtlR.$trd_cur_inc_tax_amt));
			
			hdr.xrate_cd(getCo().sls_xrate_cd());
		}
	}
	
	/**
	 * 受注明細のワークテーブルを作成する。
	 * @param dtlL 受注明細
	 */
	protected void crtSloDWk(MCList<Rslt_DtlR> dtlL) {

		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R sloDR = null;

		for (Rslt_DtlR rsltR : dtlL.groupBy(Rslt_DtlR.$slo_d_no)) {

			if (!isNull(rsltR.slo_d_no())) {

				sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(rsltR.slo_d_no());

				sloDL.add(sloDR);
			}
		}
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
		dbWkDelete("MSBBL1210_MSW_SLO_D_D01", sloDL_bldr.getBaseDbc());
		dbWkInsert("MSBBL1210_MSW_SLO_D_I01", sloDL, sloDL_bldr.getBaseDbc());
	}

	/**
	 * 引当数・保留数を設定する。
	 * @param dtlL 受注明細
	 */
	protected void setAllocWaitQty(MCList<Rslt_DtlR> dtlL) {
		
		MCList<Rslt_DtlR> rsltL = MCList.create(Rslt_DtlR.class);
		executeQuery(rsltL, MSBBL1210_MST_SHIP_SCHD_S01());
		
		MCIndexKey idxkey = rsltL.createIndex(Rslt_DtlR.$slo_d_no);
		
		for (Rslt_DtlR downR : dtlL) {
			
			Rslt_DtlR rsltR = rsltL.getFirst(idxkey, downR.slo_d_no());
			
			if (!isNull(rsltR)) {
				
				downR.alloc_qty(nvl(rsltR.alloc_qty(), MCNumber.ZERO));
				downR.wait_qty(nvl(rsltR.wait_qty(), MCNumber.ZERO));
				downR.not_dt_calc_flg(rsltR.not_dt_calc_flg());
			}
			else {
				
				downR.alloc_qty(0);
				downR.wait_qty(0);
				downR.not_dt_calc_flg(false);
			}
			downR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp( downR.alloc_typ(), downR.ship_pr_base_unit_qty(), 
					downR.alloc_qty(), downR.ship_schd_abort_qty(), false));
		}
	}
	protected void setRemAbortAbl(MCList<Rslt_DtlR> dtlL) {
		
		MCList<Rslt_DtlR> rsltL = MCList.create(Rslt_DtlR.class);
		rsltL.addStringColumn("sls_act_d_no");
		executeQuery(rsltL, MSBBL1210_MST_SHIP_SCHD_S02());
		
		MCIndexKey idxkey = rsltL.createIndex(Rslt_DtlR.$slo_d_no);
		MCList<Rslt_DtlR> schdL = MCList.create(Rslt_DtlR.class);
		
		for (Rslt_DtlR r : dtlL) {
			
			if (isNotTrnst(r)) {
				continue;
			}
			if (isAbortRet(r)) {
				continue;
			}
			
			MCList<Rslt_DtlR> shipSchdL = rsltL.subList(idxkey, r.slo_d_no());
			schdL = getRemAbortList(r, shipSchdL);
			
			if (schdL.size() > 0) {
				r.rem_abort_flg(true);
				r.rem_abort_qty(schdL.sum(Rslt_DtlR.$rem_abort_qty));
			}
		}
	}
	protected MCList<Rslt_DtlR> getRemAbortList(Rslt_DtlR r, MCList<Rslt_DtlR> shipSchdL) {
		
		MCList<Rslt_DtlR> schdL = MCList.create(Rslt_DtlR.class);
		
		for (Rslt_DtlR shipSchdR : shipSchdL) {
			
			if (isRemAbortNotEnable(shipSchdR)) {
				continue;
			}
			
			shipSchdR.rem_abort_qty(shipSchdR.base_unit_qty().subtract(shipSchdR.sls_qty()));
			schdL.add(shipSchdR);
		}
		
		return schdL;
	}
	
	protected boolean isNotTrnst(Rslt_DtlR r) {
		
		return isSame(r.ship_inst_qty(), MCNumber.ZERO) && isSame(r.ship_act_qty(), MCNumber.ZERO) 
				&& isSame(r.sls_qty(), MCNumber.ZERO) && isSame(r.iv_schd_qty(), MCNumber.ZERO)
				&& isSame(r.ship_schd_abort_qty(), MCNumber.ZERO) && isSame(r.sls_schd_abort_qty(), MCNumber.ZERO);

	}
	
	protected boolean isAbortRet(Rslt_DtlR r) {
		
		return isSame(r.ship_schd_abort_qty(), r.base_unit_qty()) 
				&& isSame(r.sls_schd_abort_qty(), r.base_unit_qty());
	}
	
	protected boolean isRemAbortNotEnable(Rslt_DtlR shipSchdR) {
		
		return  (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0))
				|| (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
				|| (((!isNull(shipSchdR.sls_qty()) && shipSchdR.sls_qty().gt(0))
						|| (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0)))
								&& (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
								&& !isNull(shipSchdR.getString("sls_act_d_no")))
				|| (!isNull(shipSchdR.iv_schd_qty()) && shipSchdR.iv_schd_qty().gt(0));

	}

	/**
	 * 	与信サービスの呼出
	 * <p>
	 * 	与信サービス.与信枠残高取得(MSBGL5080.Cred_Srch01)にて与信枠残高を取得し<br>
	 * 	取得結果を引数のコンテナに格納する
	 * </p>
	 * @param hdr Srch01_HdrR
	 */
	protected void callCredSvSrch01(Rslt_HdrR hdr) {

		MSBGL_CredService.Cred_Srch01 ope = MSBGL_CredService.crtCred_Srch01();
		ope.up0().cst_cd(hdr.cst_cd());
		ope.up0().cur_cd(hdr.trd_cur_cd());
		ope.up0().setAttributes(hdr);
		ope.exec();
		hdr.cred_bal(ope.down0().cred_bal());
	}

	/**
	 * 粗利率に関連する項目を設定する。
	 * @param hdr 受注ヘッダ
	 * @param dtlL 受注明細
	 */
	protected void calcProfRate(Rslt_HdrR hdr, MCList<Rslt_DtlR> dtlL) {
		
		MCNumber trdCurAmt = null;
		MCNumber ttlAmt = null;
		MCNumber ttlAmtNoCost = null;
		MCNumber baseCurTtlAmt = null;
		MCNumber costAmt = null;
		MCNumber trdCurIncTaxAmt = null;
		
		for (Rslt_DtlR dtlR : dtlL) {
			
			if (isNull(dtlR.trd_cur_amt()) || (dtlR.abort_flg() && !dtlR.rem_abort_flg()) || !isNull(dtlR.bd_dpt_cd())) {
				continue;
			}
			
			MCNumber trd_cur_amt = dtlR.trd_cur_amt();
			MCNumber baseCurAmt = dtlR.base_cur_amt();
			MCNumber cost_amt = dtlR.cost_amt();
			MCNumber trdIncTaxAmt = dtlR.trd_cur_inc_tax_amt();
			if(dtlR.abort_flg() && dtlR.rem_abort_flg()) {
				MCNumber baseUnitQty = dtlR.base_unit_qty().subtract(dtlR.rem_abort_qty());
				MCNumber trdUnitQty = rvrsBaseUnitConv(baseUnitQty,
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ());
				
				MCNumber remAbortDscntAmt = MCNumber.ZERO;
				if (!isNull(dtlR.trd_cur_dscnt_amt())) {
					remAbortDscntAmt = dtlR.trd_cur_dscnt_amt().multiply(baseUnitQty)
							.divide(dtlR.base_unit_qty(), hdr.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(hdr.sls_amt_rnd_typ()));
				}
				
				MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(dtlR.trd_cur_upri(), trdUnitQty,
						dtlR.tax_rate(), dtlR.inc_tax_flg(), hdr.trd_cur_amt_dec_place(),
						hdr.sls_amt_rnd_typ(), hdr.sls_tax_rnd_typ(),
						remAbortDscntAmt);
				trd_cur_amt = amtR.getNumber("amt");
				trdIncTaxAmt = amtR.getNumber("inc_tax_amt");
				cost_amt = MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), baseUnitQty,
						hdr.base_cur_amt_dec_place());
				baseCurAmt = convToBaseCur(trd_cur_amt, hdr.xrate(),
						hdr.base_cur_amt_dec_place(), hdr.xrate_rnd_typ());
			}
			if (dtlR.dscnt_itm_flg()) {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).subtract(trd_cur_amt);
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).subtract(trdIncTaxAmt);
			}
			else {
				
				trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).add(trd_cur_amt);
				trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).add(trdIncTaxAmt);
				if (!isNull(dtlR.cost_upri())) {
					
					ttlAmt = nvl(ttlAmt, MCNumber.ZERO).add(trd_cur_amt);
					baseCurTtlAmt = nvl(baseCurTtlAmt, MCNumber.ZERO).add(baseCurAmt);
					costAmt = nvl(costAmt, MCNumber.ZERO).add(cost_amt);
				}
			}
			
			dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(baseCurAmt, cost_amt));
		}
		
		if (!isNull(trdCurAmt)) {
			ttlAmtNoCost = trdCurAmt.subtract(nvl(ttlAmt, MCNumber.ZERO));
		}
		
		hdr.trd_cur_amt(trdCurAmt);
		hdr.trd_cur_inc_tax_amt(trdCurIncTaxAmt);
		hdr.ttl_amt(ttlAmt);
		hdr.ttl_amt_no_cost(ttlAmtNoCost);
		hdr.prof_rate(MSUCL_SlsUtil.getProfRate(baseCurTtlAmt, costAmt));
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 見積情報を検索する<br>
	 */
	public class Srch02 extends MSBBL_SloReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUpCnd();
			
			getQtn();
			
			if (!down0().isEmpty()) {
				
				callCredSvSrch01(down0());
				
				getQtnD();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			if (!down0().isEmpty()) {
				
				setDefaultVal();
				
				calcUpriAmt();
				
				calcProfRate(down0(), down1());
			}
		}
		
		/**
		 * 検索条件の編集
		 */
		protected void editUpCnd() {
			
			up0().setDateNE("today", getToday());
		}
		
		/**
		 * 見積情報を取得する。
		 */
		protected void getQtn() {

			executeQuery(down0(), MSBBL1210_MST_QTN_S01(), up0());
		}
		
		/**
		 * 見積明細情報を取得する。
		 */
		protected void getQtnD() {

			executeQuery(down1(), MSBBL1210_MST_QTN_D_S01(), up0());
			
			if (down1().isEmpty()) {
				
				down0().clear();
			}
		}
		
		/**
		 * 初期値を設定する。
		 */
		protected void setDefaultVal() {

			if (isNull(down0().sls_basis_typ())) {
				down0().sls_basis_typ(getCo().sls_basis_typ());
			}
			
			// 見積時に格付が指定してない場合、デフォルト格付を設定する。
			for (Rslt_DtlR dtlR : down1()) {
				if (isNull(dtlR.gd_cd())) {
					
					dtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					dtlR.gd_nm(getDefaultFeedStkGd().gd_nm());
				}
				
				if (!dtlR.inc_tax_flg() && !dtlR.tax_fix_flg() && !isSame(dtlR.tax_cd(), dtlR.new_tax_cd())) {
					// 最新税情報の設定
					dtlR.tax_cd(dtlR.new_tax_cd());
					dtlR.tax_nm(dtlR.new_tax_nm());
					dtlR.tax_rate(dtlR.new_tax_rate());
					dtlR.inc_tax_flg(dtlR.new_inc_tax_flg());
				}
			}
		}
		
		/**
		 * 単価及金額を計算する。
		 */
		protected void calcUpriAmt() {
			
			down0().xrate_cd(getCo().sls_xrate_cd());
			down0().base_cur_cd(getBaseCur().cur_cd());
			down0().base_cur_nm(getBaseCur().cur_nm());
			down0().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			down0().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			
			down0().ptax_cur_cd(getPtaxCur().cur_cd());
			down0().ptax_cur_nm(getPtaxCur().cur_nm());
			down0().ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
			down0().ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
			down0().xrate_rnd_typ(getCo().xrate_rnd_typ());
			down0().wtax_rnd_typ(getCo().wtax_rnd_typ());
			
			for (Rslt_DtlR dtlR : down1()) {
				
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(), dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
				
				if (!isNull(dtlR.init_schd_dscnt_amt())) {
					MCNumber tmpDscntAmt = MAUCL_AmtUtil.getAmt(dtlR.init_schd_dscnt_amt(), dtlR.base_unit_qty().divide(dtlR.init_schd_qty()),
							down0().trd_cur_amt_dec_place(), down0().sls_amt_rnd_typ());
					dtlR.trd_cur_dscnt_amt(tmpDscntAmt);
				}
				
				MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
						dtlR.trd_cur_upri(), 
						dtlR.trd_unit_qty(),
						dtlR.tax_rate(), 
						dtlR.inc_tax_flg(), 
						down0().trd_cur_amt_dec_place(),
						down0().sls_amt_rnd_typ(), 
						down0().sls_tax_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());

				dtlR.trd_cur_amt(amtR.getNumber("amt"));
				dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
				dtlR.trd_cur_inc_tax_amt(amtR.getNumber("inc_tax_amt"));
				
				dtlR.iv_upri(dtlR.trd_cur_upri());
				dtlR.iv_amt(dtlR.trd_cur_amt());
			
				dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), down0().xrate(), down0().base_cur_upri_dec_place(), down0().xrate_rnd_typ()));
				dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				
				dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), down0().ptax_xrate(), down0().ptax_cur_upri_dec_place(), down0().xrate_rnd_typ()));
				dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), down0().ptax_xrate(), down0().ptax_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), down0().ptax_xrate(), down0().ptax_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), down0().ptax_xrate(), down0().ptax_cur_amt_dec_place(), down0().xrate_rnd_typ()));
				
				dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), down0().base_cur_amt_dec_place()));
				
				if (isSame(down0().trd_cur_cd(), down0().base_cur_cd()) 
						&& (isSame(down0().trd_cur_cd(), down0().ptax_cur_cd()) || isNull(down0().ptax_cur_cd()))) {
					// 取引通貨＝基準通貨＝納税通貨」、もしくは「取引通貨＝基準通貨かつ納税通貨IS NULL
					if (!isNull(dtlR.wtax_rate())) {
						dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate()).divide(100,
								down0().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(down0().wtax_rnd_typ())));
					}
				}
				else {
					dtlR.wtax_rate(null); // 通貨の条件を満たさない場合は、マスタから取得できた源泉税率をクリアする
				}
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 受注情報を新規登録する<br>
	 */
	public class Ins01 extends MSBBL_SloReg_MC_A.Ins01 {

		protected MSBBL_SloRegService.Slo_Chk01 _chk01Serv = null;

		MSBBL_SloRegService.Slo_Ins01 _ins01Serv = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			
			callSloServiceChk01();
			
			throwUpdErr();
			
			callSloServiceIns01();
			
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			
			setPegNo(up0());
			setPegNo(up1());
		}
		
		@Override
		protected void doEditDown(MCContainer container) {
			super.doEditDown(container);
			doCompTime(container, false);
		}

		protected void callSloServiceChk01() {
			
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			for (Slo_Upd01_DtlR dtlR : up1()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}

			_chk01Serv = MSBBL_SloRegService.crtSlo_Chk01();
			_chk01Serv.up0().add(up0());
			
			_chk01Serv.up1().setAll(up1());
			_chk01Serv.up1().setValueNE(Slo_Upd01_DtlR.$hdr_peg_no, up0().peg_no());
			
			_chk01Serv.exec();
		}

		protected void callSloServiceIns01() {

			_ins01Serv = MSBBL_SloRegService.crtSlo_Ins01();
			_ins01Serv.up0().setAll(_chk01Serv.down0());
			_ins01Serv.up1().setAll(_chk01Serv.down1());

			_ins01Serv.exec();
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			copy(down0(), _ins01Serv.down0().get(0), createMap_Rslt_HdrR_Slo_Ins01_Rslt_HdrR());
			
			down0().cst_cd(up0().cst_cd());
			down0().trd_cur_cd(up0().trd_cur_cd());
			
			callCredSvSrch01(down0());
			
			srchSlo(down0(), down1(), _ins01Serv.down1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注情報を訂正する<br>
	 */
	public class Upd01 extends MSBBL_SloReg_MC_A.Upd01 {

		protected MSBBL_SloRegService.Slo_Chk01 _chk01Serv = null;

		MSBBL_SloRegService.Slo_Upd01 _upd01Serv = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			
			callSloServiceChk01();
			
			throwUpdErr();
			
			callSloServiceUpd01();
			
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			
			setPegNo(up0());
			setPegNo(up1());
		}
		
		@Override
		protected void doEditDown(MCContainer container) {
			super.doEditDown(container);
			doCompTime(container, false);
		}
		
		protected void callSloServiceChk01() {
			
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			for (Slo_Upd01_DtlR dtlR : up1()) {
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				if (dtlR.isStatusModify()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			_chk01Serv = MSBBL_SloRegService.crtSlo_Chk01();
			_chk01Serv.up0().add(up0());
			
			_chk01Serv.up1().setAll(up1());
			_chk01Serv.up1().setValueNE(Slo_Upd01_DtlR.$hdr_peg_no, up0().peg_no());

			_chk01Serv.exec();
		}

		protected void callSloServiceUpd01() {

			_upd01Serv = MSBBL_SloRegService.crtSlo_Upd01();
			_upd01Serv.up0().setAll(_chk01Serv.down0());
			_upd01Serv.up1().setAll(_chk01Serv.down1());

			_upd01Serv.exec();
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			copy(down0(), _upd01Serv.down0().get(0), createMap_Rslt_HdrR_Slo_Ins01_Rslt_HdrR());
			
			down0().cst_cd(up0().cst_cd());
			down0().trd_cur_cd(up0().trd_cur_cd());
			
			callCredSvSrch01(down0());
			
			srchSlo(down0(), down1(), _upd01Serv.down1());
		}
	}
	
	/**
	 * 受注を検索する。
	 * @param hdrR 受注ヘッダ
	 * @param dtlL 受注明細
	 * @param servSloDRsltL 受注登録サービスの下り電文
	 */
	protected void srchSlo(Rslt_HdrR hdrR, MCList<Rslt_DtlR> dtlL, MCList<Slo_Ins01_Rslt_DtlR> servSloDRsltL) {
		
		Srch01_CndR cndR = Srch01_CndR.create();
		cndR.slo_no(hdrR.slo_no());
		
		MCList<Rslt_DtlR> sloDL = MCList.create(Rslt_DtlR.class);
		
		executeQuery(sloDL, MSBBL1210_MST_SLO_D_S02(), cndR);
		
		crtSloDWk(sloDL);
		
		setAllocWaitQty(sloDL);
		
		MCIndexKey idxkey = sloDL.createIndex(Rslt_DtlR.$slo_d_no);
		
		Rslt_DtlR downR = null;
		for (Slo_Ins01_Rslt_DtlR dtlR : servSloDRsltL) {
			
			downR = sloDL.getFirst(idxkey, dtlR.slo_d_no());
			
			if (isNull(downR) || downR.isEmpty()) {
				downR = Rslt_DtlR.create();
			}
			
			downR.setAttributes(dtlR);
			downR.str_ln_cd_none_flg(dtlR.str_ln_cd_none_flg());
			
			dtlL.add(downR);
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価再取得を行う<br>
	 */
	public class Sprt01 extends MSBBL_SloReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callSlsUpriSvSprt01();
			
			setDown();
		}

		/**
		 * 	単価再取得サービスの呼出
		 */
		protected void callSlsUpriSvSprt01() {

			mapUpContainers(CALL_OPE);
			sprt01.up0().setColumnValue(SlsUpri_Sprt01_DtlR.$std_upri_wg_cd, SlsUpri_Sprt01_DtlR.$wg_cd);

			sprt01.exec();

			// mapDownContaiersを呼ぶと属性(呼出元のGUIIndex)が上書きされるため呼ばない
			String[] destCols = new String[] {
				Sprt01_DtlR.$sls_upri, Sprt01_DtlR.$interim_flg, Sprt01_DtlR.$cost_upri
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg, SlsUpri_Sprt01_DtlR.$std_upri,
			};
			copyByPegNo(up0(), destCols, sprt01_down0, srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$sls_upri_flg, true);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$std_upri_flg, true);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected Map_Rslt_HdrR_Slo_Ins01_Rslt_HdrR<Rslt_HdrR,Slo_Ins01_Rslt_HdrR> createMap_Rslt_HdrR_Slo_Ins01_Rslt_HdrR() {
		return new Map_Rslt_HdrR_Slo_Ins01_Rslt_HdrR<Rslt_HdrR, Slo_Ins01_Rslt_HdrR>();
	}

	public class Map_Rslt_HdrR_Slo_Ins01_Rslt_HdrR<D extends Rslt_HdrR, S extends Slo_Ins01_Rslt_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Rslt_HdrR.$slo_no, Slo_Ins01_Rslt_HdrR.$slo_no);
			addColumnPathMap(Rslt_HdrR.$slo_rev, Slo_Ins01_Rslt_HdrR.$slo_rev);
			addColumnPathMap(Rslt_HdrR.$aprv_flg, Slo_Ins01_Rslt_HdrR.$aprv_flg);
			addColumnPathMap(Rslt_HdrR.$aprv_no, Slo_Ins01_Rslt_HdrR.$aprv_no);
			addColumnPathMap(Rslt_HdrR.$aprv_sts_typ, Slo_Ins01_Rslt_HdrR.$aprv_sts_typ);
			addColumnPathMap(Rslt_HdrR.$aprv_sts_typ_nm, Slo_Ins01_Rslt_HdrR.$aprv_sts_typ_nm);
			addColumnPathMap(Rslt_HdrR.$aprv_upd_flg, Slo_Ins01_Rslt_HdrR.$aprv_upd_flg);
			addColumnPathMap(Rslt_HdrR.$aprv_can_flg, Slo_Ins01_Rslt_HdrR.$aprv_can_flg);
			addColumnPathMap(Rslt_HdrR.$iv_no, Slo_Ins01_Rslt_HdrR.$iv_no);

		}
	}

	//FMCB CUSTOM END
}