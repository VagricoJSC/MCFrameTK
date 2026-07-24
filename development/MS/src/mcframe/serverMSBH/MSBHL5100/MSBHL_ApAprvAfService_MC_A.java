package mcframe.serverMSBH.MSBHL5100;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBHL_ApAprvAfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApAprvAfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApAprvAfService.ApAprvAf_Upd01 aApAprvAf_Upd01;

	protected void initApAprvAf_Upd01() {
		this.info = PDef.MS_MSBHL5100_ApAprvAf_Upd01_INFO;
		this.aApAprvAf_Upd01 = ((MSBHL_ApAprvAfService)this).new ApAprvAf_Upd01();
	}

	public static MSBHL_ApAprvAfService.ApAprvAf_Upd01 crtApAprvAf_Upd01() {
		MSBHL_ApAprvAfService lgc = new MSBHL_ApAprvAfService();
		lgc.initApAprvAf_Upd01();
		return lgc.aApAprvAf_Upd01;
	}

	protected void paramApAprvAf_Upd01(MCParam p) {
		if (this.aApAprvAf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApAprvAf_Upd01.up0());
	}

	protected void doApAprvAf_Upd01() {
		aApAprvAf_Upd01.call();
	};

	/**
	 * ApAprvAf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createApAprvAf_Upd01_DtlR(){
		return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
	}

	/**
	 * ApAprvAf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createApAprvAf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApAprvAf_Upd01オペレーション.<p>
	 *
	 * 債務データ承認後に実行する処理を行う。<br>
	 */
	abstract public class ApAprvAf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBA.MBBAL5020.IfMBBAL_AprvAfter_AprvAfter_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApAprvAf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected ApAprvAf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_ApAprvAfService)MSBHL_ApAprvAfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ApAprvAf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR createApAprvAf_Upd01_DtlR(){
			return mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.create();
		}

		/**
		 * ApAprvAf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> createApAprvAf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5020.AprvAfter_Upd01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApAprvAfService)MSBHL_ApAprvAfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}