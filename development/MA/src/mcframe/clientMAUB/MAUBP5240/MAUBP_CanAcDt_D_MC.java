package mcframe.clientMAUB.MAUBP5240;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUD.MAUDP0010.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_CanAcDt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_CanAcDt_D_MC extends MAUBP_CanAcDt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_CanAcDt_D_MC() {
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
	public MAUBP_CanAcDt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		MAUDP_PanelBase p = (MAUDP_PanelBase) getBaseRootPanel();
		boolean cl_usr_flg = p.getUsrAcl().cl_usr_flg();

		if (!cl_usr_flg) {
			setComponentInvisibleAllStatus(columnCanAcDt_can_ac_dt_for_input);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getCanAcDtBase().getScreenOpeBeans(this) != null) {
			((MCNCBeans) getCanAcDtBase().getScreenOpeBeans(this)).addNCListener(this);
		}
		if (getCanAcDtBase().getCheckBeans(this) != null) {
			((MCNCBeans) getCanAcDtBase().getCheckBeans(this)).addNCListener(this);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getCanAcDtBase().getScreenOpeBeans(this)) {
			doBeans_screen_ope_NC(info);
		}
		else if (nc == getCanAcDtBase().getCheckBeans(this)) {
			doBeans_check_NC(info);
		}
	}

	protected void doBeans_screen_ope_NC(MCEventInfo info) {
		if (getCanAcDtBase().isCanAcDtValueInitOpe(this)) {
			for (MCRow r : CanAcDtTable.getBaseTable().getList()) {
				canAcDtValueInit(r);
			}
		}
	}

	protected void doBeans_check_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		MCRow r = CanAcDtTable.getBaseTable().getList().get(index);
		canAcDtValueInit(r);
	}

	@Override
	public void doCanAcDt_can_ac_dt_for_input_LC(MCEventInfo info) {
		super.doCanAcDt_can_ac_dt_for_input_LC(info);

		setValueEx(columnCanAcDt_can_ac_dt_for_call, info.getEventIndex(),
				info.getNewValue());
	}

	@Override
	public void afterCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.afterCallParts(matcher, caller);
		int blockIdx = caller.getDownParamBlockIndex(CanAcDtTable);
		String acDtAfterSrchCol = columnCanAcDt_ac_dt_after_srch.getBaseRowColumnName();
		MCList<?> downL = caller.getDownParamList(blockIdx);
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher
				|| caller instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLSearcher) {

			for (MCRow r : downL) {
				r.setDateNE(acDtAfterSrchCol,
						r.getDateNE(
								((MCColumnConfig) getCanAcDtBase().getAcDtBeans(this))
										.getRowColumnName()));
				canAcDtValueInit(r);
			}
		}
	}

	public void canAcDtValueInit(MCRow r) {
		String acDtAfterSrchCol = columnCanAcDt_ac_dt_after_srch.getBaseRowColumnName();
		String canAcDtForInputCol = columnCanAcDt_can_ac_dt_for_input.getBaseRowColumnName();
		if (!getCanAcDtBase().isCanAcDtValueInitOpe(this)) {
			return;
		}
		if (isNull(r.getDateNE(acDtAfterSrchCol))) {
			return;
		}
		if (!isNull(r.getDateNE(canAcDtForInputCol))) {
			return;
		}
		if (getCanAcDtBase().getCheckBeans(this) != null) {
			if (r.getGUIIndex() < 0) {
				// afterCallPartsから呼ばれた場合は、GUIIndexは-1。この場合、選択チェックはオフなので初期値設定はしない
				return;
			}
			if (r.getBoolean(((MCColumnConfig) getCanAcDtBase().getCheckBeans(this)).getRowColumnName()) == false) {
				return;
			}
		}
		if (r.getGUIIndex() < 0) {
			r.setDateNE(canAcDtForInputCol, r.getDateNE(acDtAfterSrchCol));
		}
		else {
			setValueEx(columnCanAcDt_can_ac_dt_for_input, r.getGUIIndex(), r.getDateNE(acDtAfterSrchCol));
		}
	}

	/**
	 * ベース画面を取得する。
	 * 
	 * @return ベース画面
	 */
	protected IfCanAcDtBase getCanAcDtBase() {
		return getLinkPartsPanel(IfCanAcDtBase.class);
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (column != columnCanAcDt_can_ac_dt_for_input) {
			return super.getCellMode(index, column);
		}
		else if (!getCanAcDtBase().isCanAcDtValueInitOpe(this)) {
			return MCMode.READ_ONLY;
		}
		else {
			CanAcDtR r = getCanAcDtL().get(index);
			if (isNull(r.ac_dt_after_srch())) {
				return MCMode.READ_ONLY;
			}
		}

		return getDefaultMode(column);
	}

}