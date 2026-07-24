package mcframe.serverMSLA.MSLAL9930;

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
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import mcframe.commonMSLA.MSLAR2420.*;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverPF.dbc.*;
import mcframe.serverCore.resource.MCConst;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.nio.file.Files;
import java.io.IOException;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_IABillSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_IABillSendConvService_MC extends MSLAL_IABillSendConvService_MC_A{
	//FMCB CUSTOM START
	protected static final MCNumber TAX_0 = MCNumber.valueOf(0);
	protected static final MCNumber TAX_8 = MCNumber.valueOf(8);
	protected static final MCNumber TAX_10 = MCNumber.valueOf(10);

	//ファイル名の補完用に保持する情報
	protected static final String PREFIX_BILL_NO = "{BILL_NO}";
	protected static final String PREFIX_TRD_YMD = "{TRD_YMD}";
	protected static final String PREFIX_BP_CD = "{BP_CD}";
	protected static final String PREFIX_BP_NM = "{BP_NM}";
	protected static final String PREFIX_BILL_AMT = "{BILL_AMT}";
	
	protected static final String ISSUE_FILE_PER_BILL = "2";
	/**
	 * IABillSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class IABillSendConv_Conv01 extends MSLAL_IABillSendConvService_MC_A.IABillSendConv_Conv01 {
		protected List<String> _errMsgIds = new ArrayList<>();
		protected Map<String, String> _prefixStrMap = new LinkedHashMap<>();
		
		@Override
		protected void call() {
			initPrefixStrMap();
			checkIfPrtcl();
			super.call();
		}
		
		protected void initPrefixStrMap() {
			_prefixStrMap.put(PREFIX_BILL_NO, IABillHdrRowR.$bill_no);
			_prefixStrMap.put(PREFIX_TRD_YMD, IABillHdrRowR.$bill_dt);
			_prefixStrMap.put(PREFIX_BP_CD, IABillHdrRowR.$bill_rcpt_co_cd);
			_prefixStrMap.put(PREFIX_BP_NM, IABillHdrRowR.$bill_rcpt_co_nm);
			_prefixStrMap.put(PREFIX_BILL_AMT, IABillHdrRowR.$sum_bill_amt_inc_tax);
		}
		
		protected String[] getPrefixColsFrmRsrc() {
			List<String> prefixCols = new ArrayList<>();
			String extSysCd = up0().get(0).ext_sys_cd();
			String coCd = getCo().co_cd();
			String tgtNmBase = "MS.MSLAL9930.file_nm_prefix." + coCd + "." + extSysCd; 
			for (int i = 1; i <=  _prefixStrMap.size(); i++) {
				String tgtNm = tgtNmBase + "." + "prefix" + i;
				String prefixStr = MCConst.app.getString(tgtNm,null);
				if (isNull(prefixStr)) {
					break;
				}
				prefixCols.add(_prefixStrMap.get(prefixStr));
			}
			
			if (prefixCols.isEmpty()) {
				 prefixCols.addAll(new ArrayList<>(_prefixStrMap.values()));
			}
			
			return	prefixCols.toArray(new String[prefixCols.size()]);
		}
		
		protected void checkIfPrtcl() {
			SdrvDtlR upR = up0().get(0);
			ifPrtclMgr().init(upR.ext_sys_cd());
			String fileUseHeading = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FILE_USE_HEADING, upR.if_proc_typ());
			String sendFileGrp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, upR.if_proc_typ());
			if (!isValidIfPrtcl(fileUseHeading, sendFileGrp)) {
				_errMsgIds.add(MSLAL0763);
			}
		}
		
		protected boolean isValidIfPrtcl(String fileUseHeading, String sendFileGrp) {
			if (!isSame(fileUseHeading,"true")) {
				return false;
			}
			if (!isSame(sendFileGrp, ISSUE_FILE_PER_BILL)) {
				return false;
			}
			return true;
		}
		
		@Override
		protected void insSdrvIfWk(MCList<SdrvDtlR> dtlL) {
			//エラー情報が保持されている場合は例外をスローして後続処理を行わない
			if (!_errMsgIds.isEmpty()) {
				for (String msgId : _errMsgIds) {
					for (SdrvDtlR dtlR : dtlL) {
						MCMessagePool.add(dtlR, null, msgId, dtlR.if_proc_typ(), dtlR.ext_sys_cd(), dtlR.data_no());
					}
				}
				throw new MCAppException(MSLAL0764);
			}
			super.insSdrvIfWk(dtlL);
		}
		
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(IABillHdrRowR.class, MST_BILL_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_IABillPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_BILL_SEND_IF_R());
			_IfRptSet.setPrefixCols(getPrefixColsFrmRsrc());
		}
		
		@Override
		protected void preWrite() {
			super.preWrite();
			setExeStsNotExe();
			setExeStsSkp();
			setExeStsSkpForCalsel();
			cacheTargetBIllIfInfo();
		}

		/**
		 * 前回のスキップのデータがあれば未処理に戻す
		 */
		protected void setExeStsNotExe() {
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("BillSendIf");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(billSendIfR);
			List<MCNumber> dataNoL = up0().getNumber(SdrvDtlR.$data_no);
			
			billSendIfR.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dbc_bldr.setSet(billSendIfR.exe_sts_typ);
			dbc_bldr.addWhereInWithAnd(billSendIfR.data_no, dataNoL);
			dbc_bldr.addWhereWithAnd(billSendIfR.exe_sts_typ.eq(bind("1")),MAC_EXE_STS_TYP.SKP.value());
			dbUpdate("MSLAL9930_MST_BILL_SEND_IF_U01", billSendIfR, dbc_bldr);
		}
		
		/**
		 * 締解除以外（「先行請求書ＮＯなし」または「請求明細ＮＯあり」）かつ税ＣＤが未指定のレコードは送信ＩＦデータの実行状況区分をスキップに設定
		 */
		protected void setExeStsSkp() {
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("BillSendIf");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(billSendIfR);
			List<MCNumber> dataNoL = up0().getNumber(SdrvDtlR.$data_no);
			
			billSendIfR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
			dbc_bldr.setSet(billSendIfR.exe_sts_typ);
			dbc_bldr.addWhereInWithAnd(billSendIfR.data_no, dataNoL);
			dbc_bldr.addWhereWithAnd(billSendIfR.data_crud_typ.neq(bind("1")),MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(billSendIfR.tax_cd.isNull());
			dbc_bldr.addWhereWithAnd(billSendIfR.pre_bill_no.isNull().or(billSendIfR.bill_d_no.isNotNull()));
			dbUpdate("MSLAL9930_MST_BILL_SEND_IF_U02", billSendIfR, dbc_bldr);
		}
		
		/**
		 * 連携ＣＳＶが作成されないレコードのみで構成される請求書を取消した際は、連携ＣＳＶが作成されないように
		 * 送信ＩＦデータの実行状況区分をスキップに設定
		 */
		protected void setExeStsSkpForCalsel() {
			MCList<MST_BILL_SEND_IF_R> allPrevBillIf = fetchAllPrevBillIfL();
			if(allPrevBillIf.isEmpty()) {
				return;
			}
			
			//連携ＣＳＶが作成されないレコードのみで構成される請求書のみに絞る
			List<String> tgtBillNoL = getBillNoWithOnlyNullTaxCd(allPrevBillIf);
			if(tgtBillNoL.isEmpty()) {
				return;
			}
			
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("BillSendIf");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(billSendIfR);
			List<MCNumber> dataNoL = up0().getNumber(SdrvDtlR.$data_no);
			
			billSendIfR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
			dbc_bldr.setSet(billSendIfR.exe_sts_typ);
			dbc_bldr.addWhereInWithAnd(billSendIfR.data_no, dataNoL);
			dbc_bldr.addWhereInWithAnd(billSendIfR.pre_bill_no, tgtBillNoL);
			dbc_bldr.addWhereWithAnd(billSendIfR.data_crud_typ.neq(bind("1")),MAC_DATA_CRUD_TYP.DEL.value());
			dbUpdate("MSLAL9930_MST_BILL_SEND_IF_U03", billSendIfR, dbc_bldr);
		}
		/**
		 * 締解除レコードの先行請求書ＮＯと一致する直前の請求レコードを取得する
		 */
		protected MCList<MST_BILL_SEND_IF_R> fetchAllPrevBillIfL() {
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("BillSendIf");
			MST_BILL_SEND_IF_R billSendIfSub1R = MST_BILL_SEND_IF_R.create("BillSendIfSub1");
			MCList<MST_BILL_SEND_IF_R> billSendIfL = MCList.create(MST_BILL_SEND_IF_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(billSendIfR);
			
			dbc_bldr.setSelect(billSendIfR.data_no, billSendIfR.bill_no, billSendIfR.bill_d_no, billSendIfR.tax_cd);
			dbc_bldr.addWhereWithAnd(billSendIfR.pre_bill_no.isNull());
			dbc_bldr.addWhereWithAnd(
				billSendIfR.bill_no.in(
					subQuery()
					.select(billSendIfSub1R.pre_bill_no)
					.from(billSendIfSub1R)
					.where(billSendIfSub1R.data_no.in(bind("data_no"))
							.and(billSendIfSub1R.pre_bill_no.isNotNull())
						)
					)
			);
			dbSelect("MSLAL9930_MST_BILL_SEND_IF_S01",billSendIfL, dbc_bldr,up0());
			
			return billSendIfL;
		}
		
		/**
		 * 各請求書ＮＯに紐づく明細の税ＣＤが全てＮＵＬＬのレコードの請求書ＮＯを取得する
		 */
		protected List<String> getBillNoWithOnlyNullTaxCd(MCList<MST_BILL_SEND_IF_R> billSendIfAllL) {
			List<String> tgtBillNoL = new ArrayList<>();
			
			for(MCList<MST_BILL_SEND_IF_R> billSendIfL : billSendIfAllL.groupList(MST_BILL_SEND_IF_R.$bill_no)) {
				List<MST_BILL_SEND_IF_R> hasTaxCdL = billSendIfL.subList(r -> !isNull(r.tax_cd()));
				if(hasTaxCdL.isEmpty()) {
					tgtBillNoL.add(billSendIfL.get(0).bill_no());
				}
			}
			return tgtBillNoL;
		}
		protected MCList<MST_BILL_SEND_IF_R> _acDateRangeIfL = MCList.create(MST_BILL_SEND_IF_R.class);
		protected MCIndexKey _acDateRangeIfIdx = null;
		/**
		 * 請求期間開始日から請求期間終了日の間に明細の計上日が収まるように調整するため
		 * データNO（請求書の発行単位）毎に明細の計上日の最小と最大を取得
		 */
		protected void cacheTargetBIllIfInfo() {
			
			MCList<MST_BILL_SEND_IF_R> billSendIfL = MCList.create(MST_BILL_SEND_IF_R.class);
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("BillSendIf");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(billSendIfR);
			
			List<MCNumber> dataNoL = up0().getNumber(SdrvDtlR.$data_no);

			dbc_bldr.setSelect(billSendIfR.data_no);
			dbc_bldr.addMax(billSendIfR.ac_dt, "max_ac_date");
			dbc_bldr.addMin(billSendIfR.ac_dt, "min_ac_date");
			dbc_bldr.addWhereInWithAnd(billSendIfR.data_no, dataNoL);
			dbc_bldr.addWhereWithAnd(billSendIfR.exe_sts_typ.neq(bind("1")),MAC_EXE_STS_TYP.SKP.value());
			dbc_bldr.addWhereWithAnd(billSendIfR.data_crud_typ.neq(bind("1")),MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addGroupBy(billSendIfR.data_no);
			dbSelect("MSLAL9930_MST_BILL_SEND_IF_S02",billSendIfL, dbc_bldr,up0());
			
			_acDateRangeIfL.addAll(billSendIfL);
			_acDateRangeIfIdx = _acDateRangeIfL.createIndex(MST_BILL_SEND_IF_R.$data_no);
		}
		
		@Override
		protected void setDown0(MCList<SdrvDtlR> ifL, boolean isErr) {
			super.setDown0(ifL, isErr);
			editDown0(ifL, isErr);
		}
		
		public class Map_DtlR_MST_BILL_SEND_IF_R<D extends IABillHdrRowR, S extends MST_BILL_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IABillHdrRowR.$data_lno, MST_BILL_SEND_IF_R.$data_lno);
				addColumnPathMap(IABillHdrRowR.$data_no, MST_BILL_SEND_IF_R.$data_no);
				addColumnPathMap(IABillHdrRowR.$data_crud_typ, MST_BILL_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(IABillHdrRowR.$bill_no, MST_BILL_SEND_IF_R.$bill_no);
				addColumnPathMap(IABillHdrRowR.$bill_d_no, MST_BILL_SEND_IF_R.$bill_d_no);
				addColumnPathMap(IABillHdrRowR.$pre_bill_no, MST_BILL_SEND_IF_R.$pre_bill_no);
				addColumnPathMap(IABillHdrRowR.$iv_no, MST_BILL_SEND_IF_R.$iv_no);
				addColumnPathMap(IABillHdrRowR.$wrk_no, MST_BILL_SEND_IF_R.$wrk_no);
				addColumnPathMap(IABillHdrRowR.$wrk_nm, MST_BILL_SEND_IF_R.$wrk_nm);
				addColumnPathMap(IABillHdrRowR.$bill_co_cd, MST_BILL_SEND_IF_R.$if_co_cd);
				addColumnPathMap(IABillHdrRowR.$bill_co_nm, MST_BILL_SEND_IF_R.$co_nm);
				addColumnPathMap(IABillHdrRowR.$bill_co_ein, MST_BILL_SEND_IF_R.$ein);
				addColumnPathMap(IABillHdrRowR.$bill_co_biz_co_no, MST_BILL_SEND_IF_R.$biz_co_no);
				addColumnPathMap(IABillHdrRowR.$bill_co_zip_cd, MST_BILL_SEND_IF_R.$zip_cd);
				addColumnPathMap(IABillHdrRowR.$bill_co_addr1, MST_BILL_SEND_IF_R.$addr1);
				addColumnPathMap(IABillHdrRowR.$bill_co_addr2, MST_BILL_SEND_IF_R.$addr2);
				addColumnPathMap(IABillHdrRowR.$bill_co_addr3, MST_BILL_SEND_IF_R.$addr3);
				addColumnPathMap(IABillHdrRowR.$bill_co_addr4, MST_BILL_SEND_IF_R.$addr4);
				addColumnPathMap(IABillHdrRowR.$bill_co_dpt, MST_BILL_SEND_IF_R.$bill_dpt);
				addColumnPathMap(IABillHdrRowR.$bill_co_tel, MST_BILL_SEND_IF_R.$tel);
				addColumnPathMap(IABillHdrRowR.$bill_co_cntry_cd, MST_BILL_SEND_IF_R.$if_cntry_cd);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_cd, MST_BILL_SEND_IF_R.$if_bcst_cd);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_nm, MST_BILL_SEND_IF_R.$bcst_nm);
				addColumnPathMap(IABillHdrRowR.$bill_bcst_nm, MST_BILL_SEND_IF_R.$bill_bcst_nm);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_ein, MST_BILL_SEND_IF_R.$bcst_ein);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_biz_co_no, MST_BILL_SEND_IF_R.$bcst_biz_co_no);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_zip_cd, MST_BILL_SEND_IF_R.$bcst_zip_cd);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_addr1, MST_BILL_SEND_IF_R.$bcst_addr1);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_addr2, MST_BILL_SEND_IF_R.$bcst_addr2);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_addr3, MST_BILL_SEND_IF_R.$bcst_addr3);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_addr4, MST_BILL_SEND_IF_R.$bcst_addr4);
				addColumnPathMap(IABillHdrRowR.$bill_bcst_dpt, MST_BILL_SEND_IF_R.$bill_bcst_dpt);
				addColumnPathMap(IABillHdrRowR.$bill_tel, MST_BILL_SEND_IF_R.$bill_tel);
				addColumnPathMap(IABillHdrRowR.$bill_rcpt_co_cntry_cd, MST_BILL_SEND_IF_R.$if_bcst_cntry_cd);
				addColumnPathMap(IABillHdrRowR.$trd_cur_cd, MST_BILL_SEND_IF_R.$if_trd_cur_cd);
				addColumnPathMap(IABillHdrRowR.$bill_xrate, MST_BILL_SEND_IF_R.$bill_xrate);
				addColumnPathMap(IABillHdrRowR.$last_bill_amt, MST_BILL_SEND_IF_R.$last_bill_amt);
				addColumnPathMap(IABillHdrRowR.$rcv_amt, MST_BILL_SEND_IF_R.$rcv_amt);
				addColumnPathMap(IABillHdrRowR.$sw_amt, MST_BILL_SEND_IF_R.$sw_amt);
				addColumnPathMap(IABillHdrRowR.$setoff_amt, MST_BILL_SEND_IF_R.$setoff_amt);
				addColumnPathMap(IABillHdrRowR.$bfw_amt, MST_BILL_SEND_IF_R.$bfw_amt);
				addColumnPathMap(IABillHdrRowR.$sls_amt, MST_BILL_SEND_IF_R.$sls_amt);
				addColumnPathMap(IABillHdrRowR.$dscnt_amt, MST_BILL_SEND_IF_R.$dscnt_amt);
				addColumnPathMap(IABillHdrRowR.$ret_amt, MST_BILL_SEND_IF_R.$ret_amt);
				addColumnPathMap(IABillHdrRowR.$tax_amt, MST_BILL_SEND_IF_R.$tax_amt);
				addColumnPathMap(IABillHdrRowR.$sw_to_amt, MST_BILL_SEND_IF_R.$sw_to_amt);
				addColumnPathMap(IABillHdrRowR.$bill_amt, MST_BILL_SEND_IF_R.$bill_amt);
				addColumnPathMap(IABillHdrRowR.$tax_rate1, MST_BILL_SEND_IF_R.$tax_rate1);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt1, MST_BILL_SEND_IF_R.$tax_rate_sls_amt1);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt1, MST_BILL_SEND_IF_R.$tax_rate_tax_amt1);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt1, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt1);
				addColumnPathMap(IABillHdrRowR.$tax_rate2, MST_BILL_SEND_IF_R.$tax_rate2);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt2, MST_BILL_SEND_IF_R.$tax_rate_sls_amt2);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt2, MST_BILL_SEND_IF_R.$tax_rate_tax_amt2);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt2, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt2);
				addColumnPathMap(IABillHdrRowR.$tax_rate3, MST_BILL_SEND_IF_R.$tax_rate3);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt3, MST_BILL_SEND_IF_R.$tax_rate_sls_amt3);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt3, MST_BILL_SEND_IF_R.$tax_rate_tax_amt3);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt3, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt3);
				addColumnPathMap(IABillHdrRowR.$tax_rate4, MST_BILL_SEND_IF_R.$tax_rate4);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt4, MST_BILL_SEND_IF_R.$tax_rate_sls_amt4);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt4, MST_BILL_SEND_IF_R.$tax_rate_tax_amt4);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt4, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt4);
				addColumnPathMap(IABillHdrRowR.$tax_rate5, MST_BILL_SEND_IF_R.$tax_rate5);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt5, MST_BILL_SEND_IF_R.$tax_rate_sls_amt5);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt5, MST_BILL_SEND_IF_R.$tax_rate_tax_amt5);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt5, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt5);
				addColumnPathMap(IABillHdrRowR.$tax_rate6, MST_BILL_SEND_IF_R.$tax_rate6);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt6, MST_BILL_SEND_IF_R.$tax_rate_sls_amt6);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt6, MST_BILL_SEND_IF_R.$tax_rate_tax_amt6);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt6, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt6);
				addColumnPathMap(IABillHdrRowR.$tax_rate7, MST_BILL_SEND_IF_R.$tax_rate7);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt7, MST_BILL_SEND_IF_R.$tax_rate_sls_amt7);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt7, MST_BILL_SEND_IF_R.$tax_rate_tax_amt7);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt7, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt7);
				addColumnPathMap(IABillHdrRowR.$tax_rate8, MST_BILL_SEND_IF_R.$tax_rate8);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt8, MST_BILL_SEND_IF_R.$tax_rate_sls_amt8);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt8, MST_BILL_SEND_IF_R.$tax_rate_tax_amt8);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt8, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt8);
				addColumnPathMap(IABillHdrRowR.$tax_rate9, MST_BILL_SEND_IF_R.$tax_rate9);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt9, MST_BILL_SEND_IF_R.$tax_rate_sls_amt9);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt9, MST_BILL_SEND_IF_R.$tax_rate_tax_amt9);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt9, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt9);
				addColumnPathMap(IABillHdrRowR.$tax_rate10, MST_BILL_SEND_IF_R.$tax_rate10);
				addColumnPathMap(IABillHdrRowR.$tax_rate_sls_amt10, MST_BILL_SEND_IF_R.$tax_rate_sls_amt10);
				addColumnPathMap(IABillHdrRowR.$tax_rate_tax_amt10, MST_BILL_SEND_IF_R.$tax_rate_tax_amt10);
				addColumnPathMap(IABillHdrRowR.$tax_rate_base_tax_amt10, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt10);
				addColumnPathMap(IABillHdrRowR.$adv_amt_bal, MST_BILL_SEND_IF_R.$adv_amt_bal);
				addColumnPathMap(IABillHdrRowR.$adv_amt, MST_BILL_SEND_IF_R.$adv_amt);
				addColumnPathMap(IABillHdrRowR.$adv_setoff_amt, MST_BILL_SEND_IF_R.$adv_setoff_amt);
				addColumnPathMap(IABillHdrRowR.$adv_setoff_tax_amt, MST_BILL_SEND_IF_R.$adv_setoff_tax_amt);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt1, MST_BILL_SEND_IF_R.$rcv_schd_amt1);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd1, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd1);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm1, MST_BILL_SEND_IF_R.$rcv_mtd_nm1);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt2, MST_BILL_SEND_IF_R.$rcv_schd_amt2);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd2, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd2);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm2, MST_BILL_SEND_IF_R.$rcv_mtd_nm2);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt3, MST_BILL_SEND_IF_R.$rcv_schd_amt3);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd3, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd3);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm3, MST_BILL_SEND_IF_R.$rcv_mtd_nm3);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt4, MST_BILL_SEND_IF_R.$rcv_schd_amt4);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd4, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd4);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm4, MST_BILL_SEND_IF_R.$rcv_mtd_nm4);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt5, MST_BILL_SEND_IF_R.$rcv_schd_amt5);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd5, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd5);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm5, MST_BILL_SEND_IF_R.$rcv_mtd_nm5);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt6, MST_BILL_SEND_IF_R.$rcv_schd_amt6);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd6, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd6);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm6, MST_BILL_SEND_IF_R.$rcv_mtd_nm6);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt7, MST_BILL_SEND_IF_R.$rcv_schd_amt7);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd7, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd7);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm7, MST_BILL_SEND_IF_R.$rcv_mtd_nm7);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt8, MST_BILL_SEND_IF_R.$rcv_schd_amt8);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd8, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd8);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm8, MST_BILL_SEND_IF_R.$rcv_mtd_nm8);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt9, MST_BILL_SEND_IF_R.$rcv_schd_amt9);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd9, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd9);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm9, MST_BILL_SEND_IF_R.$rcv_mtd_nm9);
				addColumnPathMap(IABillHdrRowR.$rcv_schd_amt10, MST_BILL_SEND_IF_R.$rcv_schd_amt10);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_cd10, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd10);
				addColumnPathMap(IABillHdrRowR.$rcv_mtd_nm10, MST_BILL_SEND_IF_R.$rcv_mtd_nm10);
				addColumnPathMap(IABillHdrRowR.$bank_ac_cd, MST_BILL_SEND_IF_R.$if_bank_ac_cd);
				addColumnPathMap(IABillHdrRowR.$bank_ac_typ, MST_BILL_SEND_IF_R.$bank_ac_typ);
				addColumnPathMap(IABillHdrRowR.$bank_ac_no, MST_BILL_SEND_IF_R.$bank_ac_no);
				addColumnPathMap(IABillHdrRowR.$bank_ac_holder, MST_BILL_SEND_IF_R.$bank_ac_holder);
				addColumnPathMap(IABillHdrRowR.$bank_ac_holder_sub, MST_BILL_SEND_IF_R.$bank_ac_holder_sub);
				addColumnPathMap(IABillHdrRowR.$bank_nm, MST_BILL_SEND_IF_R.$bank_nm);
				addColumnPathMap(IABillHdrRowR.$bank_cd, MST_BILL_SEND_IF_R.$bank_cd);
				addColumnPathMap(IABillHdrRowR.$branch_nm, MST_BILL_SEND_IF_R.$branch_nm);
				addColumnPathMap(IABillHdrRowR.$branch_cd, MST_BILL_SEND_IF_R.$branch_cd);
				addColumnPathMap(IABillHdrRowR.$trd_cd, MST_BILL_SEND_IF_R.$if_trd_cd);
				addColumnPathMap(IABillHdrRowR.$trd_nm, MST_BILL_SEND_IF_R.$trd_nm);
				addColumnPathMap(IABillHdrRowR.$trd_ptn_typ, MST_BILL_SEND_IF_R.$trd_ptn_typ);
				addColumnPathMap(IABillHdrRowR.$slip_sts_typ, MST_BILL_SEND_IF_R.$slip_sts_typ);
				addColumnPathMap(IABillHdrRowR.$dlv_slip_no, MST_BILL_SEND_IF_R.$dlv_slip_no);
				addColumnPathMap(IABillHdrRowR.$dlv_slip_d_no, MST_BILL_SEND_IF_R.$dlv_slip_d_no);
				addColumnPathMap(IABillHdrRowR.$ship_dlv_slip_no, MST_BILL_SEND_IF_R.$ship_dlv_slip_no);
				addColumnPathMap(IABillHdrRowR.$ship_dlv_slip_d_no, MST_BILL_SEND_IF_R.$ship_dlv_slip_d_no);
				addColumnPathMap(IABillHdrRowR.$act_no, MST_BILL_SEND_IF_R.$act_no);
				addColumnPathMap(IABillHdrRowR.$act_rev, MST_BILL_SEND_IF_R.$act_rev);
				addColumnPathMap(IABillHdrRowR.$act_d_no, MST_BILL_SEND_IF_R.$act_d_no);
				addColumnPathMap(IABillHdrRowR.$cst_po_no, MST_BILL_SEND_IF_R.$cst_po_no);
				addColumnPathMap(IABillHdrRowR.$cst_po_d_no, MST_BILL_SEND_IF_R.$cst_po_d_no);
				addColumnPathMap(IABillHdrRowR.$itm_cd, MST_BILL_SEND_IF_R.$if_itm_cd);
				addColumnPathMap(IABillHdrRowR.$itm_sub1, MST_BILL_SEND_IF_R.$if_itm_sub1);
				addColumnPathMap(IABillHdrRowR.$itm_sub2, MST_BILL_SEND_IF_R.$if_itm_sub2);
				addColumnPathMap(IABillHdrRowR.$itm_sub3, MST_BILL_SEND_IF_R.$if_itm_sub3);
				addColumnPathMap(IABillHdrRowR.$itm_nm, MST_BILL_SEND_IF_R.$itm_nm);
				addColumnPathMap(IABillHdrRowR.$itm_alt_nm1, MST_BILL_SEND_IF_R.$itm_alt_nm1);
				addColumnPathMap(IABillHdrRowR.$itm_alt_nm2, MST_BILL_SEND_IF_R.$itm_alt_nm2);
				addColumnPathMap(IABillHdrRowR.$itm_alt_nm3, MST_BILL_SEND_IF_R.$itm_alt_nm3);
				addColumnPathMap(IABillHdrRowR.$itm_alt_nm4, MST_BILL_SEND_IF_R.$itm_alt_nm4);
				addColumnPathMap(IABillHdrRowR.$sno1, MST_BILL_SEND_IF_R.$sno1);
				addColumnPathMap(IABillHdrRowR.$sno2, MST_BILL_SEND_IF_R.$sno2);
				addColumnPathMap(IABillHdrRowR.$sno3, MST_BILL_SEND_IF_R.$sno3);
				addColumnPathMap(IABillHdrRowR.$sno4, MST_BILL_SEND_IF_R.$sno4);
				addColumnPathMap(IABillHdrRowR.$trd_unit_cd, MST_BILL_SEND_IF_R.$if_trd_unit_cd);
				addColumnPathMap(IABillHdrRowR.$upri_unit_cd, MST_BILL_SEND_IF_R.$if_trd_unit_cd);
				addColumnPathMap(IABillHdrRowR.$trd_unit_nm, MST_BILL_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(IABillHdrRowR.$trd_unit_qty, MST_BILL_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(IABillHdrRowR.$interim_flg, MST_BILL_SEND_IF_R.$interim_flg);
				addColumnPathMap(IABillHdrRowR.$trd_cur_upri, MST_BILL_SEND_IF_R.$trd_cur_upri);
				addColumnPathMap(IABillHdrRowR.$trd_cur_amt, MST_BILL_SEND_IF_R.$trd_cur_amt);
				addColumnPathMap(IABillHdrRowR.$trd_cur_dscnt_amt, MST_BILL_SEND_IF_R.$trd_cur_dscnt_amt);
				addColumnPathMap(IABillHdrRowR.$tax_cd, MST_BILL_SEND_IF_R.$if_tax_cd);
				addColumnPathMap(IABillHdrRowR.$tax_nm, MST_BILL_SEND_IF_R.$tax_nm);
				addColumnPathMap(IABillHdrRowR.$tax_rate, MST_BILL_SEND_IF_R.$tax_rate);
				addColumnPathMap(IABillHdrRowR.$inc_tax_flg, MST_BILL_SEND_IF_R.$inc_tax_flg);
				addColumnPathMap(IABillHdrRowR.$trd_cur_tax_amt, MST_BILL_SEND_IF_R.$trd_cur_tax_amt);
				addColumnPathMap(IABillHdrRowR.$trd_d_rmrks, MST_BILL_SEND_IF_R.$trd_d_rmrks);
				addColumnPathMap(IABillHdrRowR.$sub_char1, MST_BILL_SEND_IF_R.$sub_char1);
				addColumnPathMap(IABillHdrRowR.$sub_char2, MST_BILL_SEND_IF_R.$sub_char2);
				addColumnPathMap(IABillHdrRowR.$sub_char3, MST_BILL_SEND_IF_R.$sub_char3);
				addColumnPathMap(IABillHdrRowR.$sub_char4, MST_BILL_SEND_IF_R.$sub_char4);
				addColumnPathMap(IABillHdrRowR.$sub_char5, MST_BILL_SEND_IF_R.$sub_char5);
				addColumnPathMap(IABillHdrRowR.$sub_char6, MST_BILL_SEND_IF_R.$sub_char6);
				addColumnPathMap(IABillHdrRowR.$sub_char7, MST_BILL_SEND_IF_R.$sub_char7);
				addColumnPathMap(IABillHdrRowR.$sub_char8, MST_BILL_SEND_IF_R.$sub_char8);
				addColumnPathMap(IABillHdrRowR.$sub_char9, MST_BILL_SEND_IF_R.$sub_char9);
				addColumnPathMap(IABillHdrRowR.$sub_char10, MST_BILL_SEND_IF_R.$sub_char10);
				addColumnPathMap(IABillHdrRowR.$sub_char11, MST_BILL_SEND_IF_R.$sub_char11);
				addColumnPathMap(IABillHdrRowR.$sub_char12, MST_BILL_SEND_IF_R.$sub_char12);
				addColumnPathMap(IABillHdrRowR.$sub_char13, MST_BILL_SEND_IF_R.$sub_char13);
				addColumnPathMap(IABillHdrRowR.$sub_char14, MST_BILL_SEND_IF_R.$sub_char14);
				addColumnPathMap(IABillHdrRowR.$sub_char15, MST_BILL_SEND_IF_R.$sub_char15);
				addColumnPathMap(IABillHdrRowR.$sub_char16, MST_BILL_SEND_IF_R.$sub_char16);
				addColumnPathMap(IABillHdrRowR.$sub_char17, MST_BILL_SEND_IF_R.$sub_char17);
				addColumnPathMap(IABillHdrRowR.$sub_char18, MST_BILL_SEND_IF_R.$sub_char18);
				addColumnPathMap(IABillHdrRowR.$sub_char19, MST_BILL_SEND_IF_R.$sub_char19);
				addColumnPathMap(IABillHdrRowR.$sub_char20, MST_BILL_SEND_IF_R.$sub_char20);
				addColumnPathMap(IABillHdrRowR.$sub_char21, MST_BILL_SEND_IF_R.$sub_char21);
				addColumnPathMap(IABillHdrRowR.$sub_char22, MST_BILL_SEND_IF_R.$sub_char22);
				addColumnPathMap(IABillHdrRowR.$sub_char23, MST_BILL_SEND_IF_R.$sub_char23);
				addColumnPathMap(IABillHdrRowR.$sub_char24, MST_BILL_SEND_IF_R.$sub_char24);
				addColumnPathMap(IABillHdrRowR.$sub_char25, MST_BILL_SEND_IF_R.$sub_char25);
				addColumnPathMap(IABillHdrRowR.$sub_char26, MST_BILL_SEND_IF_R.$sub_char26);
				addColumnPathMap(IABillHdrRowR.$sub_char27, MST_BILL_SEND_IF_R.$sub_char27);
				addColumnPathMap(IABillHdrRowR.$sub_char28, MST_BILL_SEND_IF_R.$sub_char28);
				addColumnPathMap(IABillHdrRowR.$sub_char29, MST_BILL_SEND_IF_R.$sub_char29);
				addColumnPathMap(IABillHdrRowR.$sub_char30, MST_BILL_SEND_IF_R.$sub_char30);
				addColumnPathMap(IABillHdrRowR.$sub_num1, MST_BILL_SEND_IF_R.$sub_num1);
				addColumnPathMap(IABillHdrRowR.$sub_num2, MST_BILL_SEND_IF_R.$sub_num2);
				addColumnPathMap(IABillHdrRowR.$sub_num3, MST_BILL_SEND_IF_R.$sub_num3);
				addColumnPathMap(IABillHdrRowR.$sub_num4, MST_BILL_SEND_IF_R.$sub_num4);
				addColumnPathMap(IABillHdrRowR.$sub_num5, MST_BILL_SEND_IF_R.$sub_num5);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				//日付項目を文字列にキャストして補完する
				dest.data_make_dt(src.ins_ts().toMCDate().toString("yyyy-MM-dd HH:mm:ss"));
				dest.bill_cl_dt(toYMDStringFormat(src.bill_cl_dt()));
				dest.bill_dt(toYMDStringFormat(src.bill_dt()));
				dest.pre_bill_dt(toYMDStringFormat(src.pre_bill_dt()));
				dest.bill_st_dt(toYMDStringFormat(src.bill_st_dt()));
				dest.bill_end_dt(toYMDStringFormat(src.bill_end_dt()));
				dest.rcv_schd_dt1(toYMDStringFormat(src.rcv_schd_dt1()));
				dest.rcv_schd_dt2(toYMDStringFormat(src.rcv_schd_dt2()));
				dest.rcv_schd_dt3(toYMDStringFormat(src.rcv_schd_dt3()));
				dest.rcv_schd_dt4(toYMDStringFormat(src.rcv_schd_dt4()));
				dest.rcv_schd_dt5(toYMDStringFormat(src.rcv_schd_dt5()));
				dest.rcv_schd_dt6(toYMDStringFormat(src.rcv_schd_dt6()));
				dest.rcv_schd_dt7(toYMDStringFormat(src.rcv_schd_dt7()));
				dest.rcv_schd_dt8(toYMDStringFormat(src.rcv_schd_dt8()));
				dest.rcv_schd_dt9(toYMDStringFormat(src.rcv_schd_dt9()));
				dest.rcv_schd_dt10(toYMDStringFormat(src.rcv_schd_dt10()));
				dest.ac_dt(toYMDStringFormat(src.ac_dt()));
				dest.dlv_dt(toYMDStringFormat(src.dlv_dt()));
				dest.rcv_dt(toYMDStringFormat(src.rcv_dt()));
				dest.bill_basis_dt(toYMDStringFormat(src.bill_basis_dt()));
				dest.base_ac_dt(toYMDStringFormat(src.base_ac_dt()));
				dest.sub_dt1(toYMDStringFormat(src.sub_dt1()));
				dest.sub_dt2(toYMDStringFormat(src.sub_dt2()));
				dest.sub_dt3(toYMDStringFormat(src.sub_dt3()));
				dest.sub_dt4(toYMDStringFormat(src.sub_dt4()));
				dest.sub_dt5(toYMDStringFormat(src.sub_dt5()));
				
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.BILL.value());
				dest.bill_co_cd(src.if_co_cd());
				dest.bill_co_cntry_cd(src.if_cntry_cd());
				dest.bill_rcpt_co_cd(src.if_bcst_cd());
				dest.bill_rcpt_co_cntry_cd(src.if_bcst_cntry_cd());
				dest.trd_cur_cd(src.if_trd_cur_cd());
				dest.rcv_mtd_cd1(src.if_rcv_mtd_cd1());
				dest.rcv_mtd_cd2(src.if_rcv_mtd_cd2());
				dest.rcv_mtd_cd3(src.if_rcv_mtd_cd3());
				dest.rcv_mtd_cd4(src.if_rcv_mtd_cd4());
				dest.rcv_mtd_cd5(src.if_rcv_mtd_cd5());
				dest.rcv_mtd_cd6(src.if_rcv_mtd_cd6());
				dest.rcv_mtd_cd7(src.if_rcv_mtd_cd7());
				dest.rcv_mtd_cd8(src.if_rcv_mtd_cd8());
				dest.rcv_mtd_cd9(src.if_rcv_mtd_cd9());
				dest.rcv_mtd_cd10(src.if_rcv_mtd_cd10());
				dest.bank_ac_cd(src.if_bank_ac_cd());
				dest.trd_cd(src.if_trd_cd());
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.tax_cd(src.if_tax_cd());
				
				setValueWithCondition(dest,src);
				initEachTaxItms(dest);
				copyEachTaxRate(dest,src.tax_rate1(), src.tax_rate_sls_amt1(), src.tax_rate_tax_amt1());
				copyEachTaxRate(dest,src.tax_rate2(), src.tax_rate_sls_amt2(), src.tax_rate_tax_amt2());
				copyEachTaxRate(dest,src.tax_rate3(), src.tax_rate_sls_amt3(), src.tax_rate_tax_amt3());
				
				dest.bill_paid_amt(calcPaidAmt(src));
				dest.ttl_bill_amt(calcTotalWithoutTax(src));
				dest.sum_bill_amt(dest.ttl_bill_amt());
				dest.sum_bill_amt_inc_tax(calcTotalWithTax(src));
				dest.bill_due_amt(dest.sum_bill_amt_inc_tax().subtract(dest.bill_paid_amt()));
			}
			
			protected String toYMDStringFormat(MCDate date) {
				//ロケールによらず指定のフォーマットで文字列化する
				return !isNull(date) ? date.toString("yyyy-MM-dd") : null;
			}
			
			protected void setValueWithCondition(D dest, S src) {
				setBillStEdDate(dest,src);
				
				if (isNull(src.ship_dlv_slip_no())) {
					dest.ship_dlv_slip_no(src.dlv_slip_no());
				}
				
				if (src.trd_cur_upri().lt(MCNumber.ZERO)) {
					dest.trd_cur_upri(src.trd_cur_upri().multiply(-1));
				}
				
				//連携先の必須項目であるため初期値を設定する
				if (isNull(src.itm_nm())) {
					dest.itm_nm("***");
				}
				if (isNull(src.tax_rate())) {
					dest.tax_rate(MCNumber.valueOf(0));
				}
			}
			
			protected void setBillStEdDate(D dest, S src) {
				if (_acDateRangeIfL.isEmpty()) {
					return;
				}
				MST_BILL_SEND_IF_R acDateRangeIfR = _acDateRangeIfL.getFirst(_acDateRangeIfIdx, src.data_no());
				if (isNull(acDateRangeIfR)) {
					return;
				}
				MCDate minAcDate = acDateRangeIfR.getDateNE("min_ac_date");
				MCDate maxAcDate = acDateRangeIfR.getDateNE("max_ac_date");
				if (!isNull(minAcDate) && minAcDate.lt(src.bill_st_dt())) {
					dest.bill_st_dt(toYMDStringFormat(minAcDate));
				}
				if (!isNull(maxAcDate) && maxAcDate.gt(src.bill_end_dt())) {
					dest.bill_end_dt(toYMDStringFormat(maxAcDate));
				}
			}
			
			protected void initEachTaxItms(D dest) {
				dest.tax_rate_sls_amt_per0(MCNumber.ZERO);
				dest.tax_rate_tax_amt_per0(MCNumber.ZERO);
				dest.tax_rate_sls_amt_per8(MCNumber.ZERO);
				dest.tax_rate_tax_amt_per8(MCNumber.ZERO);
				dest.tax_rate_sls_amt_per10(MCNumber.ZERO);
				dest.tax_rate_tax_amt_per10(MCNumber.ZERO);
			}
			
			protected void copyEachTaxRate(D dest, MCNumber rate, MCNumber slsAmt,MCNumber taxAmt) {
				if (isNull(rate)) {
					return;
				}
				if (rate.eq(TAX_0)) {
					copyTaxItmsPer0(dest,rate,slsAmt,taxAmt);
				}
				if (rate.eq(TAX_8)) {
					copyTaxItmsPer8(dest,rate,slsAmt,taxAmt);
				}
				if (rate.eq(TAX_10)) {
					copyTaxItmsPer10(dest,rate,slsAmt,taxAmt);
				}
			}
			
			protected void copyTaxItmsPer0(D dest, MCNumber rate, MCNumber slsAmt,MCNumber taxAmt) {
				dest.tax_rate_sls_amt_per0(slsAmt);
				dest.tax_rate_tax_amt_per0(taxAmt);
			}
			
			protected void copyTaxItmsPer8(D dest, MCNumber rate, MCNumber slsAmt,MCNumber taxAmt) {
				dest.tax_rate_sls_amt_per8(slsAmt);
				dest.tax_rate_tax_amt_per8(taxAmt);
			}
			
			protected void copyTaxItmsPer10(D dest, MCNumber rate, MCNumber slsAmt,MCNumber taxAmt) {
				dest.tax_rate_sls_amt_per10(slsAmt);
				dest.tax_rate_tax_amt_per10(taxAmt);
			}
			
			/**
			 * 支払済金額を以下の計算式で算出する</br>
			 * 振替額（請求残高振替払出）-今回振替額（請求残高振替受入）
			 * @param src
			 * @return 計算結果
			 */
			protected MCNumber calcPaidAmt(S src) {
				return src.sw_amt().subtract(src.sw_to_amt());
			}
			
			/**
			 * 税抜の合計金額を以下の計算式で算出する</br>
			 * 今回売上額＋今回値引額（負）＋今回ご返品額（負）
			 * @param src
			 * @return 計算結果
			 */
			protected MCNumber calcTotalWithoutTax(S src) {
				return src.sls_amt().add(src.dscnt_amt()).add(src.ret_amt());
			}
			
			/**
			 * 税込の合計金額を以下の計算式で算出する</br>
			 * {@link #calcTotalWithoutTax(MST_BILL_SEND_IF_R)}＋今回税額
			 * @param src
			 * @return 計算結果
			 */
			protected MCNumber calcTotalWithTax(S src) {
				return calcTotalWithoutTax(src).add(src.tax_amt());
			}
			
		}
		
		/**
		 * すべてスキップデータだった場合に送信状況区分を送信完了にする
		 */
		protected void editDown0(MCList<SdrvDtlR> down0, boolean isErr) {
			if (!isErr) {
				for (SdrvDtlR dtlR : down0.subList(SdrvDtlR.$sdrv_sts_typ,
						MAC_SDRV_STS_TYP.SEND_CONV_ERR.value())) {
					if (isAllSkipData(dtlR.data_no())) {
						dtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_OK.value());
						MCMessagePool.add(MBBBL0008, dtlR.data_no(), 0);
					}
				}
			}
		}
		
		/**
		 * 送信対象がすべてスキップデータの場合にtrueを返す
		 */
		protected boolean isAllSkipData(MCNumber dataNo) {
			MST_BILL_SEND_IF_R billSendIfR = MST_BILL_SEND_IF_R.create("T");
			return execDbCount("MSLAL9930_MST_BILL_SEND_IF_01", billSendIfR,
					billSendIfR.data_no.eq(bind("1"))
							.and(billSendIfR.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value()))),
					dataNo) == 0;
		}
	}

	//FMCB CUSTOM END
}