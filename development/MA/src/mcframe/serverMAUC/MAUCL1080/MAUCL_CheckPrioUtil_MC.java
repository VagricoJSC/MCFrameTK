package mcframe.serverMAUC.MAUCL1080;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_CheckPrioUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_CheckPrioUtil_MC extends MAUCL_CheckPrioUtil_MC_A{
	//FMCB CUSTOM START
	private static final Class<MAUCL_CheckPrioUtil> _clazz = MAUCL_CheckPrioUtil.class;
	
	protected static MAUCL_CheckPrioUtil getThis(){
		return object(_clazz);
	}
	
	// /////////////////////////////////////////////
	// 優先順位チェック用subListメソッド
	// /////////////////////////////////////////////
	
	/**
	 * 優先順位のチェック対象のrowを含む新しいリストを返します。<p>
	 * 次の条件をすべて満たすrowのみをリストに格納し、リストを返します。
	 * <li>CREATEまたはMODIFYステータス
	 * <li>優先順位がnullか-1以外
	 * @param list 優先順位のカラムをもつリスト
	 * @param prioColumn 優先順位のカラム名
	 * 
	 */	
	public static <R extends MCRow, L extends MCList<R>> L subListForCheckPrio(L list, String prioColumn) {
		return getThis()._subListForCheckPrio(list, prioColumn);
	}
	
	/**
	 * 優先順位のチェック対象のrowを含む新しいリストを返します。<p>
	 * 次の条件をすべて満たすrowのみをリストに格納し、リストを返します。
	 * <li>CREATEまたはMODIFYステータス
	 * <li>優先順位がnullか-1以外
	 * 
	 * @param list 優先順位のカラムをもつリスト
	 * @param prioColumn 優先順位のカラム名
	 */
	protected <R extends MCRow, L extends MCList<R>> L _subListForCheckPrio(L list, String prioColumn) {
		
		L down = (L)list.createInstance();
		
		final MCNumber nonCheckNo = new MCNumber(-1);
		for(R r : list){
			MCNumber prio = r.getNumberNE(prioColumn);
			
			if((r.isStatusCreate() || r.isStatusModify()) 
				&& (!isNull(prio) && !isSame(prio, nonCheckNo))){
				down.add(r);
			}
		}
		return down;
	}

	/**
	 * 優先順位のsumが優先順位よりも大きいRowを含む新しいリストを返します。<p>
	 * @param list 優先順位のsumを集計したリスト。優先順位と、それを集計したカラムを保持している必要がある
	 * @param sumPrioColumn 優先順位の合計のカラム名
	 * @param prioColumn 優先順位のカラム
	 * 
	 */	
	public static <R extends MCRow, L extends MCList<R>> L subListForErrPrio(L list, String sumPrioColumn, String prioColumn) {
		return getThis()._subListForErrPrio(list, sumPrioColumn, prioColumn);
	}
	
	/**
	 * 優先順位のsumが優先順位よりも大きいRowを含む新しいリストを返します。<p>
	 * @param list 優先順位のsumを集計したリスト。優先順位と、それを集計したカラムを保持している必要がある
	 * @param sumPrioColumn 優先順位の合計のカラム名
	 * @param prioColumn 優先順位のカラム
	 */
	protected <R extends MCRow, L extends MCList<R>> L _subListForErrPrio(L list, String sumPrioColumn, String prioColumn) {
		
		L down = (L)list.createInstance();
		
		for(R r : list){
			
			if(r.getNumber(sumPrioColumn).gt(r.getNumber(prioColumn))){
				down.add(r);
			}
		}
		return down;
	}
	//FMCB CUSTOM END
}