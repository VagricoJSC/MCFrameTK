package mcframe.clientMAUB.MAUBP0240;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Term_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Term_H_MC extends MAUBP_Term_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCDate _term;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Term_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Term_H_MC(mcframe.clientMAUB.MAUBP0240.TermR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Term START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Term END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	// ctrl + D の制御（start）
	@Override
	@SuppressWarnings("unchecked")
	public <E extends MCCalendarDate<E>> E today(MCDataType type) {
		if (isNull(_term)) {
			return super.today(type);
		}
		return (E)_term;
	}
	// ctrl + D の制御（end）

	@Override
	public void checkForCallStack(MCMessageList list, MCCaller caller) {
		super.checkForCallStack(list, caller);
		list.addAll(checkBeforeAfter(Term_term_fr, Term_term_to));
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setDefault();
	}

	/**
	 * デフォルト値を設定する必要があるかどうか
	 */
	protected boolean _isSetDefault = true;
	
	/**
	 * デフォルト値を設定する必要があるかどうかを設定する。
	 */
	public void setDefault(boolean flg) {
		_isSetDefault = flg;
	}

	/**
	 * デフォルト値を設定します。
	 */
	public void setDefault() {
		if (isNull(_term)) {
			_term = getTerm(this);
		}
		if(_isSetDefault){
			setValueEx(Term_term_fr , _term);
			setValueEx(Term_term_to , _term);
		}
	}

	public void setTerm(MCDate term) {
		if (Term_term_fr.getModeInfo().getStatus() == MCMode.ENABLE_STATUS) {
			MCMessageList msgList = Term_term_fr.checkValue(term);
			if (msgList.isEmpty()) {
				setValueEx(Term_term_fr, term);
			}
		}
		if (Term_term_to.getModeInfo().getStatus() == MCMode.ENABLE_STATUS) {
			MCMessageList msgList = Term_term_to.checkValue(term);
			if (msgList.isEmpty()) {
				setValueEx(Term_term_to, term);
			}
		}
	}

}