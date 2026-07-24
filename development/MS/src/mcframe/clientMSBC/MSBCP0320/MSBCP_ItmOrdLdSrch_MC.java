package mcframe.clientMSBC.MSBCP0320;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP5040.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_ItmOrdLdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_ItmOrdLdSrch_MC extends MSBCP_ItmOrdLdSrch_MC_A implements IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MAUCP_VHMapper<RsltR, RsltDispR> _vhM = new MAUCP_VHMapper<>();
	
	protected ArrayList<MCColumnConfig> _qtyColumns;

	/**
	 * 検索時点の検索条件
	 */
	protected CndR _srchCndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_ItmOrdLdSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_ItmOrdLdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0320_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0320_Srch01Caller<P extends MSBCP_ItmOrdLdSrch, B extends MS_MSBCL0320_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0320_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			// 表示用テーブルをクリア対象にする
			addDownContainer(getRsltDispL());
			
			setDtFrTo();
		}
		
		@Override
		protected void clear() {
			super.clear();
			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
			// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
			_vhM.clearCachedList();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd1Panel));
			msgList.addAll(checkBeforeAfter(Cnd_dt_fr, Cnd_dt_to));
			if (!isNullOr(getCndR().dt_fr(), getCndR().dt_to())) {
				long diffDay = getCndR().dt_to().diffDay(getCndR().dt_fr()) + 1;
				if (diffDay > 93) {
					msgList.add(new MCMessage(getCndR(), CndR.$dt_fr, MSBCP0002));
				}
			}
		}
		
		@Override
		protected void show() {
			super.show();
			showSub();
		}
		
		protected void showSub() {
			// 検索時点の検索条件の保持
			_srchCndR = getCndR().clone();
			
			// 縦横変換処理
			showVH();
		}
		
		protected void showVH() {
			// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
			initVHColInof();

			// 縦横変換処理を実行する	
			// 第一引数の縦リストのデータを縦横変換し、第二引数のリストに追加する
			_vhM.convertVH(getRsltL(), _vhM.getCachedHAllL());
			// このタイミングで、必要に応じて縦横変換した後のデータを加工する
			editVHHList();
			
			// チェックボックスの選択によって横テーブルの表示行を制御し、「キー」項目の表示内容を切り替える	
			// 横テーブルをソートする
			_vhM.doTableDispChange();
			
		}
		
		protected void initVHColInof() {
			MCList<MCRow> ymList = crtYmList();
			_vhM.initColInfo(ymList);
			
			// ヘッダの色設定
			setHeaderColor(ymList);
			
		}
		
		protected MCList<MCRow> crtYmList() {
			MCList<MCRow> ymList = MCList.create(MCRow.class);
			MCDate dt = MAUCP_DateUtil.getPeriodStDt(getSrchCndR().dt_fr(), getSrchCndR().period_typ(), getCo().ac_cl_day());
			MCDate endStDt = MAUCP_DateUtil.getPeriodStDt(getSrchCndR().dt_to(), getSrchCndR().period_typ(), getCo().ac_cl_day());
			int i=0;
			while (dt.lte(endStDt)) {
				MCRow o = ymList.createRow();
				// 可変カラムを識別するための値を設定する
				o.setDateNE(RsltR.$dt_fr, dt);
				// 可変カラムのラベル名を設定する
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL, getHeaderLable(dt));
				// 可変カラムのメッセージ用名称を設定する（未設定時はラベル名がメッセージ用名称となる）
				o.setStringNE(MAUCP_VHMapper.ELM_MSG, getHeaderMsg(dt));
				ymList.add(o);
				dt = MAUCP_DateUtil.addPeriodStDt(dt, getCndR().period_typ(), 1, getCo().ac_cl_day());
				// ポカ除け
				i++;
				if (i > 93) {
					break;
				}
			}
			return ymList;
		}
		
		protected String getHeaderLable(MCDate dt) {
			return toMDString(dt);
		}
		
		protected String getHeaderMsg(MCDate dt) {
			MAC_DAY_WEEK_TYP dayWeek = MAC_DAY_WEEK_TYP.toDayWeekTyp(dt);
			return toYMDString(dt) + " (" + dayWeek.name() + ")";
		}
		
		protected void setHeaderColor(MCList<MCRow> ymList) {
			if (MAC_PERIOD_TYP.isDAILY(getSrchCndR().period_typ())) {
				ArrayList<MCColumnConfig> cols = getQtyCols();
				for (int i = 0; i < ymList.size(); i++) {
					MCDate dt = ymList.get(i).getDateNE(RsltR.$dt_fr);
					if (!isNull(dt)) {
						if (dt.getDayOfWeek() == MCDate.SAT) {
							cols.get(i).setHeaderBackground(_satColor);
							continue;
						}
						if (dt.getDayOfWeek() == MCDate.SUN) {
							cols.get(i).setHeaderBackground(_sunColor);
							continue;
						}
					}
					cols.get(i).setHeaderBackground(null);
					
				}
			}
			else {
				for (MCColumnConfig col : getQtyCols()) {
					col.setHeaderBackground(null);
				}
			}
		}
		
		protected void editVHHList() {
			String labelLoc = getDispString("label_loc");
			String labelRsrc = getDispString("label_rsrc");
			String labelUnit = getDispString("label_unit");
			MCList<RsltDispR> hList = _vhM.getCachedHAllL();
			for (RsltDispR r : hList) {
				r.label_loc(labelLoc);
				r.label_rsrc(labelRsrc);
				r.label_unit(labelUnit);
			}
			
			// 休日の設定
			if (MAC_PERIOD_TYP.isDAILY(getSrchCndR().period_typ())) {
				MCIndexKey idx = getRsltL().createIndex(RsltR.$mfg_loc_cd, RsltR.$rsrc_cd);
				for (RsltDispR h : hList) {
					if (isSame(RsltR.$ld_rate, h.row_title_col())) {
						MCList<RsltR> vL = getRsltL().subList(idx, h.mfg_loc_cd(), h.rsrc_cd());
						for (MCColumnConfig col : getQtyCols()) {
							RsltR v = _vhM.getVRow(h, col.getBaseRowColumnName(), vL);
							if (isHoliday(v)) {
								h.setBoolean(getHolidayCol(col).getBaseRowColumnName(), true);
							}
						}
					}
				}
			}
			
		}
		
		protected boolean isHoliday(RsltR r) {
			if (r == null) {
				return false;
			}
			return MCNumber.ZERO.eq(r.on_num());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		
	}

	protected void setDtFrTo() {
		// 期間区分
		if (Cnd_period_typ_view_DAILY.isSelected()) {
			getCndR().period_typ(MAC_PERIOD_TYP.DAILY.value());
		}
		else if (Cnd_period_typ_view_WEEKLY.isSelected()) {
			getCndR().period_typ(MAC_PERIOD_TYP.WEEKLY.value());
		}
		else if (Cnd_period_typ_view_TENDAYS.isSelected()) {
			getCndR().period_typ(MAC_PERIOD_TYP.TENDAYS.value());
		}
		else if (Cnd_period_typ_view_MONTHLY.isSelected()) {
			getCndR().period_typ(MAC_PERIOD_TYP.MONTHLY.value());
		}
		else {
			getCndR().period_typ(null);
		}
		
		// 期間補正
		getCndR().dt_fr(MAUCP_DateUtil.getPeriodStDt(getCndR().dt_fr(), getCndR().period_typ(), getCo().ac_cl_day()));
		getCndR().dt_to(MAUCP_DateUtil.getPeriodEndDt(getCndR().dt_to(), getCndR().period_typ(), getCo().ac_cl_day()));
	}
	
	protected CndR getSrchCndR() {
		if (_srchCndR == null) {
			_srchCndR = getCndR().clone();
		}
		return _srchCndR;
	}
	
	protected ArrayList<MCColumnConfig> getQtyCols() {
		if (_qtyColumns == null) {
			_qtyColumns = new ArrayList<>();
			_qtyColumns.add(columnRsltDisp_qty01);
			_qtyColumns.add(columnRsltDisp_qty02);
			_qtyColumns.add(columnRsltDisp_qty03);
			_qtyColumns.add(columnRsltDisp_qty04);
			_qtyColumns.add(columnRsltDisp_qty05);
			_qtyColumns.add(columnRsltDisp_qty06);
			_qtyColumns.add(columnRsltDisp_qty07);
			_qtyColumns.add(columnRsltDisp_qty08);
			_qtyColumns.add(columnRsltDisp_qty09);
			_qtyColumns.add(columnRsltDisp_qty10);
			_qtyColumns.add(columnRsltDisp_qty11);
			_qtyColumns.add(columnRsltDisp_qty12);
			_qtyColumns.add(columnRsltDisp_qty13);
			_qtyColumns.add(columnRsltDisp_qty14);
			_qtyColumns.add(columnRsltDisp_qty15);
			_qtyColumns.add(columnRsltDisp_qty16);
			_qtyColumns.add(columnRsltDisp_qty17);
			_qtyColumns.add(columnRsltDisp_qty18);
			_qtyColumns.add(columnRsltDisp_qty19);
			_qtyColumns.add(columnRsltDisp_qty20);
			_qtyColumns.add(columnRsltDisp_qty21);
			_qtyColumns.add(columnRsltDisp_qty22);
			_qtyColumns.add(columnRsltDisp_qty23);
			_qtyColumns.add(columnRsltDisp_qty24);
			_qtyColumns.add(columnRsltDisp_qty25);
			_qtyColumns.add(columnRsltDisp_qty26);
			_qtyColumns.add(columnRsltDisp_qty27);
			_qtyColumns.add(columnRsltDisp_qty28);
			_qtyColumns.add(columnRsltDisp_qty29);
			_qtyColumns.add(columnRsltDisp_qty30);
			_qtyColumns.add(columnRsltDisp_qty31);
			_qtyColumns.add(columnRsltDisp_qty32);
			_qtyColumns.add(columnRsltDisp_qty33);
			_qtyColumns.add(columnRsltDisp_qty34);
			_qtyColumns.add(columnRsltDisp_qty35);
			_qtyColumns.add(columnRsltDisp_qty36);
			_qtyColumns.add(columnRsltDisp_qty37);
			_qtyColumns.add(columnRsltDisp_qty38);
			_qtyColumns.add(columnRsltDisp_qty39);
			_qtyColumns.add(columnRsltDisp_qty40);
			_qtyColumns.add(columnRsltDisp_qty41);
			_qtyColumns.add(columnRsltDisp_qty42);
			_qtyColumns.add(columnRsltDisp_qty43);
			_qtyColumns.add(columnRsltDisp_qty44);
			_qtyColumns.add(columnRsltDisp_qty45);
			_qtyColumns.add(columnRsltDisp_qty46);
			_qtyColumns.add(columnRsltDisp_qty47);
			_qtyColumns.add(columnRsltDisp_qty48);
			_qtyColumns.add(columnRsltDisp_qty49);
			_qtyColumns.add(columnRsltDisp_qty50);
			_qtyColumns.add(columnRsltDisp_qty51);
			_qtyColumns.add(columnRsltDisp_qty52);
			_qtyColumns.add(columnRsltDisp_qty53);
			_qtyColumns.add(columnRsltDisp_qty54);
			_qtyColumns.add(columnRsltDisp_qty55);
			_qtyColumns.add(columnRsltDisp_qty56);
			_qtyColumns.add(columnRsltDisp_qty57);
			_qtyColumns.add(columnRsltDisp_qty58);
			_qtyColumns.add(columnRsltDisp_qty59);
			_qtyColumns.add(columnRsltDisp_qty60);
			_qtyColumns.add(columnRsltDisp_qty61);
			_qtyColumns.add(columnRsltDisp_qty62);
			_qtyColumns.add(columnRsltDisp_qty63);
			_qtyColumns.add(columnRsltDisp_qty64);
			_qtyColumns.add(columnRsltDisp_qty65);
			_qtyColumns.add(columnRsltDisp_qty66);
			_qtyColumns.add(columnRsltDisp_qty67);
			_qtyColumns.add(columnRsltDisp_qty68);
			_qtyColumns.add(columnRsltDisp_qty69);
			_qtyColumns.add(columnRsltDisp_qty70);
			_qtyColumns.add(columnRsltDisp_qty71);
			_qtyColumns.add(columnRsltDisp_qty72);
			_qtyColumns.add(columnRsltDisp_qty73);
			_qtyColumns.add(columnRsltDisp_qty74);
			_qtyColumns.add(columnRsltDisp_qty75);
			_qtyColumns.add(columnRsltDisp_qty76);
			_qtyColumns.add(columnRsltDisp_qty77);
			_qtyColumns.add(columnRsltDisp_qty78);
			_qtyColumns.add(columnRsltDisp_qty79);
			_qtyColumns.add(columnRsltDisp_qty80);
			_qtyColumns.add(columnRsltDisp_qty81);
			_qtyColumns.add(columnRsltDisp_qty82);
			_qtyColumns.add(columnRsltDisp_qty83);
			_qtyColumns.add(columnRsltDisp_qty84);
			_qtyColumns.add(columnRsltDisp_qty85);
			_qtyColumns.add(columnRsltDisp_qty86);
			_qtyColumns.add(columnRsltDisp_qty87);
			_qtyColumns.add(columnRsltDisp_qty88);
			_qtyColumns.add(columnRsltDisp_qty89);
			_qtyColumns.add(columnRsltDisp_qty90);
			_qtyColumns.add(columnRsltDisp_qty91);
			_qtyColumns.add(columnRsltDisp_qty92);
			_qtyColumns.add(columnRsltDisp_qty93);

		}
		return _qtyColumns;
	}
	
	protected MCColumnConfig getHolidayCol(MCColumnConfig qtyCol) {
		if (qtyCol == columnRsltDisp_qty01) {
			return columnRsltDisp_holiday01_flg;
		}
		if (qtyCol == columnRsltDisp_qty02) {
			return columnRsltDisp_holiday02_flg;
		}
		if (qtyCol == columnRsltDisp_qty03) {
			return columnRsltDisp_holiday03_flg;
		}
		if (qtyCol == columnRsltDisp_qty04) {
			return columnRsltDisp_holiday04_flg;
		}
		if (qtyCol == columnRsltDisp_qty05) {
			return columnRsltDisp_holiday05_flg;
		}
		if (qtyCol == columnRsltDisp_qty06) {
			return columnRsltDisp_holiday06_flg;
		}
		if (qtyCol == columnRsltDisp_qty07) {
			return columnRsltDisp_holiday07_flg;
		}
		if (qtyCol == columnRsltDisp_qty08) {
			return columnRsltDisp_holiday08_flg;
		}
		if (qtyCol == columnRsltDisp_qty09) {
			return columnRsltDisp_holiday09_flg;
		}
		if (qtyCol == columnRsltDisp_qty10) {
			return columnRsltDisp_holiday10_flg;
		}
		if (qtyCol == columnRsltDisp_qty11) {
			return columnRsltDisp_holiday11_flg;
		}
		if (qtyCol == columnRsltDisp_qty12) {
			return columnRsltDisp_holiday12_flg;
		}
		if (qtyCol == columnRsltDisp_qty13) {
			return columnRsltDisp_holiday13_flg;
		}
		if (qtyCol == columnRsltDisp_qty14) {
			return columnRsltDisp_holiday14_flg;
		}
		if (qtyCol == columnRsltDisp_qty15) {
			return columnRsltDisp_holiday15_flg;
		}
		if (qtyCol == columnRsltDisp_qty16) {
			return columnRsltDisp_holiday16_flg;
		}
		if (qtyCol == columnRsltDisp_qty17) {
			return columnRsltDisp_holiday17_flg;
		}
		if (qtyCol == columnRsltDisp_qty18) {
			return columnRsltDisp_holiday18_flg;
		}
		if (qtyCol == columnRsltDisp_qty19) {
			return columnRsltDisp_holiday19_flg;
		}
		if (qtyCol == columnRsltDisp_qty20) {
			return columnRsltDisp_holiday20_flg;
		}
		if (qtyCol == columnRsltDisp_qty21) {
			return columnRsltDisp_holiday21_flg;
		}
		if (qtyCol == columnRsltDisp_qty22) {
			return columnRsltDisp_holiday22_flg;
		}
		if (qtyCol == columnRsltDisp_qty23) {
			return columnRsltDisp_holiday23_flg;
		}
		if (qtyCol == columnRsltDisp_qty24) {
			return columnRsltDisp_holiday24_flg;
		}
		if (qtyCol == columnRsltDisp_qty25) {
			return columnRsltDisp_holiday25_flg;
		}
		if (qtyCol == columnRsltDisp_qty26) {
			return columnRsltDisp_holiday26_flg;
		}
		if (qtyCol == columnRsltDisp_qty27) {
			return columnRsltDisp_holiday27_flg;
		}
		if (qtyCol == columnRsltDisp_qty28) {
			return columnRsltDisp_holiday28_flg;
		}
		if (qtyCol == columnRsltDisp_qty29) {
			return columnRsltDisp_holiday29_flg;
		}
		if (qtyCol == columnRsltDisp_qty30) {
			return columnRsltDisp_holiday30_flg;
		}
		if (qtyCol == columnRsltDisp_qty31) {
			return columnRsltDisp_holiday31_flg;
		}
		if (qtyCol == columnRsltDisp_qty32) {
			return columnRsltDisp_holiday32_flg;
		}
		if (qtyCol == columnRsltDisp_qty33) {
			return columnRsltDisp_holiday33_flg;
		}
		if (qtyCol == columnRsltDisp_qty34) {
			return columnRsltDisp_holiday34_flg;
		}
		if (qtyCol == columnRsltDisp_qty35) {
			return columnRsltDisp_holiday35_flg;
		}
		if (qtyCol == columnRsltDisp_qty36) {
			return columnRsltDisp_holiday36_flg;
		}
		if (qtyCol == columnRsltDisp_qty37) {
			return columnRsltDisp_holiday37_flg;
		}
		if (qtyCol == columnRsltDisp_qty38) {
			return columnRsltDisp_holiday38_flg;
		}
		if (qtyCol == columnRsltDisp_qty39) {
			return columnRsltDisp_holiday39_flg;
		}
		if (qtyCol == columnRsltDisp_qty40) {
			return columnRsltDisp_holiday40_flg;
		}
		if (qtyCol == columnRsltDisp_qty41) {
			return columnRsltDisp_holiday41_flg;
		}
		if (qtyCol == columnRsltDisp_qty42) {
			return columnRsltDisp_holiday42_flg;
		}
		if (qtyCol == columnRsltDisp_qty43) {
			return columnRsltDisp_holiday43_flg;
		}
		if (qtyCol == columnRsltDisp_qty44) {
			return columnRsltDisp_holiday44_flg;
		}
		if (qtyCol == columnRsltDisp_qty45) {
			return columnRsltDisp_holiday45_flg;
		}
		if (qtyCol == columnRsltDisp_qty46) {
			return columnRsltDisp_holiday46_flg;
		}
		if (qtyCol == columnRsltDisp_qty47) {
			return columnRsltDisp_holiday47_flg;
		}
		if (qtyCol == columnRsltDisp_qty48) {
			return columnRsltDisp_holiday48_flg;
		}
		if (qtyCol == columnRsltDisp_qty49) {
			return columnRsltDisp_holiday49_flg;
		}
		if (qtyCol == columnRsltDisp_qty50) {
			return columnRsltDisp_holiday50_flg;
		}
		if (qtyCol == columnRsltDisp_qty51) {
			return columnRsltDisp_holiday51_flg;
		}
		if (qtyCol == columnRsltDisp_qty52) {
			return columnRsltDisp_holiday52_flg;
		}
		if (qtyCol == columnRsltDisp_qty53) {
			return columnRsltDisp_holiday53_flg;
		}
		if (qtyCol == columnRsltDisp_qty54) {
			return columnRsltDisp_holiday54_flg;
		}
		if (qtyCol == columnRsltDisp_qty55) {
			return columnRsltDisp_holiday55_flg;
		}
		if (qtyCol == columnRsltDisp_qty56) {
			return columnRsltDisp_holiday56_flg;
		}
		if (qtyCol == columnRsltDisp_qty57) {
			return columnRsltDisp_holiday57_flg;
		}
		if (qtyCol == columnRsltDisp_qty58) {
			return columnRsltDisp_holiday58_flg;
		}
		if (qtyCol == columnRsltDisp_qty59) {
			return columnRsltDisp_holiday59_flg;
		}
		if (qtyCol == columnRsltDisp_qty60) {
			return columnRsltDisp_holiday60_flg;
		}
		if (qtyCol == columnRsltDisp_qty61) {
			return columnRsltDisp_holiday61_flg;
		}
		if (qtyCol == columnRsltDisp_qty62) {
			return columnRsltDisp_holiday62_flg;
		}
		if (qtyCol == columnRsltDisp_qty63) {
			return columnRsltDisp_holiday63_flg;
		}
		if (qtyCol == columnRsltDisp_qty64) {
			return columnRsltDisp_holiday64_flg;
		}
		if (qtyCol == columnRsltDisp_qty65) {
			return columnRsltDisp_holiday65_flg;
		}
		if (qtyCol == columnRsltDisp_qty66) {
			return columnRsltDisp_holiday66_flg;
		}
		if (qtyCol == columnRsltDisp_qty67) {
			return columnRsltDisp_holiday67_flg;
		}
		if (qtyCol == columnRsltDisp_qty68) {
			return columnRsltDisp_holiday68_flg;
		}
		if (qtyCol == columnRsltDisp_qty69) {
			return columnRsltDisp_holiday69_flg;
		}
		if (qtyCol == columnRsltDisp_qty70) {
			return columnRsltDisp_holiday70_flg;
		}
		if (qtyCol == columnRsltDisp_qty71) {
			return columnRsltDisp_holiday71_flg;
		}
		if (qtyCol == columnRsltDisp_qty72) {
			return columnRsltDisp_holiday72_flg;
		}
		if (qtyCol == columnRsltDisp_qty73) {
			return columnRsltDisp_holiday73_flg;
		}
		if (qtyCol == columnRsltDisp_qty74) {
			return columnRsltDisp_holiday74_flg;
		}
		if (qtyCol == columnRsltDisp_qty75) {
			return columnRsltDisp_holiday75_flg;
		}
		if (qtyCol == columnRsltDisp_qty76) {
			return columnRsltDisp_holiday76_flg;
		}
		if (qtyCol == columnRsltDisp_qty77) {
			return columnRsltDisp_holiday77_flg;
		}
		if (qtyCol == columnRsltDisp_qty78) {
			return columnRsltDisp_holiday78_flg;
		}
		if (qtyCol == columnRsltDisp_qty79) {
			return columnRsltDisp_holiday79_flg;
		}
		if (qtyCol == columnRsltDisp_qty80) {
			return columnRsltDisp_holiday80_flg;
		}
		if (qtyCol == columnRsltDisp_qty81) {
			return columnRsltDisp_holiday81_flg;
		}
		if (qtyCol == columnRsltDisp_qty82) {
			return columnRsltDisp_holiday82_flg;
		}
		if (qtyCol == columnRsltDisp_qty83) {
			return columnRsltDisp_holiday83_flg;
		}
		if (qtyCol == columnRsltDisp_qty84) {
			return columnRsltDisp_holiday84_flg;
		}
		if (qtyCol == columnRsltDisp_qty85) {
			return columnRsltDisp_holiday85_flg;
		}
		if (qtyCol == columnRsltDisp_qty86) {
			return columnRsltDisp_holiday86_flg;
		}
		if (qtyCol == columnRsltDisp_qty87) {
			return columnRsltDisp_holiday87_flg;
		}
		if (qtyCol == columnRsltDisp_qty88) {
			return columnRsltDisp_holiday88_flg;
		}
		if (qtyCol == columnRsltDisp_qty89) {
			return columnRsltDisp_holiday89_flg;
		}
		if (qtyCol == columnRsltDisp_qty90) {
			return columnRsltDisp_holiday90_flg;
		}
		if (qtyCol == columnRsltDisp_qty91) {
			return columnRsltDisp_holiday91_flg;
		}
		if (qtyCol == columnRsltDisp_qty92) {
			return columnRsltDisp_holiday92_flg;
		}
		if (qtyCol == columnRsltDisp_qty93) {
			return columnRsltDisp_holiday93_flg;
		}

		return null;
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0320_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0290]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0290(MCEventInfo info) {
		RsltDispR r = RsltDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0290(r);
	}
	protected void doBtn_open_MSBCP0290(RsltDispR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0290");
		aso.putCnd(crtOpenMSBCP0290CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBC.MSBCP0290.CndR crtOpenMSBCP0290CndR(MAUCP_AppScreenOpener aso, RsltDispR r) {		
		mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart p = (mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0290.CndR to = mcframe.clientMSBC.MSBCP0290.CndR.create();
		CndR fr = getSrchCndR();
		
		to.opn_flg(fr.opn_flg());
		to.sav_flg(fr.sav_flg());
		to.fix_flg(fr.fix_flg());
		to.inst_flg(fr.inst_flg());
		to.cmpl_flg(fr.cmpl_flg());
		to.prcd_flg(fr.prcd_flg());
		to.sim_flg(fr.sim_flg());
		to.sim_mrp_no(fr.sim_mrp_no());
		to.dt_fr(fr.dt_fr());
		to.dt_to(fr.dt_to());
		to.site_cd(fr.site_cd());
		to.site_nm(fr.site_nm());
		to.loc_grp_cd(fr.loc_grp_cd());
		to.loc_grp_nm(fr.loc_grp_nm());
		if (fr.sim_flg()) {
			to.alloc_pln_r_view(p.Cnd_alloc_pln_r_view_SIM.getActionCommand());
		}
		else if (fr.prcd_flg()) {
			to.alloc_pln_r_view(p.Cnd_alloc_pln_r_view_PRCD.getActionCommand());
		}
		else {
			to.alloc_pln_r_view(p.Cnd_alloc_pln_r_view_NRML.getActionCommand());
		}
		to.mfg_loc_cd(r.mfg_loc_cd());
		to.wg_cd(r.wg_cd());
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		RsltDispR r = RsltDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0050(r);
	}
	protected void doBtn_open_MSBCP0050(RsltDispR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0050.CndR crtOpenMSBCP0050CndR(MAUCP_AppScreenOpener aso, RsltDispR r) {		
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch p = (mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
		CndR fr = getSrchCndR();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.mfg_st_schd_dt_to(fr.dt_to());
		to.mfg_end_schd_dt_fr(fr.dt_fr());
		to.mfg_loc_cd(r.mfg_loc_cd());
		
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0130(MCEventInfo info) {
		RsltDispR r = RsltDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0130(r);
	}
	protected void doBtn_open_MSBCP0130(RsltDispR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0130");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0130CndR(aso, r), crtOpenMSBCP0130CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0130.CndR crtOpenMSBCP0130CndR(MAUCP_AppScreenOpener aso, RsltDispR r) {
		mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch p = (mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0130.CndR to = mcframe.clientMSBC.MSBCP0130.CndR.create();
		CndR fr = getSrchCndR();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.mfg_st_schd_dt_to(fr.dt_to());
		to.mfg_end_schd_dt_fr(fr.dt_fr());
		to.mfg_loc_cd(r.mfg_loc_cd());
		
		return to;
	}
	protected List<String> crtOpenMSBCP0130CndRClear(RsltDispR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBC.MSBCP0130.CndR.$fix_flg);
		return l;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0160(MCEventInfo info) {
		RsltDispR r = RsltDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0160(r);
	}
	protected void doBtn_open_MSBCP0160(RsltDispR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0160");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0160CndR(aso, r), crtOpenMSBCP0160CndRClear(r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0160.CndR crtOpenMSBCP0160CndR(MAUCP_AppScreenOpener aso, RsltDispR r) {
		mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch p = (mcframe.clientMSBC.MSBCP0160.MSBCP_SimOrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0160.CndR to = mcframe.clientMSBC.MSBCP0160.CndR.create();
		CndR fr = getSrchCndR();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.mfg_st_schd_dt_to(fr.dt_to());
		to.mfg_end_schd_dt_fr(fr.dt_fr());
		to.mfg_loc_cd(r.mfg_loc_cd());
		to.sim_mrp_no(fr.sim_mrp_no());
		
		return to;
	}
	protected List<String> crtOpenMSBCP0160CndRClear(RsltDispR r) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBC.MSBCP0160.CndR.$exp);
		return l;
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		RsltDisp_qty01_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty02_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty03_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty04_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty05_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty06_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty07_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty08_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty09_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty10_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty11_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty12_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty13_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty14_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty15_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty16_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty17_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty18_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty19_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty20_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty21_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty22_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty23_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty24_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty25_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty26_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty27_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty28_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty29_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty30_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty31_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty32_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty33_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty34_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty35_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty36_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty37_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty38_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty39_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty40_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty41_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty42_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty43_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty44_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty45_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty46_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty47_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty48_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty49_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty50_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty51_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty52_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty53_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty54_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty55_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty56_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty57_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty58_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty59_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty60_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty61_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty62_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty63_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty64_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty65_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty66_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty67_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty68_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty69_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty70_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty71_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty72_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty73_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty74_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty75_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty76_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty77_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty78_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty79_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty80_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty81_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty82_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty83_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty84_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty85_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty86_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty87_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty88_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty89_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty90_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty91_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty92_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
		RsltDisp_qty93_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm, columnRsltDisp_rsrc_dec_place);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		
		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, RsltDispTable, getRsltL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(RsltR.$ld_rate, MSC_LD_DTL_TYP.LD_RATE.name());
		map.put(RsltR.$act_qty, MSC_LD_DTL_TYP.ACT_QTY.name());
		map.put(RsltR.$base_qty, MSC_LD_DTL_TYP.BASE_QTY.name());
		map.put(RsltR.$alert_qty, MSC_LD_DTL_TYP.ALERT_QTY.name());
		_vhM.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		// 縦リストの「HVAL」の項目。
		// １番目の要素は全項目。
		// ２番目の要素は常に表示する項目。
		// ３番目以降の要素はチェックボックスの選択によって表示・非表示を切り替える項目。
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {RsltR.$ld_rate, RsltR.$act_qty, RsltR.$base_qty, RsltR.$alert_qty});
		dispList.add(new String[] {RsltR.$ld_rate});
		dispList.add(new String[] {RsltR.$act_qty});
		dispList.add(new String[] {RsltR.$base_qty});
		dispList.add(new String[] {RsltR.$alert_qty});
		// チェックボックス
		// n番目のチェックボックスの選択によって、dispListのn + 2番目の要素の項目の表示・非表示を切り替える
		MCCheckBox[] checkBox = new MCCheckBox[] {Cnd_show_act_qty_flg, Cnd_show_base_qty_flg, Cnd_show_alert_qty_flg};
		// 縦横変換クラスに設定する
		_vhM.setDispInfo(checkBox, dispList);
		
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		RsltDispTable.setSortable(false);
	}
	
	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		RsltDispTable.addSortColumn(columnRsltDisp_disp_seq);	
		RsltDispTable.addSortColumn(columnRsltDisp_mfg_loc_cd);
		RsltDispTable.addSortColumn(columnRsltDisp_rsrc_cd);
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		// 横テーブルの「ソート順変更」を無効にする
		if (beans == RsltDispTable) {
			conf.ignoreSortOrder(true);
		}
		return conf;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 縦横変換クラスのソート処理を呼び出す	
		if (table == RsltDispTable) {
			return _vhM.sortHTable(policy);
		}
		return super.sort(table, policy);
	}
	
	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		return super.sort(table, policy);
	}
	
	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		// 何もなし
	}
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub(){
		// Cnd
		setValueEx(Cnd_opn_flg, true);
		setValueEx(Cnd_sav_flg, true);
		setValueEx(Cnd_fix_flg, true);
		setValueEx(Cnd_inst_flg, true);
		
		MCDate dtFr = getToday();
		MCDate dtTo = null;
		if (!isNull(dtFr)) {
			dtTo = dtFr.addDay(getPgmSettingIntNE(this, 14, "init.term")-1);
		}
		getCndR().dt_fr(dtFr);
		getCndR().dt_to(dtTo);
		setDtFrTo();

		// LPnl
		setValueEx(Cnd_show_name_flg, true);
	}	
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		
		// 縦横変換のカラム情報の初期化
		_vhM.initColInfo(MCList.create(MCRow.class));	
		// 可変カラムのラベル名とメッセージ用名称をクリアする	
		_vhM.clearElmColsLabel();
	}
	// -----------------------------------------------
	// status
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		setLPnlStatus();
		_vhM.setAllElmColumnModeInvisible();
		CndPanel.focusFirstComponent();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		setLPnlStatus();
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
		RsltDispTable.selectLeftmostColumn(0);
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	protected void setCndMode() {
		if (getCndR().sim_flg()) {
			setDefaultMode(Cnd_sim_mrp_no);
		}
		else {
			Cnd_sim_mrp_no.setMode(MCMode.READ_ONLY);
		}
		
	}
	
	protected void setLPnlStatus() {
		if (getCndR().show_label_flg()) {
			setDefaultMode(columnRsltDisp_label);
		}
		else {
			columnRsltDisp_label.setMode(MCMode.INVISIBLE);
		}
		
		if (getCndR().show_code_flg()) {
			setDefaultMode(columnRsltDisp_code);
		}
		else {
			columnRsltDisp_code.setMode(MCMode.INVISIBLE);
		}
		
		if (getCndR().show_name_flg()) {
			setDefaultMode(columnRsltDisp_name);
		}
		else {
			columnRsltDisp_name.setMode(MCMode.INVISIBLE);
		}
	}
	
	protected void setBtnMode() {
		RsltDispR r = RsltDispTable.getSelectedMCRow();
		
		if (isEnableBtn_open_MSBCP0290(r)) {
			setDefaultMode(Btn_open_MSBCP0290);
		}
		else {
			Btn_open_MSBCP0290.setMode(MCMode.DISABLE);
		}
		
		if (isEnableBtn_open_MSBCP0050(r)) {
			setDefaultMode(Btn_open_MSBCP0050);
		}
		else {
			Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
		}
		
		if (isEnableBtn_open_MSBCP0130(r)) {
			setDefaultMode(Btn_open_MSBCP0130);
		}
		else {
			Btn_open_MSBCP0130.setMode(MCMode.DISABLE);
		}
		
		if (isEnableBtn_open_MSBCP0160(r)) {
			setDefaultMode(Btn_open_MSBCP0160);
		}
		else {
			Btn_open_MSBCP0160.setMode(MCMode.DISABLE);
		}
	}
	
	protected boolean isEnableBtn_open_MSBCP0290(RsltDispR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	protected boolean isEnableBtn_open_MSBCP0050(RsltDispR r) {
		if (r == null) {
			return false;
		}
		if (getSrchCndR().opn_flg() || getSrchCndR().sav_flg() || getSrchCndR().fix_flg()
				|| getSrchCndR().inst_flg() || getSrchCndR().cmpl_flg()) {
			return true;
		}
		return false;
	}
	protected boolean isEnableBtn_open_MSBCP0130(RsltDispR r) {
		if (r == null) {
			return false;
		}
		return getSrchCndR().prcd_flg();
	}
	protected boolean isEnableBtn_open_MSBCP0160(RsltDispR r) {
		if (r == null) {
			return false;
		}
		return !isNull(getSrchCndR().sim_mrp_no());
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRsltDisp_NC(MCEventInfo info) {
		super.doRsltDisp_NC(info);
		setBtnMode();
	}
	
	// その他イベント
	@Override
	public void doCnd_sim_flg_NC(MCEventInfo info) {
		super.doCnd_sim_flg_NC(info);
		if (!getCndR().sim_flg()) {
			setValueEx(Cnd_sim_mrp_no, null);
		}
		setCndMode();
	}
	
	@Override
	public void doCnd_show_label_flg_NC(MCEventInfo info) {
		super.doCnd_show_label_flg_NC(info);
		setLPnlStatus();
		columnRsltDisp_label.adjustWidth();
	}
	
	@Override
	public void doCnd_show_code_flg_NC(MCEventInfo info) {
		super.doCnd_show_code_flg_NC(info);
		setLPnlStatus();
		columnRsltDisp_code.adjustWidth();
	}
	
	@Override
	public void doCnd_show_name_flg_NC(MCEventInfo info) {
		super.doCnd_show_name_flg_NC(info);
		setLPnlStatus();
		columnRsltDisp_name.adjustWidth();
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltDispTable) {
			RsltDispR r = getRsltDispL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBCP0290(r)) {
				doBtn_open_MSBCP0290(r);
			}
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltDispTable.setCellConfig(crtRsltDispCellConfig());
	}
	
	protected RsltDispCellConfig crtRsltDispCellConfig() {
		return new RsltDispCellConfig();
	}
	
	protected Color _hTtlColor = getPgmSettingColorNE(this, new Color(153, 255, 153), "color.h_ttl");
	
	protected Color _vTtlColor = getPgmSettingColorNE(this, new Color(153, 255, 153), "color.v_ttl");

	protected Color _lte20Color = getPgmSettingColorNE(this, new Color(255,255,255), "color.lte20");
	
	protected Color _lte40Color = getPgmSettingColorNE(this, new Color(204,255,255), "color.lte40");
	
	protected Color _lte60Color = getPgmSettingColorNE(this, new Color(153,204,255), "color.lte60");
	
	protected Color _lte80Color = getPgmSettingColorNE(this, new Color(102,153,255), "color.lte80");
	
	protected Color _lte100Color = getPgmSettingColorNE(this, new Color(255,255,153), "color.lte100");

	protected Color _lte120Color = getPgmSettingColorNE(this, new Color(255,204,255), "color.lte120");
	
	protected Color _overColor = getPgmSettingColorNE(this, new Color(255,102,255), "color.over");
	
	protected Color _holidayColor = getPgmSettingColorNE(this, new Color(230,230,230), "color.holiday");
	
	protected Color _satColor = getPgmSettingColorNE(this, new Color(176,196,222), "color.sat");
	
	protected Color _sunColor = getPgmSettingColorNE(this, new Color(255,192,203), "color.sun");
	
	protected class RsltDispCellConfig extends MAUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (table.getBaseTable() == RsltDispTable) {
				if (column == columnRsltDisp_row_title_nm) {
					return _vTtlColor;
				}
				else if (isVTtlCol(column)) {
					RsltDispR r = (RsltDispR)table.getBaseTable().getRow(index);
					if (isSame(RsltR.$ld_rate, r.row_title_col())) {
						return _hTtlColor;
					}
				}
				// 数量カラム
				else if (isQtyCol(column)){
					RsltDispR r = (RsltDispR)table.getBaseTable().getRow(index);
					if (isSame(RsltR.$ld_rate, r.row_title_col())) {
						MCNumber rate = r.getNumber(column.getBaseRowColumnName());
						if (isNull(rate)) {
							if (isHoliday(r, column)) {
								return _holidayColor;
							}
						}
						return getLdRateBGColor(rate);
					}
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
		
		protected boolean isVTtlCol(MCColumnConfig col) {
			if (col == columnRsltDisp_label || col == columnRsltDisp_code
					|| col == columnRsltDisp_name) {
				return true;
			}
			return false;
		}
		
		protected boolean isQtyCol(MCColumnConfig col) {
			if (col != null && col.getBaseRowColumnName().startsWith("qty")) {
				return true;
			}
			return false;
		}

		protected boolean isHoliday(RsltDispR r, MCColumnConfig col) {
			return r.getBoolean(getHolidayCol(col).getBaseRowColumnName());
		}
		
		protected Color getLdRateBGColor(MCNumber rate) {
			if (isNull(rate) || rate.lte(20)) {
				return _lte20Color;
			}
			else if (rate.lte(40)) {
				return _lte40Color;
			}
			else if (rate.lte(60)) {
				return _lte60Color;
			}
			else if (rate.lte(80)) {
				return _lte80Color;
			}
			else if (rate.lte(100)) {
				return _lte100Color;
			}
			else if (rate.lte(120)) {
				return _lte120Color;
			}
			else {
				return _overColor; 
			}
		}
		
	}
	
	// -----------------------------------------------

}