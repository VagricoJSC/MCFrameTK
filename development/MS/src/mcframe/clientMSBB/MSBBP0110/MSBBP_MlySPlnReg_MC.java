package mcframe.clientMSBB.MSBBP0110;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import java.math.RoundingMode;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_MlySPlnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_MlySPlnReg_MC extends MSBBP_MlySPlnReg_MC_A implements IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _grpSeparator = " / ";

	protected CndR _srchCndR;

	protected int _maxColSize = 24;

	protected ArrayList<MCColumnConfig> _qtyColumns;

	protected MAUCP_VHMapper<DtlR, DtlDispR> _vhMDisp = new MAUCP_VHMapper<>();

	protected MAUCP_VHMapper<DtlR, DtlDispR> _vhMUpd = new MAUCP_VHMapper<>();

	protected MAUCP_VHMapper<RefDtlR, DtlDispR> _vhMRef = new MAUCP_VHMapper<>();

	protected MAUCP_VHMapper<UsrDtlR, DtlDispR> _vhMUsr = new MAUCP_VHMapper<>();

	protected HashMap<MCNumber, MCList<DtlDispR>> _grpNoUpdHMap = new HashMap<>();

	protected HashMap<MCNumber, MCList<DtlR>> _grpNoUpdVMap = new HashMap<>();

	protected HashMap<MCNumber, FixDtlR> _grpNoUpdFixMap = new HashMap<>();

	protected HashMap<MCNumber, MCList<DtlDispR>> _grpNoUsrHMap = new HashMap<>();

	protected MCList<DtlDispR> _allDtlDispL = MCList.create(DtlDispR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnReg_MC() {
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
	public MSBBP_MlySPlnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Srch01Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDtlDispL());
			setHdrDelFlg();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_usr_spln_ym_fr, Cnd_usr_spln_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_usr_reg_t_flg, Cnd_usr_reg_f_flg));
			msgList.addAll(checkAtLeastOne(Cnd_usr_fix_t_flg, Cnd_usr_fix_f_flg));
			msgList.addAll(checkForCallStackSplnYmStEnd(Cnd_usr_spln_ym_fr, Cnd_usr_spln_ym_to));
		}

		@Override
		protected void clear() {
			super.clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			srchCmmnShowSub();
			showVH();
			showVHDisp();
		}

		protected void showVH() {
			showVHEditUpdVList();

			showVHMDispInit();
			showVHMCmmn(_vhMUpd, getDtlL());

			crtGrpNoCache();

			showVHEditUpdHList();
		}

		protected void showVHDisp() {
			_allDtlDispL.addAll(getRefDtlDispL());
			_allDtlDispL.sort(crtSortVHUpd());
			addBlkRows();
			changeDispRows();
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
	 * [MS_MSBBL0110_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Srch02Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0110_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDtlDispL());
			setHdrDelFlg();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_sum_spln_ym_fr, Cnd_sum_spln_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_sum_reg_t_flg, Cnd_sum_reg_f_flg));
			msgList.addAll(checkAtLeastOne(Cnd_sum_fix_t_flg, Cnd_sum_fix_f_flg));
			msgList.addAll(checkForCallStackSplnYmStEnd(Cnd_sum_spln_ym_fr, Cnd_sum_spln_ym_to));
		}

		@Override
		protected void clear() {
			super.clear();
			clearCacheVH();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			afterCallSub();
		}

		protected void afterCallSub() {
			int usrRmrksLen = getPgmSettingIntNE(panel, 20, "sum.usr_rmrks_length");
			if (usrRmrksLen <= 0) {
				return ;
			}
			bridge.down0().sum_old_locked_flg(bridge.down0().sum_locked_flg());
			for (UsrDtlR r : bridge.down3()) {
				String rmrks = r.intr_rmrks();
				if (!isNull(rmrks) && rmrks.length() > usrRmrksLen) {
					r.intr_rmrks(rmrks.substring(0, usrRmrksLen));
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			srchCmmnShowSub();
			showVH();
			showVHDisp();
		}

		protected void showVH() {
			showVHEditUpdVList();

			showVHMDispInit();
			showVHMCmmn(_vhMUpd, getDtlL());
			showVHMCmmn(_vhMUsr, getUsrDtlL());

			crtGrpNoCache();

			showVHEditUpdHList();
		}

		protected void showVHDisp() {
			_allDtlDispL.addAll(getRefDtlDispL());
			_allDtlDispL.addAll(getUsrDtlDispL());
			_allDtlDispL.sort(crtSortVHUpd());
			addBlkRows();
			changeDispRows();
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

	protected void setHdrDelFlg() {
		getCndR().hdr_del_flg(Cnd_ope_HDR_DEL.isSelected());
	}

	protected void crtGrpNoCache() {
		MCSortPolicy sp = crtSortVHUpd();

		for (MCList<DtlR> l : getDtlL().groupList(DtlR.$grp_peg_no)) {
			_grpNoUpdVMap.put(l.get(0).grp_peg_no(), l);
		}

		for (MCList<DtlDispR> l : _vhMUsr.getCachedHAllL().groupList(DtlDispR.$grp_peg_no)) {
			l.sort(sp);
			_grpNoUsrHMap.put(l.get(0).grp_peg_no(), l);
		}

		MCList<DtlDispR> hList = _vhMUpd.getCachedHAllL();

		for (MCList<DtlDispR> l : hList.groupList(DtlDispR.$grp_peg_no)) {
			l.sort(sp);
			_grpNoUpdHMap.put(l.get(0).grp_peg_no(), l);
		}

		for (FixDtlR r : getFixDtlL()) {
			_grpNoUpdFixMap.put(r.grp_peg_no(), r);
		}

	}

	protected MCSortPolicy crtSortVHUpd() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DtlDispR.$disp_seq);
		sp.add(SortType.ASC, DtlDispR.$dpt_cd);
		sp.add(SortType.ASC, DtlDispR.$cst_cd);
		sp.add(SortType.ASC, DtlDispR.$wrk_no);
		sp.add(SortType.ASC, DtlDispR.$spln_itm_cd);
		sp.add(SortType.ASC, DtlDispR.$itm_cd);
		sp.add(SortType.ASC, DtlDispR.$itm_sub1);
		sp.add(SortType.ASC, DtlDispR.$itm_sub2);
		sp.add(SortType.ASC, DtlDispR.$itm_sub3);
		sp.add(SortType.ASC, DtlDispR.$cur_cd);
		sp.add(SortType.ASC, DtlDispR.$grp_peg_no);
		sp.add(SortType.ASC_NULL_AHEAD, DtlDispR.$usr_cd);
		sp.add(SortType.ASC, DtlDispR.$dtl_disp_no);
		return sp;
	}



	/**
	 * [MS_MSBBL0110_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Srch03Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0110_Srch03Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_ref_spln_ym_fr, Cnd_ref_spln_ym_to));
			msgList.addAll(checkForCallStackSplnYmStEnd(Cnd_ref_spln_ym_fr, Cnd_ref_spln_ym_to));
		}

		@Override
		protected void clear() {
			super.clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			srchCmmnShowSub();
			showVH();
			showVHDisp();
		}

		protected void showVH() {
			// 縦横変換を行う
			showVHMDispInit();
			showVHMCmmn(_vhMRef, getRefDtlL());

			showVHEditRefHList();
		}

		protected void showVHDisp() {
			// 表示テーブルに表示する
			_allDtlDispL.setAll(getRefDtlDispL());
			_allDtlDispL.sort(crtSortVHRef());
			addBlkRows();
			changeDispRows();
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
	 * [MS_MSBBL0110_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Srch04Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0110_Srch04Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_ref_spln_ym_fr, Cnd_ref_spln_ym_to));
			msgList.addAll(checkForCallStackSplnYmStEnd(Cnd_ref_spln_ym_fr, Cnd_ref_spln_ym_to));
		}

		@Override
		protected void clear() {
			super.clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			srchCmmnShowSub();
			showVH();
			showVHDisp();
		}

		protected void showVH() {
			// 縦横変換を行う
			showVHMDispInit();
			showVHMCmmn(_vhMRef, getRefDtlL());

			showVHEditRefHList();
		}

		protected void showVHDisp() {
			// 表示テーブルに表示する
			_allDtlDispL.setAll(getRefDtlDispL());
			_allDtlDispL.sort(crtSortVHRef());
			addBlkRows();
			changeDispRows();
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

	protected MCSortPolicy crtSortVHRef() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DtlDispR.$disp_seq);
		sp.add(SortType.ASC, DtlDispR.$dpt_cd);
		sp.add(SortType.ASC, DtlDispR.$cst_cd);
		sp.add(SortType.ASC, DtlDispR.$wrk_no);
		sp.add(SortType.ASC, DtlDispR.$spln_itm_cd);
		sp.add(SortType.ASC, DtlDispR.$itm_cd);
		sp.add(SortType.ASC, DtlDispR.$itm_sub1);
		sp.add(SortType.ASC, DtlDispR.$itm_sub2);
		sp.add(SortType.ASC, DtlDispR.$itm_sub3);
		sp.add(SortType.ASC, DtlDispR.$cur_cd);
		sp.add(SortType.ASC, DtlDispR.$ym);
		sp.add(SortType.ASC, DtlDispR.$spln_vers);
		sp.add(SortType.ASC, DtlDispR.$usr_cd);
		sp.add(SortType.ASC, DtlDispR.$grp_peg_no);
		sp.add(SortType.ASC, DtlDispR.$dtl_disp_no);
		return sp;
	}

	protected void showVHEditRefHList() {
		for (DtlDispR r : getRefDtlDispL()) {
			if (isQtyRow(r)) {
				r.usr_info(r.usr_nm());
			}
			else if (isAmtRow(r)) {
				r.usr_info(r.usr_cd());
			}
		}
	}

	protected void addBlkRows() {
		// _allDtlDispL：表示順に従ってソートされている前提
		MCList<DtlDispR> l = MCList.create(DtlDispR.class);
		MCNumber preGrpPegNo = null;
		for (int i = 0; i < _allDtlDispL.size(); i++) {
			DtlDispR r = _allDtlDispL.get(i);
			if (preGrpPegNo != null && !isSame(preGrpPegNo, r.grp_peg_no())) {
				l.add(crtBlkRow(_allDtlDispL.get(i - 1)));
			}
			l.add(r);
			preGrpPegNo = r.grp_peg_no();
		}
		if (!isNull(l)) {
			l.add(crtBlkRow(l.get(l.size()-1)));
		}

		_allDtlDispL.setAll(l);
	}

	protected DtlDispR crtBlkRow(DtlDispR r) {
		DtlDispR b = r.clone();
		b.label(null);
		b.code(null);
		b.name(null);
		b.disp_unit_cd(null);
		b.disp_unit_nm(null);
		b.disp_spln_set_typ_flg(false);
		b.row_title_col(null);
		b.row_title_nm(null);
		b.grp_nm(null);
		b.ym(null);
		b.spln_vers(null);
		b.usr_info(null);
		for (MCColumnConfig col : getQtyCols()) {
			b.clear(col.getBaseRowColumnName());
		}
		b.usr_intr_rmrks(null);
		b.sum_intr_rmrks(null);
		b.usr_sub_char1(null);
		b.usr_sub_char2(null);
		b.usr_sub_char3(null);
		b.sum_sub_char1(null);
		b.sum_sub_char2(null);
		b.sum_sub_char3(null);
		b.ins_func_id(null);
		b.ins_func_nm(null);
		b.ins_usr_id(null);
		b.ins_usr_nm(null);
		b.ins_ts(null);
		b.upd_func_id(null);
		b.upd_func_nm(null);
		b.upd_usr_id(null);
		b.upd_usr_nm(null);
		b.upd_ts(null);
		b.upd_srv_req_no(null);
		b.dtl_disp_no(null);
		b.record_id(null);
		b.fix_flg(false);
		b.adopted_flg(false);
		return b;
	}

	protected void changeDispRows() {
		if (Cnd_ope_REF.isSelected()) {
			if (getCndR().show_blk_flg()) {
				getDtlDispL().setAll(_allDtlDispL);
			}
			else {
				getDtlDispL().setAll(_allDtlDispL.subList(r->!isBlkRow(r)));
			}
		}
		else {
			if (getCndR().show_act_flg() && getCndR().show_pre_flg()
					&& getCndR().show_ref_flg() && getCndR().show_sub_flg()
					&& getCndR().show_blk_flg()) {
				getDtlDispL().setAll(_allDtlDispL);
			}
			else {
				getDtlDispL().setAll(
						_allDtlDispL
								.subList(r -> (isCurRow(r) || getCndR().show_act_flg()
										&& isActRow(r) || getCndR().show_pre_flg()
										&& isPreRow(r) || getCndR().show_ref_flg()
										&& isRefRow(r) || getCndR().show_sub_flg()
										&& isUsrRow(r) || getCndR().show_blk_flg()
										&& isBlkRow(r))));
			}
		}
		changeDispCols();
	}

	protected void changeDispCols() {
		if (Cnd_ope_REF.isSelected()) {
			setDispCol2Rows();
		}
		else if (Cnd_upd_ope_USR.isSelected()) {
			if (getCndR().show_act_flg() || getCndR().show_pre_flg()) {
				setDispCol4Rows();
			}
			else {
				setDispCol2Rows();
			}
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {

			MCNumber preGrpPegNo = null;

			for (DtlDispR r : getDtlDispL()) {
				if (!isSame(preGrpPegNo, r.grp_peg_no())) {
					r.label(r.label_itm());
					r.code(r.disp_itm_cd());
					r.name(r.disp_itm_nm());
				}
				else {
					if (isActRow(r) || isPreRow(r) || isCurRow(r) || isRefRow(r)) {
						r.label(null);
						r.code(null);
						r.name(null);
					}
				}

				preGrpPegNo = r.grp_peg_no();
			}
		}

	}

	protected void setDispCol2Rows() {
		String labelDpt = getDispString("label_dpt");
		String labelCst = getDispString("label_cst");
		String labelWrk = getDispString("label_wrk");

		MCNumber preGrpPegNo = null;
		int i = 0;
		for (DtlDispR r : getDtlDispL()) {
			if (!isSame(preGrpPegNo, r.grp_peg_no())) {
				i = 0;
			}

			if (i == 0) {
				r.label(r.label_itm());
				r.code(r.disp_itm_cd());
				r.name(r.disp_itm_nm());
			}
			else if (i == 1) {
				StringBuilder sblabel = new StringBuilder();
				StringBuilder sbcode = new StringBuilder();
				StringBuilder sbname = new StringBuilder();
				sblabel.append(labelDpt);
				sbcode.append(r.dpt_cd());
				sbname.append(r.dpt_nm());
				if (!isNullOrNullVal(r.cst_cd())) {
					sblabel.append(_grpSeparator);
					sbcode.append(_grpSeparator);
					sbname.append(_grpSeparator);
					sblabel.append(labelCst);
					sbcode.append(r.cst_cd());
					sbname.append(r.cst_nm());
				}
				if (!isNullOrNullVal(r.wrk_no())) {
					sblabel.append(_grpSeparator);
					sbcode.append(_grpSeparator);
					sbname.append(_grpSeparator);
					sblabel.append(labelWrk);
					sbcode.append(r.wrk_no());
					sbname.append(r.wrk_nm());
				}
				r.label(sblabel.toString());
				r.code(sbcode.toString());
				r.name(sbname.toString());
			}
			else {
				if (isActRow(r) || isPreRow(r) || isCurRow(r) || isRefRow(r)) {
					r.label(null);
					r.code(null);
					r.name(null);
				}
			}
			i++;
			preGrpPegNo = r.grp_peg_no();
		}
	}

	protected void setDispCol4Rows() {
		String labelDpt = getDispString("label_dpt");
		String labelCst = getDispString("label_cst");
		String labelWrk = getDispString("label_wrk");

		MCNumber preGrpPegNo = null;
		int i = 0;
		for (DtlDispR r : getDtlDispL()) {
			if (!isSame(preGrpPegNo, r.grp_peg_no())) {
				i = 0;
			}

			if (i == 0) {
				r.label(r.label_itm());
				r.code(r.disp_itm_cd());
				r.name(r.disp_itm_nm());
			}
			else if (i == 1) {
				r.label(labelDpt);
				r.code(r.dpt_cd());
				r.name(r.dpt_nm());
			}
			else if (i == 2) {
				if (!isNullOrNullVal(r.cst_cd())) {
					r.label(labelCst);
					r.code(r.cst_cd());
					r.name(r.cst_nm());
				}
			}
			else if (i == 3) {
				if (!isNullOrNullVal(r.wrk_no())) {
					r.label(labelWrk);
					r.code(r.wrk_no());
					r.name(r.wrk_nm());
				}
			}
			else {
				if (isActRow(r) || isPreRow(r) || isCurRow(r) || isRefRow(r)) {
					r.label(null);
					r.code(null);
					r.name(null);
				}
			}
			i++;
			preGrpPegNo = r.grp_peg_no();
		}
	}

	protected MCMessageList checkForCallStackSplnYmStEnd(MCDateField ymFrField, MCDateField ymToField) {
		MCMessageList msgList = new MCMessageList();
		MCDate ymFr = ymFrField.getValue();
		MCDate ymTo = ymToField.getValue();
		if (!isNullOr(ymFr, ymTo)) {
			long diff = ymTo.diffMonth(ymFr);
			if (diff >= _maxColSize) {
				msgList.add(new MCMessage(ymFrField.getBaseRow(), ymFrField.getBaseRowColumnName(), MSBBP0002));
			}
		}
		return msgList;
	}

	/**
	 * 検索処理時点の検索条件を取得する。
	 * 表示ブロックの入力制御に使用する。
	 */
	protected CndR getSrchCndR() {
		if (_srchCndR == null) {
			setSrchCndR();
		}
		return _srchCndR;
	}

	protected void setSrchCndR() {
		_srchCndR = getCndR().clone();
	}

	/**
	 * Srch01,Srch02,Srch03,Srch04の共通の検索後処理
	 */
	protected void srchCmmnShowSub() {
		if (Cnd_ope_REF.isSelected()) {
			getCndR().spln_ym_fr(getCndR().ref_spln_ym_fr());
			getCndR().spln_ym_to(getCndR().ref_spln_ym_to());
		}
		else if (Cnd_upd_ope_USR.isSelected()) {
			getCndR().spln_ym_fr(getCndR().usr_spln_ym_fr());
			getCndR().spln_ym_to(getCndR().usr_spln_ym_to());
			getHdrR().usr_spln_ym_fr(getCndR().usr_spln_ym_fr());
			getHdrR().usr_spln_ym_to(getCndR().usr_spln_ym_to());
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			getCndR().spln_ym_fr(getCndR().sum_spln_ym_fr());
			getCndR().spln_ym_to(getCndR().sum_spln_ym_to());
			getHdrR().sum_spln_ym_fr(getCndR().sum_spln_ym_fr());
			getHdrR().sum_spln_ym_to(getCndR().sum_spln_ym_to());

		}

		setSrchCndR();
		getCndR().show_act_flg(getSrchCndR().act_flg());
		getCndR().show_pre_flg(getSrchCndR().pre_flg());
		getCndR().show_ref_flg(getSrchCndR().ref_flg());
	}

	protected <V extends MCConstRow> void showVHMCmmn(
			MAUCP_VHMapper<V, DtlDispR> map, MCList<V> vList) {
		// 可変カラムのラベル名を設定する
		MCList<MCRow> ymList = getVHInitColInfo();
		map.initColInfo(ymList);

		// 縦横変換処理を実行する
		map.convertVH(vList, map.getCachedHAllL());

		// 縦横変換した後の横データを加工する
		showVHMEditHList(map.getCachedHAllL());

		// 横データを表示する
		map.doTableDispChange();
	}

	protected MCList<MCRow> getVHInitColInfo() {
		MCDate fr = getSrchCndR().spln_ym_fr();
		MCDate to = getSrchCndR().spln_ym_to();
		// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
		MCList<MCRow> ymList = MCList.create(MCRow.class);
		for (int i = 1; i <= _maxColSize; i++) {
			MCDate dt = fr.addMonth(i-1);
			if (dt.gt(to)) {
				break;
			}
			MCRow o = ymList.createRow();
			// 可変カラムを識別するための値を設定する
			o.setDateNE(DtlR.$spln_ym, dt);
			// 可変カラムのラベル名を設定する
			o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toYMString(dt));
			ymList.add(o);
		}
		return ymList;
	}

	protected void showVHMEditHList(MCList<DtlDispR> destL) {
		MCJoinKey<MCList<FixDtlR>> jk = destL.join(DtlDispR.$grp_peg_no, getFixDtlL(),
				FixDtlR.$grp_peg_no);
		join(destL, jk, createMap_DtlDispR_FixDtlR());

		String labelItm = getDispString("label_itm");
		String labelSplnItm = getDispString("label_spln_itm");

		String labelGrpAct = getDispString("label_grp_act");
		String labelGrpPre = getDispString("label_grp_pre");
		String labelGrpCur = getDispString("label_grp_cur");
		String labelGrpRef = getDispString("label_grp_ref");
		String labelGrpUsr = getDispString("label_grp_usr");

		for (DtlDispR r : destL) {
			if (isSplnItmRow(r)) {
				r.label_itm(labelSplnItm);
			}
			else {
				r.label_itm(labelItm);
			}

			if (isSame(r.row_title_col(), DtlR.$frcst_qty)) {
				r.dtl_disp_no(111);
				r.grp_nm(labelGrpAct);
			}
			if (isSame(r.row_title_col(), DtlR.$frcst_amt)) {
				r.dtl_disp_no(112);
			}
			if (isSame(r.row_title_col(), DtlR.$pre_slo_qty)) {
				r.dtl_disp_no(121);
			}
			if (isSame(r.row_title_col(), DtlR.$pre_slo_amt)) {
				r.dtl_disp_no(122);
			}
			if (isSame(r.row_title_col(), DtlR.$slo_qty)) {
				r.dtl_disp_no(131);
			}
			if (isSame(r.row_title_col(), DtlR.$slo_amt)) {
				r.dtl_disp_no(132);
			}
			if (isSame(r.row_title_col(), DtlR.$pre_spln_qty)) {
				r.dtl_disp_no(211);
				r.grp_nm(labelGrpPre);
			}
			if (isSame(r.row_title_col(), DtlR.$pre_spln_amt)) {
				r.dtl_disp_no(212);
			}
			if (isSame(r.row_title_col(), DtlR.$spln_qty)) {
				r.dtl_disp_no(221);
				r.grp_nm(labelGrpCur);
			}
			if (isSame(r.row_title_col(), DtlR.$spln_amt)) {
				r.dtl_disp_no(222);
			}
			if (isSame(r.row_title_col(), DtlR.$ref_spln_qty)) {
				r.dtl_disp_no(231);
				r.grp_nm(labelGrpRef);
			}
			if (isSame(r.row_title_col(), DtlR.$ref_spln_amt)) {
				r.dtl_disp_no(232);
			}
			if (isSame(r.row_title_col(), UsrDtlR.$usr_spln_qty)) {
				r.dtl_disp_no(301);
				r.grp_nm(labelGrpUsr);
			}
			if (isSame(r.row_title_col(), UsrDtlR.$usr_spln_amt)) {
				r.dtl_disp_no(302);
			}
		}
	}

	protected Map_DtlDispR_FixDtlR<DtlDispR,FixDtlR> createMap_DtlDispR_FixDtlR() {
		return new Map_DtlDispR_FixDtlR<DtlDispR, FixDtlR>();
	}

	public class Map_DtlDispR_FixDtlR<D extends DtlDispR, S extends FixDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlDispR.$fix_flg, FixDtlR.$fix_flg);
			addColumnPathMap(DtlDispR.$adopted_flg, FixDtlR.$adopted_flg);
			addColumnPathMap(DtlDispR.$ym, FixDtlR.$ym);
			addColumnPathMap(DtlDispR.$spln_vers, FixDtlR.$spln_vers);
			addColumnPathMap(DtlDispR.$spln_itm_cd, FixDtlR.$spln_itm_cd);
			addColumnPathMap(DtlDispR.$spln_itm_nm, FixDtlR.$spln_itm_nm);
			addColumnPathMap(DtlDispR.$itm_cd, FixDtlR.$itm_cd);
			addColumnPathMap(DtlDispR.$itm_sub1, FixDtlR.$itm_sub1);
			addColumnPathMap(DtlDispR.$itm_sub2, FixDtlR.$itm_sub2);
			addColumnPathMap(DtlDispR.$itm_sub3, FixDtlR.$itm_sub3);
			addColumnPathMap(DtlDispR.$itm_nm, FixDtlR.$itm_nm);
			addColumnPathMap(DtlDispR.$dpt_cd, FixDtlR.$dpt_cd);
			addColumnPathMap(DtlDispR.$dpt_nm, FixDtlR.$dpt_nm);
			addColumnPathMap(DtlDispR.$dpt_lvl_cd, FixDtlR.$dpt_lvl_cd);
			addColumnPathMap(DtlDispR.$cst_cd, FixDtlR.$cst_cd);
			addColumnPathMap(DtlDispR.$cst_nm, FixDtlR.$cst_nm);
			addColumnPathMap(DtlDispR.$wrk_no, FixDtlR.$wrk_no);
			addColumnPathMap(DtlDispR.$wrk_nm, FixDtlR.$wrk_nm);
			addColumnPathMap(DtlDispR.$spln_set_typ, FixDtlR.$spln_set_typ);
			addColumnPathMap(DtlDispR.$spln_set_typ_nm, FixDtlR.$spln_set_typ_nm);
			addColumnPathMap(DtlDispR.$cur_cd, FixDtlR.$cur_cd);
			addColumnPathMap(DtlDispR.$cur_nm, FixDtlR.$cur_nm);
			addColumnPathMap(DtlDispR.$unit_cd, FixDtlR.$unit_cd);
			addColumnPathMap(DtlDispR.$unit_nm, FixDtlR.$unit_nm);
			addColumnPathMap(DtlDispR.$usr_intr_rmrks, FixDtlR.$usr_intr_rmrks);
			addColumnPathMap(DtlDispR.$usr_sub_char1, FixDtlR.$usr_sub_char1);
			addColumnPathMap(DtlDispR.$usr_sub_char2, FixDtlR.$usr_sub_char2);
			addColumnPathMap(DtlDispR.$usr_sub_char3, FixDtlR.$usr_sub_char3);
			addColumnPathMap(DtlDispR.$sum_intr_rmrks, FixDtlR.$sum_intr_rmrks);
			addColumnPathMap(DtlDispR.$sum_sub_char1, FixDtlR.$sum_sub_char1);
			addColumnPathMap(DtlDispR.$sum_sub_char2, FixDtlR.$sum_sub_char2);
			addColumnPathMap(DtlDispR.$sum_sub_char3, FixDtlR.$sum_sub_char3);
			addColumnPathMap(DtlDispR.$ins_usr_id, FixDtlR.$ins_usr_id);
			addColumnPathMap(DtlDispR.$ins_usr_nm, FixDtlR.$ins_usr_nm);
			addColumnPathMap(DtlDispR.$ins_func_id, FixDtlR.$ins_func_id);
			addColumnPathMap(DtlDispR.$ins_func_nm, FixDtlR.$ins_func_nm);
			addColumnPathMap(DtlDispR.$ins_ts, FixDtlR.$ins_ts);
			addColumnPathMap(DtlDispR.$upd_usr_id, FixDtlR.$upd_usr_id);
			addColumnPathMap(DtlDispR.$upd_usr_nm, FixDtlR.$upd_usr_nm);
			addColumnPathMap(DtlDispR.$upd_func_id, FixDtlR.$upd_func_id);
			addColumnPathMap(DtlDispR.$upd_func_nm, FixDtlR.$upd_func_nm);
			addColumnPathMap(DtlDispR.$upd_ts, FixDtlR.$upd_ts);
			addColumnPathMap(DtlDispR.$upd_srv_req_no, FixDtlR.$upd_srv_req_no);
			addColumnPathMap(DtlDispR.$disp_seq, FixDtlR.$disp_seq);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isQtyRow(dest)) {
				dest.dec_place(src.qty_dec_place());
				if (isSplnItmRow(dest)) {
					dest.dec_place(0);
				}
				dest.disp_unit_cd(dest.unit_cd());
				dest.disp_unit_nm(dest.unit_nm());
			}
			else if (isAmtRow(dest)) {
				dest.dec_place(src.amt_dec_place());
				dest.disp_unit_cd(dest.cur_cd());
				dest.disp_unit_nm(dest.cur_nm());
			}

			if (isSplnItmRow(dest)) {
				dest.disp_itm_cd(src.spln_itm_cd());
				dest.disp_itm_nm(src.spln_itm_nm());
			}
			else {
				dest.disp_itm_cd(toDispItm2(src));
				dest.disp_itm_nm(src.itm_nm());
			}

			if (isInptRow(dest)) {
				dest.disp_spln_set_typ_flg(true);
			}
			else {
				dest.fix_flg(false);
				dest.adopted_flg(false);
			}


			if (isNull(dest.usr_cd())) {
				dest.usr_cd(src.usr_cd());
				dest.usr_nm(src.usr_nm());
			}

		}

	}

	protected String toDispItm2(FixDtlR r) {
		return toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this);
	}

	protected <V extends MCConstRow> void showVHMDispInit() {
		// 可変カラムのラベル名を設定する
		MCList<MCRow> ymList = getVHInitColInfo();
		_vhMDisp.initColInfo(ymList);
		_vhMDisp.doTableDispChange();

		// 可変カラムのラベル名を表示する
		MCList<DtlR> dummy = MCList.create(DtlR.class);
		_vhMDisp.convertVH(dummy, _vhMDisp.getCachedHAllL());
	}

	protected void showVHEditUpdVList() {
		int i = 0;
		for (DtlR r : getDtlL()) {
			r.setGUIIndex(i);
			i++;
		}
	}

	protected void showVHEditUpdHList() {
		MCIndexKey idxkeyDtl = getDtlL().createIndex(DtlR.$grp_peg_no, DtlR.$spln_ym);

		for (DtlDispR r : getRefDtlDispL()) {
			if (isInptRow(r)) {
				MCDate dt = getCndR().spln_ym_fr();
				ArrayList<MCColumnConfig> qtyCols = getQtyCols();
				for (int i = 0; i < qtyCols.size(); i++) {
					MCColumnConfig col = qtyCols.get(i);
					setEditableQtyCol(r, dt.addMonth(i), col, idxkeyDtl);
				}
			}
		}

		String labelUsr = getDispString("label_usr");
		String labelRmrks = getDispString("label_rmrks");
		for (DtlDispR r : getUsrDtlDispL()) {
			if (isSame(r.row_title_col(), UsrDtlR.$usr_spln_qty)) {
				r.label(labelUsr);
				r.code(r.usr_cd());
				r.name(r.usr_nm());
			}
			else if (isSame(r.row_title_col(), UsrDtlR.$usr_spln_amt)) {
				r.label(labelRmrks);
				r.code(null);
				r.name(r.intr_rmrks());
			}
		}
	}

	protected void setEditableQtyCol(DtlDispR r, MCDate dt,
			MCColumnConfig qtyCol, MCIndexKey idxkeyDtl) {
		if (isNull(r.getValue(qtyCol.getBaseRowColumnName()))) {
			DtlR v = getDtlL().getFirst(idxkeyDtl, r.grp_peg_no(), dt);
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


	/**
	 * [MS_MSBBL0110_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Sprt01Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MCList<DtlDispR> _dtlDispL;

		protected MCList<DtlR> _dtlL;

		protected MS_MSBBL0110_Sprt01Caller(P p, B b) {
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

			// 計算対象の値をクリアする
			for (DtlDispR h : _dtlDispL) {
				DtlDispR c = getCalcRow(h);
				for (MCColumnConfig col : getQtyCols()) {
					c.setNumber(col.getBaseRowColumnName(), null);
					if (h.getBoolean(getEditableQtyCol(col).getBaseRowColumnName())) {
						_vhMUpd.reflectHV(_dtlL , c, col.getBaseRowColumnName());
					}
				}
			}

			getSprtAmtQtyCalDtlL().clear();
			addAll(getSprtAmtQtyCalDtlL(), _dtlL, createMap_SprtAmtQtyCalDtlR_DtlR());

			MCJoinKey<MCList<FixDtlR>> jk = getSprtAmtQtyCalDtlL().join(
					SprtAmtQtyCalDtlR.$grp_peg_no, getFixDtlL(), FixDtlR.$grp_peg_no);
			join(getSprtAmtQtyCalDtlL(), jk, createMap_SprtAmtQtyCalDtlR_FixDtlR());

			super.setupUpParam();
		}

		@Override
		protected void show() {
			super.show();
			showVH();

		}

		protected void showVH() {
			MCList<DtlDispR> dtlDispL = MCList.create(DtlDispR.class);

			// 縦リスト横リストに値を反映する
			for (MCList<SprtAmtQtyCalDtlR> sprtL : getSprtAmtQtyCalDtlL().groupList(SprtAmtQtyCalDtlR.$grp_peg_no)) {
				MCNumber grpPegNo = sprtL.get(0).grp_peg_no();
				String splnSetTyp = sprtL.get(0).spln_set_typ();

				MCList<DtlDispR> hList = _grpNoUpdHMap.get(grpPegNo);
				DtlDispR editH = getDtlDispCalcR(hList);
				MCList<DtlR> vList = _grpNoUpdVMap.get(grpPegNo);
				dtlDispL.addAll(hList);

				// 縦リストに値を反映する
				for (SprtAmtQtyCalDtlR sprtR : sprtL) {
					DtlR v = vList.getFirst(DtlR.$spln_ym, sprtR.spln_ym());
					if (MAC_SPLN_SET_TYP.isQTY(splnSetTyp)) {
						v.spln_amt(sprtR.spln_amt());
					}
					else if (MAC_SPLN_SET_TYP.isAMT(splnSetTyp)) {
						v.spln_qty(sprtR.spln_qty());
					}
					v.sum_flg(false);
				}

				// 横リストに値を反映する
				if (MAC_SPLN_SET_TYP.isQTY(splnSetTyp)) {
					_vhMUpd.reflectVH(vList, hList, editH, DtlR.$spln_amt);
				}
				else if (MAC_SPLN_SET_TYP.isAMT(splnSetTyp)) {
					_vhMUpd.reflectVH(vList, hList, editH, DtlR.$spln_qty);
				}

			}

			// メッセージのcauseRowを縦横変換する
			_vhMUpd.cnvCauseRowVH(dtlDispL, getMessages());

		}

		protected DtlDispR getDtlDispCalcR(MCList<DtlDispR> grpNoHList) {
			for (DtlDispR r : grpNoHList) {
				if (isCalcRow(r)) {
					return r;
				}
			}
			return null;
		}


		protected Map_SprtAmtQtyCalDtlR_DtlR<SprtAmtQtyCalDtlR,DtlR> createMap_SprtAmtQtyCalDtlR_DtlR() {
			return new Map_SprtAmtQtyCalDtlR_DtlR<SprtAmtQtyCalDtlR, DtlR>();
		}

		public class Map_SprtAmtQtyCalDtlR_DtlR<D extends SprtAmtQtyCalDtlR, S extends DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SprtAmtQtyCalDtlR.$grp_peg_no, DtlR.$grp_peg_no);
				addColumnPathMap(SprtAmtQtyCalDtlR.$spln_ym, DtlR.$spln_ym);
				addColumnPathMap(SprtAmtQtyCalDtlR.$spln_qty, DtlR.$spln_qty);
				addColumnPathMap(SprtAmtQtyCalDtlR.$spln_amt, DtlR.$spln_amt);
			}
		}

		protected Map_SprtAmtQtyCalDtlR_FixDtlR<SprtAmtQtyCalDtlR,FixDtlR> createMap_SprtAmtQtyCalDtlR_FixDtlR() {
			return new Map_SprtAmtQtyCalDtlR_FixDtlR<SprtAmtQtyCalDtlR, FixDtlR>();
		}

		public class Map_SprtAmtQtyCalDtlR_FixDtlR<D extends SprtAmtQtyCalDtlR, S extends FixDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SprtAmtQtyCalDtlR.$spln_set_typ, FixDtlR.$spln_set_typ);
				addColumnPathMap(SprtAmtQtyCalDtlR.$dpt_cd, FixDtlR.$dpt_cd);
				addColumnPathMap(SprtAmtQtyCalDtlR.$cst_cd, FixDtlR.$cst_cd);
				addColumnPathMap(SprtAmtQtyCalDtlR.$spln_itm_cd, FixDtlR.$spln_itm_cd);
				addColumnPathMap(SprtAmtQtyCalDtlR.$itm_cd, FixDtlR.$itm_cd);
				addColumnPathMap(SprtAmtQtyCalDtlR.$itm_sub1, FixDtlR.$itm_sub1);
				addColumnPathMap(SprtAmtQtyCalDtlR.$itm_sub2, FixDtlR.$itm_sub2);
				addColumnPathMap(SprtAmtQtyCalDtlR.$itm_sub3, FixDtlR.$itm_sub3);
				addColumnPathMap(SprtAmtQtyCalDtlR.$cur_cd, FixDtlR.$cur_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (Cnd_upd_ope_SUM.isSelected()) {
					dest.dpt_cd(getHdrR().sum_dpt_cd());
					dest.cst_cd(getHdrR().sum_cst_cd());
				}

			}
		}


	}


	/**
	 * [MS_MSBBL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Upd01Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<DtlDispR> _dtlDispL;

		protected MCList<DtlR> _dtlL;

		protected MCList<FixDtlR> _fixDtlL;

		protected MS_MSBBL0110_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_dtlDispL =  getCheckedDtlDispL(false);
			_dtlL = getCheckedDtlL(false);
			_fixDtlL = getCheckedFixDtlL();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlDispR h : _dtlDispL) {
				msgList.addAll(panel.checkReq(h));
			}
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			// ヘッダのみの更新を認める
			return true;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_fixDtlL);
			bridge.up2().setAll(_dtlL);
		}

		@Override
		protected void show() {
			super.show();
			showVH();
		}

		protected void showVH() {
			MCList<DtlDispR> dtlDispL = MCList.create(DtlDispR.class);
			for (DtlDispR r : _dtlDispL) {
				MCList<DtlDispR> hList = _grpNoUpdHMap.get(r.grp_peg_no());
				dtlDispL.addAll(hList);
				_vhMUpd.reflectVH(_dtlL, hList, r, DtlR.$spln_qty, DtlR.$spln_amt);
			}

			// メッセージのcauseRowを縦横変換する
			_vhMUpd.cnvCauseRowVH(dtlDispL, getMessages());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUSR_FIX_UStatus();
		}
	}

	/**
	 * [MS_MSBBL0110_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Upd02Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<DtlDispR> _dtlDispL;

		protected MCList<DtlR> _dtlL;

		protected MCList<FixDtlR> _fixDtlL;

		protected MS_MSBBL0110_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_dtlDispL =  getCheckedDtlDispL(false);
			_dtlL = getCheckedDtlL(false);
			_fixDtlL = getCheckedFixDtlL();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlDispR h : _dtlDispL) {
				msgList.addAll(panel.checkReq(h));
			}
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			// ヘッダのみの更新を認める
			return true;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_fixDtlL);
			bridge.up2().setAll(_dtlL);
		}

		@Override
		protected void show() {
			super.show();
			showVH();
		}

		protected void showVH() {
			MCList<DtlDispR> dtlDispL = MCList.create(DtlDispR.class);

			for (DtlDispR r : _dtlDispL) {
				MCList<DtlDispR> hList = _grpNoUpdHMap.get(r.grp_peg_no());
				dtlDispL.addAll(hList);
				_vhMUpd.reflectVH(_dtlL, hList, r, DtlR.$spln_qty, DtlR.$spln_amt);
			}

			// メッセージのcauseRowを縦横変換する
			_vhMUpd.cnvCauseRowVH(dtlDispL, getMessages());

			// 検索条件に新規追加バージョンを設定する
			if (getHdrR().isStatusCreate()) {
				getCndR().sum_spln_vers(getHdrR().sum_spln_vers());
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSUM_FIX_UStatus();
		}
	}

	/**
	 * [MS_MSBBL0110_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Upd03Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL0110_Upd03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setCOPY_FIX_UStatus();
		}
	}


	/**
	 * [MS_MSBBL0110_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Del01Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MCList<FixDtlR> _fixDtlL;

		protected MS_MSBBL0110_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_fixDtlL = getCheckedFixDtlL();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_fixDtlL);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUSR_FIX_DTL_DStatus();
		}
	}

	/**
	 * [MS_MSBBL0110_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Del02Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MCList<FixDtlR> _fixDtlL;

		protected MS_MSBBL0110_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_fixDtlL = getCheckedFixDtlL();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_fixDtlL);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSUM_FIX_HDR_DStatus();
		}
	}

	/**
	 * [MS_MSBBL0110_Del03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Del03Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Del03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL0110_Del03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUSR_FIX_HDR_DStatus();
		}
	}

	/**
	 * [MS_MSBBL0110_Del04]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0110_Del04Caller<P extends MSBBP_MlySPlnReg, B extends MS_MSBBL0110_Del04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL0110_Del04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSUM_FIX_HDR_DStatus();
		}
	}

	protected MCList<DtlDispR> getCheckedDtlDispL(boolean unfixOnlyFlg) {
		MCList<DtlDispR> l = MCList.create(DtlDispR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (h.check() && isInptRow(h)) {
				if (unfixOnlyFlg && h.fix_flg()) {
					continue;
				}
				l.add(h);
			}
		}
		return l;
	}

	protected MCList<DtlR> getCheckedDtlL(boolean unfixOnlyFlg) {
		MCList<DtlR> l = MCList.create(DtlR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (h.check() && isInptRow(h)) {
				if (unfixOnlyFlg && h.fix_flg()) {
					continue;
				}
				MCList<DtlR> vL = _grpNoUpdVMap.get(h.grp_peg_no());
				l.addAll(vL);
			}
		}
		return l;
	}

	protected MCList<FixDtlR> getCheckedFixDtlL() {
		MCList<FixDtlR> l = MCList.create(FixDtlR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (h.check() && isInptRow(h)) {
				FixDtlR r = _grpNoUpdFixMap.get(h.grp_peg_no());
				if (r.isStatusNone() && r.fix_flg() != h.fix_flg()) {
					r.setStatus(MCRow.MODIFY);
				}
				r.fix_flg(h.fix_flg());
				r.setGUIIndex(h.getGUIIndex());
				l.add(r);
			}
		}
		return l;
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_upd_ope_USR.isSelected()) {
			if (Cnd_ope_REF.isSelected()) {
				callMS_MSBBL0110_Srch03();
			}
			else if (Cnd_ope_UPD.isSelected() || Cnd_ope_DTL_DEL.isSelected()
					|| Cnd_ope_HDR_DEL.isSelected()) {
				callMS_MSBBL0110_Srch01();
			}
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			if (Cnd_ope_REF.isSelected()) {
				callMS_MSBBL0110_Srch04();
			}
			else if (Cnd_ope_UPD.isSelected() || Cnd_ope_DTL_DEL.isSelected()
					|| Cnd_ope_HDR_DEL.isSelected()) {
				callMS_MSBBL0110_Srch02();
			}
		}

	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1400]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1400(MCEventInfo info) {
		DtlDispR r = DtlDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP1400(r);
	}
	protected void doBtn_open_MSBBP1400(DtlDispR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1400");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP1400CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBB.MSBBP1400.CndR crtOpenMSBBP1400CndR(MAUCP_AppScreenOpener aso, DtlDispR r) {
		mcframe.clientMSBB.MSBBP1400.CndR to = mcframe.clientMSBB.MSBBP1400.CndR.create();

		to.inpt_ym_d(getSrchCndR().usr_spln_ym_fr());
		to.sls_trnst_disp_d(true);
		to.sls_disp_term_d(getSrchCndR().usr_spln_ym_to().diffMonth(getSrchCndR().usr_spln_ym_fr())+1);
		to.sum_term_d(1);

		if (Cnd_upd_ope_SUM.isSelected() && (Cnd_ope_UPD.isSelected()
				|| Cnd_ope_DTL_DEL.isSelected() || Cnd_ope_HDR_DEL.isSelected())) {
			to.dpt_lvl_cd_d(getHdrR().sum_dpt_lvl_cd());
			to.dpt_cd_d(getHdrR().sum_dpt_cd());
		}
		else {
			to.dpt_lvl_cd_d(r.dpt_lvl_cd());
			to.dpt_cd_d(r.dpt_cd());
		}

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP0120(MCEventInfo info) {
		DtlDispR r = DtlDispTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP0120(r);
	}
	protected void doBtn_open_MSBBP0120(DtlDispR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0120");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBB.MSBBP0120.CndR crtOpenMSBBP0120CndR(MAUCP_AppScreenOpener aso, DtlDispR r) {
		mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd p = (mcframe.clientMSBB.MSBBP0120.MSBBP_MlySPlnItmUpd) aso
				.getPanel();
		mcframe.clientMSBB.MSBBP0120.CndR to = mcframe.clientMSBB.MSBBP0120.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());
		if (Cnd_ope_REF.isSelected()) {
			to.ym(r.ym());
			to.spln_ym_fr(getSrchCndR().ref_spln_ym_fr());
			to.spln_ym_to(getSrchCndR().ref_spln_ym_to());
			to.dpt_cd(r.dpt_cd());
			to.cst_cd(r.cst_cd());
			to.wrk_no(r.wrk_no());
			to.spln_vers(r.spln_vers());
		}
		else {
			to.ym(getHdrR().sum_ym());
			to.spln_ym_fr(getHdrR().sum_spln_ym_fr());
			to.spln_ym_to(getHdrR().sum_spln_ym_to());
			to.dpt_cd(getHdrR().sum_dpt_cd());
			to.cst_cd(getHdrR().sum_cst_cd());
			to.wrk_no(getHdrR().sum_wrk_no());
			to.spln_vers(getHdrR().sum_spln_vers());
		}
		to.spln_itm_cd(r.spln_itm_cd());

		return to;
	}


	/**
	 * Panel[Btn]のボタン[sprt_calcAmtQty]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_calcAmtQty(MCEventInfo info) {
		callMS_MSBBL0110_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[sum]の押下時の処理
	 */
	@Override
	public void doBtn_sum(MCEventInfo info) {
		if (Cnd_upd_ope_SUM.isSelected()) {

			// 実行確認
			MCMessage msgExecConfirm = new MCMessage(MSBBP0004);
			if (confirm(msgExecConfirm) == MCMessageBox.YES_OPTION) {

				// チェック処理
				MCList<DtlDispR> dispL = getCheckedDtlDispL(true);
				if (isNull(dispL)) {
					dialog(msgNoCheckedRow());
					return ;
				}

				// 集計処理
				doBtn_sum(dispL);
			}

		}
	}

	protected void doBtn_sum(MCList<DtlDispR> dispL) {
		for (DtlDispR dispR : dispL) {
			if (dispR.fix_flg()) {
				continue;
			}

			MCNumber grpPegNo = dispR.grp_peg_no();

			MCList<DtlDispR> usrList = _grpNoUsrHMap.get(grpPegNo);
			if (isNull(usrList)) {
				continue;
			}

			// 入力別データの集計
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(DtlDispR.$row_title_col, DtlDispR.$spln_set_typ);
			gp.sum(DtlDispR.$qty01, DtlDispR.$qty02, DtlDispR.$qty03, DtlDispR.$qty04,
					DtlDispR.$qty05, DtlDispR.$qty06, DtlDispR.$qty07, DtlDispR.$qty08,
					DtlDispR.$qty09, DtlDispR.$qty10, DtlDispR.$qty11, DtlDispR.$qty12,
					DtlDispR.$qty13, DtlDispR.$qty14, DtlDispR.$qty15, DtlDispR.$qty16,
					DtlDispR.$qty17, DtlDispR.$qty18, DtlDispR.$qty19, DtlDispR.$qty20,
					DtlDispR.$qty21, DtlDispR.$qty22, DtlDispR.$qty23, DtlDispR.$qty24);
			MCList<DtlDispR> sumList = usrList.groupBy(gp);
			DtlDispR sumQtyR = null;
			DtlDispR sumAmtR = null;
			for (DtlDispR r : sumList) {
				if (isQtyRow(r)) {
					sumQtyR = r;
				}
				else if (isAmtRow(r)) {
					sumAmtR = r;
				}
			}

			// 集計値の反映
			MCList<DtlR> vList = _grpNoUpdVMap.get(grpPegNo);
			DtlDispR inptR = getInptRow(dispR);
			DtlDispR calcR = getCalcRow(dispR);

			for (MCColumnConfig col : getQtyCols()) {
				if (isEditable(col, inptR.getGUIIndex())) {
					String editCol = col.getBaseRowColumnName();
					if (isQtyRow(inptR)) {
						inptR.setNumber(editCol, sumQtyR.getNumber(editCol));
						calcR.setNumber(editCol, sumAmtR.getNumber(editCol));
					}
					else if (isAmtRow(inptR)) {
						inptR.setNumber(editCol, sumAmtR.getNumber(editCol));
						calcR.setNumber(editCol, sumQtyR.getNumber(editCol));
					}

					DtlR v = _vhMUpd.getVRow(inptR, editCol, vList);
					v.spln_qty(sumQtyR.getNumber(editCol));
					v.spln_amt(sumAmtR.getNumber(editCol));
					v.sum_flg(true);
					if (v.isStatusNone()) {
						v.setStatus(MCRow.MODIFY);
					}
				}
			}

		}
	}
	/**
	 * Panel[Btn]のボタン[out_file]の押下時の処理
	 */
	@Override
	public void doBtn_out_file(MCEventInfo info) {
		clearCsvData();
		setCsvLabels();
		setCsvData();
		writeCsvFile();
		clearCsvData();
	}

	private boolean isReadCsvFileErr() {
		// framemanagerのExcel入力の処理でエラーが発生しているか
		return CsvTable.getBeansReader().getMsgList() != null && !CsvTable.getBeansReader().getMsgList().isEmpty();
	}

	/**
	 * Panel[Btn]のボタン[in_file]の押下時の処理
	 */
	@Override
	public void doBtn_in_file(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			clearCsvData();
			readCsvFile();
			if (isReadCsvFileErr()) return;
			if (isNull(getCsvL())) {
				return ;
			}
			setCsvColumnName();
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkCsv());
			if (!hasErrMsg(msgL)) {
				msgL.addAll(showCsvVH());
			}
			clearCsvData();
			showCsvInEndMsg(msgL);
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}

	// ---------- CSVファイル出力/入力 ここから----------
	/**
	 * CSV出力カラム数
	 */
	protected String _inptMark = "*";
	protected int _maxColSize_Csv = 12;
	protected String _fileType_Csv = "csv";
	protected String _fileType_Excel = "excel";
	protected String[] _csvQtyCols = new String[]{
			CsvR.$qty01, CsvR.$qty02, CsvR.$qty03, CsvR.$qty04, CsvR.$qty05, CsvR.$qty06,
			CsvR.$qty07, CsvR.$qty08, CsvR.$qty09, CsvR.$qty10, CsvR.$qty11, CsvR.$qty12};

	protected void writeCsvFile() {
		if (isSame(getFileType(), _fileType_Csv)) {
			doCSVOutAction(CsvTable, MCWriteType.ALL);
		}
		else if (isSame(getFileType(), _fileType_Excel)) {
			doExcelOutAction(CsvTable, MCWriteType.ALL);
		}
	}

	protected void readCsvFile() {
		if (isSame(getFileType(), _fileType_Csv)) {
			doCSVInAction(CsvTable);
		}
		else if (isSame(getFileType(), _fileType_Excel)) {
			doExcelInAction(CsvTable);
		}
	}

	protected String getFileType() {
		String fileType = getPgmSettingStringNE(this, _fileType_Csv, "file.type");
		if (!isSame(fileType, _fileType_Csv) && !isSame(fileType, _fileType_Excel)) {
			return _fileType_Csv;
		}
		return fileType;
	}

	protected void setCsvData() {
		MCDate fr = getSrchCndR().spln_ym_fr();
		MCDate to = getSrchCndR().spln_ym_to();
		if (to.diffMonth(fr) + 1 <= _maxColSize_Csv) {
			addAll(getCsvL(), getDtlDispL(), createMap_CsvR_DtlDispR(fr, 1));
		}
		else {
			for (DtlDispR r : getDtlDispL()) {
				CsvR tmp1R = CsvR.create();
				copy(tmp1R, r, createMap_CsvR_DtlDispR(fr, 1));
				CsvR tmp2R = CsvR.create();
				copy(tmp2R, r, createMap_CsvR_DtlDispR(fr, 2));
				getCsvL().add(tmp1R);
				getCsvL().add(tmp2R);
			}
		}
	}

	protected MCMessageList checkCsv() {
		MCMessageList msgL = new MCMessageList();
		MCList<FixDtlR> vFixDtlL = MCList.create(FixDtlR.class);
		for (DtlDispR h : getDtlDispL()) {
			if (isInptRow(h)) {
				FixDtlR r = _grpNoUpdFixMap.get(h.grp_peg_no());
				vFixDtlL.add(r);
			}
		}
		String[] fixKeys = null;
		if (Cnd_upd_ope_SUM.isSelected()) {
			fixKeys = new String[] {
					CsvR.$spln_itm_cd,
					CsvR.$itm_cd,
					CsvR.$itm_sub1,
					CsvR.$itm_sub2,
					CsvR.$itm_sub3};
		}
		else {
			fixKeys = new String[] {
					CsvR.$dpt_cd,
					CsvR.$cst_cd,
					CsvR.$wrk_no,
					CsvR.$spln_itm_cd,
					CsvR.$itm_cd,
					CsvR.$itm_sub1,
					CsvR.$itm_sub2,
					CsvR.$itm_sub3};
		}
		MCIndexKey fixIdx = vFixDtlL.createIndex(fixKeys);
		for (int i = 0; i < getCsvL().size(); i ++) {
			CsvR r = getReadCsvR(i);
			r.grp_peg_no(null);
			if (!isCsvInTgt(r)) {
				continue;
			}
			MCList<FixDtlR> fixL = vFixDtlL.subList(fixIdx, r.toArray(fixKeys));
			if (isNull(fixL)) {
				msgL.add(new MCMessage(MSBBP0015, toFileRowNo(i),
						r.dpt_cd(), r.cst_cd(), r.wrk_no(),
						r.spln_itm_cd(),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this)));
				continue;
			}
			FixDtlR fixR = fixL.get(0);
			for (FixDtlR tmpR : fixL) {
				if (isSame(r.cur_cd(), tmpR.cur_cd())) {
					fixR = tmpR;
					break;
				}
			}
			r.grp_peg_no(fixR.grp_peg_no()); // 取込対象の目印
			MCNumber decPlace = MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ()) ? fixR.qty_dec_place() : fixR.amt_dec_place();
			msgL.addAll(checkDecPlace(r, i, isNull(decPlace) ? 0 : decPlace.intValue()));
			msgL.addAll(checkSplnYm(fixR, r, i));
		}
		return msgL;
	}
	
	protected boolean isCsvInTgt(CsvR r) {
		if (isSame(r.inpt_str(), _inptMark)) {
			if (!MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ()) && !MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
				return false;
			}
			if (isNull(r.spln_ym_st())) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	protected boolean isCsvInTgt(MCDate ym) {
		MCDate fr = getSrchCndR().spln_ym_fr();
		MCDate to = getSrchCndR().spln_ym_to();
		return fr.lte(ym) && ym.lte(to);
	}

	protected MCMessageList checkDecPlace(CsvR row, int lnum, int decPlace) {
		MCMessageList msgL = new MCMessageList();
		for (String numCol : _csvQtyCols) {
			MCNumber n = row.getNumber(numCol);
			if (!isNull(n)) {
				MCNumber n2 = n.setScale(decPlace, RoundingMode.DOWN);
				if (!isSame(n, n2)) {
					msgL.add(new MCMessage(MSBBP0017, toFileRowNo(lnum), getMsgLabel(numCol), n, decPlace));
				}
			}
		}
		return msgL;
	}

	protected MCMessageList checkSplnYm(FixDtlR fixR, CsvR row, int lnum) {
		MCMessageList msgL = new MCMessageList();
		MCList<DtlR> dtlL = _grpNoUpdVMap.get(fixR.grp_peg_no());
		for (int n = 0; n < _csvQtyCols.length; n++) {
			String numCol = _csvQtyCols[n];
			MCDate ym = row.spln_ym_st().addMonth(n);
			if (!isCsvInTgt(ym)) {
				continue;
			}
			MCNumber qty = row.getNumber(numCol);
			if (isNull(qty)) {
				continue;
			}
			DtlR dtlR = dtlL.getFirst(DtlR.$spln_ym, ym);
			if (isNull(dtlR)) {
				msgL.add(new MCMessage(MSBBP0016, toFileRowNo(lnum), getMsgLabel(numCol), toYMString(ym)));
				continue;
			}
		}
		return msgL;
	}
	
	/**
	 * コンテナの行番号から、ファイルの行番号に変換する
	 */
	protected int toFileRowNo(int i) {
		i++;
		if (isUsedNameLine()) {
			i++;
		}
		if (isUsedTitleLine()) {
			i++;
		}
		return i;
	}

	protected boolean hasErrMsg(MCMessageList msgL) {
		for (MCMessage msg : msgL) {
			if (isErrMsg(msg)) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean isErrMsg(MCMessage msg) {
		return msg.getLevel() == MCMessageLevel.ERROR || msg.getLevel() == MCMessageLevel.FATAL || msg.getLevel() == MCMessageLevel.PROBLEM || msg.getLevel() == MCMessageLevel.WARN;
	}

	protected MCMessageList showCsvVH() {
		MCMessageList msgL = new MCMessageList();
		for (MCList<CsvR> grpL : getCsvL().groupList(CsvR.$grp_peg_no)) {
			CsvR baseR = grpL.get(0);
			MCNumber grpPegNo = baseR.grp_peg_no();
			if (isNull(grpPegNo)) {
				continue;
			}
			
			// 確定行の編集
			MCList<DtlDispR> hList = _grpNoUpdHMap.get(grpPegNo);
			DtlDispR editH = hList.getFirst(DtlDispR.$disp_spln_set_typ_flg, true);
			if (editH == null) {
				continue;
			}
			editH.check(true);
			editH.fix_flg(false);
			FixDtlR fixR = _grpNoUpdFixMap.get(grpPegNo);
			fixR.setStatus(MCRow.MODIFY);
			
			// 縦リストの編集
			MCList<DtlR> vList = _grpNoUpdVMap.get(grpPegNo);
			for (CsvR row : grpL) {
				for (int n = 0; n < _csvQtyCols.length; n ++) {
					String numCol = _csvQtyCols[n];
					MCDate ym = row.spln_ym_st().addMonth(n);
					MCNumber qty = row.getNumber(numCol);
					if (isNull(qty)) {
						continue;
					}
					if (!isCsvInTgt(ym)) {
						continue;
					}
					DtlR vR = vList.getFirst(DtlR.$spln_ym, ym);
					if (MAC_SPLN_SET_TYP.isQTY(row.spln_set_typ())) {
						vR.spln_qty(qty);
						vR.spln_amt(null);
						vR.setStatus(MCRow.MODIFY);
					}
					if (MAC_SPLN_SET_TYP.isAMT(row.spln_set_typ())) {
						vR.spln_qty(null);
						vR.spln_amt(qty);
						vR.setStatus(MCRow.MODIFY);
					}
				}
			}
			
			// 横リストの編集
			_vhMUpd.reflectVH(vList, hList, editH, DtlR.$spln_qty, DtlR.$spln_amt);
		}
		return msgL;
	}

	protected void showCsvInEndMsg(MCMessageList msgL) {
		sortMessageList(msgL);
		if (hasErrMsg(msgL)) {
			messageNoSort(msgL);
		}
		else {
			msgL.add(0, msgFileImported());
			messageNoSort(msgL);
		}
	}
	
	protected String getMsgLabel(String col) {
		MCColumnConfig cc = CsvTable.getColumnConfig("Csv." + col);
		if (cc != null) {
			return cc.getMessageByLocale();
		}
		return col;
	}

	protected void setCsvLabels() {
		MCDate fr = getSrchCndR().spln_ym_fr();
		for (int i = 0; i< _csvQtyCols.length; i ++) {
			String nm = String.valueOf(fr.addMonth(i).getMonth());
			setCsvLabel(_csvQtyCols[i], nm);
		}
	}

	protected void setCsvColumnName() {
		mcframe.clientCore.beans.MCBeansReader reader = CsvTable.getBeansReader();
		if (reader != null) {
			mcframe.clientCore.beans.MCBeansFileIO.MCBeansReportSet reportSet = reader.getReportSet();
			if (reportSet != null) {
				if (reportSet.getAll().isEmpty()) {
					return;
				}
				MCRow titleR1 = reportSet.getAll().get(0);
				String[] hdrCols = titleR1.getColumnPathArray();
				for (String qtyCol: _csvQtyCols) {
					for (int i = 0; i < hdrCols.length ; i ++) {
						if (isSame(qtyCol, titleR1.getStringNE(hdrCols[i]))) {
							setCsvLabel(qtyCol, getCsvColumnName(i));
							break;
						}
					}
				}
			}
		}
	}

	protected String getCsvColumnName(int col) {
		StringBuilder ret = new StringBuilder();
		if (col > 25) {
			ret.append((char)('A' -1 + (col+1)/26));
		}
		ret.append((char)('A' -1 + (col+1) % 26));
		ret.append('(');
		ret.append(col+1);
		ret.append(')');
		return ret.toString();
	}

	protected void setCsvLabel(String col, String name) {
		MCColumnConfig cc = CsvTable.getColumnConfig("Csv." + col);
		if (cc != null) {
			cc.setMessageName(name);
		}
	}

	protected CsvR getReadCsvR(int i) {
		CsvR r = getCsvL().get(i);
		if (isNull(r.cst_cd())) {
			r.cst_cd(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.wrk_no())) {
			r.wrk_no(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.spln_itm_cd())) {
			r.spln_itm_cd(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.itm_cd())) {
			r.itm_cd(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.itm_sub1())) {
			r.itm_sub1(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.itm_sub2())) {
			r.itm_sub2(MAC_STR.NULL_VAL.value());
		}
		if (isNull(r.itm_sub3())) {
			r.itm_sub3(MAC_STR.NULL_VAL.value());
		}
		return r;
	}

	protected void clearCsvData() {
		getCsvL().clear();
	}

	protected Map_CsvR_DtlDispR<CsvR,DtlDispR> createMap_CsvR_DtlDispR(MCDate fr, int ln) {
		return new Map_CsvR_DtlDispR<CsvR, DtlDispR>(fr, ln);
	}
	public class Map_CsvR_DtlDispR<D extends CsvR, S extends DtlDispR> extends MCRowMapper<D,S>{
		protected int _ln;
		protected MCDate _fr;
		public Map_CsvR_DtlDispR(MCDate fr, int ln) {
			_ln = ln;
			_fr = fr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(CsvR.$dpt_cd, DtlDispR.$dpt_cd);
			addColumnPathMap(CsvR.$dpt_nm, DtlDispR.$dpt_nm);
			addColumnPathMap(CsvR.$cst_cd, DtlDispR.$cst_cd);
			addColumnPathMap(CsvR.$cst_nm, DtlDispR.$cst_nm);
			addColumnPathMap(CsvR.$wrk_no, DtlDispR.$wrk_no);
			addColumnPathMap(CsvR.$wrk_nm, DtlDispR.$wrk_nm);
			addColumnPathMap(CsvR.$spln_itm_cd, DtlDispR.$spln_itm_cd);
			addColumnPathMap(CsvR.$spln_itm_nm, DtlDispR.$spln_itm_nm);
			addColumnPathMap(CsvR.$itm_cd, DtlDispR.$itm_cd);
			addColumnPathMap(CsvR.$itm_sub1, DtlDispR.$itm_sub1);
			addColumnPathMap(CsvR.$itm_sub2, DtlDispR.$itm_sub2);
			addColumnPathMap(CsvR.$itm_sub3, DtlDispR.$itm_sub3);
			addColumnPathMap(CsvR.$itm_nm, DtlDispR.$itm_nm);
			addColumnPathMap(CsvR.$spln_set_typ_nm, DtlDispR.$row_title_nm);
			addColumnPathMap(CsvR.$cur_cd, DtlDispR.$cur_cd);
			addColumnPathMap(CsvR.$cur_nm, DtlDispR.$cur_nm);
			addColumnPathMap(CsvR.$unit_cd, DtlDispR.$unit_cd);
			addColumnPathMap(CsvR.$unit_nm, DtlDispR.$unit_nm);
			addColumnPathMap(CsvR.$usr_cd, DtlDispR.$usr_cd);
			addColumnPathMap(CsvR.$usr_nm, DtlDispR.$usr_nm);
			addColumnPathMap(CsvR.$ym, DtlDispR.$ym);
			addColumnPathMap(CsvR.$spln_vers, DtlDispR.$spln_vers);
			addColumnPathMap(CsvR.$ins_usr_id, DtlDispR.$ins_usr_id);
			addColumnPathMap(CsvR.$ins_usr_nm, DtlDispR.$ins_usr_nm);
			addColumnPathMap(CsvR.$ins_func_id, DtlDispR.$ins_func_id);
			addColumnPathMap(CsvR.$ins_func_nm, DtlDispR.$ins_func_nm);
			addColumnPathMap(CsvR.$ins_ts, DtlDispR.$ins_ts);
			addColumnPathMap(CsvR.$upd_usr_id, DtlDispR.$upd_usr_id);
			addColumnPathMap(CsvR.$upd_usr_nm, DtlDispR.$upd_usr_nm);
			addColumnPathMap(CsvR.$upd_func_id, DtlDispR.$upd_func_id);
			addColumnPathMap(CsvR.$upd_func_nm, DtlDispR.$upd_func_nm);
			addColumnPathMap(CsvR.$upd_ts, DtlDispR.$upd_ts);
			addColumnPathMap(CsvR.$upd_srv_req_no, DtlDispR.$upd_srv_req_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			if (isNull(src.record_id())) {
				dest.clear();
				return;
			}
			dest.inpt_str(src.disp_spln_set_typ_flg() ? _inptMark : null);
			if (isSame(src.row_title_col(), DtlR.$spln_qty)) {
				dest.spln_set_typ(MAC_SPLN_SET_TYP.QTY.value());
			}
			else if (isSame(src.row_title_col(), DtlR.$spln_amt)) {
				dest.spln_set_typ(MAC_SPLN_SET_TYP.AMT.value());
			}
			if (_ln == 1) {
				dest.spln_ym_st(_fr);
				dest.qty01(src.qty01());
				dest.qty02(src.qty02());
				dest.qty03(src.qty03());
				dest.qty04(src.qty04());
				dest.qty05(src.qty05());
				dest.qty06(src.qty06());
				dest.qty07(src.qty07());
				dest.qty08(src.qty08());
				dest.qty09(src.qty09());
				dest.qty10(src.qty10());
				dest.qty11(src.qty11());
				dest.qty12(src.qty12());
			}
			else {
				dest.spln_ym_st(_fr.addMonth(_maxColSize_Csv));
				dest.qty01(src.qty13());
				dest.qty02(src.qty14());
				dest.qty03(src.qty15());
				dest.qty04(src.qty16());
				dest.qty05(src.qty17());
				dest.qty06(src.qty18());
				dest.qty07(src.qty19());
				dest.qty08(src.qty20());
				dest.qty09(src.qty21());
				dest.qty10(src.qty22());
				dest.qty11(src.qty23());
				dest.qty12(src.qty24());
			}
			if (Cnd_upd_ope_SUM.isSelected()) {
				if (Cnd_ope_REF.isSelected()) {
					dest.intr_rmrks(src.sum_intr_rmrks());
					dest.sub_char1(src.sum_sub_char1());
					dest.sub_char2(src.sum_sub_char2());
					dest.sub_char3(src.sum_sub_char3());
				}
				else {
					HdrR hdr = getHdrR();
					dest.dpt_cd(hdr.sum_dpt_cd());
					dest.dpt_nm(hdr.sum_dpt_nm());
					dest.cst_cd(hdr.sum_cst_cd());
					dest.cst_nm(hdr.sum_cst_nm());
					dest.wrk_no(hdr.sum_wrk_no());
					dest.wrk_nm(hdr.sum_wrk_nm());
				}
			}
			else {
				dest.intr_rmrks(src.usr_intr_rmrks());
				dest.sub_char1(src.usr_sub_char1());
				dest.sub_char2(src.usr_sub_char2());
				dest.sub_char3(src.usr_sub_char3());
			}
		}
	}

	// ---------- CSVファイル出力/入力 ここまで----------

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
	 * Panel[Btn]のボタン[upd_usr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_usr(MCEventInfo info) {
		callMS_MSBBL0110_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_sum]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sum(MCEventInfo info) {
		if (getHdrR().sum_adopted_flg()) {
			// 実行確認
			if (isCheckedNotFixDtlL()) {
				MCMessage msgExecConfirm = new MCMessage(MSBBP0028);
				if (confirm(msgExecConfirm) == MCMessageBox.NO_OPTION) {
					return;
				}
			}
		}
		callMS_MSBBL0110_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd_sum_copy]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sum_copy(MCEventInfo info) {
		callMS_MSBBL0110_Upd03();
	}
	/**
	 * Panel[Btn]のボタン[del_usr_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_del_usr_dtl(MCEventInfo info) {
		callMS_MSBBL0110_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_usr_hdr]の押下時の処理
	 */
	@Override
	public void doBtn_del_usr_hdr(MCEventInfo info) {
		callMS_MSBBL0110_Del03();
	}
	/**
	 * Panel[Btn]のボタン[del_sum_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_del_sum_dtl(MCEventInfo info) {
		callMS_MSBBL0110_Del02();
	}
	/**
	 * Panel[Btn]のボタン[del_sum_hdr]の押下時の処理
	 */
	@Override
	public void doBtn_del_sum_hdr(MCEventInfo info) {
		callMS_MSBBL0110_Del04();
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

		RefDtlDisp_qty01_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty02_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty03_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty04_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty05_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty06_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty07_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty08_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty09_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty10_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty11_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty12_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty13_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty14_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty15_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty16_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty17_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty18_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty19_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty20_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty21_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty22_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty23_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);
		RefDtlDisp_qty24_p_PPanel.setRelateBeans(columnRefDtlDisp_unit_cd, columnRefDtlDisp_dec_place);

		UsrDtlDisp_qty01_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty02_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty03_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty04_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty05_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty06_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty07_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty08_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty09_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty10_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty11_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty12_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty13_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty14_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty15_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty16_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty17_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty18_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty19_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty20_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty21_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty22_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty23_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);
		UsrDtlDisp_qty24_p_PPanel.setRelateBeans(columnUsrDtlDisp_unit_cd, columnUsrDtlDisp_dec_place);

	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == Cnd_usr_usr_cd) {
			setBindCnd_usr_usr_cd(row);
		}
		else if (beans == Cnd_usr_dpt_cd) {
			setBindCnd_usr_dpt_cd(row);
		}
		else if (beans == Cnd_sum_dpt_cd) {
			setBindCnd_sum_dpt_cd(row);
		}
		else if (beans == Hdr4_dpt_cd) {
			setBindHdr4_dpt_cd(row);
		}
		return row;
	}

	@Override
	public MCList getCnd_usr_usr_cd(MCRow row, MCEventInfo info) {
		setBindCnd_usr_usr_cd(row);
		return super.getCnd_usr_usr_cd(row, info);
	}

	@Override
	public MCList getCnd_usr_dpt_cd(MCRow row, MCEventInfo info) {
		setBindCnd_usr_dpt_cd(row);
		return super.getCnd_usr_dpt_cd(row, info);
	}

	@Override
	public MCList getCnd_sum_dpt_cd(MCRow row, MCEventInfo info) {
		setBindCnd_sum_dpt_cd(row);
		return super.getCnd_sum_dpt_cd(row, info);
	}

	@Override
	public MCList getHdr4_dpt_cd(MCRow row, MCEventInfo info) {
		setBindHdr4_dpt_cd(row);
		return super.getHdr4_dpt_cd(row, info);
	}

	protected void setBindCnd_usr_usr_cd(MCRow row) {
		setBindUsrCd(row, getCndR().usr_ym());
	}

	protected void setBindCnd_usr_dpt_cd(MCRow row) {
		setBindDptCd(row, getCndR().usr_ym());
	}

	protected void setBindCnd_sum_dpt_cd(MCRow row) {
		setBindDptCd(row, getCndR().sum_ym());
	}

	protected void setBindHdr4_dpt_cd(MCRow row) {
		setBindDptCd(row, getHdr4R().ym());
	}

	protected void setBindUsrCd(MCRow row , MCDate ym) {
		row.setDateNE(UsrCols.$i_dt, getYmStDt(ym, getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
	}
	protected void setBindDptCd(MCRow row , MCDate ym) {
		row.setDateNE(DptCols.$i_dt, getYmStDt(ym, getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
	}


	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		// SrchTyp
		setValueEx(Cnd_pre_flg, true);

		// Cnd
		setValueEx(Cnd_usr_reg_t_flg, true);
		setValueEx(Cnd_usr_reg_f_flg, true);
		setValueEx(Cnd_usr_fix_t_flg, true);
		setValueEx(Cnd_usr_fix_f_flg, true);

		setValueEx(Cnd_sum_reg_t_flg, true);
		setValueEx(Cnd_sum_reg_f_flg, true);
		setValueEx(Cnd_sum_fix_t_flg, true);
		setValueEx(Cnd_sum_fix_f_flg, true);

		MCDate ym = getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		setValueEx(Cnd_usr_ym, ym);
		setValueEx(Cnd_usr_spln_ym_fr, ym);
		setValueEx(Cnd_sum_ym, ym);
		setValueEx(Cnd_sum_spln_ym_fr, ym);
		setValueEx(Cnd_ref_spln_ym_fr, ym);

		if (!isNull(ym)) {
			int term = getPgmSettingIntNE(this, -1, "init.term");
			if (term > 0) {
				MCDate splnYmTo = ym.addMonth(term - 1);
				setValueEx(Cnd_usr_spln_ym_to, splnYmTo);
				setValueEx(Cnd_sum_spln_ym_to, splnYmTo);
				setValueEx(Cnd_ref_spln_ym_to, splnYmTo);
			}
		}

		// DipsCtrl
		setValueEx(Cnd_show_pre_flg, true);
		setValueEx(Cnd_show_blk_flg, true);
		setValueEx(Cnd_show_label_flg, true);
		setValueEx(Cnd_show_name_flg, true);
		setValueEx(Cnd_show_grp_flg, true);

	}

	@Override
	protected void listInit() {
		super.listInit();
		initVhMDisp();
		initVhMUpd();
		initVhMRef();
		initVhMUsr();
	}

	protected void initVhMDisp() {
		// 縦横変換クラスの初期化
		_vhMDisp.initColGroup(this, DtlDispTable, getDtlL());
		_vhMDisp.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(DtlR.$frcst_qty, MSC_SPLN_DTL_TYP.ACT_CST_FRCST_QTY.name());
		map.put(DtlR.$frcst_amt, MSC_SPLN_DTL_TYP.ACT_CST_FRCST_AMT.name());
		map.put(DtlR.$pre_slo_qty, MSC_SPLN_DTL_TYP.ACT_PRE_SLO_QTY.name());
		map.put(DtlR.$pre_slo_amt, MSC_SPLN_DTL_TYP.ACT_PRE_SLO_AMT.name());
		map.put(DtlR.$slo_qty, MSC_SPLN_DTL_TYP.ACT_SLO_QTY.name());
		map.put(DtlR.$slo_amt, MSC_SPLN_DTL_TYP.ACT_SLO_AMT.name());
		map.put(DtlR.$pre_spln_qty, MSC_SPLN_DTL_TYP.PRE_SPLN_QTY.name());
		map.put(DtlR.$pre_spln_amt, MSC_SPLN_DTL_TYP.PRE_SPLN_AMT.name());
		map.put(DtlR.$spln_qty, MSC_SPLN_DTL_TYP.CUR_SPLN_QTY.name());
		map.put(DtlR.$spln_amt, MSC_SPLN_DTL_TYP.CUR_SPLN_AMT.name());
		map.put(DtlR.$ref_spln_qty, MSC_SPLN_DTL_TYP.REF_SPLN_QTY.name());
		map.put(DtlR.$ref_spln_amt, MSC_SPLN_DTL_TYP.REF_SPLN_AMT.name());
		_vhMDisp.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {
				DtlR.$frcst_qty, DtlR.$frcst_amt, DtlR.$pre_slo_qty, DtlR.$pre_slo_amt,
				DtlR.$slo_qty,DtlR.$slo_amt,DtlR.$pre_spln_qty,DtlR.$pre_spln_amt,
				DtlR.$spln_qty, DtlR.$spln_amt,
				DtlR.$ref_spln_qty, DtlR.$ref_spln_amt
		});
		dispList.add(new String[] {
				DtlR.$frcst_qty, DtlR.$frcst_amt, DtlR.$pre_slo_qty, DtlR.$pre_slo_amt,
				DtlR.$slo_qty,DtlR.$slo_amt,DtlR.$pre_spln_qty,DtlR.$pre_spln_amt,
				DtlR.$spln_qty, DtlR.$spln_amt,
				DtlR.$ref_spln_qty, DtlR.$ref_spln_amt
		});
		_vhMDisp.setDispInfo(dispList);
		_vhMDisp.setReflectHVWhenElmColValueChanged(false);
	}

	protected void initVhMUpd() {
		// 縦横変換クラスの初期化
		_vhMUpd.initColGroup(this, RefDtlDispTable, getDtlL());
		_vhMUpd.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(DtlR.$frcst_qty, MSC_SPLN_DTL_TYP.ACT_CST_FRCST_QTY.name());
		map.put(DtlR.$frcst_amt, MSC_SPLN_DTL_TYP.ACT_CST_FRCST_AMT.name());
		map.put(DtlR.$pre_slo_qty, MSC_SPLN_DTL_TYP.ACT_PRE_SLO_QTY.name());
		map.put(DtlR.$pre_slo_amt, MSC_SPLN_DTL_TYP.ACT_PRE_SLO_AMT.name());
		map.put(DtlR.$slo_qty, MSC_SPLN_DTL_TYP.ACT_SLO_QTY.name());
		map.put(DtlR.$slo_amt, MSC_SPLN_DTL_TYP.ACT_SLO_AMT.name());
		map.put(DtlR.$pre_spln_qty, MSC_SPLN_DTL_TYP.PRE_SPLN_QTY.name());
		map.put(DtlR.$pre_spln_amt, MSC_SPLN_DTL_TYP.PRE_SPLN_AMT.name());
		map.put(DtlR.$spln_qty, MSC_SPLN_DTL_TYP.CUR_SPLN_QTY.name());
		map.put(DtlR.$spln_amt, MSC_SPLN_DTL_TYP.CUR_SPLN_AMT.name());
		map.put(DtlR.$ref_spln_qty, MSC_SPLN_DTL_TYP.REF_SPLN_QTY.name());
		map.put(DtlR.$ref_spln_amt, MSC_SPLN_DTL_TYP.REF_SPLN_AMT.name());
		_vhMUpd.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {
				DtlR.$frcst_qty, DtlR.$frcst_amt, DtlR.$pre_slo_qty, DtlR.$pre_slo_amt,
				DtlR.$slo_qty,DtlR.$slo_amt,DtlR.$pre_spln_qty,DtlR.$pre_spln_amt,
				DtlR.$spln_qty, DtlR.$spln_amt,
				DtlR.$ref_spln_qty, DtlR.$ref_spln_amt
		});
		dispList.add(new String[] {
				DtlR.$frcst_qty, DtlR.$frcst_amt, DtlR.$pre_slo_qty, DtlR.$pre_slo_amt,
				DtlR.$slo_qty,DtlR.$slo_amt,DtlR.$pre_spln_qty,DtlR.$pre_spln_amt,
				DtlR.$spln_qty, DtlR.$spln_amt,
				DtlR.$ref_spln_qty, DtlR.$ref_spln_amt
		});

		_vhMUpd.setDispInfo(dispList);
	}

	protected void initVhMRef() {
		// 縦横変換クラスの初期化
		_vhMRef.initColGroup(this, RefDtlDispTable, getRefDtlL());
		_vhMRef.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(RefDtlR.$spln_qty, MSC_SPLN_DTL_TYP.CUR_SPLN_QTY.name());
		map.put(RefDtlR.$spln_amt, MSC_SPLN_DTL_TYP.CUR_SPLN_AMT.name());
		_vhMRef.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {RefDtlR.$spln_qty, RefDtlR.$spln_amt});
		dispList.add(new String[] {RefDtlR.$spln_qty, RefDtlR.$spln_amt});
		_vhMRef.setDispInfo(dispList);

	}

	protected void initVhMUsr() {
		// 縦横変換クラスの初期化
		_vhMUsr.initColGroup(this, UsrDtlDispTable, getUsrDtlL());
		_vhMUsr.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(UsrDtlR.$usr_spln_qty, MSC_SPLN_DTL_TYP.USR_SPLN_QTY.name());
		map.put(UsrDtlR.$usr_spln_amt, MSC_SPLN_DTL_TYP.USR_SPLN_AMT.name());
		_vhMUsr.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {UsrDtlR.$usr_spln_qty, UsrDtlR.$usr_spln_amt});
		dispList.add(new String[] {UsrDtlR.$usr_spln_qty, UsrDtlR.$usr_spln_amt});
		_vhMUsr.setDispInfo(dispList);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearCacheVH();
	}

	protected void clearCacheVH() {
		// 縦横変換クラスのキャッシュをクリアする
		clearCacheVHMDisp();
		clearCacheVHMUpd();
		clearCacheVHMRef();
		clearCacheVHMUsr();

		// 入力支援ワークのキャッシュをクリアする
		getSprtAmtQtyCalDtlL().clear();

		// グループ取得用のキャッシュをクリアする
		_grpNoUpdFixMap.clear();
		_grpNoUpdHMap.clear();
		_grpNoUpdVMap.clear();
		_grpNoUsrHMap.clear();

		_allDtlDispL.clear();
	}

	protected void clearCacheVHMDisp() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhMDisp.initColInfo(MCList.create(MCRow.class));
		_vhMDisp.clearElmColsLabel();

	}

	protected void clearCacheVHMUpd() {
		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhMUpd.clearCachedList();

		// 縦横変換クラスの縦テーブルのキャッシュをクリアする
		getDtlL().clear();
	}

	protected void clearCacheVHMRef() {
		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhMRef.clearCachedList();

		// 縦横変換クラスの縦テーブルのキャッシュをクリアする
		getRefDtlL().clear();
	}

	protected void clearCacheVHMUsr() {
		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhMUsr.clearCachedList();

		// 縦横変換クラスの縦テーブルのキャッシュをクリアする
		getUsrDtlL().clear();
	}


	@Override
	protected void tableInit() {
		super.tableInit();
		DtlDispTable.setSortable(false);
		RefDtlDispTable.setMode(MCMode.INVISIBLE);
		UsrDtlDispTable.setMode(MCMode.INVISIBLE);
		CsvTable.setMode(MCMode.INVISIBLE);
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
	public void setUSR_SRCH_UPDStatus() {
		super.setUSR_SRCH_UPDStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_UPDStatus() {
		super.setUSR_UPDStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_FIX_UStatus() {
		super.setUSR_FIX_UStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_SRCH_DTL_DELStatus() {
		super.setUSR_SRCH_DTL_DELStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_DTL_DELStatus() {
		super.setUSR_DTL_DELStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_FIX_DTL_DStatus() {
		super.setUSR_FIX_DTL_DStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_SRCH_HDR_DELStatus() {
		super.setUSR_SRCH_HDR_DELStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_HDR_DELStatus() {
		super.setUSR_HDR_DELStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_FIX_HDR_DStatus() {
		super.setUSR_FIX_HDR_DStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_SRCHStatus() {
		super.setUSR_SRCHStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setUSR_REFStatus() {
		super.setUSR_REFStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}


	@Override
	public void setSUM_SRCH_UPDStatus() {
		super.setSUM_SRCH_UPDStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_UPDStatus() {
		super.setSUM_UPDStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_FIX_UStatus() {
		super.setSUM_FIX_UStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_SRCH_DTL_DELStatus() {
		super.setSUM_SRCH_DTL_DELStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_DTL_DELStatus() {
		super.setSUM_DTL_DELStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_FIX_DTL_DStatus() {
		super.setSUM_FIX_DTL_DStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_SRCH_HDR_DELStatus() {
		super.setSUM_SRCH_HDR_DELStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_HDR_DELStatus() {
		super.setSUM_HDR_DELStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_FIX_HDR_DStatus() {
		super.setSUM_FIX_HDR_DStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_SRCHStatus() {
		super.setSUM_SRCHStatus();
		setCndMode();
		setHdrMode();
		FoldTab.focusActiveFirstComponent();
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setSUM_REFStatus() {
		super.setSUM_REFStatus();
		setCndMode();
		setHdrMode();
		DtlDispTable.selectLeftmostColumn(0);
		_vhMDisp.setUnusedElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setCOPY_UPDStatus() {
		super.setCOPY_UPDStatus();
		setCndMode();
		setHdrMode();
		HdrTabTab.focusActiveFirstComponent();
		_vhMDisp.setAllElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	@Override
	public void setCOPY_FIX_UStatus() {
		super.setCOPY_FIX_UStatus();
		setCndMode();
		setHdrMode();
		_vhMDisp.setAllElmColumnModeInvisible();
		setDispCtrlStatus();
		setBtnMode();
	}

	protected void setCndMode() {
		if (Cnd_ope_VERS_COPY.isSelected()) {
			setTabComponentEnable(FoldTab);
		}
		else if (Cnd_upd_ope_USR.isSelected()) {
			if (Cnd_ope_REF.isSelected()) {
				setTabComponentEnable(FoldTab, Tab3Panel, Tab4Panel, Tab5Panel);
			}
			else if (Cnd_ope_UPD.isSelected() || Cnd_ope_DTL_DEL.isSelected()
					|| Cnd_ope_HDR_DEL.isSelected()) {
				setTabComponentEnable(FoldTab, Tab1Panel, Tab4Panel, Tab5Panel);
			}
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			if (Cnd_ope_REF.isSelected()) {
				setTabComponentEnable(FoldTab, Tab3Panel, Tab4Panel, Tab5Panel);
			}
			else if (Cnd_ope_UPD.isSelected() || Cnd_ope_DTL_DEL.isSelected()
					|| Cnd_ope_HDR_DEL.isSelected()) {
				setTabComponentEnable(FoldTab, Tab2Panel, Tab4Panel);
			}
		}
	}

	protected void setHdrMode() {
		if (Cnd_ope_REF.isSelected()) {
			HdrTabPanel.setVisible(false);
		}
		else {
			HdrTabPanel.setVisible(true);
		}

		if (Cnd_ope_VERS_COPY.isSelected()) {
			setTabComponentEnable(HdrTabTab, Tab14Panel);
		}
		else if (Cnd_upd_ope_USR.isSelected()) {
			setTabComponentEnable(HdrTabTab, Tab11Panel, Tab13Panel);
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			setTabComponentEnable(HdrTabTab, Tab12Panel, Tab13Panel);
		}

		if (Cnd_upd_ope_SUM.isSelected()) {
			if (isUpdStatus()) {
				if (getHdrR().sum_old_locked_flg()) {
					Hdr_sum_edited_flg.setMode(MCMode.READ_ONLY);
					Hdr_sum_adopted_flg.setMode(MCMode.READ_ONLY);
					Hdr_sum_usr_cd.setMode(MCMode.READ_ONLY);
					Hdr_sum_ref_vers.setMode(MCMode.READ_ONLY);
					Hdr_sum_intr_rmrks.setMode(MCMode.READ_ONLY);
					Hdr_sum_sub_char1.setMode(MCMode.READ_ONLY);
					Hdr_sum_sub_char2.setMode(MCMode.READ_ONLY);
					Hdr_sum_sub_char3.setMode(MCMode.READ_ONLY);
				}

				if (!getHdrR().isStatusCreate()) {
					Hdr_sum_spln_vers.setMode(MCMode.READ_ONLY);
				}
			}

		}
	}

	protected void setDispCtrlStatus() {
		if (isUpdStatus() || isDelStatus() || isFixStatus()) {
			setDispCtrlMode(Cnd_show_act_flg, getSrchCndR().act_flg());
			setDispCtrlMode(Cnd_show_pre_flg, getSrchCndR().pre_flg());
			setDispCtrlMode(Cnd_show_ref_flg, getSrchCndR().ref_flg());
		}

		setDispCtrlMode(columnDtlDisp_label, getCndR().show_label_flg());
		setDispCtrlMode(columnDtlDisp_code, getCndR().show_code_flg());
		setDispCtrlMode(columnDtlDisp_disp_unit_cd, getCndR().show_code_flg());
		setDispCtrlMode(columnDtlDisp_disp_unit_nm, getCndR().show_name_flg());
		setDispCtrlMode(columnDtlDisp_name, getCndR().show_name_flg());
		setDispCtrlMode(columnDtlDisp_grp_nm, getCndR().show_grp_flg());
		setDispCtrlMode(columnDtlDisp_usr_intr_rmrks, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_usr_sub_char1, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_usr_sub_char2, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_usr_sub_char3, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_sum_intr_rmrks, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_sum_sub_char1, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_sum_sub_char2, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_sum_sub_char3, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_ins_usr_id, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_ins_usr_nm, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_ins_func_id, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_ins_func_nm, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_ins_ts, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_usr_id, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_usr_nm, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_func_id, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_func_nm, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_ts, getCndR().show_others_flg());
		setDispCtrlMode(columnDtlDisp_upd_srv_req_no, getCndR().show_others_flg());
	}

	protected void setDispCtrlMode(MCCheckBox b, boolean flg) {
		if (flg) {
			setDefaultMode(b);
		}
		else {
			b.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setDispCtrlMode(MCColumnConfig col, boolean flg) {
		if (flg) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}


	protected void setBtnMode() {
		if (Cnd_ope_VERS_COPY.isSelected()) {
			Ctrl_ctrl_PPanel.setDISABLEStatus();
		}
		else {
			Ctrl_ctrl_PPanel.setENABLEStatus();
		}

		DtlDispR r = DtlDispTable.getSelectedMCRow();

		if (isEnableBtn_open_MSBBP1400(r)) {
			setDefaultMode(Btn_open_MSBBP1400);
		}
		else {
			Btn_open_MSBBP1400.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBBP0120(r)) {
			setDefaultMode(Btn_open_MSBBP0120);
		}
		else {
			Btn_open_MSBBP0120.setMode(MCMode.DISABLE);
		}

		if (getHdrR().sum_old_locked_flg()) {
			Btn_sprt_calcAmtQty.setMode(MCMode.DISABLE);
			Btn_sum.setMode(MCMode.DISABLE);
			Btn_select_all.setMode(MCMode.DISABLE);
			Btn_deselect_all.setMode(MCMode.DISABLE);
			Btn_fix_all.setMode(MCMode.DISABLE);
			Btn_unfix_all.setMode(MCMode.DISABLE);
			Btn_del_sum_dtl.setMode(MCMode.DISABLE);
			Btn_del_sum_hdr.setMode(MCMode.DISABLE);
			Btn_in_file.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBBP1400(DtlDispR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBBP0120(DtlDispR r) {
		if (r == null) {
			return false;
		}
		return isSplnItmRow(r) && Cnd_upd_ope_SUM.isSelected();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), USR_UPD) || isSame(getStatus(), SUM_UPD);
	}

	protected boolean isCopyUpdStatus() {
		return isSame(getStatus(), COPY_UPD);
	}

	protected boolean isDtlDelStatus() {
		return isSame(getStatus(), USR_DTL_DEL) || isSame(getStatus(), SUM_DTL_DEL);
	}

	protected boolean isHdrDelStatus() {
		return isSame(getStatus(), USR_HDR_DEL) || isSame(getStatus(), SUM_HDR_DEL);
	}

	protected boolean isDelStatus() {
		return isDtlDelStatus() || isHdrDelStatus();
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isCopyUpdStatus();
	}

	protected boolean isRefStatus() {
		return isSame(getStatus(), USR_SRCH) || isSame(getStatus(), USR_REF)
				|| isSame(getStatus(), SUM_SRCH) || isSame(getStatus(), SUM_REF);
	}

	protected boolean isFixStatus() {
		return isSame(getStatus(), USR_FIX_DTL_D) || isSame(getStatus(), USR_FIX_HDR_D)
				|| isSame(getStatus(), SUM_FIX_DTL_D)
				|| isSame(getStatus(), SUM_FIX_HDR_D);
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_upd_ope_USR.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setUSR_SRCH_UPDStatus();
			}
			else if (Cnd_ope_DTL_DEL.isSelected()) {
				setUSR_SRCH_DTL_DELStatus();
			}
			else if (Cnd_ope_HDR_DEL.isSelected()) {
				setUSR_SRCH_HDR_DELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setUSR_SRCHStatus();
			}
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setSUM_SRCH_UPDStatus();
			}
			else if (Cnd_ope_DTL_DEL.isSelected()) {
				setSUM_SRCH_DTL_DELStatus();
			}
			else if (Cnd_ope_HDR_DEL.isSelected()) {
				setSUM_SRCH_HDR_DELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setSUM_SRCHStatus();
			}
		}
		if (Cnd_ope_VERS_COPY.isSelected()) {
			setCOPY_UPDStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			// 操作種別変更時や検索前ステータスでは、検索枠を表示する
			Ctrl_ctrl_PPanel.expand(true);
		}
	}


	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_upd_ope_USR.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setUSR_UPDStatus();
			}
			else if (Cnd_ope_DTL_DEL.isSelected()) {
				setUSR_DTL_DELStatus();
			}
			else if (Cnd_ope_HDR_DEL.isSelected()) {
				setUSR_HDR_DELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setUSR_REFStatus();
			}
		}
		else if (Cnd_upd_ope_SUM.isSelected()) {
			if (Cnd_ope_UPD.isSelected()) {
				setSUM_UPDStatus();
			}
			else if (Cnd_ope_DTL_DEL.isSelected()) {
				setSUM_DTL_DELStatus();
			}
			else if (Cnd_ope_HDR_DEL.isSelected()) {
				setSUM_HDR_DELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setSUM_REFStatus();
			}
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
		clearData();
		initCndByOpe();
		setSrchStatus();
		initCnd();
	}

	protected void clearData() {
		clearContainers(getHdrR(), getDtlDispL());
		clearCacheVH();
	}

	protected void initCndByOpe() {
		if (Cnd_ope_VERS_COPY.isSelected() && Cnd_upd_ope_USR.isSelected()) {
			setValueEx(Cnd_upd_ope_Group, Cnd_upd_ope_SUM.getActionCommand());
		}
	}

	protected void initCnd() {
		// clear
		if (!Cnd_ope_VERS_COPY.isSelected()) {
			clearByMode(Cnd_act_flg);
			clearByMode(Cnd_pre_flg);
			clearByMode(Cnd_ref_flg);

			clearByMode(Cnd_show_act_flg);
			clearByMode(Cnd_show_pre_flg);
			clearByMode(Cnd_show_ref_flg);
			clearByMode(Cnd_show_sub_flg);

			clearByMode(Cnd_show_grp_flg);
			clearByMode(Cnd_show_others_flg);

			clearByMode(Cnd_ref_spln_vers);

			if (Cnd_ope_DTL_DEL.isSelected() || Cnd_ope_HDR_DEL.isSelected()) {
				setValueEx(Cnd_usr_reg_f_flg, false);
				setValueEx(Cnd_usr_reg_t_flg, true);
				setValueEx(Cnd_sum_reg_f_flg, false);
				setValueEx(Cnd_sum_reg_t_flg, true);
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setValueEx(Cnd_usr_reg_f_flg, true);
				setValueEx(Cnd_usr_reg_t_flg, true);
				setValueEx(Cnd_sum_reg_f_flg, true);
				setValueEx(Cnd_sum_reg_t_flg, true);
			}
		}

		// set
		checkOnByMode(Cnd_pre_flg);
		checkOnByMode(Cnd_show_pre_flg);
		checkOnByMode(Cnd_show_sub_flg);
		checkOnByMode(Cnd_show_grp_flg);

	}

	protected void clearByMode(MCModeBeans b) {
		if (b == null) {
			return ;
		}

		if (b.getMode() == MCMode.READ_ONLY) {
			if (b instanceof MCCheckBox) {
				setValueEx((MCCheckBox)b, false);
			}
			else if (b instanceof MCTextField) {
				setValueEx((MCTextField)b, null);
			}
		}
	}

	protected void checkOnByMode(MCCheckBox b) {
		if (b == null) {
			return ;
		}

		if (b.getMode() == MCMode.REQUIRED) {
			setValueEx(b, true);
		}
	}

	@Override
	public boolean doCnd_upd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_upd_ope_VC(info)) {
			return false;
		}
		else if (Cnd_ope_VERS_COPY.isSelected()
				&& isSame(info.getNewValue(), Cnd_upd_ope_USR.getActionCommand())) {
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
	public void doCnd_upd_ope_NC(MCEventInfo info) {
		super.doCnd_upd_ope_NC(info);
		clearData();
		setSrchStatus();
		initCnd();
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
			MCList<DtlR> vList = _grpNoUpdVMap.get(r.grp_peg_no());

			// 計算行
			DtlDispR c = getCalcRow(r);
			if (!isNull(c.getNumber(col.getBaseRowColumnName()))) {
				c.setNumber(col.getBaseRowColumnName(), null);
				DtlR v = _vhMUpd.getVRow(c, col.getBaseRowColumnName(), vList);
				v.sum_flg(false);
			}
			_vhMUpd.reflectHV(vList , r, col.getBaseRowColumnName());
			_vhMUpd.reflectHV(vList , c, col.getBaseRowColumnName());

		}
		autoCheckOn(r);
	}


	@Override
	public void doDtlDisp_fix_flg_NC(MCEventInfo info) {
		super.doDtlDisp_fix_flg_NC(info);
		DtlDispR r = getDtlDispL().get(info.getEventIndex());
		autoCheckOn(r);
	}

	protected void autoCheckOn(DtlDispR r) {
		if (isEditable(columnDtlDisp_check, r.getGUIIndex())) {
			setValueEx(columnDtlDisp_check, r.getGUIIndex(), true);
		}
	}

	// 行表示切替
	@Override
	public void doCnd_show_act_flg_NC(MCEventInfo info) {
		super.doCnd_show_act_flg_NC(info);
		changeDispRows();
		adjustWidthOnChangeDispRows();
	}

	@Override
	public void doCnd_show_pre_flg_NC(MCEventInfo info) {
		super.doCnd_show_pre_flg_NC(info);
		changeDispRows();
		adjustWidthOnChangeDispRows();
	}

	@Override
	public void doCnd_show_ref_flg_NC(MCEventInfo info) {
		super.doCnd_show_ref_flg_NC(info);
		changeDispRows();
		adjustWidthOnChangeDispRows();
	}

	@Override
	public void doCnd_show_sub_flg_NC(MCEventInfo info) {
		super.doCnd_show_sub_flg_NC(info);
		changeDispRows();
		adjustWidthOnChangeDispRows();
	}

	protected void adjustWidthOnChangeDispRows() {
		columnDtlDisp_label.adjustWidth();
		columnDtlDisp_code.adjustWidth();
		columnDtlDisp_name.adjustWidth();
		columnDtlDisp_grp_nm.adjustWidth();
	}

	@Override
	public void doCnd_show_blk_flg_NC(MCEventInfo info) {
		super.doCnd_show_blk_flg_NC(info);
		changeDispRows();
	}

	// カラム表示切替
	@Override
	public void doCnd_show_label_flg_NC(MCEventInfo info) {
		super.doCnd_show_label_flg_NC(info);
		setDispCtrlStatus();
		columnDtlDisp_label.adjustWidth();
	}

	@Override
	public void doCnd_show_code_flg_NC(MCEventInfo info) {
		super.doCnd_show_code_flg_NC(info);
		setDispCtrlStatus();
		columnDtlDisp_code.adjustWidth();
	}

	@Override
	public void doCnd_show_name_flg_NC(MCEventInfo info) {
		super.doCnd_show_name_flg_NC(info);
		setDispCtrlStatus();
		columnDtlDisp_name.adjustWidth();
	}

	@Override
	public void doCnd_show_grp_flg_NC(MCEventInfo info) {
		super.doCnd_show_grp_flg_NC(info);
		setDispCtrlStatus();
		columnDtlDisp_grp_nm.adjustWidth();
	}

	@Override
	public void doCnd_show_others_flg_NC(MCEventInfo info) {
		super.doCnd_show_others_flg_NC(info);
		setDispCtrlStatus();
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlDispTable) {
			DtlDispR r = getDtlDispL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBBP1400(r)) {
				doBtn_open_MSBBP1400(r);
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

	protected Color _actBgColor = getPgmSettingColorNE(this, new Color(255, 153, 0), "color.act.bg");

	protected Color _preBgColor = getPgmSettingColorNE(this, new Color(153, 204, 255), "color.pre.bg");

	protected Color _curBgColor = getPgmSettingColorNE(this, new Color(255, 255, 0), "color.cur.bg");

	protected Color _refBgColor = getPgmSettingColorNE(this, new Color(102, 255, 255), "color.ref.bg");

	protected Color _subBgColor = getPgmSettingColorNE(this, new Color(0, 255, 102), "color.sub.bg");

	protected Color _blkBgColor = getPgmSettingColorNE(this, new Color(255, 255, 255), "color.blk.bg");

	protected class DtlDispCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				// 検索時訂正不可
				if (getHdrR().sum_old_locked_flg()) {
					return MCMode.READ_ONLY;
				}

				// 検索時訂正可能
				DtlDispR r = (DtlDispR) table.getBaseTable().getRow(index);
				if (!isInptRow(r)) {
					return MCMode.READ_ONLY;
				}

				if (column == columnDtlDisp_check || column == columnDtlDisp_fix_flg) {
					return null;
				}
				else {
					if (r.fix_flg()) {
						return MCMode.READ_ONLY;
					}

					MCColumnConfig eidtableQtyCol = getEditableQtyCol(column);
					if (eidtableQtyCol == null) {
						return null;
					}
					else {
						if (!r.getBoolean(eidtableQtyCol.getBaseRowColumnName())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			else if (isDtlDelStatus()) {
				DtlDispR r = (DtlDispR) table.getBaseTable().getRow(index);
				if (column == columnDtlDisp_check) {
					// 検索時訂正不可
					if (getHdrR().sum_old_locked_flg()) {
						return MCMode.READ_ONLY;
					}

					// 検索時訂正可能
					if (!isInptRow(r)) {
						return MCMode.READ_ONLY;
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
				if (column == columnDtlDisp_label || column == columnDtlDisp_code
						|| column == columnDtlDisp_name || column == columnDtlDisp_ym
						|| column == columnDtlDisp_spln_vers
						|| column == columnDtlDisp_usr_info
						|| column == columnDtlDisp_row_title_nm) {
					if (isHdrRow(r)) {
						return getRowTitleNmBgColor(r);
					}
				}
				if (column == columnDtlDisp_grp_nm) {
					return getGrpNmBgColor(r);
				}
				else if (column == columnDtlDisp_row_title_nm) {
					return getRowTitleNmBgColor(r);
				}
				else if (isQtyColumn(column)) {
					return getQtyBgColor(r);
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}

		protected Color getBlkBgColor() {
			return _blkBgColor;
		}

		protected Color getGrpNmBgColor(DtlDispR r) {
			if (isActTtlRow(r)) {
				return getRowTitleNmBgColor(r);
			}
			else if (isPreTtlRow(r)) {
				return getRowTitleNmBgColor(r);
			}
			else if (isCurTtlRow(r)) {
				return getRowTitleNmBgColor(r);
			}
			else if (isRefTtlRow(r)) {
				return getRowTitleNmBgColor(r);
			}
			else if (isUsrTtlRow(r)) {
				return getRowTitleNmBgColor(r);
			}
			return null;
		}

		protected Color getRowTitleNmBgColor(DtlDispR r) {
			if (isActRow(r)) {
				return _actBgColor;
			}
			else if (isPreRow(r)) {
				return _preBgColor;
			}
			else if (isCurRow(r)) {
				return _curBgColor;
			}
			else if (isRefRow(r)) {
				return _refBgColor;
			}
			else if (isUsrRow(r)) {
				return _subBgColor;
			}
			return null;
		}

		protected Color getQtyBgColor(DtlDispR r) {
			if (isCurRow(r)) {
				return null;
			}
			else {
				return getRowTitleNmBgColor(r);
			}
		}

		protected boolean isActTtlRow(DtlDispR r) {
			return isSame(r.row_title_col(), DtlR.$frcst_qty);
		}

		protected boolean isPreTtlRow(DtlDispR r) {
			return isSame(r.row_title_col(), DtlR.$pre_spln_qty);
		}

		protected boolean isCurTtlRow(DtlDispR r) {
			return isSame(r.row_title_col(), DtlR.$spln_qty);
		}

		protected boolean isRefTtlRow(DtlDispR r) {
			return isSame(r.row_title_col(), DtlR.$ref_spln_qty);
		}

		protected boolean isUsrTtlRow(DtlDispR r) {
			return !isNull(r.grp_nm()) && isSame(r.row_title_col(), UsrDtlR.$usr_spln_qty);
		}

	}

	protected DtlDispR getInptRow(DtlDispR r) {
		if (isInptRow(r)) {
			return r;
		}
		else if (isCalcRow(r)) {
			if (isSame(r.row_title_col(), DtlR.$spln_qty)) {
				return getDtlDispL().get(r.getGUIIndex() + 1);
			}
			else if (isSame(r.row_title_col(), DtlR.$spln_amt)) {
				return getDtlDispL().get(r.getGUIIndex() - 1);
			}
		}
		return null;
	}

	protected DtlDispR getCalcRow(DtlDispR r) {
		if (isInptRow(r)) {
			if (isSame(r.row_title_col(), DtlR.$spln_qty)) {
				return getDtlDispL().get(r.getGUIIndex() + 1);
			}
			else if (isSame(r.row_title_col(), DtlR.$spln_amt)) {
				return getDtlDispL().get(r.getGUIIndex() - 1);
			}
		}
		else if (isCalcRow(r)) {
			return r;
		}
		return null;
	}

	protected boolean isBlkRow(DtlDispR r) {
		return isNull(r.row_title_col());
	}

	protected boolean isHdrRow(DtlDispR r) {
		if (r.getGUIIndex() == 0) {
			return true;
		}
		else {
			return !isSame(r.grp_peg_no(), getDtlDispL().get(r.getGUIIndex() - 1)
					.grp_peg_no());
		}
	}

	protected boolean isInptRow(DtlDispR r) {
		if (isNull(r)) {
			return false;
		}
		else if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
			return isSame(r.row_title_col(), DtlR.$spln_qty);
		}
		else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
			return isSame(r.row_title_col(), DtlR.$spln_amt);
		}
		return false;
	}

	protected boolean isCalcRow(DtlDispR r) {
		if (isNull(r)) {
			return false;
		}
		else if (MAC_SPLN_SET_TYP.isQTY(r.spln_set_typ())) {
			return isSame(r.row_title_col(), DtlR.$spln_amt);
		}
		else if (MAC_SPLN_SET_TYP.isAMT(r.spln_set_typ())) {
			return isSame(r.row_title_col(), DtlR.$spln_qty);
		}
		return false;
	}

	protected boolean isSplnItmRow(DtlDispR r) {
		return !isNullOrNullVal(r.spln_itm_cd());
	}

	protected boolean isQtyRow(DtlDispR r) {
		return !isNull(r.row_title_col()) && r.row_title_col().endsWith("qty");
	}

	protected boolean isAmtRow(DtlDispR r) {
		return !isNull(r.row_title_col()) && r.row_title_col().endsWith("amt");
	}

	protected boolean isActRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$frcst_qty)
				|| isSame(r.row_title_col(), DtlR.$frcst_amt)
				|| isSame(r.row_title_col(), DtlR.$pre_slo_qty)
				|| isSame(r.row_title_col(), DtlR.$pre_slo_amt)
				|| isSame(r.row_title_col(), DtlR.$slo_qty)
				|| isSame(r.row_title_col(), DtlR.$slo_amt);
	}

	protected boolean isPreRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$pre_spln_qty)
				|| isSame(r.row_title_col(), DtlR.$pre_spln_amt);
	}

	protected boolean isCurRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$spln_qty)
				|| isSame(r.row_title_col(), DtlR.$spln_amt);
	}

	protected boolean isRefRow(DtlDispR r) {
		return isSame(r.row_title_col(), DtlR.$ref_spln_qty)
				|| isSame(r.row_title_col(), DtlR.$ref_spln_amt);
	}

	protected boolean isUsrRow(DtlDispR r) {
		return isSame(r.row_title_col(), UsrDtlR.$usr_spln_qty)
				|| isSame(r.row_title_col(), UsrDtlR.$usr_spln_amt);
	}

	protected boolean isCheckedNotFixDtlL() {
		for (DtlDispR r : getDtlDispL()) {
			if (isInptRow(r)) {
				if (!r.fix_flg()) {
					return true;
				}
			}
		}
		return false;
	}

}