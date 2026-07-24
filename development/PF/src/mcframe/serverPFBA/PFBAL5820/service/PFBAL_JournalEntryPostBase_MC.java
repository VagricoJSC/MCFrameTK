package mcframe.serverPFBA.PFBAL5820.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.LinkedHashMap;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.notice.MCException;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.util.MCDBUtil.*;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;

import mcframe.commonMA.constant.MAC_AC_IF_TYP;
import mcframe.commonMA.constant.MAC_DC_TYP;
import mcframe.commonMA.constant.MAC_MASTER_TYP;
import mcframe.serverMA.dbc.MAM_AUTO_JNL_R;
import mcframe.serverMA.dbc.MAM_EXT_SYS_USR_R;
import mcframe.serverMA.dbc.MAM_AC_TAX_MAP_R;
import mcframe.serverMA.dbc.MAM_TAX_R;
import mcframe.serverMA.dbc.MAM_ACCOUNT_R;
import mcframe.serverMB.dbc.MBT_JOURNAL_R;
import mcframe.serverMB.dbc.MBT_JOURNAL_SND_IF_R;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;


public class PFBAL_JournalEntryPostBase_MC  {

	protected static final Class<PFBAL_JournalEntryPostBase> CLAZZ = PFBAL_JournalEntryPostBase.class;

	public static PFBZL_CodeConvert.IfDBContainer<MBT_JOURNAL_SND_IF_R> getIfDBC() {
		return PFBZL_CodeConvert.crtSendIfDBContainer(MBT_JOURNAL_SND_IF_R.class);
	}
	
	protected ObjectFactory _jeFctry;
	protected ObjectFactory getJEFactory() {
		if (_jeFctry == null) {
			_jeFctry = new ObjectFactory();
		}
		return _jeFctry;
	}
	
	protected DatatypeFactory _dtFctry;
	protected DatatypeFactory getDataTypFactory() {
		if (_dtFctry == null) {
			try {
				_dtFctry = DatatypeFactory.newInstance();
			}
			catch (Exception e) {
				throw new MCException(e);
			}
		}
		return _dtFctry;
	}
	
	public  JournalEntryCreateRequestBulkMessage createMessage(MCList<?> ifL) {
		
		initCache(ifL);
		
		JournalEntryCreateRequestBulkMessage rqstL = createRequestBulk(ifL.get(0));
		for (MCList<?> jnlL : groupList(ifL)) {
			rqstL.getJournalEntryCreateRequest().add(createRequest(jnlL));
		}
		
		return rqstL;
	}
	
	protected void initCache(MCList<?> ifL) {
		initJnlCache(ifL);
	}
	
	protected JournalEntryCreateRequestBulkMessage createRequestBulk(MCRow ifR) {
		JournalEntryCreateRequestBulkMessage rqst = getJEFactory().createJournalEntryCreateRequestBulkMessage();
		
		rqst.setMessageHeader(getRquestBulkHeader(ifR));
		
		return rqst;
	}
	
	protected BusinessDocumentMessageHeader getRquestBulkHeader(MCRow ifR) {
		BusinessDocumentMessageHeader  msgHdr = getJEFactory().createBusinessDocumentMessageHeader();
		
		BusinessDocumentMessageID id = getJEFactory().createBusinessDocumentMessageID();
		id.setValue(ifR.getStringNE(MBT_JOURNAL_SND_IF_R.$upd_srv_req_no));
		msgHdr.setID(id);
		msgHdr.setCreationDateTime(getSysDt());
		
		return msgHdr;
	}
	
	protected JournalEntryCreateRequestMessage createRequest(MCList<?> ifL) {
		JournalEntryCreateRequestMessage rqst = null;
		
		int seq = 0;
		for (MCRow r : ifL) {
			MBT_JOURNAL_SND_IF_R ifR = (MBT_JOURNAL_SND_IF_R)r;
			
			setJnlInf(ifR, ++seq);
			
			if (rqst == null) {
				rqst = createRequest(ifR);
			}
			JournalEntryCreateRequestJournalEntry jnlEntry = rqst.getJournalEntry();
			
			if (isProductTaxItem(ifR.ac_cd())) {
				// <ProductTaxItem>で連携
				jnlEntry.getProductTaxItem().add(createProductTaxItem(ifR));
			}
			else {
				// <Item>で連携
				jnlEntry.getItem().add(createItem(ifR));
			}
		}
		
		return rqst;
	}
	
	protected JournalEntryCreateRequestMessage createRequest(MBT_JOURNAL_SND_IF_R ifR) {
		JournalEntryCreateRequestMessage rqst = getJEFactory().createJournalEntryCreateRequestMessage();
		
		rqst.setMessageHeader(getRquestHeader(ifR));
		rqst.setJournalEntry(createJournalEntry(ifR));
		
		return rqst;
	}
	
	protected BusinessDocumentMessageHeader getRquestHeader(MCRow ifR) {
		BusinessDocumentMessageHeader  msgHdr = getJEFactory().createBusinessDocumentMessageHeader();
		
		BusinessDocumentMessageID id = getJEFactory().createBusinessDocumentMessageID();
		id.setValue(
				getCo().co_cd() + "_" + ifR.getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no).toString()
		);
		msgHdr.setID(id);
		msgHdr.setCreationDateTime(getSysDt());
		
		return msgHdr;
	}
	
	protected JournalEntryCreateRequestJournalEntry createJournalEntry(MBT_JOURNAL_SND_IF_R ifR) {
		JournalEntryCreateRequestJournalEntry jnlEntry = getJEFactory().createJournalEntryCreateRequestJournalEntry();
		
		jnlEntry.setOriginalReferenceDocumentType(
			getResConst("OriginalReferenceDocumentType")
		);
		jnlEntry.setBusinessTransactionType(
			getResConst("BusinessTransactionType")
		);
		jnlEntry.setAccountingDocumentType(toAcDocTyp(ifR.ac_if_typ()));
		
		jnlEntry.setDocumentReferenceID(createDocumentReferenceID(ifR));
		jnlEntry.setDocumentHeaderText(createDocumentHeaderText(ifR));
		
		MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(ifR.ext_sys_cd());
		if(extSysUsrR != null) {
			jnlEntry.setCreatedByUser(extSysUsrR.ext_sys_usr_cd());
		}
		jnlEntry.setCompanyCode(ifR.if_co_cd());
		
		XMLGregorianCalendar acDt = toXMLCalenderDate(ifR.ac_dt());
		jnlEntry.setDocumentDate(acDt);
		jnlEntry.setPostingDate(acDt);
		jnlEntry.setTaxDeterminationDate(acDt);
		jnlEntry.setDoTaxAmountCheck(false);
		
		jnlEntry.setExchangeRate(ifR.xrate());
		jnlEntry.setSourceSystemCompanyCode(ifR.slip_cnt_id());
		jnlEntry.setSourceSystemAccountingDocument(ifR.ac_ym().toString("yyyyMM"));
		jnlEntry.setReference1InDocumentHeader(ifR.jnl_no());
		jnlEntry.setReference2InDocumentHeader(getCo().co_cd());
		
		return jnlEntry;
	}
	
	public static String createDocumentReferenceID(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._createDocumentReferenceID(ifR);
	}

	protected String _createDocumentReferenceID(MBT_JOURNAL_SND_IF_R ifR) {
		return String.valueOf(ifR.data_no());
	}
	
	public static String createDocumentHeaderText(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._createDocumentHeaderText(ifR);
	}
	
	protected String _createDocumentHeaderText(MBT_JOURNAL_SND_IF_R ifR) {
		return subStringL(
				nvl(ifR.getStringNE(getSapMappingCol("jnl_ptn_cd")), "")
				+ nvl(ifR.getStringNE(getSapMappingCol("jnl_ptn_nm")), ""), 25);
	}
		
	
	public static String toAcDocTyp(String acIfTyp) {
		return object(CLAZZ)._toAcDocTyp(acIfTyp);
	}

	protected String _toAcDocTyp(String acIfTyp) {
		if (MAC_AC_IF_TYP.isGL(acIfTyp)) {
			return getResConst("AccountingDocumentType.GL");
		}
		else if (MAC_AC_IF_TYP.isAP(acIfTyp)) {
			return getResConst("AccountingDocumentType.AP");
		}
		else if (MAC_AC_IF_TYP.isAR(acIfTyp)) {
			return getResConst("AccountingDocumentType.AR");
		}
		return null;
	}
	
	protected String toDebitCreditCode(String dcTyp) {
		if (MAC_DC_TYP.isDR(dcTyp)) {
			return getResConst("DebitCreditCode.DR");
		}
		else if (MAC_DC_TYP.isCR(dcTyp)) {
			return getResConst("DebitCreditCode.CR");
		}
		return null;
	}
	
	protected JournalEntryCreateRequestJournalEntryItem createItem(MBT_JOURNAL_SND_IF_R ifR) {
		JournalEntryCreateRequestJournalEntryItem
			itm = getJEFactory().createJournalEntryCreateRequestJournalEntryItem();
			
		itm.setReferenceDocumentItem(ifR.getStringNE("ReferenceDocumentItem"));
		itm.setGLAccount(getGLAccount(ifR));
		itm.setDebitCreditCode(toDebitCreditCode(ifR.dc_typ()));
		
		itm.setAmountInCompanyCodeCurrency(getBaseCurSumAmt(ifR, true));
		itm.setAmountInTransactionCurrency(
			isNull(ifR.if_trd_cur_cd()) ? itm.getAmountInCompanyCodeCurrency() : getTrdCurSumAmt(ifR, true)
		);
		
		itm.setDocumentItemText(createDocumentItemText(ifR));
		itm.setHouseBank(ifR.if_bank_cd());
		itm.setHouseBankAccount(ifR.if_bank_ac_cd());
		
		itm.setAccountAssignment(getAccountAssignment(ifR));
		itm.setProfitabilitySupplement(getProfitabilitySupplement(ifR));
		
		return itm;
	}
	
	public static String createDocumentItemText(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._createDocumentItemText(ifR);
	}

	protected String _createDocumentItemText(MBT_JOURNAL_SND_IF_R ifR) {
		return subStringL(ifR.abstract1(), 50);
	}
	
	protected JournalEntryCreateRequestJournalEntryProductTaxItem createProductTaxItem(MBT_JOURNAL_SND_IF_R ifR) {
		JournalEntryCreateRequestJournalEntryProductTaxItem
			itm = getJEFactory().createJournalEntryCreateRequestJournalEntryProductTaxItem();
			
		itm.setReferenceDocumentItem(ifR.getStringNE("ReferenceDocumentItem"));
		
		ProductTaxationCharacteristicsCode taxCd = getJEFactory().createProductTaxationCharacteristicsCode();
		taxCd.setValue(ifR.tax_cd());
		itm.setTaxCode(taxCd);
		itm.setTaxItemClassification(getTaxItemClassification(ifR));
		
		itm.setAmountInCompanyCodeCurrency(getBaseCurSumAmt(ifR, true));
		itm.setAmountInTransactionCurrency(createAmountInTransactionCurrencyAmt(ifR, true));
		itm.setDebitCreditCode(toDebitCreditCode(ifR.dc_typ()));
		
		itm.setTaxRate(ifR.getNumberNE(MAM_TAX_R.$tax_rate));
		itm.setTaxBaseAmountInCoCodeCrcy(getBaseCurTaxBaseAmt(ifR, true));
		itm.setTaxBaseAmountInTransCrcy(createTaxBaseAmountInTransCrcyAmt(ifR, true));
		
		return itm;
	}
	
	public static MCNumber createTaxBaseAmountInTransCrcy(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return object(CLAZZ)._createTaxBaseAmountInTransCrcy(ifR, negateCreditor);
	}

	protected MCNumber _createTaxBaseAmountInTransCrcy(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return MCNumber.valueOf(createTaxBaseAmountInTransCrcyAmt(ifR, negateCreditor).getValue());
	}

	protected Amount createTaxBaseAmountInTransCrcyAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return isNull(ifR.if_trd_cur_cd()) ? getBaseCurTaxBaseAmt(ifR, negateCreditor) : getTrdCurTaxBaseAmt(ifR, negateCreditor);
	}
	
	public static MCNumber createAmountInCompanyCodeCurrency(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return object(CLAZZ)._createAmountInCompanyCodeCurrency(ifR, negateCreditor);
	}

	protected MCNumber _createAmountInCompanyCodeCurrency(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return MCNumber.valueOf(getBaseCurSumAmt(ifR, negateCreditor).getValue());
	}

	public static MCNumber createAmountInTransactionCurrency(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return object(CLAZZ)._createAmountInTransactionCurrency(ifR, negateCreditor);
	}

	protected MCNumber _createAmountInTransactionCurrency(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return MCNumber.valueOf(createAmountInTransactionCurrencyAmt(ifR, negateCreditor).getValue());
	}

	protected Amount createAmountInTransactionCurrencyAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return isNull(ifR.if_trd_cur_cd()) ? getBaseCurSumAmt(ifR, negateCreditor) : getTrdCurSumAmt(ifR, negateCreditor);
	}
	
	protected String getTaxItemClassification(MBT_JOURNAL_SND_IF_R ifR) {
		String val = getProductTaxItem(ifR.ac_cd());
		if (!isNull(val)) {
			return getResConst("TaxItemClassification.val" + val);
		}
		return null;
	}
	
	protected ChartOfAccountsItemCode getGLAccount(MBT_JOURNAL_SND_IF_R ifR) {
		ChartOfAccountsItemCode glaAccount = getJEFactory().createChartOfAccountsItemCode();
		glaAccount.setValue(ifR.ac_cd());
		return glaAccount;
	}
	
	protected JournalEntryCreateRequestJournalEntryItemAccountAssignment getAccountAssignment(MBT_JOURNAL_SND_IF_R ifR) {
		if (!isSetCostCenter(ifR)
			&& !isSetProfitCenter(ifR)) {
			return null;
		}
		
		JournalEntryCreateRequestJournalEntryItemAccountAssignment
			accntAssign = getJEFactory().createJournalEntryCreateRequestJournalEntryItemAccountAssignment();
		
		accntAssign.setCostCenter(createCostCenter(ifR));
		accntAssign.setProfitCenter(createProfitCenter(ifR));
		
		return accntAssign;
	}
	
	
	public static String getBpCd(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._getBpCd(ifR);
	}
	
	protected String _getBpCd(MBT_JOURNAL_SND_IF_R ifR) {
		if (isNull(ifR.if_bp_cd())
			|| !MAC_MASTER_TYP.isCST(ifR.bp_typ())
			|| !isSetProfitSup(ifR)) {
			return null;
		}
		return ifR.if_bp_cd();
	}
	
	public static String getItmCd(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._getItmCd(ifR);
	}
	
	protected String _getItmCd(MBT_JOURNAL_SND_IF_R ifR) {

		if (isItmLinkTarget() && isSetProfitSup(ifR)) {
			return ifR.if_itm_cd();
		}
		return null;
	}
	
	public static String getItmGrpCd(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._getItmGrpCd(ifR);
	}
	
	protected String _getItmGrpCd(MBT_JOURNAL_SND_IF_R ifR) {

		if (isItmGroupLinkTarget() && isSetProfitSup(ifR)) {
			return ifR.itm_grp_cd();
		}
		return null;
	}
	
	protected JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement getProfitabilitySupplement(MBT_JOURNAL_SND_IF_R ifR) {
		
		String bpCd = getBpCd(ifR);
		String itmCd = getItmCd(ifR);
		String itmgrpCd = getItmGrpCd(ifR);
		if (isNullAnd(bpCd, itmCd, itmgrpCd)) {
			return null;
		}

		JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement
			prfSup = getJEFactory().createJournalEntryCreateRequestJournalEntryItemProfitabilitySupplement();
			
		prfSup.setCustomer(bpCd);
		prfSup.setSoldMaterial(itmCd);
		prfSup.setSoldMaterialGroup(itmgrpCd);
		
		return prfSup;
	}
	
	public static String createCostCenter(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._createCostCenter(ifR);
	}
	
	protected String _createCostCenter(MBT_JOURNAL_SND_IF_R ifR) {
		if (isSetCostCenter(ifR)) {
			return ifR.getStringNE(getSapMappingCol("cost_center"));
		}
		else {
			return null;
		}
	}
	
	public static String createProfitCenter(MBT_JOURNAL_SND_IF_R ifR) {
		return object(CLAZZ)._createProfitCenter(ifR);
	}

	protected String _createProfitCenter(MBT_JOURNAL_SND_IF_R ifR) {
		if (isSetProfitCenter(ifR)) {
			return ifR.getStringNE(getSapMappingCol("profit_center"));
		}
		else {
			return null;
		}
	}
	
	protected boolean isSetCostCenter(MBT_JOURNAL_SND_IF_R ifR) {
		// 1：原価センタを連携、3：原価センタと利益センタを連携
		MAM_ACCOUNT_R acR = getAccountR(ifR.ac_cd());
		return isSame(acR.ac_typ2(), "1") || isSame(acR.ac_typ2(), "3");
	}
	
	protected boolean isSetProfitCenter(MBT_JOURNAL_SND_IF_R ifR) {
		// 2：利益センタを連携、3：原価センタと利益センタを連携
		MAM_ACCOUNT_R acR = getAccountR(ifR.ac_cd());
		return isSame(acR.ac_typ2(), "2") || isSame(acR.ac_typ2(), "3");
	}
	
	protected boolean isSetProfitSup(MBT_JOURNAL_SND_IF_R ifR) {
		// 1：収益性分析(CO-PA)に関連する追加項目を連携
		MAM_ACCOUNT_R acR = getAccountR(ifR.ac_cd());
		return isSame(acR.ac_typ3(), "1");
	}
	
	protected Amount getTrdCurSumAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return toAmt(ifR.if_trd_cur_cd(), ifR.trd_cur_sum_amt(), ifR.dc_typ(), negateCreditor);
	}

	protected Amount getBaseCurSumAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return toAmt(ifR.if_base_cur_cd(), ifR.base_cur_sum_amt(), ifR.dc_typ(), negateCreditor);
	}

	protected Amount getTrdCurTaxBaseAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return toAmt(ifR.if_trd_cur_cd(), ifR.trd_cur_tax_base_amt(), ifR.dc_typ(), negateCreditor);
	}

	protected Amount getBaseCurTaxBaseAmt(MBT_JOURNAL_SND_IF_R ifR, boolean negateCreditor) {
		return toAmt(ifR.if_base_cur_cd(), ifR.base_cur_tax_base_amt(), ifR.dc_typ(), negateCreditor);
	}

	protected Amount toAmt(String curCd, MCNumber amt, String dcTyp, boolean negateCreditor) {
		Amount amount = getJEFactory().createAmount();
		amount.setCurrencyCode(curCd);
		if (negateCreditor) {
			amount.setValue(MAC_DC_TYP.isDR(dcTyp) ? amt : amt.negate());
		}
		else {
			amount.setValue(amt);
		}
		return amount;
	}
	
	public static boolean isProductTaxItem(String acCd) {
		return object(CLAZZ)._isProductTaxItem(acCd);
	}

	protected boolean _isProductTaxItem(String acCd) {
		// 1：仮払消費税勘定
		// 2：仮受消費税勘定
		String typ = getProductTaxItem(acCd);
		return isSame(typ, "1") || isSame(typ, "2");
	}

	protected String getProductTaxItem(String acCd) {
		MAM_ACCOUNT_R acR = getAccountR(acCd);
		return acR.ac_typ1();
	}
	
	protected MCDate _sysDt;
	protected XMLGregorianCalendar getSysDt() {
		if (isNull(_sysDt)) {
			_sysDt = MCDate.sysnow();
		}
		return 
			getDataTypFactory().newXMLGregorianCalendar(
				_sysDt.getYear(),
				_sysDt.getMonth(),
				_sysDt.getDay(),
				_sysDt.getHour(),
				_sysDt.getMinute(),
				_sysDt.getSecond(),
				_sysDt.getMilliSecond(),
				0
			);
	}
	
	protected XMLGregorianCalendar toXMLCalenderDate(MCDate dt) {
		return 
			getDataTypFactory().newXMLGregorianCalendarDate(
				dt.getYear(),
				dt.getMonth(),
				dt.getDay(),
				DatatypeConstants.FIELD_UNDEFINED
			);
	}
	
	protected MCList<?>[] groupList(MCList<?> ifL) {
		String[] grpKey = {
			MBT_JOURNAL_SND_IF_R.$jnl_grp_no,
			MBT_JOURNAL_SND_IF_R.$ac_ym,
			MBT_JOURNAL_SND_IF_R.$ac_if_typ,
			MBT_JOURNAL_SND_IF_R.$jnl_no
		};
		
		MCList<?>[] arr = ifL.groupList(grpKey);
		for (int i=0; i<arr.length; i++) {
			arr[i].sort(MBT_JOURNAL_SND_IF_R.$jnl_no_seq);
		}
		
		Arrays.sort(arr, new Comparator<MCList<?>>() {
			public int compare(MCList<?> o1, MCList<?> o2) {
				int cmp = 0;
				for (String col : grpKey) {
					if (o1.get(0).getDataType(col) == mcframe.commonCore.lang.MCDataType.DATE) {
						cmp = o1.get(0).getDateNE(col).compareTo(o2.get(0).getDateNE(col));
					}
					else {
						cmp = o1.get(0).getStringNE(col).compareTo(o2.get(0).getStringNE(col));
					}
					if (cmp != 0) {
						break;
					}
				}
				return cmp;
			}
		});
		
		return arr;
	}
	
	protected String subStringL(String str, int  maxLen) {
		if (isNull(str)) {
			return null;
		}
		int len = str.length();
		return len <= maxLen ? str : str.substring(0,  maxLen);
	}
	
	protected void setJnlInf(MBT_JOURNAL_SND_IF_R ifR, int seq) {
		MBT_JOURNAL_R jnlR = getJnlR(ifR);
		if (!isNullOr(jnlR, jnlR.jnl_ptn()) && jnlR.jnl_ptn().contains("-")) {
			MAM_AUTO_JNL_R autoJnlR = getAutoJnlR(jnlR.jnl_ptn().split("-")[0]);
			ifR.setStringNE(MAM_AUTO_JNL_R.$ac_slip_typ, autoJnlR.ac_slip_typ());
			
			MAM_AC_TAX_MAP_R acTaxMapR = getAcTaxMapR(autoJnlR.ac_slip_typ(), ifR.tax_cd(), ifR.ac_dt());
			MAM_TAX_R taxR = getTaxR(acTaxMapR.tax_cd());
			ifR.setNumberNE(MAM_TAX_R.$tax_rate, taxR.tax_rate());
		}
		
		ifR.setStringNE("ReferenceDocumentItem", String.valueOf(seq));
	}


///// キャッシュ関連
	protected FXUCL_MCDbcCache<MBT_JOURNAL_R> _jnlCache;
	protected void initJnlCache(MCList<?> ifL) {
		_jnlCache = new FXUCL_MCDbcCache<MBT_JOURNAL_R>(
			MCQueryApiBuilder.create(MBT_JOURNAL_R.create("T")), ifL,
				MBT_JOURNAL_R.$jnl_grp_no,
				MBT_JOURNAL_R.$ac_ym,
				MBT_JOURNAL_R.$ac_if_typ,
				MBT_JOURNAL_R.$slip_cnt_id,
				MBT_JOURNAL_R.$jnl_no,
				MBT_JOURNAL_R.$jnl_no_seq,
				MBT_JOURNAL_R.$dc_typ
		);
	}
	protected MBT_JOURNAL_R getJnlR(MBT_JOURNAL_SND_IF_R r) {
		return _jnlCache.get(
			r.jnl_grp_no(),
			r.ac_ym(),
			r.ac_if_typ(),
			r.slip_cnt_id(),
			r.jnl_no(),
			r.jnl_no_seq(),
			r.dc_typ()
		);
	}
	
	protected MCList<MAM_AUTO_JNL_R> _autoJnlCache;
	protected MCIndexKey _autoJnlIdx;
	protected MAM_AUTO_JNL_R getAutoJnlR(String jnlPtnCd) {
		if (_autoJnlCache == null) {
			_autoJnlCache = MCList.create(MAM_AUTO_JNL_R.class);
			
			MAM_AUTO_JNL_R t = MAM_AUTO_JNL_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setOrderByAsc(t.ac_slip_typ);
			
			dbSelect("PFBAL5820_MAM_AUTO_JNL_S01", _autoJnlCache, bldr);
			_autoJnlIdx = _autoJnlCache.createIndex(MAM_AUTO_JNL_R.$jnl_ptn_cd);
		}
		
		return _autoJnlCache.getFirst(_autoJnlIdx, jnlPtnCd);
	}
	
	protected FXUCL_MCDbcCache<MAM_ACCOUNT_R> _accountCache;
	protected MAM_ACCOUNT_R getAccountR(String acCd) {
		if (_accountCache  == null) {
			_accountCache =
				new FXUCL_MCDbcCache<MAM_ACCOUNT_R>(
					MCQueryApiBuilder.create(MAM_ACCOUNT_R.create("T"))
				);
		}
		return _accountCache.get(acCd);
	}
	
	protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache;
	protected MAM_TAX_R getTaxR(String taxCd) {
		if (_taxCache  == null) {
			_taxCache =
				new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T"))
				);
		}
		return _taxCache.get(taxCd);
	}
	
	protected MCList<MAM_AC_TAX_MAP_R> _acTaxMapCache;
	protected MCIndexKey _acTaxMapIdx;
	protected MAM_AC_TAX_MAP_R getAcTaxMapR(String acSlipTyp, String acTaxCd, MCDate baseDt) {
		if (_acTaxMapCache == null) {
			_acTaxMapCache = MCList.create(MAM_AC_TAX_MAP_R.class);
			
			MAM_AC_TAX_MAP_R t = MAM_AC_TAX_MAP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			
			dbSelect("PFBAL5820_MAM_AC_TAX_MAP_S01", _acTaxMapCache, bldr);
			_acTaxMapIdx = _acTaxMapCache.createIndex(
				MAM_AC_TAX_MAP_R.$ac_slip_typ, MAM_AC_TAX_MAP_R.$ac_tax_cd
			);
		}
		
		// 対象の税ＣＤが複数になる場合、最小の税ＣＤを採用する
		MCList<MAM_AC_TAX_MAP_R> acTaxMapL = _acTaxMapCache.subList(_acTaxMapIdx, acSlipTyp, acTaxCd);
		acTaxMapL.sort(MAM_AC_TAX_MAP_R.$tax_cd);
		
		return acTaxMapL.stream()
					.filter(cc -> cc.st_dt().lte(baseDt) && baseDt.lte(cc.end_dt()))
					.findFirst()
					.orElse(MAM_AC_TAX_MAP_R.create());
	}
	

///// リソース関連
	/**
	 * SAPと連携する項目のマッピング情報をキャッシュ
	 */
	protected Map<String, String> _gaMappingCols;
	protected void initSapMappingCols() {
		_gaMappingCols = new LinkedHashMap<>();
		for (String col : MCConst.app.findPattern(
				MCConst.createKey("MB.MBBBL5080.mapping_cols.MBT_JOURNAL_SND_IF", "*"))) {
			if (!_gaMappingCols.containsKey(col)) {
				// key：SAP側の項目
				// value：mcframe側の項目
				String[] keys = MCConst.splitKey(col);
				_gaMappingCols.put(keys[keys.length-1], MCConst.app.getString(col));
			}
		}
	}
	protected String getSapMappingCol(String key) {
		if (_gaMappingCols == null) {
			initSapMappingCols();
		}
		return _gaMappingCols.get(key);
	}
	
	protected boolean isItmLinkTarget() {
		return MCConst.app.getBoolean("PF.PFBAL5820.mapping_cols.send.SoldMaterial");
	}

	protected boolean isItmGroupLinkTarget() {
		return MCConst.app.getBoolean("PF.PFBAL5820.mapping_cols.send.SoldMaterialGroup");
	}
	
	protected String getResConst(String key) {
		return MCConst.app.getString("PF.PFBAL5820.const." + key);
	}
}
