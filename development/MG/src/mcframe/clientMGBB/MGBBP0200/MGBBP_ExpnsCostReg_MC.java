package mcframe.clientMGBB.MGBBP0200;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_ExpnsCostReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_ExpnsCostReg_MC extends MGBBP_ExpnsCostReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ExpnsCostReg_MC() {
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
	public MGBBP_ExpnsCostReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch01Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0200_Srch01Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0200_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch02Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0200_Srch02Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0200_Srch03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch03Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0200_Srch03Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0200_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd01Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * [MG_MGBBL0200_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd02Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * [MG_MGBBL0200_Upd03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd03Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * [MG_MGBBL0200_Upd04]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd04Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBBL0200_Upd05]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd05Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd05Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBBL0200_Upd06]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd06Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Upd06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0200_Upd06Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBBL0200_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del01Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0200_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * [MG_MGBBL0200_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del02Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0200_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}

	/**
	 * [MG_MGBBL0200_Del03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del03Caller<P extends MGBBP_ExpnsCostReg, B extends MG_MGBBL0200_Del03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0200_Del03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch_inpt]の押下時の処理
	 */
	@Override
	public void doCnd_srch_inpt(MCEventInfo info) {
		callMG_MGBBL0200_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_io]の押下時の処理
	 */
	@Override
	public void doCnd_srch_io(MCEventInfo info) {
		callMG_MGBBL0200_Srch02();
	}
	/**
	 * Panel[Cnd]のボタン[srch_sls]の押下時の処理
	 */
	@Override
	public void doCnd_srch_sls(MCEventInfo info) {
		callMG_MGBBL0200_Srch03();
	}
	/**
	 * Panel[Btn]のボタン[upd_inpt]の押下時の処理
	 */
	@Override
	public void doBtn_upd_inpt(MCEventInfo info) {
		callMG_MGBBL0200_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_io]の押下時の処理
	 */
	@Override
	public void doBtn_upd_io(MCEventInfo info) {
		callMG_MGBBL0200_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd_sls]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sls(MCEventInfo info) {
		callMG_MGBBL0200_Upd03();
	}
	/**
	 * Panel[Btn]のボタン[upd_inpt_a]の押下時の処理
	 */
	@Override
	public void doBtn_upd_inpt_a(MCEventInfo info) {
		callMG_MGBBL0200_Upd04();
	}
	/**
	 * Panel[Btn]のボタン[upd_io_a]の押下時の処理
	 */
	@Override
	public void doBtn_upd_io_a(MCEventInfo info) {
		callMG_MGBBL0200_Upd05();
	}
	/**
	 * Panel[Btn]のボタン[upd_sls_a]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sls_a(MCEventInfo info) {
		callMG_MGBBL0200_Upd06();
	}
	/**
	 * Panel[Btn]のボタン[del_inpt]の押下時の処理
	 */
	@Override
	public void doBtn_del_inpt(MCEventInfo info) {
		callMG_MGBBL0200_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_io]の押下時の処理
	 */
	@Override
	public void doBtn_del_io(MCEventInfo info) {
		callMG_MGBBL0200_Del02();
	}
	/**
	 * Panel[Btn]のボタン[del_sls]の押下時の処理
	 */
	@Override
	public void doBtn_del_sls(MCEventInfo info) {
		callMG_MGBBL0200_Del03();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc.setSum(RsltR.$ttl);
		_cc.setUpri(RsltR.$qty, RsltR.$upri);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color expnsEnableColor = getExpnsEnableColor(this);
		Color expnsGColor = getExpnsGSubTtlColor(this);
		cc.putColumnBG(_cc.getExpnsColumnConfigs(), MCMode.ENABLE, expnsEnableColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGColor);
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		displayColumn();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_AUTO.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_AUTO_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_AUTO_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_AUTO_SLSStatus();
			}
		}
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setUPD_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setUPD_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setUPD_SLSStatus();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setDEL_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setDEL_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setDEL_SLSStatus();
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setREF_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setREF_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setREF_SLSStatus();
			}
		}
		else if (Cnd_ope_AUTO.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setAUTO_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setAUTO_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setAUTO_SLSStatus();
			}
		}
	}

	protected void setFixStatus() {
		// 更新後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setFIX_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setFIX_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setFIX_SLSStatus();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setFIX_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setFIX_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setFIX_SLSStatus();
			}
		}
		else if (Cnd_ope_AUTO.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setFIX_AUTO_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setFIX_AUTO_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setFIX_AUTO_SLSStatus();
			}
		}
	}

	@Override
	public void setSRCH_INPTStatus() {
		super.setSRCH_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setUPD_INPTStatus() {
		super.setUPD_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setREF_INPTStatus() {
		super.setREF_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setDEL_INPTStatus() {
		super.setDEL_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setSRCH_AUTO_INPTStatus() {
		super.setSRCH_AUTO_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setAUTO_INPTStatus() {
		super.setAUTO_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_INPTStatus() {
		super.setFIX_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_AUTO_INPTStatus() {
		super.setFIX_AUTO_INPTStatus();
		setStatusCom();
	}
	@Override
	public void setSRCH_IOStatus() {
		super.setSRCH_IOStatus();
		setStatusCom();
	}
	@Override
	public void setUPD_IOStatus() {
		super.setUPD_IOStatus();
		setStatusCom();
	}
	@Override
	public void setREF_IOStatus() {
		super.setREF_IOStatus();
		setStatusCom();
	}
	@Override
	public void setDEL_IOStatus() {
		super.setDEL_IOStatus();
		setStatusCom();
	}
	@Override
	public void setSRCH_AUTO_IOStatus() {
		super.setSRCH_AUTO_IOStatus();
		setStatusCom();
	}
	@Override
	public void setAUTO_IOStatus() {
		super.setAUTO_IOStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_IOStatus() {
		super.setFIX_IOStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_AUTO_IOStatus() {
		super.setFIX_AUTO_IOStatus();
		setStatusCom();
	}
	@Override
	public void setSRCH_SLSStatus() {
		super.setSRCH_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setUPD_SLSStatus() {
		super.setUPD_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setREF_SLSStatus() {
		super.setREF_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setDEL_SLSStatus() {
		super.setDEL_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setSRCH_AUTO_SLSStatus() {
		super.setSRCH_AUTO_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setAUTO_SLSStatus() {
		super.setAUTO_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_SLSStatus() {
		super.setFIX_SLSStatus();
		setStatusCom();
	}
	@Override
	public void setFIX_AUTO_SLSStatus() {
		super.setFIX_AUTO_SLSStatus();
		setStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_INPT) || isSame(getStatus(), UPD_IO) || isSame(getStatus(), UPD_SLS);
	}

	protected boolean isAutoStatus() {
		return isSame(getStatus(), AUTO_INPT) || isSame(getStatus(), AUTO_IO) || isSame(getStatus(), AUTO_SLS);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isAutoStatus();
	}

	protected void setStatusCom() {
		setStatusColumn();
		setFocus();
		displayColumn();
	}

	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_AUTO.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!confirmClear()) {
			return false;
		}
		return super.doCnd_ope_VC(info);
	}
	@Override
	public boolean doCnd_tar_VC(MCEventInfo info) {
		if (!confirmClear()) {
			return false;
		}
		return super.doCnd_tar_VC(info);
	}
	protected boolean confirmClear() {
		if (isRegStatus() && !isStatusNone(getRsltL())) {
			return confirmRegDataClear();
		}
		return true;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		setStatusCom();
	}

	@Override
	public void doCnd_tar_NC(MCEventInfo info) {
		super.doCnd_tar_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		setStatusCom();
	}

	@Override
	public void doRslt_amt_set_typ_LC(MCEventInfo info) {
		super.doRslt_amt_set_typ_LC(info);
		setValueEx(columnRslt_calc_grp_cd, info.getEventIndex(), null);
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		_cc.displayColumn();
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (isAutoStatus()) {
				if (column == columnRslt_calc_grp_cd) {
					if (!MAC_AMT_SET_TYP.isAVE(r.amt_set_typ()) 
							&& !MAC_AMT_SET_TYP.isAVE_STD(r.amt_set_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			RsltR r = RsltR.create();
			return r.getKeys("ELM").contains(column.getBaseRowColumnName())
					|| column == columnRslt_ttl;
		}
		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			return getBaseCur().amt_dec_place();
		}
	}

}