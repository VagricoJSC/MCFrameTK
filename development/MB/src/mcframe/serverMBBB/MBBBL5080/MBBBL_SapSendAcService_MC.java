package mcframe.serverMBBB.MBBBL5080;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMB.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;

import mcframe.serverCore.resource.MCConst;

import java.util.Map;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SapSendAcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SapSendAcService_MC extends MBBBL_SapSendAcService_MC_A{
	//FMCB CUSTOM START
		
	/**
	 * SendAc_Ins01オペレーション.<p>
	 *
	 * 会計データを送信する。<br>
	 */
	public class SendAc_Ins01 extends MBBBL_SapSendAcService_MC_A.SendAc_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void insJnlSndIf(SendAc_Chk01_DtlR r) {
			MCList<MBT_JOURNAL_R> jnlL = getJnlL(r);
			
			MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL = crtJnlSndIf(jnlL, r);
			
			addSendRecvIfUpR(jnlSndIfL);
			
			insJnlSndIf(jnlSndIfL);
		}
		
		protected MCList<MBT_JOURNAL_R> getJnlL(SendAc_Chk01_DtlR r) {
			MBT_JOURNAL_R jnl = MBT_JOURNAL_R.create("");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(jnl);
			bldr.setWhere(jnl.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
			
			MCList<MBT_JOURNAL_R> rsltL = MCList.create(MBT_JOURNAL_R.class);
			dbSelect("MBBL5080_MBT_JOURNAL_S01", rsltL, bldr);
			
			return rsltL;
		}
		
		protected MCList<MBT_JOURNAL_SND_IF_R> crtJnlSndIf(MCList<MBT_JOURNAL_R> jnlL, SendAc_Chk01_DtlR r) {
			
			MCList<MBT_JOURNAL_SND_IF_R>  jnlSndIfL = MCList.create(MBT_JOURNAL_SND_IF_R.class);
			setAll(jnlSndIfL, jnlL, r, createMap_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R());
			
			jnlSndIfL = makeIfData(jnlSndIfL);
			
			setDataNo(jnlSndIfL);
			
			// 原価センタ
			setCostCenter(jnlSndIfL);
			
			// 利益センタ
			setProfitCenter(jnlSndIfL);
			
			return jnlSndIfL;
		}
		
		
		protected void setDataNo(MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL) {
			
			MCList<MBT_JOURNAL_SND_IF_R>[] arr = groupList(jnlSndIfL);
			
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, arr.length);
			doSeqCache(MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO, jnlSndIfL.size());
			
			for (MCList<MBT_JOURNAL_SND_IF_R> ifL : arr) {
				MCNumber no = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				
				for (MBT_JOURNAL_SND_IF_R ifR : ifL) {
					MCNumber lno = getSequence(MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO.value());
					
					ifR.data_lno(lno);
					ifR.data_no(no);
				}
			}
		}
		
		protected MCList<MBT_JOURNAL_SND_IF_R>[] groupList(MCList<MBT_JOURNAL_SND_IF_R> lst) {
			MCList<MBT_JOURNAL_SND_IF_R>[] arr = lst.groupList(getGrpKey());
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(
					MBT_JOURNAL_SND_IF_R.$ac_ym,
					MBT_JOURNAL_SND_IF_R.$jnl_no,
					MBT_JOURNAL_SND_IF_R.$jnl_no_seq,
					MBT_JOURNAL_SND_IF_R.$dc_typ
				);
			}
			java.util.Arrays.sort(arr, new java.util.Comparator<MCList<MBT_JOURNAL_SND_IF_R>>() {
				public int compare(MCList<MBT_JOURNAL_SND_IF_R> o1, MCList<MBT_JOURNAL_SND_IF_R> o2) {
					int cmp = 0;
					for (String col : getGrpKey()) {
						if (o1.get(0).getDataType(col) == MCDataType.DATE) {
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
		
		protected String[] getGrpKey() {
			java.util.ArrayList<String> arr = new java.util.ArrayList<>();
			arr.add(MBT_JOURNAL_SND_IF_R.$ac_ym);
			arr.add(MBT_JOURNAL_SND_IF_R.$ac_if_typ);
			arr.add(MBT_JOURNAL_SND_IF_R.$jnl_no);
			
			return arr.toArray(new String[arr.size()]);
		}
	
		protected MCList<MBT_JOURNAL_SND_IF_R> makeIfData(MCList<?> ifL) {
			
			MCList<MBT_JOURNAL_SND_IF_R> rList = MCList.create(MBT_JOURNAL_SND_IF_R.class);
			
			for (MCRow r : ifL) {
				MBT_JOURNAL_SND_IF_R ifR = (MBT_JOURNAL_SND_IF_R)r;
				
				if (isCreateTax(ifR)) {
					rList.add(createBaseIfR(ifR));
					rList.add(createTaxIfR(ifR));
				}
				else if (isProductTaxItem(ifR.ac_cd())) {
					calcTaxBaseAmt(ifR);
					rList.add(ifR);
				}
				else {
					rList.add(ifR);
				}
			}
			
			// 税調整の受払実績から作成される仕訳の場合、
			// すべての金額が０になる仕訳が作成されることがあるためリストから除外する
			rList.removeIf(r -> 
				r.base_cur_sum_amt().isZero()
					&& r.base_cur_amt().isZero()
					&& r.base_cur_tax_amt().isZero()
					&& r.base_cur_tax_base_amt().isZero()
			);
					
			return rList;
		}
		
		protected boolean isCreateTax(MBT_JOURNAL_SND_IF_R ifR) {
			if (!isProductTaxItem(ifR.ac_cd())) {
				
				MAM_AC_TAX_R acTaxR = getAcTaxR(ifR.tax_cd());
				
				// 1：課税、非課税、免税
				// これらは税額が0であってもSAPに連携する
				if (isSame(acTaxR.ac_tax_typ(), "1")
					 && isProductTaxItem(acTaxR.ac_cd())) {
					
					if (ifR.base_cur_tax_amt().isZero()) {
						MAM_TAX_R taxR = getTaxR(ifR.getStringNE("org_tax_cd"));
						if (!MAC_TAX_TYP.isXMPT(taxR.tax_typ()) && taxR.tax_rate().isZero()) {
							return true;
						}
					}
					else {
						return true;
					}
				}
			}
			
			return false;
		}
		
		protected boolean isProductTaxItem(String acCd) {
			// 1：仮払消費税勘定
			// 2：仮受消費税勘定
			MAM_ACCOUNT_R acR = getAccountR(acCd);
			return isSame(acR.ac_typ1(), "1") || isSame(acR.ac_typ1(), "2");
		}
		
		protected MBT_JOURNAL_SND_IF_R createBaseIfR(MBT_JOURNAL_SND_IF_R ifR) {
			
			MBT_JOURNAL_SND_IF_R baseIfR = ifR.clone();
			baseIfR.base_cur_sum_amt(ifR.base_cur_amt());
			baseIfR.base_cur_tax_amt(MCNumber.ZERO);
			baseIfR.base_cur_tax_base_amt(MCNumber.ZERO);
			baseIfR.trd_cur_sum_amt(ifR.trd_cur_amt());
			baseIfR.trd_cur_tax_amt(MCNumber.ZERO);
			baseIfR.trd_cur_tax_base_amt(MCNumber.ZERO);
			baseIfR.ptax_cur_sum_amt(ifR.ptax_cur_amt());
			baseIfR.ptax_cur_tax_amt(MCNumber.ZERO);
			baseIfR.ptax_cur_tax_base_amt(MCNumber.ZERO);
			
			return baseIfR;
		}
		protected MBT_JOURNAL_SND_IF_R createTaxIfR(MBT_JOURNAL_SND_IF_R ifR) {
			
			// 仮払消費税または仮受消費税
			MBT_JOURNAL_SND_IF_R taxIfR = ifR.clone();
			taxIfR.ac_cd(getAcTaxR(ifR.tax_cd()).ac_cd());
			
			MAM_TAX_R taxR = getTaxR(ifR.getStringNE("org_tax_cd"));
			
			if (!isNull(taxIfR.base_cur_upri())){
				taxIfR.base_cur_upri(MCNumber.ZERO);
			}
			taxIfR.base_cur_sum_amt(ifR.base_cur_tax_amt());
			taxIfR.base_cur_amt(MCNumber.ZERO);
			if (isNull(ifR.base_cur_amt()) || !ifR.base_cur_amt().isZero()) {
				taxIfR.base_cur_tax_base_amt(ifR.base_cur_amt());
			}
			else {
				// 税調整の受払実績から作成される仕訳の場合、基準通貨金額は０になる（税額しか設定されていない）
				// その場合の税計算基準金額は、税額と税率をもとに算出する
				taxIfR.base_cur_tax_base_amt(ifR.base_cur_tax_amt().multiply(taxR.tax_rate()));
			}
			
			if (!isNull(taxIfR.trd_cur_upri())){
				taxIfR.trd_cur_upri(MCNumber.ZERO);
			}
			taxIfR.trd_cur_sum_amt(ifR.trd_cur_tax_amt());
			taxIfR.trd_cur_amt(MCNumber.ZERO);
			if (isNull(ifR.trd_cur_amt()) || !ifR.trd_cur_amt().isZero()) {
				taxIfR.trd_cur_tax_base_amt(ifR.trd_cur_amt());
			}
			else {
				taxIfR.trd_cur_tax_base_amt(ifR.trd_cur_tax_amt().multiply(taxR.tax_rate()));
			}
			
			if (!isNull(taxIfR.ptax_cur_upri())){
				taxIfR.ptax_cur_upri(MCNumber.ZERO);
			}
			taxIfR.ptax_cur_sum_amt(ifR.ptax_cur_tax_amt());
			taxIfR.ptax_cur_amt(MCNumber.ZERO);
			if (isNull(ifR.ptax_cur_amt()) || !ifR.ptax_cur_amt().isZero()) {
				taxIfR.ptax_cur_tax_base_amt(ifR.ptax_cur_amt());
			}
			else {
				taxIfR.ptax_cur_tax_base_amt(ifR.ptax_cur_tax_amt().multiply(taxR.tax_rate()));
			}
			
			return taxIfR;
		}
		
		protected void addSendRecvIfUpR(MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL) {
			for (MBT_JOURNAL_SND_IF_R ifR : jnlSndIfL.distinctNE(MBT_JOURNAL_SND_IF_R.$data_no)) {
				_sendRecvIfUpL.add(
					createSendRecvIfUpR(ifR.data_no(), up0().get(0).ext_sys_cd(), MAC_IF_PROC_TYP.SAP_JOURNAL_SEND.value())
				);
			}
		}
		protected void calcTaxBaseAmt(MBT_JOURNAL_SND_IF_R ifR) {
			// 税調整の受払実績から作成される仕訳の場合、基準通貨金額は０になる（税額しか設定されていない）
			// その場合の税計算基準金額は、税額と税率をもとに算出する
			
			MAM_TAX_R taxR = getTaxR(ifR.getStringNE("org_tax_cd"));
			
			if (ifR.base_cur_tax_base_amt().isZero()) {
				ifR.base_cur_tax_base_amt(ifR.base_cur_tax_amt().multiply(taxR.tax_rate()));
			}
			
			if (ifR.trd_cur_tax_base_amt().isZero()) {
				ifR.trd_cur_tax_base_amt(ifR.trd_cur_tax_amt().multiply(taxR.tax_rate()));
			}
			
			if (ifR.ptax_cur_tax_base_amt().isZero()) {
				ifR.ptax_cur_tax_base_amt(ifR.ptax_cur_tax_amt().multiply(taxR.tax_rate()));
			}
		}
		
		protected void insJnlSndIf(MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL) {
			MBT_JOURNAL_SND_IF_R jnlSndIf = MBT_JOURNAL_SND_IF_R.create("");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(jnlSndIf);
			dbInsert("MBBL5080_MBT_JOURNAL_SND_IF_I01", jnlSndIfL, bldr);
		}
		
		protected void setCostCenter(MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL) {
			jnlSndIfL.forEach(r -> {
				r.setStringNE(
					getSapMappingCol("cost_center"),
					getAcDptR(r.dpt_cd(), r.ac_dt()).cost_center()
				);
			});
		}
		
		protected void setProfitCenter(MCList<MBT_JOURNAL_SND_IF_R> jnlSndIfL) {
			jnlSndIfL.forEach(r -> {
				r.setStringNE(
					getSapMappingCol("profit_center"),
					getCostCenter(r.getStringNE(getSapMappingCol("cost_center")), r.ac_dt())
				);
			});
		}
		
		protected MCList<?> _costCenterL;
		protected MCIndexKey _costCenterIdx;
		protected String getCostCenter(String costCenter, MCDate baseDt) {
			if (_costCenterL == null) {
				initCostCenterL();
			}
			
			MCList<?> ccs = _costCenterL.subList(_costCenterIdx, costCenter);
			if (isNull(ccs)) return null;
			
			MCRow row =ccs.stream()
						.filter(cc -> cc.getDateNE("validity_start_date").lte(baseDt) && baseDt.lte(cc.getDateNE("validity_end_date")))
						.findFirst()
						.orElse(null);
			
			return !isNull(row) ? row.getStringNE("profit_center") : null;	
		}
		
		protected void initCostCenterL() {

			String[] costCenterOpe = getCostCenterOpe();
			String modId = costCenterOpe[0];
			String lgcId = costCenterOpe[1];
			String opeId = costCenterOpe[2];
			
			MCOperation ope = createOperation(modId, lgcId, opeId, MCOperation.class);
			MCRow up0 = (MCRow) ope.up(0);
			up0.setStringNE("if_proc_typ", MAC_IF_PROC_TYP.SAP_COST_CENTER.value());
			up0.setStringNE("ext_sys_cd", up0().get(0).ext_sys_cd());
			ope.exec();
			
			_costCenterL = (MCList<?>)ope.down(0);
			_costCenterIdx = _costCenterL.createIndex("cost_center");
		}
		
		protected Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<MBT_JOURNAL_SND_IF_R,MBT_JOURNAL_R, SendAc_Chk01_DtlR> createMap_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R() {
			return new Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<MBT_JOURNAL_SND_IF_R, MBT_JOURNAL_R, SendAc_Chk01_DtlR>();
		}
		public class Map_MBT_JOURNAL_SND_IF_R_MBT_JOURNAL_R<D extends MBT_JOURNAL_SND_IF_R, S extends MBT_JOURNAL_R, W extends SendAc_Chk01_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
			protected SendAc_Chk01_DtlR _upR;
			@Override
			public void setWith(SendAc_Chk01_DtlR upR) {
				_upR = upR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_grp_no, MBT_JOURNAL_R.$jnl_grp_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_ym, MBT_JOURNAL_R.$ac_ym);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_if_typ, MBT_JOURNAL_R.$ac_if_typ);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_cnt_id, MBT_JOURNAL_R.$slip_cnt_id);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_no, MBT_JOURNAL_R.$jnl_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$jnl_no_seq, MBT_JOURNAL_R.$jnl_no_seq);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$dc_typ, MBT_JOURNAL_R.$dc_typ);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_slip_dt, MBT_JOURNAL_R.$ac_slip_dt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_dt, MBT_JOURNAL_R.$ac_dt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_no, MBT_JOURNAL_R.$slip_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slip_seq_no, MBT_JOURNAL_R.$slip_seq_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$dpt_cd, MBT_JOURNAL_R.$dpt_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ac_cd, MBT_JOURNAL_R.$ac_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_ac_cd, MBT_JOURNAL_R.$sub_ac_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$project_cd, MBT_JOURNAL_R.$project_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd0, MBT_JOURNAL_R.$summary_cd0);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd1, MBT_JOURNAL_R.$summary_cd1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd2, MBT_JOURNAL_R.$summary_cd2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd3, MBT_JOURNAL_R.$summary_cd3);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd4, MBT_JOURNAL_R.$summary_cd4);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$summary_cd5, MBT_JOURNAL_R.$summary_cd5);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_cd, MBT_JOURNAL_R.$itm_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub1, MBT_JOURNAL_R.$itm_sub1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub2, MBT_JOURNAL_R.$itm_sub2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_sub3, MBT_JOURNAL_R.$itm_sub3);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$itm_nm, MBT_JOURNAL_R.$itm_nm);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bp_typ, MBT_JOURNAL_R.$bp_typ);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bp_cd, MBT_JOURNAL_R.$bp_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_unit_qty, MBT_JOURNAL_R.$base_unit_qty);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_unit_cd, MBT_JOURNAL_R.$base_unit_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_upri, MBT_JOURNAL_R.$base_cur_upri);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_sum_amt, MBT_JOURNAL_R.$base_cur_sum_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_amt, MBT_JOURNAL_R.$base_cur_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_tax_amt, MBT_JOURNAL_R.$base_cur_tax_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_cd, MBT_JOURNAL_R.$base_cur_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_upri, MBT_JOURNAL_R.$trd_cur_upri);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_sum_amt, MBT_JOURNAL_R.$trd_cur_sum_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_amt, MBT_JOURNAL_R.$trd_cur_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_tax_amt, MBT_JOURNAL_R.$trd_cur_tax_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_cd, MBT_JOURNAL_R.$trd_cur_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_upri, MBT_JOURNAL_R.$ptax_cur_upri);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_sum_amt, MBT_JOURNAL_R.$ptax_cur_sum_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_amt, MBT_JOURNAL_R.$ptax_cur_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_tax_amt, MBT_JOURNAL_R.$ptax_cur_tax_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_cd, MBT_JOURNAL_R.$ptax_cur_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$tax_typ, MBT_JOURNAL_R.$tax_typ);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$tax_cd, MBT_JOURNAL_R.$tax_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$foreign_flg, MBT_JOURNAL_R.$foreign_flg);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$xrate, MBT_JOURNAL_R.$xrate);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$xrate_cd, MBT_JOURNAL_R.$xrate_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_xrate, MBT_JOURNAL_R.$ptax_xrate);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_xrate_cd, MBT_JOURNAL_R.$ptax_xrate_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$iv_no, MBT_JOURNAL_R.$iv_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bill_no, MBT_JOURNAL_R.$bill_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$slo_no, MBT_JOURNAL_R.$slo_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$po_no, MBT_JOURNAL_R.$po_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$usr_cd, MBT_JOURNAL_R.$usr_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$cls_jnl_typ, MBT_JOURNAL_R.$cls_jnl_typ);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$alloc_jnl_flg, MBT_JOURNAL_R.$alloc_jnl_flg);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$spot_flg, MBT_JOURNAL_R.$spot_flg);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sttl_schd_dt, MBT_JOURNAL_R.$sttl_schd_dt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sttl_cd, MBT_JOURNAL_R.$sttl_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$bank_ac_cd, MBT_JOURNAL_R.$bank_ac_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_ac_cd, MBT_JOURNAL_R.$other_ac_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_sub_ac_cd, MBT_JOURNAL_R.$other_sub_ac_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$other_dpt_cd, MBT_JOURNAL_R.$other_dpt_cd);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$abstract1, MBT_JOURNAL_R.$abstract1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$abstract2, MBT_JOURNAL_R.$abstract2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char1, MBT_JOURNAL_R.$sub_char1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char2, MBT_JOURNAL_R.$sub_char2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char3, MBT_JOURNAL_R.$sub_char3);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char4, MBT_JOURNAL_R.$sub_char4);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char5, MBT_JOURNAL_R.$sub_char5);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char6, MBT_JOURNAL_R.$sub_char6);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char7, MBT_JOURNAL_R.$sub_char7);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char8, MBT_JOURNAL_R.$sub_char8);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char9, MBT_JOURNAL_R.$sub_char9);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_char10, MBT_JOURNAL_R.$sub_char10);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num1, MBT_JOURNAL_R.$sub_num1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num2, MBT_JOURNAL_R.$sub_num2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_num3, MBT_JOURNAL_R.$sub_num3);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt1, MBT_JOURNAL_R.$sub_dt1);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt2, MBT_JOURNAL_R.$sub_dt2);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$sub_dt3, MBT_JOURNAL_R.$sub_dt3);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_usr_id, MBT_JOURNAL_R.$ins_usr_id);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_usr_nm, MBT_JOURNAL_R.$ins_usr_nm);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_ts, MBT_JOURNAL_R.$ins_ts);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ins_func_id, MBT_JOURNAL_R.$ins_func_id);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_cntr, MBT_JOURNAL_R.$upd_cntr);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_usr_id, MBT_JOURNAL_R.$upd_usr_id);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_usr_nm, MBT_JOURNAL_R.$upd_usr_nm);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_ts, MBT_JOURNAL_R.$upd_ts);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_func_id, MBT_JOURNAL_R.$upd_func_id);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$upd_srv_req_no, MBT_JOURNAL_R.$upd_srv_req_no);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$base_cur_tax_base_amt, MBT_JOURNAL_R.$base_cur_tax_base_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$trd_cur_tax_base_amt, MBT_JOURNAL_R.$trd_cur_tax_base_amt);
				addColumnPathMap(MBT_JOURNAL_SND_IF_R.$ptax_cur_tax_base_amt, MBT_JOURNAL_R.$ptax_cur_tax_base_amt);
			}
		
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.exe_sts_typ(_upR.getStringNE(MBT_JOURNAL_SND_IF_R.$exe_sts_typ));
				dest.data_crud_typ(_upR.getStringNE(MBT_JOURNAL_SND_IF_R.$data_crud_typ));
				dest.ext_sys_cd(_upR.ext_sys_cd());
				
				if (!isNull(src.itm_cd())) {
					MAM_ITM_R itmR = getItmR(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
					MAM_ITM_GRP_R itmGrpR = getItmGrpR(itmR);
					dest.itm_grp_typ(itmGrpR.itm_grp_typ());
					dest.itm_grp_cd(itmGrpR.itm_grp_cd());
				}
				
				if (isNull(src.bank_ac_cd())) {
					MAM_ACCOUNT_R acR = getAccountR(src.ac_cd());
					// 1：自社口座を連携
				 	if (isSame(acR.ac_typ4(), "1")) {
						MAM_BANK_AC_R bankAcR = getOwnBankAcR();
						dest.bank_ac_cd(bankAcR.bank_ac_cd());
				 	}
				}
				
				if (!isNull(dest.bank_ac_cd())) {
					MAM_BANK_AC_R bankAcR = getBankAcR(dest.bank_ac_cd());
					dest.bank_cd(bankAcR.bank_cd());
				}
				
				if (!isNull(src.jnl_ptn()) && src.jnl_ptn().contains("-")) {
					MAM_JNL_PTN_BASE_R jnlPtnBaseR = getJnlPtnBaseR(src.jnl_ptn().split("-")[0]);
					dest.setStringNE(getSapMappingCol("jnl_ptn_cd"), jnlPtnBaseR.jnl_ptn_cd());
					dest.setStringNE(getSapMappingCol("jnl_ptn_nm"), jnlPtnBaseR.jnl_ptn_nm());
					
					MAM_AUTO_JNL_R autoJnlR = getAutoJnlR(jnlPtnBaseR.jnl_ptn_cd());
					MAM_AC_TAX_MAP_R acTaxMapR = getAcTaxMapR(autoJnlR.ac_slip_typ(), dest.tax_cd(), dest.ac_dt());
					MAM_TAX_R taxR = getTaxR(acTaxMapR.tax_cd());
					if (!isNull(taxR)) {
						dest.setStringNE("org_tax_cd", taxR.tax_cd());
					}  
				}
			}
		}
	
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			if (_itmCache  == null) {
				_itmCache =
					new FXUCL_MCDbcCache<MAM_ITM_R>(
						MCQueryApiBuilder.create(MAM_ITM_R.create("T"))
					);
			}
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		
		protected MAM_ITM_GRP_R getItmGrpR(MAM_ITM_R itmR) {
			MAM_ITM_GRP_R itmGrpR = MAM_ITM_GRP_R.create();
			
			String grpCdColumn = getItmGrpMappingCol();
			if (!isNull(grpCdColumn)) {
				for (int i = 1; i <= getItmGrpTyps().length; i++) {
					if (isSame(grpCdColumn, "itm_grp_cd" + i)) {
						itmGrpR.itm_grp_typ(getItmGrpTyps()[i - 1]);
						itmGrpR.itm_grp_cd(itmR.getStringNE(grpCdColumn));
						break;
					}
				}
			}
			
			return itmGrpR;
		}
		protected String[] getItmGrpTyps() {
			return new String[] {
					MAC_ITM_GRP_TYP.GRP1.value(), MAC_ITM_GRP_TYP.GRP2.value(),
					MAC_ITM_GRP_TYP.GRP3.value(), MAC_ITM_GRP_TYP.GRP4.value(),
					MAC_ITM_GRP_TYP.GRP5.value(), MAC_ITM_GRP_TYP.GRP6.value(),
					MAC_ITM_GRP_TYP.GRP7.value(), MAC_ITM_GRP_TYP.GRP8.value(),
					MAC_ITM_GRP_TYP.GRP9.value(), MAC_ITM_GRP_TYP.GRP10.value()
			};
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_AC_DPT_R> _acDptCache;
		protected MAM_AC_DPT_R getAcDptR(String acDptCd, MCDate dt) {
			if (_acDptCache  == null) {
				_acDptCache =
					new FXUCL_MCDbcCacheStEnd<MAM_AC_DPT_R>(
						MCQueryApiBuilder.create(MAM_AC_DPT_R.create("T"))
					);
			}
			return _acDptCache.get(dt, acDptCd);
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
	
		protected FXUCL_MCDbcCache<MAM_AC_TAX_R> _acTaxCache;
		protected MAM_AC_TAX_R getAcTaxR(String taxCd) {
			if (_acTaxCache  == null) {
				_acTaxCache =
					new FXUCL_MCDbcCache<MAM_AC_TAX_R>(
						MCQueryApiBuilder.create(MAM_AC_TAX_R.create("T"))
					);
			}
			return _acTaxCache.get(taxCd);
		}
	
		protected MCList<MAM_AC_TAX_MAP_R> _acTaxMapCache;
		protected MCIndexKey _acTaxMapIdx;
		protected MAM_AC_TAX_MAP_R getAcTaxMapR(String acSlipTyp, String acTaxCd, MCDate baseDt) {
			if (_acTaxMapCache == null) {
				_acTaxMapCache = MCList.create(MAM_AC_TAX_MAP_R.class);
				
				MAM_AC_TAX_MAP_R t = MAM_AC_TAX_MAP_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				
				dbSelect("MBBBL5080_MAM_AC_TAX_MAP_S01", _acTaxMapCache, bldr);
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
		
		protected FXUCL_MCDbcCache<MAM_JNL_PTN_BASE_R> _jnlPtnBaseCache;
		protected MAM_JNL_PTN_BASE_R getJnlPtnBaseR(String jnlPtnCd) {
			if (_jnlPtnBaseCache  == null) {
				_jnlPtnBaseCache =
					new FXUCL_MCDbcCache<MAM_JNL_PTN_BASE_R>(
						MCQueryApiBuilder.create(MAM_JNL_PTN_BASE_R.create("T"))
					);
			}
			return _jnlPtnBaseCache.get(jnlPtnCd);
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
		
		protected MAM_BANK_AC_R _ownBankAcR;
		protected MAM_BANK_AC_R getOwnBankAcR() {
			if (isNull(_ownBankAcR)) {
				MAM_BANK_AC_R t = MAM_BANK_AC_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.bank_ac_cd);
				bldr.setWhere(t.ext_flg.eq(value(false)));
				bldr.setOrderByAsc(t.bank_ac_cd);
				
				MCList<MAM_BANK_AC_R> rsltL = MCList.create(MAM_BANK_AC_R.class);
				dbSelect("MBBBL5080_MAM_BANK_AC_S01", rsltL, bldr);
				
				_ownBankAcR = rsltL.isEmpty() ? MAM_BANK_AC_R.create() : rsltL.get(0);
			}
			
			return _ownBankAcR;
		}
		
		protected FXUCL_MCDbcCache<MAM_BANK_AC_R> _bankAcCache;
		protected MAM_BANK_AC_R getBankAcR(String bankAcCd) {
			if (_bankAcCache  == null) {
				_bankAcCache =
					new FXUCL_MCDbcCache<MAM_BANK_AC_R>(
						MCQueryApiBuilder.create(MAM_BANK_AC_R.create("T"))
					);
			}
			return _bankAcCache.get(bankAcCd);
		}
	
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
		
		protected String getItmGrpMappingCol() {
			return MCConst.app.getString("MB.MBBBL5080.mapping_cols.itm_grp_cd");
		}
		
		
		protected String[] getCostCenterOpe() {

			MCList<MAM_IF_ADAPTER_R> ifAdaptL = getIfAdapter();
			if (!ifAdaptL.isEmpty()) {
				MAM_IF_ADAPTER_R ifAdaptR = ifAdaptL.get(0);
				if (!isNull(ifAdaptR.web_api_ope())) {
					return parseOperation(ifAdaptR.web_api_ope());
				}
			}

			return parseOperation(MAC_IF_PROC_TYP.SAP_COST_CENTER.wep_api_ope());
		}
		
		
		protected MCList<MAM_IF_ADAPTER_R> getIfAdapter() {
			
			MCList<MAM_IF_ADAPTER_R> ifAdaptL = MCList.create(MAM_IF_ADAPTER_R.class);
			MAM_IF_ADAPTER_R ifAdaptR = MAM_IF_ADAPTER_R.create("IFADAPT");
			MCQueryApiBuilder ifAdaptBuilder = MCQueryApiBuilder.create(ifAdaptR);

			ifAdaptBuilder.setWhere(ifAdaptR.ext_sys_cd.eq(bind("ext_sys_cd")));
			ifAdaptBuilder.addWhereWithAnd(ifAdaptR.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SAP_COST_CENTER.value())));
			ifAdaptBuilder.addWhereWithAnd(ifAdaptR.st_dt.lte(bind("1")), getToday());
			ifAdaptBuilder.addWhereWithAnd(ifAdaptR.end_dt.gte(bind("1")), getToday());

			dbSelect("MBBBL5080_MAM_IF_ADAPTER_S01", ifAdaptL, ifAdaptBuilder, up0().groupBy(MAM_IF_PROTOCOL_R.$ext_sys_cd));
			
			return ifAdaptL;
		}
		
		/**
		 * オペレーション文字列からモジュールID、ロジックID、オペレーションIDを取得
		 * 
		 * @param operation	オペレーション文字列
		 * @return	[0]：モジュールID
		 * 			[1]：ロジックID
		 * 			[2]：オペレーションID
		 */
		protected String[] parseOperation(String operation) {

			String[] arr = operation.split("\\."), ret = new String[3];
			if (arr.length == 3) {
				System.arraycopy(arr, 0, ret, 0, arr.length);
			}
			return ret;
		}

		
	}


	private static final String NOT_EXEC_CODE_CONV = "1";

	@Override
	protected void callSendRecvIf(MCList<MCRow> upL) {

		MCList<MAM_IF_PROTOCOL_R> ifProtL = getIfProtocol(upL);
		MCIndexKey ifProtLKey = ifProtL.createIndex(MAM_IF_PROTOCOL_R.$ext_sys_cd, MAM_IF_PROTOCOL_R.$if_ctl_typ);
		upL.addBooleanColumn("webapi_not_link_flg");
		for (MCRow upR : upL) {
			MAM_IF_PROTOCOL_R ifProtR = ifProtL.getFirst(ifProtLKey, upR.getStringNE("ext_sys_cd"), MAC_IF_CTL_TYP.EXT_SYS_STR8.value());
			if (!isNull(ifProtR) && isSame(ifProtR.var_str(), NOT_EXEC_CODE_CONV)) {
				upR.setBoolean("webapi_not_link_flg", true);
			}
		}

		super.callSendRecvIf(upL);
	}

	protected MCList<MAM_IF_PROTOCOL_R> getIfProtocol(MCList<MCRow> upL) {
		
		MCList<MAM_IF_PROTOCOL_R> ifProtL = MCList.create(MAM_IF_PROTOCOL_R.class);
		MAM_IF_PROTOCOL_R ifProtR = MAM_IF_PROTOCOL_R.create("IFPROT");
		MCQueryApiBuilder ifProtBuilder = MCQueryApiBuilder.create(ifProtR);
		
		ifProtBuilder.setWhere(ifProtR.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SAP_JOURNAL_SEND.value())));
		ifProtBuilder.addWhereWithAnd(ifProtR.ext_sys_cd.eq(bind("ext_sys_cd")));
		upL.addStringColumn("ext_sys_cd");
		
		dbSelect("MBBBL5080_MAM_IF_PROTOCOL_S01", ifProtL, ifProtBuilder, upL.groupBy(MAM_IF_PROTOCOL_R.$ext_sys_cd));

		return ifProtL;
	}

	//FMCB CUSTOM END
}