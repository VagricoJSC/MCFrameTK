package mcframe.serverMSBH.MSBHL5140;

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
import mcframe.serverMSBH.MSBHL5140.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_BillRecvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_BillRecvReg_MC extends MSBHL_BillRecvReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * BillRcpt_Chk01オペレーション.<p>
	 *
	 * 受領した請求を登録する前のチェックをする<br>
	 */
	public class BillRcpt_Chk01 extends MSBHL_BillRecvReg_MC_A.BillRcpt_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkDecPlace());
			return msgL;
		}
		
		/**
		 * 有効桁数チェック
		 * @return
		 */
		protected MCMessageList chkDecPlace() {
			//有効桁数チェック
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_HdrR> notErrHdrL = getChkList(up0());
			MCList<Chk01_DtlR> notErrDtlL = getChkList(up1());
			copyDecPlace(notErrHdrL,notErrDtlL);
			
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$last_bill_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$rcv_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$sw_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$bfw_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$setoff_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$sls_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$dscnt_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$ret_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$tax_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$sw_to_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$bill_amt));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt1));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt2));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt3));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt4));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt5));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt6));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt7));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt8));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt9));
			msgL.addAll(checkDecPlace(notErrHdrL, Chk01_HdrR.$trd_cur_amt_dec_place,Chk01_HdrR.$pay_schd_amt10));
		
			msgL.addAll(checkDecPlace(notErrDtlL, Chk01_DtlR.$trd_unit_dec_place,Chk01_DtlR.$trd_unit_qty));
			msgL.addAll(checkDecPlace(notErrDtlL, Chk01_DtlR.$trd_cur_amt_dec_place,Chk01_DtlR.$trd_cur_amt));
			msgL.addAll(checkDecPlace(notErrDtlL, Chk01_DtlR.$trd_cur_amt_dec_place,Chk01_DtlR.$trd_cur_dscnt_amt));
			msgL.addAll(checkDecPlace(notErrDtlL, Chk01_DtlR.$trd_cur_amt_dec_place,Chk01_DtlR.$trd_cur_tax_amt));
			msgL.addAll(checkDecPlace(notErrDtlL, Chk01_DtlR.$trd_cur_upri_dec_place,Chk01_DtlR.$trd_cur_upri));
			
			return msgL;
		}
		
		/**
		 * Chk01_HdrRがリストロジックで取得した取引金額小数部有効桁数・取引単価小数部有効桁数をChk01_DtlRにコピーする
		 */
		protected void copyDecPlace(MCList<Chk01_HdrR> notErrHdrL,MCList<Chk01_DtlR> notErrDtlL) {
			for(Chk01_HdrR notErrHdrR:notErrHdrL) {
				for(Chk01_DtlR notErrDtrR: notErrDtlL) {
					notErrDtrR.trd_cur_amt_dec_place(notErrHdrR.trd_cur_amt_dec_place());
					notErrDtrR.trd_cur_upri_dec_place(notErrHdrR.trd_cur_upri_dec_place());
				}
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	/**
	 * BillRcpt_Ins01オペレーション.<p>
	 *
	 * 受領した請求を登録する<br>
	 */
	public class BillRcpt_Ins01 extends MSBHL_BillRecvReg_MC_A.BillRcpt_Ins01 {
		MCList<Chk01_HdrR> _notErrHdrL;
		MCList<Chk01_DtlR> _notErrDtlL;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			//チェック処理
			setNotErr();
			
			//発番
			setupNo();
			
			//請求情報登録
			insBill();
			
			//下り電文設定
			setDown();
		}
		
		/**
		 * エラーFLGがオフの行をセットする
		 * return
		 */
		protected void setNotErr() {
			_notErrHdrL = getChkList(up0());
			_notErrDtlL = getChkList(up1());
		}
		/**
		 * 発番システム区分を設定する
		 * return
		 */
		protected void setupNo() {
			setHdrNo();
			setDtlNo();
		}
		/**
		 * 請求情報登録
		 * return
		 */
		protected void insBill() {
			updInvalidFlg();
			insBillHdr();
			insBillDtl();
		}
		
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up1());
		}
		
		protected void setHdrNo() {
			doSeqCache(MSC_NUM_SYS_TYP.BILLRCPT, _notErrHdrL.size());
			for(Chk01_HdrR hdrR : _notErrHdrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					hdrR.bill_rcpt_no(getStrSeq(MSC_NUM_SYS_TYP.BILLRCPT));
				}
			}
		}
		protected void setDtlNo() {
			MCIndexKey hdrNoKey = _notErrHdrL.createIndex(Chk01_HdrR.$peg_no);
			doSeqCache(MSC_NUM_SYS_TYP.BILLRCPTD, _notErrDtlL.size());
			for(Chk01_DtlR dtlR : _notErrDtlL) {
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlR.bill_rcpt_d_no(getStrSeq(MSC_NUM_SYS_TYP.BILLRCPTD));
					
					//ヘッダの請求受領NOを紐づける
					MCList<Chk01_HdrR> hdrL = _notErrHdrL.subList(hdrNoKey,dtlR.hdr_peg_no());
					dtlR.bill_rcpt_no(hdrL.get(0).bill_rcpt_no());
				}
			}
		}
		/**
		 * 請求元、請求書ＮＯをキーとして過去の請求受領ヘッダの無効フラグをオンに更新する
		 */
		protected void updInvalidFlg() {
			if(!isNull(_notErrHdrL)) {
				//請求受領ヘッダ検索
				MCList<MST_BILL_RCPT_R> resultBIllRcptL = srchTargetBillRcptS01();
				if(!isNull(resultBIllRcptL)) {
					MST_BILL_RCPT_R t = MST_BILL_RCPT_R.create("T");
					MCQueryApiBuilder updBillRcpt_bldr = MCQueryApiBuilder.create(t);
					resultBIllRcptL.forEach(r->r.invalid_flg(true));
					dbUpdateKey("MSBHL5140_MST_BILL_RCPT_U01",resultBIllRcptL,updBillRcpt_bldr);
				}
			}
			
		}
		
		protected MCList<MST_BILL_RCPT_R> srchTargetBillRcptS01(){
			//請求元ＣＤと請求ＮＯが一致する登録済みレコードを検索
			//請求元ＣＤ毎に登録処理が行われるため、請求元ＣＤと請求ＮＯはAND条件にする必要はない
			MCList<MST_BILL_RCPT_R> hdrL= MCList.create(MST_BILL_RCPT_R.class);
			MST_BILL_RCPT_R t = MST_BILL_RCPT_R.create("T");
			MCQueryApiBuilder billRcpt_bldr = MCQueryApiBuilder.create(t);
			billRcpt_bldr.setWhere(t.bill_src_cd.eq(bind("1")),_notErrHdrL.get(0).bill_src_cd());
			billRcpt_bldr.addWhereInWithAnd(t.bill_no,getBillNoInL(_notErrHdrL));
			dbSelect("MSBHL5140_MST_BILL_RCPT_S01",hdrL,billRcpt_bldr);
			
			return hdrL;
		}
		
		/**
		 * IN句用の請求ＮＯのリスト取得
		 * @param BillNoL
		 * @return 請求ＮＯリスト
		 */
		protected List<String> getBillNoInL(MCList<Chk01_HdrR> hdrL){
			List<String> billNoInL = new ArrayList<String>();
			for(Chk01_HdrR hdrR : hdrL) {
				billNoInL.add(hdrR.bill_no());
			}
			return billNoInL;
		}
		
		
		protected void insBillHdr() {
			MCList<MST_BILL_RCPT_R> billHdrL = MCList.create(MST_BILL_RCPT_R.class);
			
			for(Chk01_HdrR r : _notErrHdrL) {
				MST_BILL_RCPT_R billHdrR = MST_BILL_RCPT_R.create();
				copy(billHdrR, r, crateMap_MST_BILL_RCPT_R_Chk01_HdrR(null));
				billHdrL.add(billHdrR);
			}
			MCQueryApiBuilder billHdrL_bldr = MCQueryApiBuilder.create(MST_BILL_RCPT_R.create("T"));
			dbInsert("MSBHL5140_MST_BILL_RCPT_I01", billHdrL, billHdrL_bldr);
		}
		protected void insBillDtl() {
			MCList<MST_BILL_RCPT_D_R> billDtlL = MCList.create(MST_BILL_RCPT_D_R.class);
			
			for(Chk01_DtlR r : _notErrDtlL) {
				MST_BILL_RCPT_D_R billDtlR = MST_BILL_RCPT_D_R.create();
				copy(billDtlR, r, crateMap_MST_BILL_RCPT_D_R_Chk01_DtlR(null));
				billDtlL.add(billDtlR);
			}
			MCQueryApiBuilder billDtlL_bldr = MCQueryApiBuilder.create(MST_BILL_RCPT_D_R.create("T"));
			dbInsert("MSBHL5140_MST_BILL_RCPT_D_I01", billDtlL, billDtlL_bldr);
		}
	}
	
	//Mapper
	protected Map_MST_BILL_RCPT_R_Chk01_HdrR<MST_BILL_RCPT_R, Chk01_HdrR> crateMap_MST_BILL_RCPT_R_Chk01_HdrR(MST_BILL_RCPT_R orgBillRecptR){
		return new Map_MST_BILL_RCPT_R_Chk01_HdrR<MST_BILL_RCPT_R, Chk01_HdrR>(orgBillRecptR);
	}
	public class Map_MST_BILL_RCPT_R_Chk01_HdrR<D extends MST_BILL_RCPT_R, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		protected MST_BILL_RCPT_R _orgBillRcptR;
		
		public Map_MST_BILL_RCPT_R_Chk01_HdrR(MST_BILL_RCPT_R orgBillRcptR){
			_orgBillRcptR = orgBillRcptR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_RCPT_R.$invalid_flg, Chk01_HdrR.$invalid_flg);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_cl_dt, Chk01_HdrR.$bill_cl_dt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_dt, Chk01_HdrR.$bill_dt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_no, Chk01_HdrR.$bill_no);
			addColumnPathMap(MST_BILL_RCPT_R.$pre_bill_no, Chk01_HdrR.$pre_bill_no);
			addColumnPathMap(MST_BILL_RCPT_R.$pre_bill_dt, Chk01_HdrR.$pre_bill_dt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_st_dt, Chk01_HdrR.$bill_st_dt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_end_dt, Chk01_HdrR.$bill_end_dt);
			addColumnPathMap(MST_BILL_RCPT_R.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(MST_BILL_RCPT_R.$wrk_no, Chk01_HdrR.$wrk_no);
			addColumnPathMap(MST_BILL_RCPT_R.$wrk_nm, Chk01_HdrR.$wrk_nm);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_cd, Chk01_HdrR.$bill_src_cd);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_ein, Chk01_HdrR.$bill_src_ein);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_biz_co_no, Chk01_HdrR.$bill_src_biz_co_no);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_zip_cd, Chk01_HdrR.$bill_src_zip_cd);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_addr1, Chk01_HdrR.$bill_src_addr1);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_addr2, Chk01_HdrR.$bill_src_addr2);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_addr3, Chk01_HdrR.$bill_src_addr3);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_addr4, Chk01_HdrR.$bill_src_addr4);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_dpt, Chk01_HdrR.$bill_src_dpt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_src_tel, Chk01_HdrR.$bill_src_tel);
			addColumnPathMap(MST_BILL_RCPT_R.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_xrate, Chk01_HdrR.$bill_xrate);
			addColumnPathMap(MST_BILL_RCPT_R.$last_bill_amt, Chk01_HdrR.$last_bill_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$rcv_amt, Chk01_HdrR.$rcv_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$sw_amt, Chk01_HdrR.$sw_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$setoff_amt, Chk01_HdrR.$setoff_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$bfw_amt, Chk01_HdrR.$bfw_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$sls_amt, Chk01_HdrR.$sls_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$dscnt_amt, Chk01_HdrR.$dscnt_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$ret_amt, Chk01_HdrR.$ret_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_amt, Chk01_HdrR.$tax_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$sw_to_amt, Chk01_HdrR.$sw_to_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_amt, Chk01_HdrR.$bill_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate1, Chk01_HdrR.$tax_rate1);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt1, Chk01_HdrR.$tax_rate_sls_amt1);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt1, Chk01_HdrR.$tax_rate_tax_amt1);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt1, Chk01_HdrR.$tax_rate_base_tax_amt1);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate2, Chk01_HdrR.$tax_rate2);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt2, Chk01_HdrR.$tax_rate_sls_amt2);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt2, Chk01_HdrR.$tax_rate_tax_amt2);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt2, Chk01_HdrR.$tax_rate_base_tax_amt2);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate3, Chk01_HdrR.$tax_rate3);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt3, Chk01_HdrR.$tax_rate_sls_amt3);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt3, Chk01_HdrR.$tax_rate_tax_amt3);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt3, Chk01_HdrR.$tax_rate_base_tax_amt3);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate4, Chk01_HdrR.$tax_rate4);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt4, Chk01_HdrR.$tax_rate_sls_amt4);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt4, Chk01_HdrR.$tax_rate_tax_amt4);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt4, Chk01_HdrR.$tax_rate_base_tax_amt4);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate5, Chk01_HdrR.$tax_rate5);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt5, Chk01_HdrR.$tax_rate_sls_amt5);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt5, Chk01_HdrR.$tax_rate_tax_amt5);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt5, Chk01_HdrR.$tax_rate_base_tax_amt5);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate6, Chk01_HdrR.$tax_rate6);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt6, Chk01_HdrR.$tax_rate_sls_amt6);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt6, Chk01_HdrR.$tax_rate_tax_amt6);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt6, Chk01_HdrR.$tax_rate_base_tax_amt6);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate7, Chk01_HdrR.$tax_rate7);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt7, Chk01_HdrR.$tax_rate_sls_amt7);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt7, Chk01_HdrR.$tax_rate_tax_amt7);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt7, Chk01_HdrR.$tax_rate_base_tax_amt7);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate8, Chk01_HdrR.$tax_rate8);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt8, Chk01_HdrR.$tax_rate_sls_amt8);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt8, Chk01_HdrR.$tax_rate_tax_amt8);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt8, Chk01_HdrR.$tax_rate_base_tax_amt8);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate9, Chk01_HdrR.$tax_rate9);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt9, Chk01_HdrR.$tax_rate_sls_amt9);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt9, Chk01_HdrR.$tax_rate_tax_amt9);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt9, Chk01_HdrR.$tax_rate_base_tax_amt9);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate10, Chk01_HdrR.$tax_rate10);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_sls_amt10, Chk01_HdrR.$tax_rate_sls_amt10);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_tax_amt10, Chk01_HdrR.$tax_rate_tax_amt10);
			addColumnPathMap(MST_BILL_RCPT_R.$tax_rate_base_tax_amt10, Chk01_HdrR.$tax_rate_base_tax_amt10);
			addColumnPathMap(MST_BILL_RCPT_R.$adv_amt_bal, Chk01_HdrR.$adv_amt_bal);
			addColumnPathMap(MST_BILL_RCPT_R.$adv_amt, Chk01_HdrR.$adv_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$adv_setoff_amt, Chk01_HdrR.$adv_setoff_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$adv_setoff_tax_amt, Chk01_HdrR.$adv_setoff_tax_amt);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt1, Chk01_HdrR.$pay_schd_dt1);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt1, Chk01_HdrR.$pay_schd_amt1);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd1, Chk01_HdrR.$pay_mtd_cd1);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt2, Chk01_HdrR.$pay_schd_dt2);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt2, Chk01_HdrR.$pay_schd_amt2);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd2, Chk01_HdrR.$pay_mtd_cd2);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt3, Chk01_HdrR.$pay_schd_dt3);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt3, Chk01_HdrR.$pay_schd_amt3);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd3, Chk01_HdrR.$pay_mtd_cd3);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt4, Chk01_HdrR.$pay_schd_dt4);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt4, Chk01_HdrR.$pay_schd_amt4);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd4, Chk01_HdrR.$pay_mtd_cd4);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt5, Chk01_HdrR.$pay_schd_dt5);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt5, Chk01_HdrR.$pay_schd_amt5);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd5, Chk01_HdrR.$pay_mtd_cd5);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt6, Chk01_HdrR.$pay_schd_dt6);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt6, Chk01_HdrR.$pay_schd_amt6);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd6, Chk01_HdrR.$pay_mtd_cd6);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt7, Chk01_HdrR.$pay_schd_dt7);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt7, Chk01_HdrR.$pay_schd_amt7);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd7, Chk01_HdrR.$pay_mtd_cd7);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt8, Chk01_HdrR.$pay_schd_dt8);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt8, Chk01_HdrR.$pay_schd_amt8);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd8, Chk01_HdrR.$pay_mtd_cd8);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt9, Chk01_HdrR.$pay_schd_dt9);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt9, Chk01_HdrR.$pay_schd_amt9);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd9, Chk01_HdrR.$pay_mtd_cd9);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_dt10, Chk01_HdrR.$pay_schd_dt10);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_schd_amt10, Chk01_HdrR.$pay_schd_amt10);
			addColumnPathMap(MST_BILL_RCPT_R.$pay_mtd_cd10, Chk01_HdrR.$pay_mtd_cd10);
			addColumnPathMap(MST_BILL_RCPT_R.$bank_ac_cd, Chk01_HdrR.$bank_ac_cd);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_bcst_nm, Chk01_HdrR.$bill_bcst_nm);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_ein, Chk01_HdrR.$bill_ein);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_biz_co_no, Chk01_HdrR.$bill_biz_co_no);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_zip_cd, Chk01_HdrR.$bill_zip_cd);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_addr1, Chk01_HdrR.$bill_addr1);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_addr2, Chk01_HdrR.$bill_addr2);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_addr3, Chk01_HdrR.$bill_addr3);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_addr4, Chk01_HdrR.$bill_addr4);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_bcst_dpt, Chk01_HdrR.$bill_bcst_dpt);
			addColumnPathMap(MST_BILL_RCPT_R.$bill_tel, Chk01_HdrR.$bill_tel);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			dest.bill_rcpt_no(isNull(_orgBillRcptR) ? src.bill_rcpt_no() : _orgBillRcptR.bill_rcpt_no());
		}
	}
	
	protected Map_MST_BILL_RCPT_D_R_Chk01_DtlR<MST_BILL_RCPT_D_R, Chk01_DtlR> crateMap_MST_BILL_RCPT_D_R_Chk01_DtlR(MST_BILL_RCPT_D_R orgBillRecptDR){
		return new Map_MST_BILL_RCPT_D_R_Chk01_DtlR<MST_BILL_RCPT_D_R, Chk01_DtlR>(orgBillRecptDR);
	}
	public class Map_MST_BILL_RCPT_D_R_Chk01_DtlR<D extends MST_BILL_RCPT_D_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		protected MST_BILL_RCPT_D_R _orgBillRcptDR;
		
		public Map_MST_BILL_RCPT_D_R_Chk01_DtlR(MST_BILL_RCPT_D_R orgBillRcptDR){
			_orgBillRcptDR = orgBillRcptDR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_RCPT_D_R.$bill_rcpt_no, Chk01_DtlR.$bill_rcpt_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$bill_d_no, Chk01_DtlR.$bill_d_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_cd, Chk01_DtlR.$trd_cd);
			addColumnPathMap(MST_BILL_RCPT_D_R.$dlv_slip_no, Chk01_DtlR.$dlv_slip_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$ship_dlv_slip_no, Chk01_DtlR.$ship_dlv_slip_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$ship_dlv_slip_d_no, Chk01_DtlR.$ship_dlv_slip_d_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$act_no, Chk01_DtlR.$act_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$act_rev, Chk01_DtlR.$act_rev);
			addColumnPathMap(MST_BILL_RCPT_D_R.$act_d_no, Chk01_DtlR.$act_d_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(MST_BILL_RCPT_D_R.$ac_dt, Chk01_DtlR.$ac_dt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$dlv_dt, Chk01_DtlR.$dlv_dt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$rcv_dt, Chk01_DtlR.$rcv_dt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$bill_basis_dt, Chk01_DtlR.$bill_basis_dt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_BILL_RCPT_D_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_BILL_RCPT_D_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_BILL_RCPT_D_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_BILL_RCPT_D_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MST_BILL_RCPT_D_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MST_BILL_RCPT_D_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MST_BILL_RCPT_D_R.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_BILL_RCPT_D_R.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(MST_BILL_RCPT_D_R.$tax_rate, Chk01_DtlR.$tax_rate);
			addColumnPathMap(MST_BILL_RCPT_D_R.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_BILL_RCPT_D_R.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			dest.bill_rcpt_d_no(isNull(_orgBillRcptDR) ? src.bill_rcpt_d_no() : _orgBillRcptDR.bill_rcpt_d_no());
		}
	}

	//FMCB CUSTOM END
}