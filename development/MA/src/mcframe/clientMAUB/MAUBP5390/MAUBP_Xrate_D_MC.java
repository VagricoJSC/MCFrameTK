package mcframe.clientMAUB.MAUBP5390;

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
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Xrate_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Xrate_D_MC extends MAUBP_Xrate_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCBeans _cur_cd_fr = null;
	protected MCBeans _cur_cd_to = null;
	protected MCBeans _xrate_cd = null;
	protected MCBeans _base_dt = null;
	protected MCBeans _xrate_inpt_flg = null;
	protected boolean _lcBaseDtFlg = true;
	protected boolean _schdXrateInptFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Xrate_D_MC() {
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
	public MAUBP_Xrate_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans getCurCdFr() {
		return _cur_cd_fr;
	}

	protected MCBeans getCurCdTo() {
		return _cur_cd_to;
	}

	protected MCBeans getXrateCd() {
		return _xrate_cd;
	}

	protected MCBeans getBaseDt() {
		return _base_dt;
	}

	protected MCBeans getXrateInptFlg() {
		return _xrate_inpt_flg;
	}

	protected boolean isLcBaseDtFlg() {
		return _lcBaseDtFlg;
	}
	
	/**
	 * 連携に必要な部品を設定する。<br>
	 * 為替レートの入力を為替レート指定ＦＬＧで制御しない場合の初期化処理。
	 * 
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param lcBaseDtFlg 基準日変更時にデフォルトの為替レートを再取得する場合はtrue
	 */
	public void setRelateBeans(MCBeans cur_cd_fr, MCBeans cur_cd_to, MCBeans xrate_cd, MCBeans base_dt, boolean lcBaseDtFlg) {
		_cur_cd_fr = cur_cd_fr;
		_cur_cd_to = cur_cd_to;
		_xrate_cd = xrate_cd;
		_base_dt = base_dt;
		_lcBaseDtFlg = lcBaseDtFlg;
	}

	/**
	 * 連携に必要な部品を設定する。<br>
	 * 為替レートの入力を為替レート指定ＦＬＧで制御する場合の初期化処理。
	 * setupPartsにて設定することを想定。
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param lcBaseDtFlg 基準日変更時にデフォルトの為替レートを再取得する場合はtrue
	 * @param xrate_inpt_flg 為替指定ＦＬＧ
	 */
	public void setRelateBeans(MCBeans cur_cd_fr, MCBeans cur_cd_to, MCBeans xrate_cd, MCBeans base_dt, boolean lcBaseDtFlg, MCBeans xrate_inpt_flg) {
		_cur_cd_fr = cur_cd_fr;
		_cur_cd_to = cur_cd_to;
		_xrate_cd = xrate_cd;
		_base_dt = base_dt;
		_lcBaseDtFlg = lcBaseDtFlg;
		_xrate_inpt_flg = xrate_inpt_flg;
	}
	
	/**
	 * 連携に必要な部品を設定する。<br>
	 * 為替レートの入力を為替レート指定ＦＬＧで制御する場合の初期化処理。
	 * setupPartsにて設定することを想定。<br>
	 * 
	 * @param cur_cd_fr 換算元通貨ＣＤ
	 * @param cur_cd_to 換算先通貨ＣＤ
	 * @param xrate_cd 為替レートＣＤ
	 * @param base_dt 基準日
	 * @param lcBaseDtFlg 基準日変更時にデフォルトの為替レートを再取得する場合はtrue
	 * @param xrate_inpt_flg 為替指定ＦＬＧ
	 * @param schdXrateInptFlg 為替指定ＦＬＧが予定レート指定の意味の場合はtrue
	 */
	public void setRelateBeans(MCBeans cur_cd_fr, MCBeans cur_cd_to, MCBeans xrate_cd, MCBeans base_dt, boolean lcBaseDtFlg, MCBeans xrate_inpt_flg, boolean schdXrateInptFlg) {
		_cur_cd_fr = cur_cd_fr;
		_cur_cd_to = cur_cd_to;
		_xrate_cd = xrate_cd;
		_base_dt = base_dt;
		_lcBaseDtFlg = lcBaseDtFlg;
		_xrate_inpt_flg = xrate_inpt_flg;
		_schdXrateInptFlg = schdXrateInptFlg;
	}
	
	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_cur_cd_fr != null) {
			((MCLCBeans) _cur_cd_fr).addLCListener(this);
		}
		if (_cur_cd_to != null) {
			((MCLCBeans) _cur_cd_to).addLCListener(this);
		}
		if (_xrate_cd != null) {
			((MCLCBeans) _xrate_cd).addLCListener(this);
		}
		if (_base_dt != null && _lcBaseDtFlg) {
			((MCLCBeans) _base_dt).addLCListener(this);
		}
		if (_xrate_inpt_flg != null) {
			((MCNCBeans) _xrate_inpt_flg).addNCListener(this);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		int index = info.getEventIndex();
		if (index >= 0) {
			if (lc == _cur_cd_fr || lc == _cur_cd_to) {
				setDefXrate(index);
			}
			if (lc == _xrate_cd || lc == _base_dt) {
				setDefXrate(index);
			}
		}	
	}

	@Override
	public void doNCEvent(MCNCBeans lc, MCEventInfo info) {
		super.doNCEvent(lc, info);
		
		int index = info.getEventIndex();
		if (index >= 0) {
			if (lc == _xrate_inpt_flg) {
				setDefXrate(index);
			}
		}
	}
	
	protected void setDefXrate(int index) {
		if (isBaseCurFlg(this) || isDefaultModeEditable(columnXrate_xrate)) {
			// 換算元、換算前の通貨が同じ場合は強制的に1にする
			if (isSame(getBeansValue(getCurCdFr(), index), getBeansValue(getCurCdTo(), index))) {
				setValueEx(columnXrate_xrate, index,
						getDefXrateNE((String)getBeansValue(getCurCdFr(),index)
							, (String)getBeansValue(getCurCdTo(), index)
							, (String)getBeansValue(getXrateCd(),index)
							, (MCDate)getBeansValue(getBaseDt(), index)
							, this));
			}
			// 為替レート指定ＦＬＧで入力制御しない、または為替レート指定ＦＬＧがfalseの場合、デフォルトの為替レートを設定する
			if (getBeansValue(getXrateInptFlg(), index) == null || !(Boolean)getBeansValue(getXrateInptFlg(), index)) {
				setValueEx(columnXrate_xrate, index,
						getDefXrateNE((String)getBeansValue(getCurCdFr(),index)
							, (String)getBeansValue(getCurCdTo(), index)
							, (String)getBeansValue(getXrateCd(),index)
							, (MCDate)getBeansValue(getBaseDt(), index)
							, this));
			}
		}
	}
	
	// モード設定
	
	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isDefaultModeEditable(columnXrate_xrate) && column == columnXrate_xrate) {
			// 次の場合はREAD_ONLY
			// ・換算元通貨ＣＤと換算先通貨ＣＤが同じ場合
			// ・為替レート指定ＦＬＧで入力制御する場合で、falseの場合
			if (isSame(getBeansValue(getCurCdFr(), index), getBeansValue(getCurCdTo(), index))) {
				return MCMode.READ_ONLY;
			}
			else if (isNull(getBeansValue(getCurCdFr(), index))
					|| isNull(getBeansValue(getCurCdTo(), index))) {
				return MCMode.READ_ONLY;
			}
			else if (getBeansValue(getXrateInptFlg(), index) != null && !(Boolean)getBeansValue(getXrateInptFlg(), index) && !_schdXrateInptFlg) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}