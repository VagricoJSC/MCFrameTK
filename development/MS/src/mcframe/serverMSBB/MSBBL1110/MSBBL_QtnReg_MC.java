package mcframe.serverMSBB.MSBBL1110;

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
import mcframe.serverMSBB.MSBBL6040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6090.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSBB.MSBBL1110.Query.*;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_QtnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_QtnReg_MC extends MSBBL_QtnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 見積を検索する。<br>
	 */
	public class Srch01 extends MSBBL_QtnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUpCnd();
			
			int cnt = getQtn();
			
			if (isSame(cnt, 0)) {
				return;
			}
			
			cnt = getQtnD();
			if (isSame(cnt, 0)) {
				down0().clear();
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			if (!down0().isEmpty()) {
				
				setBaseCur();
				
				setProfRate();
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
		protected int getQtn() {
			return executeQuery(down0(), MSBBL1110_MST_QTN_S01(), up0());
		}
		
		/**
		 * 見積明細情報を取得する。
		 */
		protected int getQtnD() {
			return executeQuery(down1(), MSBBL1110_MST_QTN_D_S01(), up0());
		}
		
		/**
		 * 基準通貨情報を設定する。
		 */
		protected void setBaseCur() {
			
			down0().xrate_cd(getCo().sls_xrate_cd());
			down0().base_cur_cd(getBaseCur().cur_cd());
			down0().base_cur_nm(getBaseCur().cur_nm());
			down0().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
			down0().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
			
			String rndTyp = getCo().xrate_rnd_typ();
			
			for (Srch01_DtlR dtlR : down1()) {
				
				dtlR.base_cur_std_sls_upri(convToBaseCur(dtlR.trd_cur_std_sls_upri(), down0().xrate(), down0().base_cur_upri_dec_place(), rndTyp));
				dtlR.base_cur_std_sls_amt(convToBaseCur(dtlR.trd_cur_std_sls_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
				dtlR.base_cur_std_sls_inc_tax_amt(convToBaseCur(dtlR.trd_cur_std_sls_inc_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
				dtlR.base_cur_std_sls_tax_amt(convToBaseCur(dtlR.trd_cur_std_sls_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
				dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), down0().xrate(), down0().base_cur_upri_dec_place(), rndTyp));
				dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
				dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
				dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), down0().xrate(), down0().base_cur_amt_dec_place(), rndTyp));
			}
		}
		
		/**
		 * 粗利率に関連する項目を設定する。
		 */
		protected void setProfRate() {
			
			MCNumber trdCurAmt = null;
			MCNumber ttlAmt = null;
			MCNumber ttlAmtNoCost = null;
			MCNumber baseCurTtlAmt = null;
			MCNumber costAmt = null;
			MCNumber trdCurIncTaxAmt = null;
			
			for (Srch01_DtlR dtlR : down1()) {
				
				if (isNull(dtlR.trd_cur_amt())) {
					continue;
				}
				
				if (dtlR.dscnt_itm_flg()) {
					
					trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_amt());
					trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).subtract(dtlR.trd_cur_inc_tax_amt());
				}
				else {
					
					trdCurAmt = nvl(trdCurAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
					trdCurIncTaxAmt = nvl(trdCurIncTaxAmt, MCNumber.ZERO).add(dtlR.trd_cur_inc_tax_amt());
					if (!isNull(dtlR.cost_upri())) {
						
						ttlAmt = nvl(ttlAmt, MCNumber.ZERO).add(dtlR.trd_cur_amt());
						baseCurTtlAmt = nvl(baseCurTtlAmt, MCNumber.ZERO).add(dtlR.base_cur_amt());
						costAmt = nvl(costAmt, MCNumber.ZERO).add(dtlR.cost_amt());
					}
				}
				
				dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
			}
			
			if (!isNull(trdCurAmt)) {
				ttlAmtNoCost = trdCurAmt.subtract(nvl(ttlAmt, MCNumber.ZERO));
			}
			
			down0().trd_cur_amt(trdCurAmt);
			down0().trd_cur_inc_tax_amt(trdCurIncTaxAmt);
			down0().ttl_amt(ttlAmt);
			down0().ttl_amt_no_cost(ttlAmtNoCost);
			down0().prof_rate(MSUCL_SlsUtil.getProfRate(baseCurTtlAmt, costAmt));
		}
	}
	
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 見積を新規登録する。<br>
	 */
	public class Ins01 extends MSBBL_QtnReg_MC_A.Ins01 {
				
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callQtnRegServiceChk01();
			
			throwUpdErr();
			
			callQtnRegServiceIns01();
			
			prntQtn();
			
			setDown();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up0());
			setPegNo(up1());
		}
		
		/**
		 * 見積登録サービスの更新前チェック処理を呼び出す。
		 */
		protected void callQtnRegServiceChk01() {
			
			MSBBL_QtnRegService.QtnReg_Chk01 ope = MSBBL_QtnRegService.crtQtnReg_Chk01();
			
			copyall(ope.up0(), up0());
			ope.up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			
			up1().setValue(DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			ope.up1().setAll(up1());
			
			ope.exec();
			
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 見積登録サービスの見積登録処理を呼び出す。
		 */
		protected void callQtnRegServiceIns01() {
			
			MSBBL_QtnRegService.QtnReg_Ins01 ope = MSBBL_QtnRegService.crtQtnReg_Ins01();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			
			ope.exec();

			up0().qtn_no(ope.down0().qtn_no());
			up0().qtn_rev(ope.down0().qtn_rev());
			up0().aprv_flg(ope.down0().aprv_flg());
			up0().aprv_no(ope.down0().aprv_no());
			up0().aprv_sts_typ(ope.down0().aprv_sts_typ());
			
			String[] destCols = new String[] {DtlR.$qtn_d_no, DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4, DtlR.$disp_seq};
			String[] srcCols = new String[] {DtlR.$qtn_d_no, DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4, DtlR.$disp_seq};
			copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			
		}
		
		/**
		 * 見積書を発行する。
		 */
		protected void prntQtn() {
			
			if (up0().qtn_out_flg() 
					&& !MSC_QTN_TYP.isCREATING(up0().qtn_typ())
					&& (!up0().aprv_flg() || MAC_APRV_STS_TYP.isACPT(up0().aprv_sts_typ()))) {
				
				Qtn_Prnt01_HdrR prntHdrR = Qtn_Prnt01_HdrR.create();
				prntHdrR.qtn_no(up0().qtn_no());
				prntHdrR.qtn_rev(up0().qtn_rev());
				prntHdrR.qtn_prnt_seq(MCNumber.ZERO);
				
				callQtnPrntServicePrnt01(prntHdrR);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 見積を訂正する。<br>
	 */
	public class Upd01 extends MSBBL_QtnReg_MC_A.Upd01 {
				
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callQtnRegServiceChk01();
			
		    throwUpdErr();
		    
		    callQtnRegServiceUpd01();
		    
		    prntQtn();
		    
		    setDown();
	    }
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up0());
			setPegNo(up1());
		}
		
		/**
		 * 見積登録サービスの更新前チェック処理を呼び出す。
		 */
		protected void callQtnRegServiceChk01() {
			
			MSBBL_QtnRegService.QtnReg_Chk01 ope = MSBBL_QtnRegService.crtQtnReg_Chk01();
			
			copyall(ope.up0(), up0());
			ope.up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			ope.up1().setAll(up1());
		    
			ope.exec();
			
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 見積登録サービスの見積更新処理を呼び出す。
		 */
		protected void callQtnRegServiceUpd01() {
			
			MSBBL_QtnRegService.QtnReg_Upd01 ope = MSBBL_QtnRegService.crtQtnReg_Upd01();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
		    
			ope.exec();
			
			up0().qtn_no(ope.down0().qtn_no());
			up0().qtn_rev(ope.down0().qtn_rev());
			up0().aprv_flg(ope.down0().aprv_flg());
			up0().aprv_no(ope.down0().aprv_no());
			up0().aprv_sts_typ(ope.down0().aprv_sts_typ());
			
			String[] destCols = new String[] {DtlR.$qtn_d_no, DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4, DtlR.$disp_seq};
			String[] srcCols = new String[] {DtlR.$qtn_d_no, DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4, DtlR.$disp_seq};
			copyByPegNo(up1(), destCols, ope.down1(), srcCols);
		}
		
		/**
		 * 見積書を発行する。
		 */
		protected void prntQtn() {
			
			if (up0().qtn_out_flg()
					&& !MSC_QTN_TYP.isCREATING(up0().qtn_typ())
					&& (!up0().aprv_flg() || MAC_APRV_STS_TYP.isACPT(up0().aprv_sts_typ()))) {
				
				Qtn_Prnt01_HdrR prntHdrR = Qtn_Prnt01_HdrR.create();
				prntHdrR.qtn_no(up0().qtn_no());
				prntHdrR.qtn_rev(up0().qtn_rev());
				prntHdrR.qtn_prnt_seq(up0().qtn_prnt_seq());
				
				callQtnPrntServicePrnt01(prntHdrR);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 見積を取消する。<br>
	 */
	public class Del01 extends MSBBL_QtnReg_MC_A.Del01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callQtnRegServiceChk02();
			
			throwCanErr();
		    
		    callQtnRegServiceDel01();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setPegNo(up0());
		}
		
		/**
		 * 見積登録サービスの削除前チェック処理を呼び出す。
		 */
		protected void callQtnRegServiceChk02() {
			
			MSBBL_QtnRegService.QtnReg_Chk02 ope = MSBBL_QtnRegService.crtQtnReg_Chk02();
			copyall(ope.up0(), up0()); 
		    
			ope.exec();
			
			copyall(up0(), ope.down0());
		}
		
		/**
		 * 見積登録サービスの見積削除処理を呼び出す。
		 */
		protected void callQtnRegServiceDel01() {
			
			MSBBL_QtnRegService.QtnReg_Del01 del01Serv = MSBBL_QtnRegService.crtQtnReg_Del01();
			copyall(del01Serv.up0(), up0());
		    
			del01Serv.exec();
		}
	}
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 見積書を発行する。<br>
	 */
	public class Prnt01 extends MSBBL_QtnReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callQtnPrntServicePrnt01(up0());
		}
	}
	
	/**
	 * 見積書発行サービスの帳票出力処理を呼び出す。
	 */
	protected void callQtnPrntServicePrnt01(Qtn_Prnt01_HdrR hdrR) {
		
		MSBBL_QtnPrntService.Qtn_Prnt01 ope = MSBBL_QtnPrntService.crtQtn_Prnt01();
		ope.up0().add(hdrR);
		ope.up1().indiv_prnt_flg(true);
		ope.exec();
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価再取得を行う。<br>
	 */
	public class Sprt01 extends MSBBL_QtnReg_MC_A.Sprt01 {
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
				Sprt01_DtlR.$std_sls_upri, Sprt01_DtlR.$interim_flg
			};
			String[] srcCols = new String[] {
				SlsUpri_Sprt01_DtlR.$std_sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg
			};
			copyByPegNo(up0(), destCols, sprt01_down0, srcCols);
		}

		@Override
		protected void up_CALL_OPE(MCList<SlsUpri_Sprt01_DtlR> dest0_0,
				MCList<Sprt01_DtlR> src_Sprt01_Dtl) {

			setPegNo(up0());
			super.up_CALL_OPE(dest0_0, src_Sprt01_Dtl);
			dest0_0.setBoolean(SlsUpri_Sprt01_DtlR.$std_sls_upri_flg, true);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}