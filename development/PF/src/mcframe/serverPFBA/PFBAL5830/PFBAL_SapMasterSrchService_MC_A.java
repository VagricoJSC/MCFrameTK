package mcframe.serverPFBA.PFBAL5830;

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
 * "PFBAL_SapMasterSrchService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBAL_SapMasterSrchService_MC_A extends mcframe.serverPFUD.PFUDL5040.PFUDL_ODataLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBAL5830";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBAL_SapMasterSrchService.CostCenter_Srch01 aCostCenter_Srch01;

	protected void initCostCenter_Srch01() {
		this.info = PDef.PF_PFBAL5830_CostCenter_Srch01_INFO;
		this.aCostCenter_Srch01 = ((PFBAL_SapMasterSrchService)this).new CostCenter_Srch01();
	}

	public static PFBAL_SapMasterSrchService.CostCenter_Srch01 crtCostCenter_Srch01() {
		PFBAL_SapMasterSrchService lgc = new PFBAL_SapMasterSrchService();
		lgc.initCostCenter_Srch01();
		return lgc.aCostCenter_Srch01;
	}

	protected void paramCostCenter_Srch01(MCParam p) {
		if (this.aCostCenter_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostCenter_Srch01.up0());
		p.addDownBlock(aCostCenter_Srch01.down0());
	}

	protected void doCostCenter_Srch01() {
		aCostCenter_Srch01.call();
	};

	/**
	 * CostCenter_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR createCostCenter_DtlR(){
		return mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR.create();
	}

	/**
	 * CostCenter_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR> createCostCenter_DtlL(){
		return MCList.create(mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CostCenter_Srch01オペレーション.<p>
	 *
	 */
	abstract public class CostCenter_Srch01 extends mcframe.serverPFUD.PFUDL5040.PFUDL_ODataLogicBase.SrchBase01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostCenter_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR> down0;
		
		
		// コンストラクタ
		protected CostCenter_Srch01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			down0 = MCList.create(mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBAL_SapMasterSrchService)PFBAL_SapMasterSrchService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CostCenter_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR createCostCenter_DtlR(){
			return mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR.create();
		}

		/**
		 * CostCenter_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR> createCostCenter_DtlL(){
			return MCList.create(mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_center</td></tr>
		 * 	<tr><td><br></td><td>validity_start_date</td></tr>
		 * 	<tr><td><br></td><td>validity_end_date</td></tr>
		 * 	<tr><td><br></td><td>profit_center</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBA.PFBAL5830.CostCenter_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBAL_SapMasterSrchService)PFBAL_SapMasterSrchService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}