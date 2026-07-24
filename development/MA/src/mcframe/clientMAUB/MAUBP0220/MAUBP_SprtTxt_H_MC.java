package mcframe.clientMAUB.MAUBP0220;

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
import mcframe.commonCore.resource.ctrl.MCCustomResource;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_SprtTxt_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_SprtTxt_H_MC extends MAUBP_SprtTxt_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String RES_NM = "MCInputHistory";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_SprtTxt_H_MC() {
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
	protected MAUBP_SprtTxt_H_MC(mcframe.clientMAUB.MAUBP0220.TxtR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Txt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Txt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 指定したメタの長さで入力制御します。
	 * 
	 * @param meta 項目メタ
	 */
	public void setMetaLength(mcframe.commonCore.meta.MCMeta meta) {
		Txt_txt.setLength(meta.length());
	}

	@Override
	public MCList<MCRow> getTxt_txt(MCRow row, MCEventInfo info){
		MCList<MCRow> l = MCList.create(MCRow.class);
		for (String s : getInputHistory()) {
			if (isSame(l.size(), _viewSize)) {
				break;
			}
			String txt = Txt_txt.getViewValue();
			if (isNull(txt) || s.matches(".*" + java.util.regex.Pattern.quote(txt) + ".*")) {
				MCRow r = MCRow.create();
				r.addStringColumn("txt", s);
				r.addStringColumn("_view", s);
				l.add(r);
			}
		}
		return l;
	}
	
	protected List<String> getInputHistory() {
		List<String> inputHistory = new ArrayList<String>();
		MCCustomResource cr = new MCCustomResource(RES_NM);
		cr.loadUser(MCSys.env.USERPROFILE(), null, null);
		String[] strArr = cr.getStringArray(getResKey(), null, null);
		
		int len = strArr == null ? 0 : strArr.length;
		for (int i = 0; i < len; i++) {
			inputHistory.add(strArr[i]);
		}
		return inputHistory;
	}

	protected String getResKey() {
		String key = MCConst.createKey(getBaseRootPanel().getScreenID(),
				Txt_txt.getAliasName(getBaseRootPanel()));
		return key;
	}

	@Override
	public void beforeCallParts(MCCaller caller) {
		super.beforeCallParts(caller);

		saveInputHistory();
	}

	protected void saveInputHistory() {
		String txt = getTxtR().txt();
		if (isNull(txt)) {
			return ;
		}

		List<String> inputHistory = getInputHistory();
		if (!isSame(_memSize,0)) {
			if (inputHistory.contains(txt)) {
				inputHistory.remove(txt);
			}
			else {
				if (inputHistory.size() >= _memSize) {
					for (int i = inputHistory.size(); i >= _memSize; i--) {
						inputHistory.remove(i-1);
					}
				}
			}
			inputHistory.add(0,txt);
		}
		
		MCCustomResource cr = new MCCustomResource(RES_NM);
		cr.loadUser(MCSys.env.USERPROFILE(), null, null);
		cr.setStringArray(getResKey(), inputHistory.toArray(new String[0]));
		cr.saveUser(MCSys.env.USERPROFILE(), null, null);
	}

	protected int _memSize;
	protected int _viewSize;

	@Override
	protected void partsInit() {
		super.partsInit();
		_memSize = MCConst.app.getInteger("MA.MAUBP0220.his_memory_size", 100);
		_viewSize = MCConst.app.getInteger("MA.MAUBP0220.his_view_size", 20);
		if (_memSize < 0) {
			_memSize = 0;
		}
		if (_viewSize < 0) {
			_viewSize = 0;
		}
	}

}