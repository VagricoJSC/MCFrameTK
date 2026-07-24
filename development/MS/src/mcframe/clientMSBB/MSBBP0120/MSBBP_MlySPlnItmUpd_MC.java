package mcframe.clientMSBB.MSBBP0120;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMSUB.MSUBP0010.*;

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
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
import mcframe.clientCore.beans.list.MCLinkBeans;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_MlySPlnItmUpd"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_MlySPlnItmUpd_MC extends MSBBP_MlySPlnItmUpd_MC_A implements IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _maxColSize = 24;
	
	protected ArrayList<MCColumnConfig> _qtyColumns;

	protected MAUCP_VHMapper<DtlR, DtlDispR> _vhM = new MAUCP_VHMapper<>();
	
	protected HashMap<MCNumber, MCList<DtlDispR>> _grpNoHMap = new HashMap<>();
	
	protected HashMap<MCNumber, MCList<DtlR>> _grpNoVMap = new HashMap<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnItmUpd_MC() {
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
	public MSBBP_MlySPlnItmUpd_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Srch01Caller<P extends MSBBP_MlySPlnItmUpd, B extends MS_MSBBL0120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			addDownContainer(getDtlDispL());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_spln_ym_fr, Cnd_spln_ym_to));
			msgList.addAll(checkAtLeastOneInput(Cnd_fix_t_flg, Cnd_fix_f_flg));
			if (!isNullOr(getCndR().spln_ym_fr(), getCndR().spln_ym_to())) {
				long diff = getCndR().spln_ym_to().diffMonth(getCndR().spln_ym_fr());
				if (diff >= _maxColSize) {
					msgList.add(new MCMessage(getCndR(), CndR.$spln_ym_fr, MSBBP0002));
				}
			}
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearCacheVH();
		}
		
		@Override
		protected void show() {
			super.show();
			showSub();
			showVH();
		}
		
		protected void showSub() {
			// 検索時点の開始日終了日の保持
			getHdrR().spln_ym_fr(getCndR().spln_ym_fr());
			getHdrR().spln_ym_to(getCndR().spln_ym_to());
		}
		
		protected void showVH() {
			// 計画品目のグループを識別する番号を設定する
			showVHEditVList();
			
			// 可変カラムのラベル名を設定する
			showVHInitColInfo();
			
			// 縦横変換処理を実行する
			_vhM.convertVH(getDtlL(), _vhM.getCachedHAllL());
			
			// 縦横変換した後の横データを加工する
			showVHEditHList();
			
			// 横データを表示する
			showVHHList();
		}
		
		protected void showVHEditVList() {
			int i = 0;
			for (MCList<DtlR> l : getDtlL().groupList(DtlR.$grp_peg_no)) {
				for (DtlR r : l) {
					r.setGUIIndex(i);
					i++;
				}
				MCNumber grpPegNo = l.get(0).grp_peg_no();
				_grpNoVMap.put(grpPegNo, l);
			}
			
		}
		
		protected void showVHInitColInfo() {
			// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
			MCList<MCRow> ymList = MCList.create(MCRow.class);
			for (int i = 1; i <= 24; i++) {
				MCDate dt = getHdrR().spln_ym_fr().addMonth(i-1);
				if (dt.gt(getHdrR().spln_ym_to())) {
					break;
				}
				MCRow o = ymList.createRow();
				// 可変カラムを識別するための値を設定する
				o.setDateNE(DtlR.$spln_ym, dt);
				// 可変カラムのラベル名を設定する
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toYMString(dt));
				ymList.add(o);
			}
			_vhM.initColInfo(ymList);
		}
		
		protected void showVHEditHList() {
			String labelSumQty = getDispString("label_sum_qty");
			String labelSumAmt = getDispString("label_sum_amt");
			String labelItmQty = getDispString("label_itm_qty");
			String labelItmAmt = getDispString("label_itm_amt");
			
			MCIndexKey idxkeyDtl = getDtlL().createIndex(DtlR.$grp_peg_no, DtlR.$itm_cd,
					DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3, DtlR.$spln_ym);
			
			MCList<DtlDispR> hList = _vhM.getCachedHAllL();
			for (DtlDispR r : hList) {
				if (isSplnItmRow(r)) {
					r.spln_itm_flg(true);
				}
				
				if (isQtyRow(r)) {
					r.dec_place(0);
					r.qty_flg(true);
					r.disp_spln_itm(r.spln_itm_nm());
					r.disp_unit_cd(r.unit_cd());
					r.disp_unit_nm(r.unit_nm());
				}
				else if (isAmtRow(r)) {
					r.dec_place(r.amt_dec_place());
					r.disp_spln_itm(r.spln_itm_cd());
					r.disp_unit_cd(r.cur_cd());
					r.disp_unit_nm(r.cur_nm());
				}
				
				if (r.spln_itm_flg()){
					if (isQtyRow(r)) {
						r.disp_row_title_nm(labelSumQty);
					}
					else if (isAmtRow(r)) {
						r.disp_row_title_nm(labelSumAmt);
					}
					
				}
				else {
					if (isQtyRow(r)) {
						r.disp_row_title_nm(labelItmQty);
						r.disp_itm(r.itm_nm());
					}
					else if (isAmtRow(r)) {
						r.disp_row_title_nm(labelItmAmt);
						r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), panel));
					}
					
					// 入力可能
					if (isInptRow(r)) {
						r.spln_set_typ_flg(true);
						
						MCDate dt = getHdrR().spln_ym_fr();
						setEditableQtyCol(r, dt, columnDtlDisp_qty01, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(1), columnDtlDisp_qty02, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(2), columnDtlDisp_qty03, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(3), columnDtlDisp_qty04, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(4), columnDtlDisp_qty05, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(5), columnDtlDisp_qty06, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(6), columnDtlDisp_qty07, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(7), columnDtlDisp_qty08, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(8), columnDtlDisp_qty09, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(9), columnDtlDisp_qty10, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(10), columnDtlDisp_qty11, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(11), columnDtlDisp_qty12, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(12), columnDtlDisp_qty13, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(13), columnDtlDisp_qty14, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(14), columnDtlDisp_qty15, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(15), columnDtlDisp_qty16, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(16), columnDtlDisp_qty17, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(17), columnDtlDisp_qty18, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(18), columnDtlDisp_qty19, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(19), columnDtlDisp_qty20, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(20), columnDtlDisp_qty21, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(21), columnDtlDisp_qty22, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(22), columnDtlDisp_qty23, idxkeyDtl);
						setEditableQtyCol(r, dt.addMonth(23), columnDtlDisp_qty24, idxkeyDtl);
					}
				}
				
				if (isHdrRow(r)) {
					r.fix_flg(r.old_fix_flg());
				}
			}
			
			crtGrpNoHCache(hList);
		}
		
		protected void setEditableQtyCol(DtlDispR r, MCDate dt,
				MCColumnConfig qtyCol, MCIndexKey idxkeyDtl) {
			if (isNull(r.getValue(qtyCol.getBaseRowColumnName() ))) {
				DtlR v = getDtlL().getFirst(idxkeyDtl, r.grp_peg_no(), r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), dt);
				if (v != null) {
					MCColumnConfig editableQtyCol = getEditableQtyCol(qtyCol);
					r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
				}
			}
			else {
				MCColumnConfig editableQtyCol = getEditableQtyCol(qtyCol);
				r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
			}
		}
		
		protected void crtGrpNoHCache(MCList<DtlDispR> hList) {
			MCSortPolicy sp = crtSortVH();
			for (MCList<DtlDispR> l : hList.groupList(DtlDispR.$grp_peg_no)) {
				l.sort(sp);
				_grpNoHMap.put(l.get(0).grp_peg_no(), l);
			}
		}
		
		protected void showVHHList() {
			MCList<DtlDispR> rsltL = MCList.create(DtlDispR.class);
			for (MCNumber grpPegNo : _grpNoHMap.keySet()) {
				MCList<DtlDispR> l =  _grpNoHMap.get(grpPegNo);
				rsltL.addAll(l);
				rsltL.add(crtBlkR(l.get(0)));
			}
			getDtlDispL().setAll(rsltL);
			panel.sort(DtlDispTable);
		}
		
		protected DtlDispR crtBlkR(DtlDispR splnR) {
			DtlDispR blkR = splnR.clone();
			blkR.fix_flg(false);
			blkR.row_title_col(null);
			blkR.row_title_nm(null);
			blkR.disp_row_title_nm(null);
			blkR.spln_itm_flg(false);
			blkR.qty_flg(false);
			blkR.record_id(null);
			for (MCColumnConfig col : getQtyCols()) {
				blkR.setNumber(col.getBaseRowColumnName(), null);
			}
			return blkR;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
	}

	/**
	 * [MS_MSBBL0120_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Sprt01Caller<P extends MSBBP_MlySPlnItmUpd, B extends MS_MSBBL0120_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MCList<DtlDispR> _dtlDispL;
		
		protected MCList<DtlR> _dtlL;
		
		protected MS_MSBBL0120_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			_dtlDispL =  getCheckedDtlDispL(true);
			_dtlL = getCheckedDtlL(true);
			getSprtAmtQtyCalDtlL().setAll(_dtlL);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0003);
		}
		
		@Override
		protected boolean checkForCall() {
			if (!hasUpList()) {
				return false;
			}
			return super.checkForCall();
		}
		
		protected boolean hasUpList() {
			if (isNull(_dtlDispL)) {
				dialog(msgNoCheckedRow());
				return false;
			}
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlDispR h : _dtlDispL) {
				msgList.addAll(panel.checkReq(h));
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			// 計算対象の値をクリアする
			for (DtlDispR r : _dtlDispL) {
				if (isCalcRow(r)) {
					for (MCColumnConfig col : getQtyCols()) {
						r.setNumber(col.getBaseRowColumnName(), null);
					}
				}
			}
			
			for (DtlR r : _dtlL) {
				if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
					r.spln_amt(null);
				}
				else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
					r.spln_qty(null);
				}
				if (r.isStatusNone()) {
					r.setStatus(MCRow.MODIFY);
				}
			}

		}
		
		@Override
		protected void show() {
			super.show();
			showVH();
		}
		
		protected void showVH() {
			for (DtlDispR r : _dtlDispL) {
				if (isQtyRow(r)) {
					_vhM.reflectVH(_dtlL, _dtlDispL, r, DtlR.$spln_qty, DtlR.$spln_amt);
				}
			}
			// メッセージのcauseRowを縦横変換する
			_vhM.cnvCauseRowVH(_dtlDispL, getMessages());
		}
		
	}
	
	/**
	 * [MS_MSBBL0120_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Sprt02Caller<P extends MSBBP_MlySPlnItmUpd, B extends MS_MSBBL0120_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MCList<DtlDispR> _dtlDispL;
		
		protected MCList<DtlR> _dtlL;
		
		protected MS_MSBBL0120_Sprt02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			_dtlDispL =  getCheckedDtlDispL(true);
			_dtlL = getCheckedDtlL(true);
			getSprtAmtQtyCalDtlL().setAll(_dtlL);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0005);
		}

		@Override
		protected boolean checkForCall() {
			if (!hasUpList()) {
				return false;
			}
			return super.checkForCall();
		}
		
		protected boolean hasUpList() {
			if (isNull(_dtlDispL)) {
				dialog(msgNoCheckedRow());
				return false;
			}
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もなし
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			// 計算対象の値をクリアする
			for (DtlDispR r : _dtlDispL) {
				if (isSplnItmRow(r)) {
					if (isCalcRow(r)) {
						for (MCColumnConfig col : getQtyCols()) {
							r.setNumber(col.getBaseRowColumnName(), null);
						}
					}
				}
				else {
					for (MCColumnConfig col : getQtyCols()) {
						r.setNumber(col.getBaseRowColumnName(), null);
					}
				}
			}
			
			for (DtlR r : _dtlL) {
				if (isSplnItmRow(r)) {
					if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
						r.spln_amt(null);
					}
					else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
						r.spln_qty(null);
					}
				}
				else {
					r.spln_amt(null);
					r.spln_qty(null);
				}
				if (r.isStatusNone()) {
					r.setStatus(MCRow.MODIFY);
				}
			}
		}
		
		@Override
		protected void show() {
			super.show();
			showVH();
		}
		
		protected void showVH() {
			for (DtlDispR r : _dtlDispL) {
				if (isQtyRow(r)) {
					_vhM.reflectVH(_dtlL, _dtlDispL, r, DtlR.$spln_qty, DtlR.$spln_amt);
				}
			}
			
			// メッセージのcauseRowを縦横変換する
			_vhM.cnvCauseRowVH(_dtlDispL, getMessages());
		}
	}

	/**
	 * [MS_MSBBL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0120_Upd01Caller<P extends MSBBP_MlySPlnItmUpd, B extends MS_MSBBL0120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<DtlDispR> _dtlDispL;
		
		protected MCList<DtlR> _dtlL;
		
		protected MS_MSBBL0120_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		protected void initCallerSub() {
			_dtlDispL =  getCheckedDtlDispL(false);
			// 品目行のみ上り電文に含む
			_dtlL = MCList.create(DtlR.class);
			for (DtlR v : getCheckedDtlL(false)) {
				if (!isSplnItmRow(v)) {
					_dtlL.add(v);
				}
			}
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlDispR h : _dtlDispL) {
				msgList.addAll(panel.checkReq(h));
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlL);
		}
		
		@Override
		protected void show() {
			super.show();
			showVH();
		}
		
		protected void showVH() {
			// 品目行に対して、縦リストの計算結果を横リストに反映する
			for (DtlDispR r : _dtlDispL) {
				if (!isSplnItmRow(r)) {
					if (isQtyRow(r)) {
						_vhM.reflectVH(_dtlL, _dtlDispL, r, DtlR.$spln_qty, DtlR.$spln_amt);
					}
				}
			}
			
			// 計画品目行に対して、縦リストの値を計算し、縦リストと横リストに反映する
			for (DtlDispR r : _dtlDispL) {
				if (isSplnItmRow(r)) {
					for (MCColumnConfig col : getQtyCols()) {
						setValueEx(col, r.getGUIIndex(), getSumNum(r, col));
					}
				}
			}
			
			// メッセージのcauseRowを縦横変換する
			_vhM.cnvCauseRowVH(_dtlDispL, getMessages());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
		
		@Override
		protected void handleMCEx(MCException ex) {
			// メッセージのcauseRowを縦横変換する
			_vhM.cnvCauseRowVH(_dtlDispL, ex.getCauseMessageList());
			super.handleMCEx(ex);

		}
	}

	protected boolean isSplnItmRow(DtlDispR r) {
		return MAC_STR.isNULL_VAL(r.itm_cd());
	}
	
	protected boolean isSplnItmRow(DtlR r) {
		return MAC_STR.isNULL_VAL(r.itm_cd());
	}
	
	protected MCList<DtlDispR> getCheckedDtlDispL(boolean unfixOnlyFlg) {
		MCList<DtlDispR> l = MCList.create(DtlDispR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (h.check() && isHdrRow(h)) {
				if (unfixOnlyFlg && h.fix_flg()) {
					continue;
				}
				l.addAll(_grpNoHMap.get(h.grp_peg_no()));
			}
		}
		return l;
	}

	protected MCList<DtlR> getCheckedDtlL(boolean unfixOnlyFlg) {
		MCList<DtlR> l = MCList.create(DtlR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (h.check() && isHdrRow(h)) {
				if (unfixOnlyFlg && h.fix_flg()) {
					continue;
				}
				MCList<DtlR> vL = _grpNoVMap.get(h.grp_peg_no());
				for (DtlR v : vL) {
					v.fix_flg(h.fix_flg());
					MAUCP_VHMapper<DtlR,DtlDispR>.HRowInfo hinfo = _vhM.getHRow(v, DtlR.$spln_qty, _grpNoHMap.get(v.grp_peg_no()));
					if (hinfo != null) {
						v.setGUIIndex(hinfo.row().getGUIIndex());
					}
					if (v.isStatusNone()) {
						if (v.fix_flg() != v.old_fix_flg()) {
							v.setStatus(MCRow.MODIFY);
						}
					}
				}
				l.addAll(vL);
			}
		}
		return l;
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL0120_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP0110(MCEventInfo info) {
		DtlDispR r = DtlDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP0110(r);
	}
	protected void doBtn_open_MSBBP0110(DtlDispR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0110");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP0110CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBB.MSBBP0110.CndR crtOpenMSBBP0110CndR(MAUCP_AppScreenOpener aso, DtlDispR r) {
		mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg p = (mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg) aso
				.getPanel();
		mcframe.clientMSBB.MSBBP0110.CndR to = mcframe.clientMSBB.MSBBP0110.CndR.create();
		
		to.upd_ope(p.Cnd_upd_ope_SUM.getActionCommand());
		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.sum_ym(getHdrR().ym());
		to.sum_spln_ym_fr(getHdrR().spln_ym_fr());
		to.sum_spln_ym_to(getHdrR().spln_ym_to());
		to.sum_dpt_cd(getHdrR().dpt_cd());
		to.sum_cst_cd(getHdrR().cst_cd());
		to.sum_wrk_no(getHdrR().wrk_no());
		to.sum_spln_vers(getHdrR().spln_vers());
		to.sum_spln_itm_cd(r.spln_itm_cd());
		
		return to;
	}

	
	/**
	 * Panel[Btn]のボタン[sprt_calcAmtQty]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_calcAmtQty(MCEventInfo info) {
		callMS_MSBBL0120_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[sprt_reExpAmtQty]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_reExpAmtQty(MCEventInfo info) {
		callMS_MSBBL0120_Sprt02();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlDispTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlDispTable);
	}
	/**
	 * Panel[Btn]のボタン[fix_all]の押下時の処理
	 */
	@Override
	public void doBtn_fix_all(MCEventInfo info) {
		doSelectAll(DtlDispTable, columnDtlDisp_fix_flg);
	}
	/**
	 * Panel[Btn]のボタン[unfix_all]の押下時の処理
	 */
	@Override
	public void doBtn_unfix_all(MCEventInfo info) {
		doDeselectAll(DtlDispTable, columnDtlDisp_fix_flg);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL0120_Upd01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		DtlDisp_qty01_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty02_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty03_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty04_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty05_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty06_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty07_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty08_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty09_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty10_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty11_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty12_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty13_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty14_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty15_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty16_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty17_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty18_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty19_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty20_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty21_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty22_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty23_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		DtlDisp_qty24_p_PPanel.setRelateBeans(columnDtlDisp_unit_cd, columnDtlDisp_dec_place);
		
	}
	
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == Cnd_dpt_cd) {
			setBindCnd_dpt_cd(row);
		}
		return row;
	}
	
	@Override
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info) {
		setBindCnd_dpt_cd(row);
		return super.getCnd_dpt_cd(row, info);
	}
	
	protected void setBindCnd_dpt_cd(MCRow row) {
		row.setDateNE(DptCols.$i_dt, getYmStDt(getCndR().ym(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		MCDate ym = getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		setValueEx(Cnd_ym, ym);
		setValueEx(Cnd_spln_ym_fr, ym);
		if (!isNull(ym)) {
			int term = getPgmSettingIntNE(this, -1, "init.term");
			if (term > 0) {
				MCDate splnYmTo = ym.addMonth(term - 1);
				setValueEx(Cnd_spln_ym_to, splnYmTo);
			}
		}
		
		setValueEx(Cnd_fix_t_flg, true);
		setValueEx(Cnd_fix_f_flg, true);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		
		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, DtlDispTable, getDtlL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。グループの下に空行を入れる場合は最後にnullを指定する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(DtlR.$spln_qty, MSC_SPLN_DTL_TYP.CUR_SPLN_QTY.name());
		map.put(DtlR.$spln_amt, MSC_SPLN_DTL_TYP.CUR_SPLN_AMT.name());
		_vhM.setRowTitles(map);
		
		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {DtlR.$spln_qty, DtlR.$spln_amt});
		dispList.add(new String[] {DtlR.$spln_qty, DtlR.$spln_amt});
		_vhM.setDispInfo(dispList);
	}
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearCacheVH();
	}
	
	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();
		
		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();
		
		// 入力支援ワークのキャッシュをクリアする
		getSprtAmtQtyCalDtlL().clear();
		
		// グループ取得用のキャッシュをクリアする
		_grpNoHMap.clear();
		_grpNoVMap.clear();
	}
	
	
	@Override
	protected void tableInit() {
		super.tableInit();
		DtlDispTable.setSortable(false);
		columnDtlDisp_spln_itm_cd.setSortable(true);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);

		// 横テーブルの「ソート順変更」を無効にする
		if (beans == DtlDispTable) {
			config.ignoreSortOrder(true);
		}

		return config;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 縦横変換クラスのソート処理を呼び出す
		if (table == DtlDispTable) {
			return sortVH(policy);
		}
		return super.sort(table, policy);
	}
	
	protected boolean sortVH(MCSortPolicy policy) {
		return _vhM.sortHTable(crtSortVH());
	}
	
	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DtlDispR.$disp_seq);
		sp.add(SortType.ASC, DtlDispR.$spln_itm_cd);
		sp.add(SortType.ASC, DtlDispR.$grp_peg_no);
		sp.add(SortType.DESC, DtlDispR.$spln_itm_flg);
		sp.add(SortType.ASC, DtlDispR.$itm_cd);
		sp.add(SortType.ASC, DtlDispR.$itm_sub1);
		sp.add(SortType.ASC, DtlDispR.$itm_sub2);
		sp.add(SortType.ASC, DtlDispR.$itm_sub3);
		sp.add(SortType.DESC, DtlDispR.$qty_flg);
		return sp;
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装
	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		// テーブルのソート処理。縦横変換クラスから呼び出される。
		return super.sort(table, policy);
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装
	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		// 何もなし
	}
	
	// -----------------------------------------------
	// status
	
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		DtlDispTable.selectLeftmostColumn(0);
		setBtnMode();
		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.REQUIRED);
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlDispTable.selectLeftmostColumn(0);
		setBtnMode();
		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}
	
	protected void setBtnMode() {
		DtlDispR r = DtlDispTable.getSelectedMCRow();
		
		if (isEnableBtn_open_MSBBP0110(r)) {
			setDefaultMode(Btn_open_MSBBP0110);
		}
		else {
			Btn_open_MSBBP0110.setMode(MCMode.DISABLE);
		}
	}
	
	protected boolean isEnableBtn_open_MSBBP0110(DtlDispR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}
	
	protected boolean isRegStatus() {
		return isUpdStatus();
	}
	
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doDtlDisp_NC(MCEventInfo info) {
		super.doDtlDisp_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getDtlDispL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (isSame(info.getNewValue(), Cnd_ope_REF.getActionCommand())) {
			clearData();
			setSrchStatus();
		}
		else if (isSame(info.getNewValue(), Cnd_ope_UPD.getActionCommand())) {
			if (isSame(getStatus(), REF)) {
				setUPDStatus();
			}
			else if (isSame(getStatus(), SRCH)) {
				clearData();
				setSRCH_UPDStatus();
			}
		}
	}
	
	protected void clearData() {
		clearContainers(getHdrR(), getDtlDispL());
		clearCacheVH();
	}

	// その他イベント
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtlDisp_qty01.addLCListener(this);
		columnDtlDisp_qty02.addLCListener(this);
		columnDtlDisp_qty03.addLCListener(this);
		columnDtlDisp_qty04.addLCListener(this);
		columnDtlDisp_qty05.addLCListener(this);
		columnDtlDisp_qty06.addLCListener(this);
		columnDtlDisp_qty07.addLCListener(this);
		columnDtlDisp_qty08.addLCListener(this);
		columnDtlDisp_qty09.addLCListener(this);
		columnDtlDisp_qty10.addLCListener(this);
		columnDtlDisp_qty11.addLCListener(this);
		columnDtlDisp_qty12.addLCListener(this);
		columnDtlDisp_qty13.addLCListener(this);
		columnDtlDisp_qty14.addLCListener(this);
		columnDtlDisp_qty15.addLCListener(this);
		columnDtlDisp_qty16.addLCListener(this);
		columnDtlDisp_qty17.addLCListener(this);
		columnDtlDisp_qty18.addLCListener(this);
		columnDtlDisp_qty19.addLCListener(this);
		columnDtlDisp_qty20.addLCListener(this);
		columnDtlDisp_qty21.addLCListener(this);
		columnDtlDisp_qty22.addLCListener(this);
		columnDtlDisp_qty23.addLCListener(this);
		columnDtlDisp_qty24.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc instanceof MCColumnConfig) {
			if (isQtyCol((MCColumnConfig)lc)) {
				doDtlDisp_qty_LC((MCColumnConfig)lc, info);
			}
		}
		
	}
	
	protected boolean isQtyCol(MCColumnConfig column) {
		MCColumnConfig c = getEditableQtyCol(column);
		return c != null;
	}

	protected MCColumnConfig getEditableQtyCol(MCColumnConfig qtyCol) {
		if (qtyCol == columnDtlDisp_qty01) {
			return columnDtlDisp_editable_qty01_flg;
		}
		if (qtyCol == columnDtlDisp_qty02) {
			return columnDtlDisp_editable_qty02_flg;
		}
		if (qtyCol == columnDtlDisp_qty03) {
			return columnDtlDisp_editable_qty03_flg;
		}
		if (qtyCol == columnDtlDisp_qty04) {
			return columnDtlDisp_editable_qty04_flg;
		}
		if (qtyCol == columnDtlDisp_qty05) {
			return columnDtlDisp_editable_qty05_flg;
		}
		if (qtyCol == columnDtlDisp_qty06) {
			return columnDtlDisp_editable_qty06_flg;
		}
		if (qtyCol == columnDtlDisp_qty07) {
			return columnDtlDisp_editable_qty07_flg;
		}
		if (qtyCol == columnDtlDisp_qty08) {
			return columnDtlDisp_editable_qty08_flg;
		}
		if (qtyCol == columnDtlDisp_qty09) {
			return columnDtlDisp_editable_qty09_flg;
		}
		if (qtyCol == columnDtlDisp_qty10) {
			return columnDtlDisp_editable_qty10_flg;
		}
		if (qtyCol == columnDtlDisp_qty11) {
			return columnDtlDisp_editable_qty11_flg;
		}
		if (qtyCol == columnDtlDisp_qty12) {
			return columnDtlDisp_editable_qty12_flg;
		}
		if (qtyCol == columnDtlDisp_qty13) {
			return columnDtlDisp_editable_qty13_flg;
		}
		if (qtyCol == columnDtlDisp_qty14) {
			return columnDtlDisp_editable_qty14_flg;
		}
		if (qtyCol == columnDtlDisp_qty15) {
			return columnDtlDisp_editable_qty15_flg;
		}
		if (qtyCol == columnDtlDisp_qty16) {
			return columnDtlDisp_editable_qty16_flg;
		}
		if (qtyCol == columnDtlDisp_qty17) {
			return columnDtlDisp_editable_qty17_flg;
		}
		if (qtyCol == columnDtlDisp_qty18) {
			return columnDtlDisp_editable_qty18_flg;
		}
		if (qtyCol == columnDtlDisp_qty19) {
			return columnDtlDisp_editable_qty19_flg;
		}
		if (qtyCol == columnDtlDisp_qty20) {
			return columnDtlDisp_editable_qty20_flg;
		}
		if (qtyCol == columnDtlDisp_qty21) {
			return columnDtlDisp_editable_qty21_flg;
		}
		if (qtyCol == columnDtlDisp_qty22) {
			return columnDtlDisp_editable_qty22_flg;
		}
		if (qtyCol == columnDtlDisp_qty23) {
			return columnDtlDisp_editable_qty23_flg;
		}
		if (qtyCol == columnDtlDisp_qty24) {
			return columnDtlDisp_editable_qty24_flg;
		}

		return null;
	}

	protected ArrayList<MCColumnConfig> getQtyCols() {
		if (_qtyColumns == null) {
			_qtyColumns = new ArrayList<>();
			_qtyColumns.add(columnDtlDisp_qty01);
			_qtyColumns.add(columnDtlDisp_qty02);
			_qtyColumns.add(columnDtlDisp_qty03);
			_qtyColumns.add(columnDtlDisp_qty04);
			_qtyColumns.add(columnDtlDisp_qty05);
			_qtyColumns.add(columnDtlDisp_qty06);
			_qtyColumns.add(columnDtlDisp_qty07);
			_qtyColumns.add(columnDtlDisp_qty08);
			_qtyColumns.add(columnDtlDisp_qty09);
			_qtyColumns.add(columnDtlDisp_qty10);
			_qtyColumns.add(columnDtlDisp_qty11);
			_qtyColumns.add(columnDtlDisp_qty12);
			_qtyColumns.add(columnDtlDisp_qty13);
			_qtyColumns.add(columnDtlDisp_qty14);
			_qtyColumns.add(columnDtlDisp_qty15);
			_qtyColumns.add(columnDtlDisp_qty16);
			_qtyColumns.add(columnDtlDisp_qty17);
			_qtyColumns.add(columnDtlDisp_qty18);
			_qtyColumns.add(columnDtlDisp_qty19);
			_qtyColumns.add(columnDtlDisp_qty20);
			_qtyColumns.add(columnDtlDisp_qty21);
			_qtyColumns.add(columnDtlDisp_qty22);
			_qtyColumns.add(columnDtlDisp_qty23);
			_qtyColumns.add(columnDtlDisp_qty24);
			
		}
		return _qtyColumns;
	}
	

	protected void doDtlDisp_qty_LC(MCColumnConfig col, MCEventInfo info) {
		DtlDispR r = getDtlDispL().get(info.getEventIndex());
		if (isInptRow(r)) {
			// 計算行
			DtlDispR c = getCalcRow(r);
			if (!isNull(c.getNumber(col.getBaseRowColumnName()))) {
				setValueEx(col, c.getGUIIndex(), null);
			}
			
			// 合計行
			DtlDispR hdr = getHdrRow(r);
			
			DtlDispR hdrc = getCalcRow(hdr);
			if (!isNull(hdrc.getNumber(col.getBaseRowColumnName()))) {
				setValueEx(col, hdrc.getGUIIndex(), null);
			}
			
			DtlDispR hdri = getInptRow(hdr);
			setValueEx(col, hdri.getGUIIndex(), getSumNum(hdri, col));

		}
		autoCheckOn(r);
	}
	
	protected MCNumber getSumNum(DtlDispR h, MCColumnConfig col) {
		return getSumNum(h, col, isQtyRow(h));
	}
	
	protected MCNumber getSumNum(DtlDispR h, MCColumnConfig col, boolean isQty) {
		MCList<DtlDispR> l = _grpNoHMap.get(h.grp_peg_no());
		if (isNull(l)) {
			return null;
		}
		
		MCNumber sumNum = null;
		for (DtlDispR r : l) {
			if (!r.spln_itm_flg()) {
				if (isQty && isQtyRow(r)) {
					sumNum = MCNumber.sum(sumNum, r.getNumber(col.getBaseRowColumnName()));
				}
				else if (!isQty && isAmtRow(r)) {
					sumNum = MCNumber.sum(sumNum, r.getNumber(col.getBaseRowColumnName()));
				}
			}
		}
		return sumNum;
	}
	
	@Override
	public void doDtlDisp_fix_flg_NC(MCEventInfo info) {
		super.doDtlDisp_fix_flg_NC(info);
		DtlDispR r = getDtlDispL().get(info.getEventIndex());
		autoCheckOn(r);
	}
	
	protected void autoCheckOn(DtlDispR r) {
		DtlDispR c = getHdrRow(r);
		if (!isNull(c)) {
			setValueEx(columnDtlDisp_check, c.getGUIIndex(), true);
		}
	}

	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlDispTable) {
			DtlDispR r = getDtlDispL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBBP0110(r)) {
				doBtn_open_MSBBP0110(r);
			}
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlDispTable.setCellConfig(crtDtlDispCellConfig());
	}

	protected DtlDispCellConfig crtDtlDispCellConfig() {
		return new DtlDispCellConfig();
	}
	
	protected Color _sumBgColor = getPgmSettingColorNE(this, new Color(255, 153, 0), "color.sum.bg");
	
	protected Color _itmBgColor = getPgmSettingColorNE(this, new Color(255, 255, 0), "color.itm.bg");
	
	protected Color _blkBgColor = getPgmSettingColorNE(this, new Color(255, 255, 255), "color.blk.bg");

	protected class DtlDispCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				// 検索時訂正不可
				if (getHdrR().locked_flg()) {
					return MCMode.READ_ONLY;
				}
				
				// 検索時訂正可能
				DtlDispR r = (DtlDispR) table.getBaseTable().getRow(index);
				if (column == columnDtlDisp_check || column == columnDtlDisp_fix_flg) {
					if (isHdrRow(r)) {
						return null;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (r.spln_itm_flg()) {
					return MCMode.READ_ONLY;
				}
				else {
					MCColumnConfig eidtableQtyCol = getEditableQtyCol(column);
					if (eidtableQtyCol == null) {
						return null;
					}
					else {
						DtlDispR h = getHdrRow(r);
						if (!isNull(h)) {
							if (h.fix_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						if (!r.getBoolean(eidtableQtyCol.getBaseRowColumnName())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (table.getBaseTable() == DtlDispTable) {
				DtlDispR r = (DtlDispR)table.getBaseTable().getRow(index);
				if (isBlkRow(r)) {
					return getBlkBgColor();
				}
				
				if (column == columnDtlDisp_disp_spln_itm) {
					return getDispSumColor(r);
				}
				if (column == columnDtlDisp_disp_itm) {
					return getDispItmColor(r);
				}
				if (column == columnDtlDisp_disp_row_title_nm) {
					return getRowTitleNmBgColor(r);
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
		
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column,
				MCTable<?> table, MCMode mode) {
			if (table.getBaseTable() == DtlDispTable) {
				DtlDispR r = (DtlDispR)table.getBaseTable().getRow(index);
				if (column == columnDtlDisp_disp_spln_itm) {
					if (!r.spln_itm_flg()) {
						return Boolean.TRUE;
					}
				}
			}
			return super.getPriorReverseFG(index, column, table, mode);
		}
		
		protected boolean isBlkRow(DtlDispR r) {
			return isNull(r.row_title_col());
		}
		
		protected Color getBlkBgColor() {
			return _blkBgColor;
		}
		
		protected Color getDispSumColor(DtlDispR r) {
			if (isHdrRow(r)) {
				return _sumBgColor;
			}
			return null;
		}
		
		protected Color getDispItmColor(DtlDispR r) {
			if (isHdrRow(r)) {
				return _sumBgColor;
			}
			else if (!r.spln_itm_flg()) {
				if (isQtyRow(r)) {
					return _itmBgColor;
				}
			}
			return null;
		}
		
		protected Color getRowTitleNmBgColor(DtlDispR r) {
			if (r.spln_itm_flg()) {
				return _sumBgColor;
			}
			if (!isNull(r.row_title_col())) {
				return _itmBgColor;
			}
			return _blkBgColor;
		}
		
	}
	
	protected DtlDispR getInptRow(DtlDispR r) {
		if (isInptRow(r)) {
			return r;
		}
		else if (isCalcRow(r)) {
			if (isQtyRow(r)) {
				return getDtlDispL().get(r.getGUIIndex() + 1);
			}
			else if (isAmtRow(r)) {
				return getDtlDispL().get(r.getGUIIndex() - 1);
			}
		}
		return null;
	}
	
	protected DtlDispR getCalcRow(DtlDispR r) {
		if (isInptRow(r)) {
			if (isQtyRow(r)) {
				return getDtlDispL().get(r.getGUIIndex() + 1);
			}
			else if (isAmtRow(r)) {
				return getDtlDispL().get(r.getGUIIndex() - 1);
			}
		}
		else if (isCalcRow(r)) {
			return r;
		}
		return null;
	}
	
	protected DtlDispR getHdrRow(DtlDispR r) {
		MCList<DtlDispR> l = _grpNoHMap.get(r.grp_peg_no());
		if (!isNull(l)) {
			return l.get(0);
		}
		return null;
	}
	
	protected DtlDispR getHdrRow(DtlR r) {
		MCList<DtlDispR> l = _grpNoHMap.get(r.grp_peg_no());
		if (!isNull(l)) {
			return l.get(0);
		}
		return null;
	}
	
	protected boolean isHdrRow(DtlDispR r) {
		return r.spln_itm_flg() && isQtyRow(r);
	}
	
	protected boolean isQtyRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$spln_qty);
	}
	
	protected boolean isAmtRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$spln_amt);
	}
	
	protected boolean isInptRow(DtlDispR r) {
		if (isNull(r)) {
			return false;
		}
		else if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
			return isQtyRow(r);
		}
		else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
			return isAmtRow(r);
		}
		return false;
	}
	
	protected boolean isCalcRow(DtlDispR r) {
		if (isNull(r)) {
			return false;
		}
		else if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
			return isAmtRow(r);
		}
		else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
			return isQtyRow(r);
		}
		return false;
	}
	
	// -----------------------------------------------

}