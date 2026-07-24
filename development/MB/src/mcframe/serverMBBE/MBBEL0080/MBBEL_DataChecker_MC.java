package mcframe.serverMBBE.MBBEL0080;

import java.lang.reflect.Constructor;
import java.util.*;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.cache.MCJoinerList.*;

import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import static mcframe.commonCore.util.MCCollectionUtil.*;

import mcframe.serverFXBA.FXBAL0140.FXBAL0140AppDefResource;
import mcframe.serverFXBA.FXBAL0140.FXBAL0140DataChecker;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMA.constant.MAC_IF_PROC_TYP;
import mcframe.commonMA.constant.MAC_EXE_STS_TYP;
import mcframe.commonMA.constant.MAC_NUM_SYS_TYP;
import mcframe.commonMA.constant.MAC_STR;
import mcframe.commonMA.constant.MAC_BP_GRP_TYP;
import mcframe.commonMA.constant.MAC_SLS_ANLY_TYP;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import mcframe.serverMB.dbc.*;

import mcframe.serverCore.cache.MCJoinerList;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MBBEL_DataChecker_MC extends MAUDL_LogicBase
		implements FXBAL0140DataChecker<MCDBContainer> {

	protected MBBEL_DataChecker _dataCheker;
	public static final Class<MBBEL_DataChecker> CLAZZ = MBBEL_DataChecker.class;
		
	@Override
	public void beforeSearch(MCQueryApiBuilder builder, FXBAL0140AppDefResource appRes, MCDBContainer cond) {

		getInstance(cond.tableName())._beforeSearch(builder, appRes, cond);
	}
	
	protected String getTableModule(String tableName) {
		if (tableName.length() < 2) {
			return "";
		}
		return tableName.substring(0, 2);
	}

	
	public void _beforeSearch(MCQueryApiBuilder builder, FXBAL0140AppDefResource appRes, MCDBContainer cond) {

		setDelFlgCtl(false);
		
		int i = 1;
		String awt = null;
		do {
			awt = appRes.getString("addSql.where.text" + i);
			if (awt != null) {
				String[] awtL = awt.split(",");
				for (String r : awtL) {
					builder.addWhereWithCutOffAnd(MCQueryApiBuilder
							.makeEq(builder.getBaseDbc().getColumn$(r), bind(r)));
				}
			}
			i++;
		}
		while (awt != null);

		int j = 1;
		String aoc = null;
		do {
			aoc = appRes.getString("addSql.orderBy.col" + j);
			if (aoc != null) {
				boolean desc = appRes.getBoolean("addSql.orderBy.desc" + j);
				if (desc) {
					String[] aocL = aoc.split(",");
					for (String r : aocL) {
						builder.addOrderByDesc(pr(r));
					}
				}
				else {
					String[] aocL = aoc.split(",");
					for (String r : aocL) {
						builder.addOrderByAsc(pr(r));
					}
				}
			}
			j++;
		}
		while (aoc != null);
	}

	protected MBBEL_DataChecker getInstance() {
		return object(CLAZZ)._dataCheker;
	}
	
	protected MBBEL_DataChecker getInstance(String tableName) {

		if (null == object(CLAZZ)._dataCheker) {

			try {
				String moduleId = getTableModule(tableName);
				if (null == moduleId || isSame(moduleId, "MB")) {
					if (this instanceof MBBEL_DataChecker) {
						object(CLAZZ)._dataCheker = (MBBEL_DataChecker) this;
					}
					else {
						object(CLAZZ)._dataCheker = new MBBEL_DataChecker();
					}
				}
				else if (MCConst.app.containsKey(moduleId + ".tbledit.checker")) {
					Class<?> clazz = Class.forName(MCConst.app.getString(moduleId + ".tbledit.checker"));
					Constructor<?> con = clazz.getDeclaredConstructor();
					object(CLAZZ)._dataCheker = (MBBEL_DataChecker) con.newInstance();
				}
				else {
					if (this instanceof MBBEL_DataChecker) {
						object(CLAZZ)._dataCheker = (MBBEL_DataChecker) this;
					}
					else {
						object(CLAZZ)._dataCheker = new MBBEL_DataChecker();
					}
				}
			}
			catch (Exception e) {
				throw new MCException(e);
			}
		}
		return object(CLAZZ)._dataCheker;
	}

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ<p>
	 */
	protected void setDelFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		r.setStringNE("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId(LOGIC_ID, procid, "01"), procid, r, ":del_flg_ctl");
	}
	
	@Override
	public void afterSearch(MCList<MCDBContainer> dbL, FXBAL0140AppDefResource appRes) {
		getInstance(dbL.createRow().tableName())._afterSearch(dbL, appRes);
	}
	
	protected void _afterSearch(MCList<MCDBContainer> dbL, FXBAL0140AppDefResource appRes) {
		setValuesDbc(dbL);
	}
	
	protected void setValuesDbc(MCList<MCDBContainer> dbL) {
		setValuesDbcBps(dbL);
		setValuesDbcXrates(dbL);
		setValuesDbcCurs(dbL);
		setValuesDbcDpts(dbL);
		setValuesDbcAcDpts(dbL);
		setValuesDbcAcs(dbL);
		setValuesDbcSubAcs(dbL);
		setValuesDbcUnits(dbL);
		setValuesDbcTaxs(dbL);
		setValuesDbcAcTaxs(dbL);
		setValuesDbcUsrs(dbL);
		setValuesDbcSttls(dbL);
		setValuesDbcBankAc(dbL);
		setValuesDbcNoteRsns(dbL);
		setValuesDbcBank(dbL);
		setValuesDbcBankBranch(dbL);
		setValuesDbcTrds(dbL);
		setValuesDbcLgGrps(dbL);
		setValuesDbcItmGrps(dbL);
		setValuesDbcItmJnls(dbL);
		setValuesDbcJnlGrps(dbL);
		setValuesDbcItms(dbL);
		setValuesDbcHss(dbL);
		setValuesDbcCntries(dbL);
		setValuesDbcLocs(dbL);
		setValuesDbcWgs(dbL);
		setValuesDbcAreas(dbL);
		setValuesDbcSlipForms(dbL);
		setValuesDbcCal(dbL);
		setValuesDbcTterm(dbL);
		setValuesDbcSlsAnlies(dbL);
		setValuesDbcSetoffGrps(dbL);
		setValuesDbcPoPrints(dbL);
		setValuesDbcBpGrps(dbL);
		setValuesDbcDptBases(dbL);
	}
	
	protected List<String> getBpBaseTables() {
		List<String> billSrcTables = new ArrayList<String>();
		billSrcTables.add(MBT_BP_SND_IF_R.TABLE_NAME);
		billSrcTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		billSrcTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		billSrcTables.add(MBT_BP_SND_IF_EXT_R.TABLE_NAME);
		billSrcTables.add(MBT_BP_STOP_SND_IF_R.TABLE_NAME);
		return billSrcTables;
	}
	
	protected List<String> getRcstBaseTables() {
		List<String> rcstTables = new ArrayList<String>();
		rcstTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		rcstTables.add(MBT_BP_IF_R.TABLE_NAME);
		return rcstTables;
	}
	
	protected List<String> getSpplBaseTables() {
		List<String> spplTables = new ArrayList<String>();
		spplTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		spplTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		spplTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return spplTables;
	}
	
	protected List<String> getCredBaseTables() {
		List<String> credTables = new ArrayList<String>();
		credTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		credTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return credTables;
	}
	
	protected List<String> getBspplBaseTables() {
		List<String> bspplTables = new ArrayList<String>();
		bspplTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		bspplTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		bspplTables.add(MBT_BP_IF_R.TABLE_NAME);
		return bspplTables;
	}
	
	protected List<String> getAspplBaseTables() {
		List<String> aspplTables = new ArrayList<String>();
		aspplTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		aspplTables.add(MBT_BP_IF_R.TABLE_NAME);
		return aspplTables;
	}
	
	protected List<String> getPspplBaseTables() {
		List<String> pspplTables = new ArrayList<String>();
		pspplTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		pspplTables.add(MBT_BP_IF_R.TABLE_NAME);
		return pspplTables;
	}
	
	protected List<String> getCstBaseTables() {
		List<String> cstTables = new ArrayList<String>();
		cstTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return cstTables;
	}
	
	protected List<String> getPrspplBaseTables() {
		List<String> prspplTables = new ArrayList<String>();
		prspplTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return prspplTables;
	}
	
	protected List<String> getBcstBaseTables() {
		List<String> bcstTables = new ArrayList<String>();
		bcstTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		bcstTables.add(MBT_BP_IF_R.TABLE_NAME);
		return bcstTables;
	}
	
	protected List<String> getMakerBaseTables() {
		List<String> makerTables = new ArrayList<String>();
		makerTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		makerTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return makerTables;
	}
	
	protected List<String> getDlvBaseTables() {
		List<String> dlvTables = new ArrayList<String>();
		dlvTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		dlvTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return dlvTables;
	}
	
	protected List<String> getAcstBaseTables() {
		List<String> acstTables = new ArrayList<String>();
		acstTables.add(MBT_BP_IF_R.TABLE_NAME);
		return acstTables;
	}
	
	protected List<String> getArCredBaseTables() {
		List<String> arCredTables = new ArrayList<String>();
		arCredTables.add(MBT_BP_IF_R.TABLE_NAME);
		return arCredTables;
	}
	
	protected List<String> getApCredBaseTables() {
		List<String> apCredTables = new ArrayList<String>();
		apCredTables.add(MBT_BP_IF_R.TABLE_NAME);
		return apCredTables;
	}
	
	protected List<String> getXrateBaseTables() {
		List<String> xrateTables = new ArrayList<String>();
		xrateTables.add(MBT_CUR_XRATE_IF_R.TABLE_NAME);
		xrateTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		xrateTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		xrateTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		xrateTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		xrateTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return xrateTables;
	}
	
	protected List<String> getPtaxXrateBaseTables() {
		List<String> ptaxXrateTables = new ArrayList<String>();
		ptaxXrateTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return ptaxXrateTables;
	}
	
	protected List<String> getBaseCurBaseTables() {
		List<String> baseCurTables = new ArrayList<String>();
		baseCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		baseCurTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		baseCurTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		baseCurTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		baseCurTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return baseCurTables;
	}
	
	protected List<String> getTrdCurBaseTables() {
		List<String> trdCurTables = new ArrayList<String>();
		trdCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		trdCurTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		trdCurTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		trdCurTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		trdCurTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return trdCurTables;
	}
	
	protected List<String> getPtaxCurBaseTables() {
		List<String> ptaxCurTables = new ArrayList<String>();
		ptaxCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return ptaxCurTables;
	}
	
	protected List<String> getFrCurBaseTables() {
		List<String> frCurTables = new ArrayList<String>();
		frCurTables.add(MBT_CUR_XRATE_IF_R.TABLE_NAME);
		return frCurTables;
	}
	
	protected List<String> getToCurBaseTables() {
		List<String> toCurTables = new ArrayList<String>();
		toCurTables.add(MBT_CUR_XRATE_IF_R.TABLE_NAME);
		return toCurTables;
	}
	
	protected List<String> getCurBaseTables() {
		List<String> curTables = new ArrayList<String>();
		curTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		curTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		curTables.add(MBT_BP_IF_R.TABLE_NAME);
		return curTables;
	}
	
	protected List<String> getAcBaseTables() {
		List<String> acCurTables = new ArrayList<String>();
		acCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		acCurTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		acCurTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		acCurTables.add(MBT_AC_TAX_IF_R.TABLE_NAME);
		acCurTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		acCurTables.add(MBT_SUB_ACCOUNT_IF_R.TABLE_NAME);
		return acCurTables;
	}
	
	protected List<String> getOtherAcBaseTables() {
		List<String> otherAcCurTables = new ArrayList<String>();
		otherAcCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return otherAcCurTables;
	}
	
	protected List<String> getSubAcBaseTables() {
		List<String> subAcCurTables = new ArrayList<String>();
		subAcCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		subAcCurTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		subAcCurTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		subAcCurTables.add(MBT_AC_TAX_IF_R.TABLE_NAME);
		subAcCurTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		return subAcCurTables;
	}
	
	protected List<String> getOtherSubAcBaseTables() {
		List<String> subOtherAcCurTables = new ArrayList<String>();
		subOtherAcCurTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return subOtherAcCurTables;
	}
	
	protected List<String> getBaseUnitBaseTables() {
		List<String> baseUnitTables = new ArrayList<String>();
		baseUnitTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		baseUnitTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		baseUnitTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return baseUnitTables;
	}
	
	protected List<String> getTrdUnitBaseTables() {
		List<String> trdUnitTables = new ArrayList<String>();
		trdUnitTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		trdUnitTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return trdUnitTables;
	}
	
	protected List<String> getUnitBaseTables() {
		List<String> UnitTables = new ArrayList<String>();
		UnitTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		UnitTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return UnitTables;
	}
	
	protected List<String> getTaxBaseTables() {
		List<String> taxTables = new ArrayList<String>();
		taxTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		taxTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return taxTables;
	}
	
	protected List<String> getSlsTaxBaseTables() {
		List<String> slsTaxTables = new ArrayList<String>();
		slsTaxTables.add(MBT_BP_IF_R.TABLE_NAME);
		return slsTaxTables;
	}
	
	protected List<String> getPurcTaxBaseTables() {
		List<String> purcTaxTables = new ArrayList<String>();
		purcTaxTables.add(MBT_BP_IF_R.TABLE_NAME);
		return purcTaxTables;
	}
	
	protected List<String> getProvTaxBaseTables() {
		List<String> provTaxTables = new ArrayList<String>();
		provTaxTables.add(MBT_BP_IF_R.TABLE_NAME);
		return provTaxTables;
	}
	
	protected List<String> getAcTaxBaseTables() {
		List<String> taxTables = new ArrayList<String>();
		taxTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return taxTables;
	}
	
	protected List<String> getAcAcTaxBaseTables() {
		List<String> acTaxTables = new ArrayList<String>();
		acTaxTables.add(MBT_ACCOUNT_IF_R.TABLE_NAME);
		acTaxTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		return acTaxTables;
	}
	
	protected List<String> getUsrBaseTables() {
		List<String> usrTables = new ArrayList<String>();
		usrTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		usrTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		usrTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		usrTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return usrTables;
	}
	
	protected List<String> getSttlBaseTables() {
		List<String> sttlTables = new ArrayList<String>();
		sttlTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		sttlTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		return sttlTables;
	}
	
	protected List<String> getApSttlBaseTables() {
		List<String> apSttlTables = new ArrayList<String>();
		apSttlTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		return apSttlTables;
	}
	
	protected List<String> getArSttlBaseTables() {
		List<String> arSttlTables = new ArrayList<String>();
		arSttlTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return arSttlTables;
	}
	
	protected List<String> getBankAcBaseTables() {
		List<String> bankAcTables = new ArrayList<String>();
		bankAcTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		bankAcTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		bankAcTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		return bankAcTables;
	}
	
	protected List<String> getPayBankAcBaseTables() {
		List<String> payBankAcTables = new ArrayList<String>();
		payBankAcTables.add(MBT_SCHD_PAY_SND_IF_R.TABLE_NAME);
		payBankAcTables.add(MBT_BP_IF_R.TABLE_NAME);
		return payBankAcTables;
	}
	
	protected List<String> getNoteRsnBaseTables() {
		List<String> noteRsnTables = new ArrayList<String>();
		noteRsnTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		return noteRsnTables;
	}
	
	protected List<String> getBankBaseTables() {
		List<String> bankTables = new ArrayList<String>();
		bankTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		bankTables.add(MBT_BANK_AC_IF_R.TABLE_NAME);
		bankTables.add(MBT_BANK_BRANCH_IF_R.TABLE_NAME);
		bankTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return bankTables;
	}
	
	protected List<String> getBankBranchBaseTables() {
		List<String> bankBranchTables = new ArrayList<String>();
		bankBranchTables.add(MBT_NOTE_SND_IF_R.TABLE_NAME);
		bankBranchTables.add(MBT_BANK_AC_IF_R.TABLE_NAME);
		return bankBranchTables;
	}
	
	protected List<String> getCalBaseTables() {
		List<String> calTables = new ArrayList<String>();
		calTables.add(MBT_BANK_BRANCH_IF_R.TABLE_NAME);
		calTables.add(MBT_BANK_IF_R.TABLE_NAME);
		return calTables;
	}
	
	protected List<String> getTrdBaseTables() {
		List<String> trdTables = new ArrayList<String>();
		trdTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		trdTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return trdTables;
	}
	
	protected List<String> getArrLgGrpBaseTables() {
		List<String> arrLgGrpTables = new ArrayList<String>();
		arrLgGrpTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		return arrLgGrpTables;
	}
	
	protected List<String> getShipLgGrpBaseTables() {
		List<String> shipLgGrpTables = new ArrayList<String>();
		shipLgGrpTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return shipLgGrpTables;
	}
	
	protected List<String> getLgGrpBaseTables() {
		List<String> lgGrpTables = new ArrayList<String>();
		lgGrpTables.add(MBT_BP_IF_R.TABLE_NAME);
		return lgGrpTables;
	}
	
	protected List<String> getItmGrpBaseTables() {
		List<String> itmGrpTables = new ArrayList<String>();
		itmGrpTables.add(MBT_JOURNAL_SND_IF_R.TABLE_NAME);
		return itmGrpTables;
	}
	
	protected List<String> getItmJnlBaseTables() {
		List<String> itmJnlTables = new ArrayList<String>();
		itmJnlTables.add(MBT_PURC_SLIP_SND_IF_R.TABLE_NAME);
		itmJnlTables.add(MBT_SLS_SLIP_SND_IF_R.TABLE_NAME);
		return itmJnlTables;
	}
	
	protected List<String> getJnlGrpBaseTables() {
		List<String> itmJnlTables = new ArrayList<String>();
		itmJnlTables.add(MBT_BAC_AC_IF_R.TABLE_NAME);
		return itmJnlTables;
	}
	
	protected List<String> getItmBaseTables() {
		List<String> itmTables = new ArrayList<String>();
		itmTables.add(MBT_ITM_SND_IF_R.TABLE_NAME);
		itmTables.add(MBT_ITM_STOP_SND_IF_R.TABLE_NAME);
		itmTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		itmTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return itmTables;
	}
	
	protected List<String> getHsBaseTables() {
		List<String> hsTables = new ArrayList<String>();
		hsTables.add(MBT_EX_CTRL_SND_IF_R.TABLE_NAME);
		return hsTables;
	}
	
	protected List<String> getCntryBaseTables() {
		List<String> cntryTables = new ArrayList<String>();
		cntryTables.add(MBT_EX_CTRL_SND_IF_R.TABLE_NAME);
		cntryTables.add(MBT_BP_IF_R.TABLE_NAME);
		return cntryTables;
	}
	
	protected List<String> getLocBaseTables() {
		List<String> inToLocTables = new ArrayList<String>();
		inToLocTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		inToLocTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return inToLocTables;
	}
	
	protected List<String> getWgBaseTables() {
		List<String> wgTables = new ArrayList<String>();
		wgTables.add(MBT_PURC_UPRI_IF_R.TABLE_NAME);
		wgTables.add(MBT_PROC_UPRI_IF_R.TABLE_NAME);
		return wgTables;
	}
	
	protected List<String> getAreaBaseTables() {
		List<String> areaTables = new ArrayList<String>();
		areaTables.add(MBT_BP_IF_R.TABLE_NAME);
		return areaTables;
	}
	
	protected List<String> getCstShipFormBaseTables() {
		List<String> cstShipFormTables = new ArrayList<String>();
		cstShipFormTables.add(MBT_BP_IF_R.TABLE_NAME);
		return cstShipFormTables;
	}
	
	protected List<String> getStkLstFormBaseTables() {
		List<String> stkLstFormTables = new ArrayList<String>();
		stkLstFormTables.add(MBT_BP_IF_R.TABLE_NAME);
		return stkLstFormTables;
	}
	
	protected List<String> getSpplShipFormBaseTables() {
		List<String> spplShipFormTables = new ArrayList<String>();
		spplShipFormTables.add(MBT_BP_IF_R.TABLE_NAME);
		return spplShipFormTables;
	}
	
	protected List<String> getBillCalBaseTables() {
		List<String> billCalBaseTables = new ArrayList<String>();
		billCalBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return billCalBaseTables;
	}
	
	protected List<String> getDlvCalBaseTables() {
		List<String> dlvCalBaseTables = new ArrayList<String>();
		dlvCalBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return dlvCalBaseTables;
	}
	
	protected List<String> getSpplCalBaseTables() {
		List<String> spplCalBaseTables = new ArrayList<String>();
		spplCalBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return spplCalBaseTables;
	}
	
	protected List<String> getCstTterm1BaseTables() {
		List<String> cstTterm1Tables = new ArrayList<String>();
		cstTterm1Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return cstTterm1Tables;
	}
	
	protected List<String> getCstTterm2BaseTables() {
		List<String> cstTterm2Tables = new ArrayList<String>();
		cstTterm2Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return cstTterm2Tables;
	}
	
	protected List<String> getCstTterm3BaseTables() {
		List<String> cstTterm3Tables = new ArrayList<String>();
		cstTterm3Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return cstTterm3Tables;
	}
	
	protected List<String> getSpplTterm1BaseTables() {
		List<String> spplTterm1Tables = new ArrayList<String>();
		spplTterm1Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return spplTterm1Tables;
	}
	
	protected List<String> getSpplTterm2BaseTables() {
		List<String> spplTterm2Tables = new ArrayList<String>();
		spplTterm2Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return spplTterm2Tables;
	}
	
	protected List<String> getSpplTterm3BaseTables() {
		List<String> spplTterm3Tables = new ArrayList<String>();
		spplTterm3Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return spplTterm3Tables;
	}
	
	protected List<String> getSlsAnlyBaseTables() {
		List<String> slsAnly1Tables = new ArrayList<String>();
		slsAnly1Tables.add(MBT_BP_IF_R.TABLE_NAME);
		return slsAnly1Tables;
	}
	
	protected List<String> getArSetoffGrpBaseTables() {
		List<String> arSetoffGrpTables = new ArrayList<String>();
		arSetoffGrpTables.add(MBT_BP_IF_R.TABLE_NAME);
		return arSetoffGrpTables;
	}
	
	protected List<String> getApSetoffGrpBaseTables() {
		List<String> apSetoffGrpTables = new ArrayList<String>();
		apSetoffGrpTables.add(MBT_BP_IF_R.TABLE_NAME);
		return apSetoffGrpTables;
	}
	
	protected List<String> getPoPrintBaseTables() {
		List<String> poPrintTables = new ArrayList<String>();
		poPrintTables.add(MBT_BP_IF_R.TABLE_NAME);
		return poPrintTables;
	}
	
	protected List<String> getBpGrpBaseTables() {
		List<String> bpGrpTables = new ArrayList<String>();
		bpGrpTables.add(MBT_BP_IF_R.TABLE_NAME);
		return bpGrpTables;
	}
	
	protected List<String> getArDptBaseBaseTables() {
		List<String> arDptBaseTables = new ArrayList<String>();
		arDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return arDptBaseTables;
	}
	
	protected List<String> getBcstDptBaseBaseTables() {
		List<String> bcstDptBaseTables = new ArrayList<String>();
		bcstDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return bcstDptBaseTables;
	}
	
	protected List<String> getVmiPurcDptBaseBaseTables() {
		List<String> vmiPurcDptBaseTables = new ArrayList<String>();
		vmiPurcDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return vmiPurcDptBaseTables;
	}
	
	protected List<String> getApDptBaseBaseTables() {
		List<String> apDptBaseTables = new ArrayList<String>();
		apDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return apDptBaseTables;
	}
	
	protected List<String> getBspplDptBaseBaseTables() {
		List<String> bspplDptBaseTables = new ArrayList<String>();
		bspplDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return bspplDptBaseTables;
	}
	
	protected List<String> getPayDptBaseBaseTables() {
		List<String> payDptBaseTables = new ArrayList<String>();
		payDptBaseTables.add(MBT_BP_IF_R.TABLE_NAME);
		return payDptBaseTables;
	}
	
	protected void setValuesDbcBps(MCList<MCDBContainer> dbL) {
		if (getBpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bp_cd", "bp_nm");
		}
		if (getRcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "rcst_cd", "rcst_nm");
		}
		if (getSpplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "sppl_cd", "sppl_nm");
		}
		if (getCredBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "cred_cd", "cred_nm");
		}
		if (getBspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bsppl_cd", "bsppl_nm");
		}
		if (getAspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "asppl_cd", "asppl_nm");
		}
		if (getPspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "psppl_cd", "psppl_nm");
		}
		if (getCstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "cst_cd", "cst_nm");
		}
		if (getPrspplBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "prsppl_cd", "prsppl_nm");
		}
		if (getBcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "bcst_cd", "bcst_nm");
		}
		if (getMakerBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "maker_cd", "maker_nm");
		}
		if (getDlvBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "dlv_cd", "dlv_nm");
		}
		if (getAcstBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "acst_cd", "acst_nm");
		}
		if (getArCredBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "ar_cred_cd", "ar_cred_nm");
		}
		if (getApCredBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBp(dbL, "ap_cred_cd", "ap_cred_nm");
		}
	}
	
	protected void setValuesDbcXrates(MCList<MCDBContainer> dbL) {
		if (getXrateBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcXrate(dbL, "xrate_cd", "xrate_nm");
		}
		if (getPtaxXrateBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcXrate(dbL, "ptax_xrate_cd", "ptax_xrate_nm");
		}
	}
	
	protected void setValuesDbcCurs(MCList<MCDBContainer> dbL) {
		if (getBaseCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "base_cur_cd", "base_cur_nm");
		}
		if (getTrdCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "trd_cur_cd", "trd_cur_nm");
		}
		if (getPtaxCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "ptax_cur_cd", "ptax_cur_nm");
		}
		if (getFrCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "fr_cur_cd", "fr_cur_nm");
		}
		if (getToCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "to_cur_cd", "to_cur_nm");
		}
		if (getCurBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCur(dbL, "cur_cd", "cur_nm");
		}
	}
	
	protected void setValuesDbcDpts(MCList<MCDBContainer> dbL) {
		if (isSame(dbL.createRow().tableName(), MBT_PURC_SLIP_SND_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "bsppl_dpt_cd", "ac_dt", "bsppl_dpt_nm");
			setValuesDbcDpt(dbL, "dpt_cd", "ac_dt", "dpt_nm");
			setValuesDbcDpt(dbL, "ap_dpt_cd", "ac_dt", "ap_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MBT_SLS_SLIP_SND_IF_R.TABLE_NAME)) {
			setValuesDbcDpt(dbL, "dpt_cd", "ac_dt", "dpt_nm");
			setValuesDbcDpt(dbL, "sls_dpt_cd", "ac_dt", "sls_dpt_nm");
			setValuesDbcDpt(dbL, "asst_dpt_cd", "ac_dt", "asst_dpt_nm");
			setValuesDbcDpt(dbL, "bill_dpt_cd", "ac_dt", "bill_dpt_nm");
			setValuesDbcDpt(dbL, "ar_dpt_cd", "ac_dt", "ar_dpt_nm");
		}
	}
	
	protected void setValuesDbcAcDpts(MCList<MCDBContainer> dbL) {
		if (isSame(dbL.createRow().tableName(), MBT_JOURNAL_SND_IF_R.TABLE_NAME)) {
			setValuesDbcAcDpt(dbL, "dpt_cd", "ac_dt", "dpt_nm");
			setValuesDbcAcDpt(dbL, "other_dpt_cd", "ac_dt", "other_dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MBT_NOTE_SND_IF_R.TABLE_NAME)) {
			setValuesDbcAcDpt(dbL, "dpt_cd", "ac_dt", "dpt_nm");
		}
		if (isSame(dbL.createRow().tableName(), MBT_SCHD_PAY_SND_IF_R.TABLE_NAME)) {
			setValuesDbcAcDpt(dbL, "pay_dpt_cd", "ac_dt", "pay_dpt_nm");
			setValuesDbcAcDpt(dbL, "bsppl_dpt_cd", "ac_dt", "bsppl_dpt_nm");
			setValuesDbcAcDpt(dbL, "ap_dpt_cd", "ac_dt", "ap_dpt_nm");
			setValuesDbcAcDpt(dbL, "sub_dpt_cd1", "ac_dt", "sub_dpt_nm1");
			setValuesDbcAcDpt(dbL, "sub_dpt_cd2", "ac_dt", "sub_dpt_nm2");
			setValuesDbcAcDpt(dbL, "sub_dpt_cd3", "ac_dt", "sub_dpt_nm3");
		}
	}
	
	protected void setValuesDbcAcs(MCList<MCDBContainer> dbL) {
		if (getAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcs(dbL, "ac_cd", "ac_nm");
		}
		if (getOtherAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcs(dbL, "other_ac_cd", "other_ac_nm");
		}
	}
	
	protected void setValuesDbcSubAcs(MCList<MCDBContainer> dbL) {
		if (getSubAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSubAcs(dbL, "ac_cd", "sub_ac_cd", "sub_ac_nm");
		}
		if (getOtherSubAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSubAcs(dbL, "other_ac_cd", "other_sub_ac_cd", "other_sub_ac_nm");
		}
	}
	
	protected void setValuesDbcUnits(MCList<MCDBContainer> dbL) {
		if (getBaseUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "base_unit_cd", "base_unit_nm");
		}
		if (getTrdUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "trd_unit_cd", "trd_unit_nm");
		}
		if (getUnitBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUnit(dbL, "unit_cd", "unit_nm");
		}
	}
	
	protected void setValuesDbcTaxs(MCList<MCDBContainer> dbL) {
		if (getTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTax(dbL, "tax_cd", "tax_nm");
		}
		if (getSlsTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTax(dbL, "sls_tax_cd", "sls_tax_nm");
		}
		if (getPurcTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTax(dbL, "purc_tax_cd", "purc_tax_nm");
		}
		if (getProvTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTax(dbL, "prov_tax_cd", "prov_tax_nm");
		}
	}
	
	protected void setValuesDbcAcTaxs(MCList<MCDBContainer> dbL) {
		if (getAcTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcTax(dbL, "tax_cd", "tax_nm");
		}
		if (getAcAcTaxBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcAcTax(dbL, "ac_tax_cd", "ac_tax_nm");
		}
	}
	
	protected void setValuesDbcUsrs(MCList<MCDBContainer> dbL) {
		if (getUsrBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcUsr(dbL, "usr_cd", "usr_nm");
		}
	}
	
	protected void setValuesDbcSttls(MCList<MCDBContainer> dbL) {
		if (getSttlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "sttl_cd", "sttl_nm");
		}
		if (getApSttlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "ap_sttl_cd", "ap_sttl_nm");
		}
		if (getArSttlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSttl(dbL, "ar_sttl_cd", "ar_sttl_nm");
		}
	}
	
	protected void setValuesDbcBankAc(MCList<MCDBContainer> dbL) {
		if (getBankAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBankAc(dbL, "bank_ac_cd", "bank_ac_nm");
		}
		if (getPayBankAcBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBankAc(dbL, "pay_bank_ac_cd", "pay_bank_ac_nm");
		}
	}
	
	protected void setValuesDbcNoteRsns(MCList<MCDBContainer> dbL) {
		if (getNoteRsnBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcNoteRsn(dbL, "note_rsn_cd", "note_rsn_nm");
		}
	}
	
	protected void setValuesDbcBank(MCList<MCDBContainer> dbL) {
		if (getBankBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBank(dbL, "bank_cd", "bank_nm");
		}
	}
	
	protected void setValuesDbcBankBranch(MCList<MCDBContainer> dbL) {
		if (getBankBranchBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcBankBranch(dbL, "bank_cd", "branch_cd", "branch_nm");
		}
	}
	
	protected void setValuesDbcTrds(MCList<MCDBContainer> dbL) {
		if (getTrdBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTrd(dbL, "trd_cd", "trd_nm");
		}
	}
	
	protected void setValuesDbcLgGrps(MCList<MCDBContainer> dbL) {
		if (getArrLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "arr_lg_grp_cd", "arr_lg_grp_nm");
		}
		if (getShipLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "ship_lg_grp_cd", "ship_lg_grp_nm");
		}
		if (getLgGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLgGrp(dbL, "lg_grp_cd", "lg_grp_nm");
		}
	}
	
	protected void setValuesDbcItmGrps(MCList<MCDBContainer> dbL) {
		if (getItmGrpBaseTables().contains(dbL.createRow().tableName())) {
			for (MCList<MCDBContainer> l : dbL.groupList("itm_grp_typ")) {
				setValuesDbcItmGrp(l, "itm_grp_cd", "itm_grp_nm", l.get(0).getStringNE("itm_grp_typ"));
			}
		}
	}
	
	protected void setValuesDbcItmJnls(MCList<MCDBContainer> dbL) {
		if (getItmJnlBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItmJnl(dbL, "itm_jnl_cd", "itm_jnl_nm");
		}
	}
	
	protected void setValuesDbcJnlGrps(MCList<MCDBContainer> dbL) {
		if (getJnlGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcJnlGrp(dbL, "jnl_grp_cd", "jnl_grp_nm");
		}
	}
	
	protected void setValuesDbcItms(MCList<MCDBContainer> dbL) {
		if (getItmBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcItm(dbL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "itm_nm");
		}
	}
	
	protected void setValuesDbcHss(MCList<MCDBContainer> dbL) {
		if (getHsBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcHs(dbL, "hs_cd", "hs_nm");
		}
	}
	
	protected void setValuesDbcCntries(MCList<MCDBContainer> dbL) {
		if (getCntryBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCntry(dbL, "cntry_cd", "cntry_nm");
		}
	}
	
	protected void setValuesDbcLocs(MCList<MCDBContainer> dbL) {
		if (getLocBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcLoc(dbL, "loc_cd", "loc_nm");
		}
	}
	
	protected void setValuesDbcWgs(MCList<MCDBContainer> dbL) {
		if (getWgBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcWg(dbL, "wg_cd", "wg_nm");
		}
	}
	
	protected void setValuesDbcAreas(MCList<MCDBContainer> dbL) {
		if (getAreaBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcArea(dbL, "area_cd", "area_nm");
		}
	}
	
	protected void setValuesDbcSlipForms(MCList<MCDBContainer> dbL) {
		if (getCstShipFormBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSlipForm(dbL, "cst_ship_form_cd", "cst_ship_form_nm");
		}
		if (getStkLstFormBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSlipForm(dbL, "stk_lst_form_cd", "stk_lst_form_nm");
		}
		if (getSpplShipFormBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSlipForm(dbL, "sppl_ship_form_cd", "sppl_ship_form_nm");
		}
	}
	
	protected void setValuesDbcCal(MCList<MCDBContainer> dbL) {
		if (getBillCalBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCal(dbL, "bill_cal_cd", "bill_cal_nm");
		}
		if (getDlvCalBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCal(dbL, "dlv_cal_cd", "dlv_cal_nm");
		}
		if (getSpplCalBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCal(dbL, "sppl_cal_cd", "sppl_cal_nm");
		}
		if (getCalBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcCal(dbL, "cal_cd", "cal_nm");
		}
	}
	
	protected void setValuesDbcTterm(MCList<MCDBContainer> dbL) {
		if (getCstTterm1BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "cst_tterm_cd1", "cst_tterm_nm1");
		}
		if (getCstTterm2BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "cst_tterm_cd2", "cst_tterm_nm2");
		}
		if (getCstTterm3BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "cst_tterm_cd3", "cst_tterm_nm3");
		}
		if (getSpplTterm1BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "sppl_tterm_cd1", "sppl_tterm_nm1");
		}
		if (getSpplTterm2BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "sppl_tterm_cd2", "sppl_tterm_nm2");
		}
		if (getSpplTterm3BaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcTterm(dbL, "sppl_tterm_cd3", "sppl_tterm_nm3");
		}
	}
	
	protected void setValuesDbcSlsAnlies(MCList<MCDBContainer> dbL) {
		if (getSlsAnlyBaseTables().contains(dbL.createRow().tableName())) {
			for (int i = 1; i <= getSlsAnlyTyps().length; i++) {
				String slsAnlyCdColumn = "sls_anly_cd" + i;
				String slsAnlyNmAlias = "sls_anly_nm" + i;
				setValuesDbcSlsAnly(dbL, slsAnlyCdColumn, slsAnlyNmAlias, getSlsAnlyTyps()[i - 1]);
			}
		}
	}
	
	protected String[] getSlsAnlyTyps() {
		return new String[] {
				MAC_SLS_ANLY_TYP.ANLY1.value(), MAC_SLS_ANLY_TYP.ANLY2.value(),
				MAC_SLS_ANLY_TYP.ANLY3.value()
		};
	}
	
	protected void setValuesDbcSetoffGrps(MCList<MCDBContainer> dbL) {
		if (getArSetoffGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSetoffGrp(dbL, "ar_setoff_grp_cd", "ar_setoff_grp_nm");
		}
		if (getApSetoffGrpBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcSetoffGrp(dbL, "ap_setoff_grp_cd", "ap_setoff_grp_nm");
		}
	}
	
	protected void setValuesDbcPoPrints(MCList<MCDBContainer> dbL) {
		if (getPoPrintBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcPoPrint(dbL, "po_print_cd", "po_print_nm");
		}
	}
	
	protected void setValuesDbcBpGrps(MCList<MCDBContainer> dbL) {
		if (getBpGrpBaseTables().contains(dbL.createRow().tableName())) {
			for (int i = 1; i <= getBpGrpTyps().length; i++) {
				String grpCdColumn = "bp_grp_cd" + i;
				String grpNmAlias = "bp_grp_nm" + i;
				setValuesDbcBpGrp(dbL, grpCdColumn, grpNmAlias, getBpGrpTyps()[i - 1]);
			}
		}
	}
	
	protected String[] getBpGrpTyps() {
		return new String[] {
				MAC_BP_GRP_TYP.GRP1.value(), MAC_BP_GRP_TYP.GRP2.value(),
				MAC_BP_GRP_TYP.GRP3.value(), MAC_BP_GRP_TYP.GRP4.value(),
				MAC_BP_GRP_TYP.GRP5.value(), MAC_BP_GRP_TYP.GRP6.value(),
				MAC_BP_GRP_TYP.GRP7.value(), MAC_BP_GRP_TYP.GRP8.value(),
				MAC_BP_GRP_TYP.GRP9.value(), MAC_BP_GRP_TYP.GRP10.value()
		};
	}
	
	protected void setValuesDbcDptBases(MCList<MCDBContainer> dbL) {
		if (getArDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "ar_dpt_cd", "ar_dpt_nm");
		}
		if (getBcstDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "bcst_dpt_cd", "bcst_dpt_nm");
		}
		if (getVmiPurcDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "vmi_purc_dpt_cd", "vmi_purc_dpt_nm");
		}
		if (getApDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "ap_dpt_cd", "ap_dpt_nm");
		}
		if (getBspplDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "bsppl_dpt_cd", "bsppl_dpt_nm");
		}
		if (getPayDptBaseBaseTables().contains(dbL.createRow().tableName())) {
			setValuesDbcDptBase(dbL, "pay_dpt_cd", "pay_dpt_nm");
		}
	}
	
	protected void setValuesDbcItm(MCList<MCDBContainer> dbL, String itmCdColumn, String itmSub1Column, String itmSub2Column, String itmSub3Column, String itmNmAlias) {
		setValuesDbc(getJoinInfoItm(itmCdColumn, itmSub1Column, itmSub2Column, itmSub3Column, itmNmAlias), null, dbL);
	}
	
	
	protected void setValuesDbcSundryItm(MCList<MCDBContainer> dbL, String itmCdColumn, String itmSub1Column, String itmSub2Column, String itmSub3Column,
			String sno1Column, String sno2Column, String sno3Column, String sno4Column, String itmNmAlias) {
		setValuesDbc(getJoinInfoSundryItm(itmCdColumn, itmSub1Column, itmSub2Column, itmSub3Column, sno1Column, sno2Column, sno3Column, sno4Column, itmNmAlias), null, dbL);
	}
	
	protected void setValuesDbcDpt(MCList<MCDBContainer> dbL, String dptCdColumn, String stDtColumn, String dptNmAlias) {
		setValuesDbc(getJoinInfoDpt(dptCdColumn, stDtColumn, dptNmAlias), null, dbL);
	}

	protected void setValuesDbcAcDpt(MCList<MCDBContainer> dbL, String acDptCdColumn, String stDtColumn, String acDptNmAlias) {
		setValuesDbc(getJoinInfoAcDpt(acDptCdColumn, stDtColumn, acDptNmAlias), null, dbL);
	}

	protected void setValuesDbcAltGrp(MCList<MCDBContainer> dbL, String altGrpCdColumn, String wgCdColumn, String altGrpNmAlias) {
		setValuesDbc(getJoinInfoAltGrp(altGrpCdColumn, wgCdColumn, altGrpNmAlias), null, dbL);
	}

	protected void setValuesDbcItmGrp(MCList<MCDBContainer> dbL, String itmGrpCdColumn, String itmGrpNmAlias, String grpTypConstant) {
		setValuesDbc(getJoinInfoItmGrp(itmGrpCdColumn, itmGrpNmAlias, grpTypConstant), null, dbL);
	}

	protected void setValuesDbcItmJnl(MCList<MCDBContainer> dbL, String itmJnlCdColumn, String itmJnlNmAlias) {
		setValuesDbc(getJoinInfoItmJnl(itmJnlCdColumn, itmJnlNmAlias), null, dbL);
	}

	protected void setValuesDbcTrd(MCList<MCDBContainer> dbL, String trdCdColumn, String trdNmAlias) {
		setValuesDbc(getJoinInfoTrd(trdCdColumn, trdNmAlias), null, dbL);
	}

	protected void setValuesDbcBizRsn(MCList<MCDBContainer> dbL, String bizRsnCdColumn, String bizRsnNmAlias) {
		setValuesDbc(getJoinInfoBizRsn(bizRsnCdColumn, bizRsnNmAlias), null, dbL);
	}
	
	protected void setValuesDbcNoteRsn(MCList<MCDBContainer> dbL, String noteRsnCdColumn, String noteRsnNmAlias) {
		setValuesDbc(getJoinInfoNoteRsn(noteRsnCdColumn, noteRsnNmAlias), null, dbL);
	}

	protected void setValuesDbcAcRsn(MCList<MCDBContainer> dbL, String acRsnCdColumn, String acRsnNmAlias) {
		setValuesDbc(getJoinInfoAcRsn(acRsnCdColumn, acRsnNmAlias), null, dbL);
	}

	protected void setValuesDbcWg(MCList<MCDBContainer> dbL, String wgCdColumn, String wgNmAlias) {
		setValuesDbc(getJoinInfoWg(wgCdColumn, wgNmAlias), null, dbL);
	}

	protected void setValuesDbcUsr(MCList<MCDBContainer> dbL, String usrCdColumn, String usrNmAlias) {
		setValuesDbc(getJoinInfoUsr(usrCdColumn, usrNmAlias), null, dbL);
	}

	protected void setValuesDbcLoc(MCList<MCDBContainer> dbL, String locCdColumn, String locNmAlias) {
		setValuesDbc(getJoinInfoLoc(locCdColumn, locNmAlias), null, dbL);
	}

	protected void setValuesDbcStrLn(MCList<MCDBContainer> dbL, String locCdColumn, String strLnCdColumn, String strLnNmAlias) {
		setValuesDbc(getJoinInfoStrLn(locCdColumn, strLnCdColumn, strLnNmAlias), null, dbL);
	}

	protected void setValuesDbcBp(MCList<MCDBContainer> dbL, String bpCdColumn, String bpNmAlias) {
		setValuesDbc(getJoinInfoBp(bpCdColumn, bpNmAlias), null, dbL);
	}

	protected void setValuesDbcAcItmGrp(MCList<MCDBContainer> dbL, String acItmGrpCdColumn, String acItmGrpNmAlias) {
		setValuesDbc(getJoinInfoAcItmGrp(acItmGrpCdColumn, acItmGrpNmAlias), null, dbL);
	}

	protected void setValuesDbcStkGd(MCList<MCDBContainer> dbL, String gdCdColumn, String gdNmAlias) {
		setValuesDbc(getJoinInfoStkGd(gdCdColumn, gdNmAlias), null, dbL);
	}

	protected void setValuesDbcUnit(MCList<MCDBContainer> dbL, String unitCdColumn, String unitNmAlias) {
		setValuesDbc(getJoinInfoUnit(unitCdColumn, unitNmAlias), null, dbL);
	}

	protected void setValuesDbcCur(MCList<MCDBContainer> dbL, String curCdColumn, String curNmAlias) {
		setValuesDbc(getJoinInfoCur(curCdColumn, curNmAlias), null, dbL);
	}

	protected void setValuesDbcTax(MCList<MCDBContainer> dbL, String taxCdColumn, String taxNmAlias) {
		setValuesDbc(getJoinInfoTax(taxCdColumn, taxNmAlias), null, dbL);
	}

	protected void setValuesDbcAcTax(MCList<MCDBContainer> dbL, String acTaxCdColumn, String acTaxNmAlias) {
		setValuesDbc(getJoinInfoAcTax(acTaxCdColumn, acTaxNmAlias), null, dbL);
	}

	protected void setValuesDbcXrate(MCList<MCDBContainer> dbL, String xrateCdColumn, String xrateNmAlias) {
		setValuesDbc(getJoinInfoXrate(xrateCdColumn, xrateNmAlias), null, dbL);
	}

	protected void setValuesDbcSttl(MCList<MCDBContainer> dbL, String sttlCdColumn, String sttlNmAlias) {
		setValuesDbc(getJoinInfoSttl(sttlCdColumn, sttlNmAlias), null, dbL);
	}

	protected void setValuesDbcArea(MCList<MCDBContainer> dbL, String areaCdColumn, String areaNmAlias) {
		setValuesDbc(getJoinInfoArea(areaCdColumn, areaNmAlias), null, dbL);
	}

	protected void setValuesDbcCntry(MCList<MCDBContainer> dbL, String cntryCdColumn, String cntryNmAlias) {
		setValuesDbc(getJoinInfoCntry(cntryCdColumn, cntryNmAlias), null, dbL);
	}

	protected void setValuesDbcOper(MCList<MCDBContainer> dbL, String operCdColumn, String operNmAlias) {
		setValuesDbc(getJoinInfoOper(operCdColumn, operNmAlias), null, dbL);
	}

	protected void setValuesDbcLgGrp(MCList<MCDBContainer> dbL, String lgGrpCdColumn, String lgGrpNmAlias) {
		setValuesDbc(getJoinInfoLgGrp(lgGrpCdColumn, lgGrpNmAlias), null, dbL);
	}

	protected void setValuesDbcSiteCo(MCList<MCDBContainer> dbL, String siteCoCdColumn, String siteCoNmAlias) {
		setValuesDbc(getJoinInfoSiteCo(siteCoCdColumn, siteCoNmAlias), null, dbL);
	}

	protected void setValuesDbcCostCtg(MCList<MCDBContainer> dbL, String costCtgCdColumn, String costCtgNmAlias) {
		setValuesDbc(getJoinInfoCostCtg(costCtgCdColumn, costCtgNmAlias), null, dbL);
	}

	protected void setValuesDbcShipTerm(MCList<MCDBContainer> dbL, String shipTermCdColumn, String shipTermNmAlias) {
		setValuesDbc(getJoinInfoShipTerm(shipTermCdColumn, shipTermNmAlias), null, dbL);
	}

	protected void setValuesDbcTrnspt(MCList<MCDBContainer> dbL, String trnsptCdColumn, String trnsptNmAlias) {
		setValuesDbc(getJoinInfoTrnspt(trnsptCdColumn, trnsptNmAlias), null, dbL);
	}

	protected void setValuesDbcEximPort(MCList<MCDBContainer> dbL, String portCdColumn, String portNmAlias) {
		setValuesDbc(getJoinInfoEximPort(portCdColumn, portNmAlias), null, dbL);
	}

	protected void setValuesDbcTterm(MCList<MCDBContainer> dbL, String ttermCdColumn, String ttermNmAlias) {
		setValuesDbc(getJoinInfoTterm(ttermCdColumn, ttermNmAlias), null, dbL);
	}
	
	protected void setValuesDbcPoPrint(MCList<MCDBContainer> dbL, String poprintCdColumn, String poprintNmAlias) {
		setValuesDbc(getJoinInfoPoPrint(poprintCdColumn, poprintNmAlias), null, dbL);
	}

	protected void setValuesDbcWkCost(MCList<MCDBContainer> dbL, String wkCostCdColumn, String wkCostNmAlias) {
		setValuesDbc(getJoinInfoWkCost(wkCostCdColumn, wkCostNmAlias), null, dbL);
	}

	protected void setValuesDbcWkDay(MCList<MCDBContainer> dbL, String wkDayCdColumn, String wkDayNmAlias) {
		setValuesDbc(getJoinInfoWkDay(wkDayCdColumn, wkDayNmAlias), null, dbL);
	}

	protected void setValuesDbcWkRsn(MCList<MCDBContainer> dbL, String wkRsnCdColumn, String wkRsnNmAlias) {
		setValuesDbc(getJoinInfoWkRsn(wkRsnCdColumn, wkRsnNmAlias), null, dbL);
	}

	protected void setValuesDbcBank(MCList<MCDBContainer> dbL, String bankCdColumn, String bankNmAlias) {
		setValuesDbc(getJoinInfoBank(bankCdColumn, bankNmAlias), null, dbL);
	}
	
	protected void setValuesDbcBankAc(MCList<MCDBContainer> dbL, String bankAcCdColumn, String bankAcNmAlias) {
		setValuesDbc(getJoinInfoBankAc(bankAcCdColumn, bankAcNmAlias), null, dbL);
	}
	
	protected void setValuesDbcBankBranch(MCList<MCDBContainer> dbL, String bankCdColumn, String branchCdColumn, String branchNmAlias) {
		setValuesDbc(getJoinInfoBankBranch(bankCdColumn, branchCdColumn, branchNmAlias), null, dbL);
	}
	
	protected void setValuesDbcCal(MCList<MCDBContainer> dbL, String calCdColumn, String calNmAlias) {
		setValuesDbc(getJoinInfoCalBase(calCdColumn, calNmAlias), null, dbL);
	}
	
	protected void setValuesDbcItmTypD(MCList<MCDBContainer> dbL, String itmTypColumn, String itmTypDCdColumn, String itmTypDNmAlias) {
		setValuesDbc(getJoinInfoItmTypD(itmTypColumn, itmTypDCdColumn, itmTypDNmAlias), null, dbL);
	}
	
	protected void setValuesDbcSite(MCList<MCDBContainer> dbL, String siteCdColumn, String siteNmAlias) {
		setValuesDbc(getJoinInfoSite(siteCdColumn, siteNmAlias), null, dbL);
	}
	
	protected void setValuesDbcLocGrp(MCList<MCDBContainer> dbL, String locGrpCdColumn, String locGrpNmAlias) {
		setValuesDbc(getJoinInfoLocGrp(locGrpCdColumn, locGrpNmAlias), null, dbL);
	}
	
	protected void setValuesDbcAcs(MCList<MCDBContainer> dbL, String acCdColumn, String acNmAlias) {
		setValuesDbc(getJoinInfoAc(acCdColumn, acNmAlias), null, dbL);
	}
	
	protected void setValuesDbcSubAcs(MCList<MCDBContainer> dbL, String acCdColumn, String subAcCdColumn, String subAcGrpNmAlias) {
		setValuesDbc(getJoinInfoSubAc(acCdColumn, subAcCdColumn, subAcGrpNmAlias), null, dbL);
	}
	
	protected void setValuesDbcJnlGrp(MCList<MCDBContainer> dbL, String jnlGrpCdColumn, String jnlGrpNmAlias) {
		setValuesDbc(getJoinInfoJnlGrp(jnlGrpCdColumn, jnlGrpNmAlias), null, dbL);
	}
	
	protected void setValuesDbcHs(MCList<MCDBContainer> dbL, String hsCdColumn, String hsNmAlias) {
		setValuesDbc(getJoinInfoHs(hsCdColumn, hsNmAlias), null, dbL);
	}
	
	protected void setValuesDbcSlipForm(MCList<MCDBContainer> dbL, String slipFormCdColumn, String slipFormNmAlias) {
		setValuesDbc(getJoinInfoSlipForm(slipFormCdColumn, slipFormNmAlias), null, dbL);
	}
	
	protected void setValuesDbcSlsAnly(MCList<MCDBContainer> dbL, String slsAnlyCdColumn, String slsAnlyNmAlias, String slsAnlyTypConstant) {
		setValuesDbc(getJoinInfoSlsAnly(slsAnlyCdColumn, slsAnlyNmAlias, slsAnlyTypConstant), null, dbL);
	}
	
	protected void setValuesDbcSetoffGrp(MCList<MCDBContainer> dbL, String setoffGrpCdColumn, String setoffGrpNmAlias) {
		setValuesDbc(getJoinInfoSetoffGrp(setoffGrpCdColumn, setoffGrpNmAlias), null, dbL);
	}
	
	protected void setValuesDbcBpGrp(MCList<MCDBContainer> dbL, String bpGrpCdColumn, String bpGrpNmAlias, String grpTypConstant) {
		setValuesDbc(getJoinInfoBpGrp(bpGrpCdColumn, bpGrpNmAlias, grpTypConstant), null, dbL);
	}
	
	protected void setValuesDbcDptBase(MCList<MCDBContainer> dbL, String dptBaseCdColumn, String dptBaseNmAlias) {
		setValuesDbc(getJoinInfoDptBase(dptBaseCdColumn, dptBaseNmAlias), null, dbL);
	}
	
	protected MCJoinerList<MCRow> getJoinInfoItm(String itmCdColumn, String itmSub1Column, String itmSub2Column, String itmSub3Column, String itmNmAlias) {
		return joinInfo(j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
						r.getStringNE(itmCdColumn), 
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub1Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub2Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub3Column), MAC_STR.NULL_VAL.value())
				))
				.addSelect(m -> toArray(m.itm_nm))
				.addMap((r, m) -> {
					r.setStringNE(itmNmAlias, m.itm_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoSundryItm(String itmCdColumn, String itmSub1Column, String itmSub2Column, String itmSub3Column,
			String sno1Column, String sno2Column, String sno3Column, String sno4Column, String itmNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SUNDRY_ITM_R.class, r -> toCondition(
						r.getStringNE(itmCdColumn), 
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub1Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub2Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub3Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(sno1Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(sno2Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(sno3Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(sno4Column), MAC_STR.NULL_VAL.value())
					))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					if (!isNull(m.itm_nm())) {
						r.setStringNE(itmNmAlias, m.itm_nm());
					}
				}),
				j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
						r.getStringNE(itmCdColumn), 
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub1Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub2Column), MAC_STR.NULL_VAL.value()),
						FXUCL_DataUtil.nvl(r.getStringNE(itmSub3Column), MAC_STR.NULL_VAL.value())
						))
				.addSelect(m -> toArray(m.itm_nm))
				.addMap((r, m) -> {
					if (isNull(r.getStringNE(itmNmAlias))) {
						r.setStringNE(itmNmAlias, m.itm_nm());
					}
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoDpt(String dptCdColumn, String stDtColumn, String dptNmAlias) {
		return joinInfo(j -> j
				.add(MAM_DPT_R.class, r -> toCondition(r.getStringNE(dptCdColumn), r.getDateNE(stDtColumn)))
				.addSelect(m -> toArray(m.dpt_nm))
				.addMap((r, m) -> {
					r.setStringNE((dptNmAlias), m.dpt_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoAcDpt(String acDptCdColumn, String stDtColumn, String acDptNmAlias) {
		return joinInfo(j -> j
				.add(MAM_AC_DPT_R.class, r -> toCondition(r.getStringNE(acDptCdColumn), r.getDateNE(stDtColumn)))
				.addSelect(m -> toArray(m.ac_dpt_nm))
				.addMap((r, m) -> {
					r.setStringNE((acDptNmAlias), m.ac_dpt_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoAltGrp(String altGrpCdColumn, String wgCdColumn, String altGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_ALT_GRP_R.class, r -> toCondition(
						r.getStringNE(altGrpCdColumn),
						FXUCL_DataUtil.nvl(r.getStringNE(wgCdColumn), MAC_STR.NULL_VAL.value())
				))
				.addSelect(m -> toArray(m.alt_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE(altGrpNmAlias, m.alt_grp_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoItmGrp(String itmGrpCdColumn, String itmGrpNmAlias, String grpTypConstant) {
		return joinInfo(j -> j
				.add(MAM_ITM_GRP_R.class, r -> toCondition(grpTypConstant, r.getStringNE(itmGrpCdColumn)))
				.addSelect(m -> toArray(m.itm_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((itmGrpNmAlias), m.itm_grp_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoItmJnl(String itmJnlCdColumn, String itmJnlNmAlias) {
		return joinInfo(j -> j
				.add(MAM_ITM_JNL_R.class, r -> toCondition(r.getStringNE(itmJnlCdColumn)))
				.addSelect(m -> toArray(m.itm_jnl_nm))
				.addMap((r, m) -> {
					r.setStringNE((itmJnlNmAlias), m.itm_jnl_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoTrd(String trdCdColumn, String trdNmAlias) {
		return joinInfo(j -> j
				.add(MAM_TRD_R.class, r -> toCondition(r.getStringNE(trdCdColumn)))
				.addSelect(m -> toArray(m.trd_nm))
				.addMap((r, m) -> {
					r.setStringNE((trdNmAlias), m.trd_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoBizRsn(String bizRsnCdColumn, String bizRsnNmAlias) {
		return joinInfo(j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(r.getStringNE(bizRsnCdColumn)))
				.addSelect(m -> toArray(m.biz_rsn_nm))
				.addMap((r, m) -> {
					r.setStringNE((bizRsnNmAlias), m.biz_rsn_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoNoteRsn(String noteRsnCdColumn, String noteRsnNmAlias) {
		return joinInfo(j -> j
				.add(MAM_NOTE_RSN_R.class, r -> toCondition(r.getStringNE(noteRsnCdColumn)))
				.addSelect(m -> toArray(m.note_rsn_nm))
				.addMap((r, m) -> {
					r.setStringNE((noteRsnNmAlias), m.note_rsn_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoAcRsn(String acRsnCdColumn, String acRsnNmAlias) {
		return joinInfo(j -> j
				.add(MAM_AC_RSN_R.class, r -> toCondition(r.getStringNE(acRsnCdColumn)))
				.addSelect(m -> toArray(m.ac_rsn_nm))
				.addMap((r, m) -> {
					r.setStringNE((acRsnNmAlias), m.ac_rsn_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoWg(String wgCdColumn, String wgNmAlias) {
		return joinInfo(j -> j
				.add(MAM_WG_R.class, r -> toCondition(r.getStringNE(wgCdColumn)))
				.addSelect(m -> toArray(m.wg_nm))
				.addMap((r, m) -> {
					r.setStringNE((wgNmAlias), m.wg_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoUsr(String usrCdColumn, String usrNmAlias) {
		return joinInfo(j -> j
				.add(MAM_USR_R.class, r -> toCondition(r.getStringNE(usrCdColumn)))
				.addSelect(m -> toArray(m.usr_nm))
				.addMap((r, m) -> {
					r.setStringNE((usrNmAlias), m.usr_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoLoc(String locCdColumn, String locNmAlias) {
		return joinInfo(j -> j
				.add(MAM_LOC_R.class, r -> toCondition(r.getStringNE(locCdColumn)))
				.addSelect(m -> toArray(m.loc_nm))
				.addMap((r, m) -> {
					r.setStringNE((locNmAlias), m.loc_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoStrLn(String locCdColumn, String strLnCdColumn, String strLnNmAlias) {
		return joinInfo(j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(r.getStringNE(locCdColumn),r.getStringNE(strLnCdColumn)))
				.addSelect(m -> toArray(m.str_ln_nm))
				.addMap((r, m) -> {
					r.setStringNE((strLnNmAlias), m.str_ln_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoBp(String bpCdColumn, String bpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_BP_R.class, r -> toCondition(r.getStringNE(bpCdColumn)))
				.addSelect(m -> toArray(m.bp_nm))
				.addMap((r, m) -> {
					r.setStringNE((bpNmAlias), m.bp_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoAcItmGrp(String acItmGrpCdColumn, String acItmGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_AC_ITM_GRP_R.class, r -> toCondition(r.getStringNE(acItmGrpCdColumn)))
				.addSelect(m -> toArray(m.ac_itm_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((acItmGrpNmAlias), m.ac_itm_grp_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoStkGd(String gdCdColumn, String gdNmAlias) {
		return joinInfo(j -> j
				.add(MAM_STK_GD_R.class, r -> toCondition(r.getStringNE(gdCdColumn)))
				.addSelect(m -> toArray(m.gd_nm))
				.addMap((r, m) -> {
					r.setStringNE((gdNmAlias), m.gd_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoUnit(String unitCdColumn, String unitNmAlias) {
		return joinInfo(j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(r.getStringNE(unitCdColumn)))
				.addSelect(m -> toArray(m.unit_nm))
				.addMap((r, m) -> {
					r.setStringNE((unitNmAlias), m.unit_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoCur(String curCdColumn, String curNmAlias) {
		return joinInfo(j -> j
				.add(MAM_CUR_R.class, r -> toCondition(r.getStringNE(curCdColumn)))
				.addSelect(m -> toArray(m.cur_nm))
				.addMap((r, m) -> {
					r.setStringNE((curNmAlias), m.cur_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoTax(String taxCdColumn, String taxNmAlias) {
		return joinInfo(j -> j
				.add(MAM_TAX_R.class, r -> toCondition(r.getStringNE(taxCdColumn)))
				.addSelect(m -> toArray(m.tax_nm))
				.addMap((r, m) -> {
					r.setStringNE((taxNmAlias), m.tax_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoAcTax(String acTaxCdColumn, String acTaxNmAlias) {
		return joinInfo(j -> j
				.add(MAM_AC_TAX_R.class, r -> toCondition(r.getStringNE(acTaxCdColumn)))
				.addSelect(m -> toArray(m.ac_tax_nm))
				.addMap((r, m) -> {
					r.setStringNE((acTaxNmAlias), m.ac_tax_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoXrate(String xrateCdColumn, String xrateNmAlias) {
		return joinInfo(j -> j
				.add(MAM_XRATE_R.class, r -> toCondition(r.getStringNE(xrateCdColumn)))
				.addSelect(m -> toArray(m.xrate_nm))
				.addMap((r, m) -> {
					r.setStringNE((xrateNmAlias), m.xrate_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoSttl(String sttlCdColumn, String sttlNmAlias) {
		return joinInfo(j -> j
				.add(MAM_STTL_R.class, r -> toCondition(r.getStringNE(sttlCdColumn)))
				.addSelect(m -> toArray(m.sttl_nm))
				.addMap((r, m) -> {
					r.setStringNE((sttlNmAlias), m.sttl_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoArea(String areaCdColumn, String areaNmAlias) {
		return joinInfo(j -> j
				.add(MAM_AREA_R.class, r -> toCondition(r.getStringNE(areaCdColumn)))
				.addSelect(m -> toArray(m.area_nm))
				.addMap((r, m) -> {
					r.setStringNE((areaNmAlias), m.area_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoCntry(String cntryCdColumn, String cntryNmAlias) {
		return joinInfo(j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(r.getStringNE(cntryCdColumn)))
				.addSelect(m -> toArray(m.cntry_nm))
				.addMap((r, m) -> {
					r.setStringNE((cntryNmAlias), m.cntry_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoOper(String operCdColumn, String operNmAlias) {
		return joinInfo(j -> j
				.add(MAM_OPER_R.class, r -> toCondition(r.getStringNE(operCdColumn)))
				.addSelect(m -> toArray(m.oper_nm))
				.addMap((r, m) -> {
					r.setStringNE((operNmAlias), m.oper_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoLgGrp(String lgGrpCdColumn, String lgGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_LG_GRP_R.class, r -> toCondition(r.getStringNE(lgGrpCdColumn)))
				.addSelect(m -> toArray(m.lg_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((lgGrpNmAlias), m.lg_grp_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoSiteCo(String siteCoCdColumn, String siteCoNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SITE_CO_R.class, r -> toCondition(r.getStringNE(siteCoCdColumn)))
				.addSelect(m -> toArray(m.site_co_nm))
				.addMap((r, m) -> {
					r.setStringNE((siteCoNmAlias), m.site_co_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoCostCtg(String costCtgCdColumn, String costCtgNmAlias) {
		return joinInfo(j -> j
				.add(MAM_COST_CTG_R.class, r -> toCondition(r.getStringNE(costCtgCdColumn)))
				.addSelect(m -> toArray(m.ctg_nm))
				.addMap((r, m) -> {
					r.setStringNE((costCtgNmAlias), m.ctg_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoShipTerm(String shipTermCdColumn, String shipTermNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SHIP_TERM_R.class, r -> toCondition(r.getStringNE(shipTermCdColumn)))
				.addSelect(m -> toArray(m.ship_term_nm))
				.addMap((r, m) -> {
					r.setStringNE((shipTermNmAlias), m.ship_term_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoTrnspt(String trnsptCdColumn, String trnsptNmAlias) {
		return joinInfo(j -> j
				.add(MAM_TRNSPT_R.class, r -> toCondition(r.getStringNE(trnsptCdColumn)))
				.addSelect(m -> toArray(m.trnspt_nm))
				.addMap((r, m) -> {
					r.setStringNE((trnsptNmAlias), m.trnspt_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoEximPort(String portCdColumn, String portNmAlias) {
		return joinInfo(j -> j
				.add(MAM_EXIM_PORT_R.class, r -> toCondition(r.getStringNE(portCdColumn)))
				.addSelect(m -> toArray(m.port_nm))
				.addMap((r, m) -> {
					r.setStringNE((portNmAlias), m.port_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoTterm(String ttermCdColumn, String ttermNmAlias) {
		return joinInfo(j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(r.getStringNE(ttermCdColumn)))
				.addSelect(m -> toArray(m.tterm_nm))
				.addMap((r, m) -> {
					r.setStringNE((ttermNmAlias), m.tterm_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoPoPrint(String poPrintCdColumn, String poPrintNmAlias) {
		return joinInfo(j -> j
				.add(MAM_PO_PRINT_R.class, r -> toCondition(r.getStringNE(poPrintCdColumn)))
				.addSelect(m -> toArray(m.po_print_nm))
				.addMap((r, m) -> {
					r.setStringNE((poPrintNmAlias), m.po_print_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoWkCost(String wkCostCdColumn, String wkCostNmAlias) {
		return joinInfo(j -> j
				.add(MAM_WK_COST_R.class, r -> toCondition(r.getStringNE(wkCostCdColumn)))
				.addSelect(m -> toArray(m.wk_cost_nm))
				.addMap((r, m) -> {
					r.setStringNE((wkCostNmAlias), m.wk_cost_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoWkDay(String wkDayCdColumn, String wkDayNmAlias) {
		return joinInfo(j -> j
				.add(MAM_WK_DAY_R.class, r -> toCondition(r.getStringNE(wkDayCdColumn)))
				.addSelect(m -> toArray(m.wk_day_nm))
				.addMap((r, m) -> {
					r.setStringNE((wkDayNmAlias), m.wk_day_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoWkRsn(String wkRsnCdColumn, String wkRsnNmAlias) {
		return joinInfo(j -> j
				.add(MAM_WK_RSN_R.class, r -> toCondition(r.getStringNE(wkRsnCdColumn)))
				.addSelect(m -> toArray(m.wk_rsn_nm))
				.addMap((r, m) -> {
					r.setStringNE((wkRsnNmAlias), m.wk_rsn_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoBank(String bankColumn, String bankAlias) {
		return joinInfo(j -> j
				.add(MAM_BANK_R.class, r -> toCondition(r.getStringNE(bankColumn)))
				.addSelect(m -> toArray(m.bank_nm))
				.addMap((r, m) -> {
					r.setStringNE((bankAlias), m.bank_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoBankAc(String bankAcColumn, String bankAcAlias) {
		return joinInfo(j -> j
				.add(MAM_BANK_AC_R.class, r -> toCondition(r.getStringNE(bankAcColumn)))
				.addSelect(m -> toArray(m.bank_ac_nm))
				.addMap((r, m) -> {
					r.setStringNE((bankAcAlias), m.bank_ac_nm());
				}));
	}
	
	protected MCJoinerList<MCRow> getJoinInfoBankBranch(String bankCdColumn, String branchCdColumn, String branchNmAlias) {
		return joinInfo(j -> j
				.add(MAM_BANK_BRANCH_R.class, r -> toCondition(r.getStringNE(bankCdColumn),r.getStringNE(branchCdColumn)))
				.addSelect(m -> toArray(m.branch_nm))
				.addMap((r, m) -> {
					r.setStringNE((branchNmAlias), m.branch_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoCalBase(String calCdColumn, String calNmAlias) {
		return joinInfo(j -> j
				.add(MAM_CAL_BASE_R.class, r -> toCondition(r.getStringNE(calCdColumn)))
				.addSelect(m -> toArray(m.cal_nm))
				.addMap((r, m) -> {
					r.setStringNE((calNmAlias), m.cal_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoItmTypD(String itmTypColumn, String itmTypDCdColumn, String itmTypDNmAlias) {
		return joinInfo(j -> j
				.add(MAM_ITM_TYP_D_R.class, r -> toCondition(r.getStringNE(itmTypColumn),r.getStringNE(itmTypDCdColumn)))
				.addSelect(m -> toArray(m.itm_typ_d_nm))
				.addMap((r, m) -> {
					r.setStringNE((itmTypDNmAlias), m.itm_typ_d_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoSite(String siteCdColumn, String siteNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SITE_R.class, r -> toCondition(r.getStringNE(siteCdColumn)))
				.addSelect(m -> toArray(m.site_nm))
				.addMap((r, m) -> {
					r.setStringNE((siteNmAlias), m.site_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoLocGrp(String locGrpCdColumn, String locGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_LOC_GRP_R.class, r -> toCondition(r.getStringNE(locGrpCdColumn)))
				.addSelect(m -> toArray(m.loc_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((locGrpNmAlias), m.loc_grp_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoAc(String acCdColumn, String acNmAlias) {
		return joinInfo(j -> j
				.add(MAM_ACCOUNT_R.class, r -> toCondition(r.getStringNE(acCdColumn)))
				.addSelect(m -> toArray(m.ac_nm))
				.addMap((r, m) -> {
					r.setStringNE((acNmAlias), m.ac_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoSubAc(String acCdColumn, String subAcCdColumn, String subAcNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SUB_ACCOUNT_R.class, r -> toCondition(r.getStringNE(acCdColumn),r.getStringNE(subAcCdColumn)))
				.addSelect(m -> toArray(m.sub_ac_nm))
				.addMap((r, m) -> {
					r.setStringNE((subAcNmAlias), m.sub_ac_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoJnlGrp(String jnlGrpCdColumn, String jnlGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_JNL_GRP_R.class, r -> toCondition(r.getStringNE(jnlGrpCdColumn)))
				.addSelect(m -> toArray(m.jnl_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((jnlGrpNmAlias), m.jnl_grp_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoHs(String hsCdColumn, String hsNmAlias) {
		return joinInfo(j -> j
				.add(MAM_HS_R.class, r -> toCondition(r.getStringNE(hsCdColumn)))
				.addSelect(m -> toArray(m.hs_nm))
				.addMap((r, m) -> {
					r.setStringNE((hsNmAlias), m.hs_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoSlipForm(String slipFormCdColumn, String slipFormNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SLIP_FORM_R.class, r -> toCondition(r.getStringNE(slipFormCdColumn)))
				.addSelect(m -> toArray(m.slip_form_nm))
				.addMap((r, m) -> {
					r.setStringNE((slipFormNmAlias), m.slip_form_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoSlsAnly(String slsAnlyCdColumn, String slsAnlyNmAlias, String slsAnlyTypConstant) {
		return joinInfo(j -> j
				.add(MAM_SLS_ANLY_R.class, r -> toCondition(slsAnlyTypConstant, r.getStringNE(slsAnlyCdColumn)))
				.addSelect(m -> toArray(m.sls_anly_nm))
				.addMap((r, m) -> {
					r.setStringNE((slsAnlyNmAlias), m.sls_anly_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoSetoffGrp(String setoffGrpCdColumn, String setoffGrpNmAlias) {
		return joinInfo(j -> j
				.add(MAM_SETOFF_GRP_R.class, r -> toCondition(r.getStringNE(setoffGrpCdColumn)))
				.addSelect(m -> toArray(m.setoff_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((setoffGrpNmAlias), m.setoff_grp_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoBpGrp(String bpGrpCdColumn, String bpGrpNmAlias, String grpTypConstant) {
		return joinInfo(j -> j
				.add(MAM_BP_GRP_R.class, r -> toCondition(grpTypConstant, r.getStringNE(bpGrpCdColumn)))
				.addSelect(m -> toArray(m.bp_grp_nm))
				.addMap((r, m) -> {
					r.setStringNE((bpGrpNmAlias), m.bp_grp_nm());
				}));
	}

	protected MCJoinerList<MCRow> getJoinInfoDptBase(String dptBaseCdColumn, String dptBaseNmAlias) {
		return joinInfo(j -> j
				.add(MAM_DPT_BASE_R.class, r -> toCondition(r.getStringNE(dptBaseCdColumn)))
				.addSelect(m -> toArray(m.def_dpt_nm))
				.addMap((r, m) -> {
					r.setStringNE((dptBaseNmAlias), m.def_dpt_nm());
				}));
	}

	@Override
	public void beforeUpdate(MCList<MCDBContainer> insL,
			MCList<MCDBContainer> modL, MCList<MCDBContainer> delL,
			FXBAL0140AppDefResource appRes) {
		if (!isNull(insL)) {
			setRecvIfInfo(insL, appRes.getString("ifProcTyp"), appRes.getStringArray("dataByGrp"));
			for(MCDBContainer insR : insL) {
				setHmForWkAct(insR, appRes, "st_hm");
				setHmForWkAct(insR, appRes, "end_hm");
			}
			metaValidate(insL);
		}
		if(!isNull(modL)) {
			for(MCDBContainer modR : modL) {
				if (modR.contains("recv_dt")&&isNull(modR.getDateNE("recv_dt"))) {
					modR.setDate("recv_dt", getToday());
				}
				if (modR.contains("data_make_dt")&&isNull(modR.getDateNE("data_make_dt"))) {
					modR.setDate("data_make_dt", mcframe.commonCore.lang.MCDate.now());
				}
				setHmForWkAct(modR, appRes, "st_hm");
				setHmForWkAct(modR, appRes, "end_hm");
			}
			metaValidate(modL);
		}
	}

	protected void setHmForWkAct(MCDBContainer r, FXBAL0140AppDefResource res, String hm) {
		if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(res.getString("ifProcTyp"))) {
			if (!isNullOr(r.getDate("ac_dt"), r.getDate(hm))) {
				r.setDate(hm, getYmdHm(r.getDate("ac_dt"), r.getDate(hm)));
			}
		}
	}

	protected void setRecvIfInfo(MCList<MCDBContainer> insL, String ifProcTyp, String[] grpKey) {

		grpKey = checkGrpKey(insL, grpKey);

		MCIndexKey idx = insL.createIndex(grpKey);
		MCList<MCDBContainer> insGrpL = insL.groupBy(grpKey);

		doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, insGrpL.size());	// データＮＯ
		MAC_IF_PROC_TYP typ = MAC_IF_PROC_TYP.get(ifProcTyp);
		doSeqCache(typ.data_lno_seq(), insL.size());		// データ行ＮＯ

		for (MCDBContainer insGrpR : insGrpL) {
			MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			for (MCDBContainer insR : insL.subList(idx, insGrpR.toArray(idx.getKeys()))) {
				insR.setNumber("data_no", dataNo);
				insR.setNumber("data_lno", getSequence(typ.data_lno_seq()));
				insR.setString("exe_sts_typ", MAC_EXE_STS_TYP.NOT_EXE.value());
				if (insR.contains("recv_dt")&&isNull(insR.getDateNE("recv_dt"))) {
					insR.setDate("recv_dt", getToday());
				}
				if (insR.contains("data_make_dt")&&isNull(insR.getDateNE("data_make_dt"))) {
					insR.setDate("data_make_dt", mcframe.commonCore.lang.MCDate.now());
				}
			}
		}
	}

	protected String[] checkGrpKey(MCList<MCDBContainer> insL, String[] grpKey) {
		// リソースにグループキーが設定されていない、もしくはコンテナに存在しない項目が指定されている場合
		// 一意になる値を割り振り、それごとにデータＮＯを発番する（処理対象の件数分、データＮＯを発番する）
		if (grpKey != null) {
			for (String s : grpKey) {
				if (!insL.get(0).contains(s)) {
					grpKey = null;
					break;
				}
			}
		}
		if (grpKey == null) {
			grpKey = new String[]{"__row__"};
			insL.addStringColumn(grpKey[0]);
			for (int i=0; i<insL.size(); i++)	{
				insL.get(i).setString(grpKey[0], Integer.toString(i));
			}
		}
		return grpKey;
	}

	protected void metaValidate(MCList<MCDBContainer> l) {
		MCMessageList msgL = new MCMessageList();
		for (MCDBContainer r : l) {
			List<String> colL = new ArrayList<String>(Arrays.asList(r.getColumnPathArray()));
			MCMessageList mL = r.validate((String[]) colL.toArray(new String[colL.size()]));
			for (MCMessage m : mL) {
				if (isNull(m.getCauseColumn())) continue;
				String[] str = new String[30];
				System.arraycopy(m.getBindArray(), 0, str ,0, m.getBindArray().length);
				str[20] = m.getCauseColumn();
				if (!isNull(r.getValue(m.getCauseColumn()))) {
					str[21] = r.getValue(m.getCauseColumn()).toString();
				}
				m.setBind(str);
			}
			msgL.addAll(mL);
		}

		// DBに値を保存するためのチェックのため、マイナスチェックエラーを不具合扱いしない
		// メッセージリストからマイナス値エラー (FCBBC0065)を除外する
		msgL.removeIf(m -> isSame(m.getID(), mcframe.commonCore.notice.Core_Msg.FCBBC0065));

		if (!msgL.isEmpty()) {
			MCAppException ae = new MCAppException(MAUDL0010);
			ae.setCauseMessageList(msgL);
			throw ae;
		}
	}

}