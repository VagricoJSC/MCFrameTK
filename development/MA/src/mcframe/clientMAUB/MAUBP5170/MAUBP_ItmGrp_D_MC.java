package mcframe.clientMAUB.MAUBP5170;

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
import mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_ItmGrp_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_ItmGrp_D_MC extends MAUBP_ItmGrp_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ItmGrp_D_MC() {
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
	public MAUBP_ItmGrp_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MAUBP_ItmGrp_S _itmGrp;
	protected MCRow _itmGrpCndRCopy;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param itmGrp 品目分類_検索部品（MAUBP_ItmGrp_S）
	 */
	public void setRelateBeans(MAUBP_ItmGrp_S itmGrp) {
		_itmGrp = itmGrp;
		_itmGrpCndRCopy = getItmGrp().getItmGrpR().clone();
	}

	protected MAUBP_ItmGrp_S getItmGrp() {
		return _itmGrp;
	}

	@Override
	public void preShow(MCCaller caller) {
		super.preShow(caller);
		
		// 分類の表示・非表示の切り替えは検索後のみ設定
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher) {
			// 検索実行のタイミングで検索情報を保存しておく
			_itmGrpCndRCopy = getItmGrp().getItmGrpR().clone();

			setCdNmMode();
		}
	}

	public void afterCallParts_sub() {
		// 汎用検索画面用
		_itmGrpCndRCopy = getItmGrp().getItmGrpR().clone();

		setCdNmMode();
	}

	
	@Override
	public void setMode(java.lang.String status) {
		super.setMode(status);

		setCdNmMode();
	}

	/**
	 * 検索部品のフラグ項目によってカラムの表示・非表示を切り替えます。<br>
	 * カラムと検索部品のカラム項目の対応付けは実装仕様書の「SHOW」種別に記述しています。
	 */
	protected void setCdNmMode() {
		if (getItmGrp() == null) {
			return ;
		}

		Map<String, String> map = ItmGrpR.create().getExtMap("SHOW");

		for (MCColumnConfig cc : ItmGrpTable.getColumnConfigs()) {
			if (map.containsKey(cc.getRowColumnName())) {
				if (_itmGrpCndRCopy.getBoolean(map.get(cc.getRowColumnName()))) {
					setDefaultMode(cc);
				}
				else {
					cc.setMode(MCMode.INVISIBLE);
				}
			}
		}
	}

}