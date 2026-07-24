package mcframe.serverMABC.MABCL0390;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_ItmLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ItmLst_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0390";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ItmLst.ItmLst_UpdChk01 aItmLst_UpdChk01;

	protected void initItmLst_UpdChk01() {
		this.info = PDef.MA_MABCL0390_ItmLst_UpdChk01_INFO;
		this.aItmLst_UpdChk01 = ((MABCL_ItmLst)this).new ItmLst_UpdChk01();
	}

	public static MABCL_ItmLst.ItmLst_UpdChk01 crtItmLst_UpdChk01() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initItmLst_UpdChk01();
		return lgc.aItmLst_UpdChk01;
	}

	protected void paramItmLst_UpdChk01(MCParam p) {
		if (this.aItmLst_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmLst_UpdChk01.up0());
	}

	protected void doItmLst_UpdChk01() {
		aItmLst_UpdChk01.call();
	};

	/**
	 * ItmLst_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR createItmLst_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.create();
	}

	/**
	 * ItmLst_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> createItmLst_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmLst.ItmLst_Upd01 aItmLst_Upd01;

	protected void initItmLst_Upd01() {
		this.info = PDef.MA_MABCL0390_ItmLst_Upd01_INFO;
		this.aItmLst_Upd01 = ((MABCL_ItmLst)this).new ItmLst_Upd01();
	}

	public static MABCL_ItmLst.ItmLst_Upd01 crtItmLst_Upd01() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initItmLst_Upd01();
		return lgc.aItmLst_Upd01;
	}

	protected void paramItmLst_Upd01(MCParam p) {
		if (this.aItmLst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmLst_Upd01.up0());
	}

	protected void doItmLst_Upd01() {
		aItmLst_Upd01.call();
	};

	/**
	 * ItmLst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR createItmLst_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.create();
	}

	/**
	 * ItmLst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> createItmLst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmLst.ItmLst_UpdChk02 aItmLst_UpdChk02;

	protected void initItmLst_UpdChk02() {
		this.info = PDef.MA_MABCL0390_ItmLst_UpdChk02_INFO;
		this.aItmLst_UpdChk02 = ((MABCL_ItmLst)this).new ItmLst_UpdChk02();
	}

	public static MABCL_ItmLst.ItmLst_UpdChk02 crtItmLst_UpdChk02() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initItmLst_UpdChk02();
		return lgc.aItmLst_UpdChk02;
	}

	protected void paramItmLst_UpdChk02(MCParam p) {
		if (this.aItmLst_UpdChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmLst_UpdChk02.up0());
	}

	protected void doItmLst_UpdChk02() {
		aItmLst_UpdChk02.call();
	};

	/**
	 * ItmLst_UpdChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR createItmLst_UpdChk02_DtlR(){
		return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.create();
	}

	/**
	 * ItmLst_UpdChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> createItmLst_UpdChk02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);
	}
	protected MABCL_ItmLst.ItmLst_Upd02 aItmLst_Upd02;

	protected void initItmLst_Upd02() {
		this.info = PDef.MA_MABCL0390_ItmLst_Upd02_INFO;
		this.aItmLst_Upd02 = ((MABCL_ItmLst)this).new ItmLst_Upd02();
	}

	public static MABCL_ItmLst.ItmLst_Upd02 crtItmLst_Upd02() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initItmLst_Upd02();
		return lgc.aItmLst_Upd02;
	}

	protected void paramItmLst_Upd02(MCParam p) {
		if (this.aItmLst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmLst_Upd02.up0());
	}

	protected void doItmLst_Upd02() {
		aItmLst_Upd02.call();
	};

	/**
	 * ItmLst_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR createItmLst_Upd02_DtlR(){
		return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.create();
	}

	/**
	 * ItmLst_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> createItmLst_Upd02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);
	}
	protected MABCL_ItmLst.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0390_Srch01_INFO;
		this.aSrch01 = ((MABCL_ItmLst)this).new Srch01();
	}

	public static MABCL_ItmLst.Srch01 crtSrch01() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0390.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);
	}
	protected MABCL_ItmLst.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0390_Upd01_INFO;
		this.aUpd01 = ((MABCL_ItmLst)this).new Upd01();
	}

	public static MABCL_ItmLst.Upd01 crtUpd01() {
		MABCL_ItmLst lgc = new MABCL_ItmLst();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Upd01_Dtl1R createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMABC.MABCL0390.Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ItmLst_UpdChk01オペレーション.<p>
	 *
	 * 品目マスタ（共通）の登録前のチェックを行います。<br>
	 */
	abstract public class ItmLst_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmLst_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmLst_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);

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
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmLst_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR createItmLst_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.create();
		}

		/**
		 * ItmLst_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> createItmLst_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image_flg</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}


	}
	/**
	 * ItmLst_Upd01オペレーション.<p>
	 *
	 * 品目マスタ（共通）の登録を行います。<br>
	 */
	abstract public class ItmLst_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmLst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_CMN_UPD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_CMN_UPD_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_CMN_UPD_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_CMN_UPD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_CMN_UPD_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_CMN_UPD_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmLst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_CMN_UPD_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_CMN_UPD_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_CMN_UPD_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_CMN_UPD_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_CMN_UPD_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmLst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR createItmLst_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.create();
		}

		/**
		 * ItmLst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> createItmLst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image_flg</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_CMN_UPD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> src_ItmLst_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmLst_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_alt_nm1", "itm_alt_nm1");
				addColumnPathMap("itm_alt_nm2", "itm_alt_nm2");
				addColumnPathMap("itm_alt_nm3", "itm_alt_nm3");
				addColumnPathMap("itm_alt_nm4", "itm_alt_nm4");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ITM_CMN_UPD_R r_dest, mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_CMN_UPD_R> dest, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_src : src){
				MAM_ITM_CMN_UPD_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_CMN_UPD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> src_ItmLst_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmLst_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_CMN_UPD_R r_dest, mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_CMN_UPD_R> dest, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_src : src){
				MAM_ITM_CMN_UPD_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * ItmLst_UpdChk02オペレーション.<p>
	 *
	 * 品目マスタ（会社）の登録前のチェックを行います。<br>
	 */
	abstract public class ItmLst_UpdChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmLst_UpdChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmLst_UpdChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);

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
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmLst_UpdChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR createItmLst_UpdChk02_DtlR(){
			return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.create();
		}

		/**
		 * ItmLst_UpdChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> createItmLst_UpdChk02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}


	}
	/**
	 * ItmLst_Upd02オペレーション.<p>
	 *
	 * 品目マスタ（会社）の登録を行います。<br>
	 */
	abstract public class ItmLst_Upd02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmLst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmLst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmLst_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR createItmLst_Upd02_DtlR(){
			return mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.create();
		}

		/**
		 * ItmLst_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> createItmLst_Upd02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> src_ItmLst_Upd02_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmLst_Upd02_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> src_ItmLst_Upd02_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmLst_Upd02_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目マスタ一覧の検索を行います。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0390.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SRCH_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SRCH_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_SRCH_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SRCH_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_SRCH_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0390.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM_SRCH_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM_SRCH_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM_SRCH_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
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
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0390.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg_on</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg_off</td></tr>
		 * 	<tr><td><br></td><td>own_co_flg_off</td></tr>
		 * 	<tr><td><br></td><td>own_co_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>th_image_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0390.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0390.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image_flg</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_nm</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_ts_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no_c</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>release_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ITM_SRCH_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("base_itm_nm", "base_itm_nm");
				addColumnPathMap("base_itm_alt_nm1", "base_itm_alt_nm1");
				addColumnPathMap("base_itm_alt_nm2", "base_itm_alt_nm2");
				addColumnPathMap("base_itm_alt_nm3", "base_itm_alt_nm3");
				addColumnPathMap("base_itm_alt_nm4", "base_itm_alt_nm4");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim_unit_nm", "dim_unit_nm");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt_unit_nm", "wt_unit_nm");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_unit_nm", "conts_unit_nm");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("sls_itm_grp_nm", "sls_itm_grp_nm");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("hs_nm", "hs_nm");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1_c", "memo1_c");
				addColumnPathMap("memo2_c", "memo2_c");
				addColumnPathMap("memo3_c", "memo3_c");
				addColumnPathMap("ins_usr_id_c", "ins_usr_id_c");
				addColumnPathMap("ins_usr_nm_c", "ins_usr_nm_c");
				addColumnPathMap("ins_ts_c", "ins_ts_c");
				addColumnPathMap("ins_func_id_c", "ins_func_id_c");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_usr_id_c", "upd_usr_id_c");
				addColumnPathMap("upd_usr_nm_c", "upd_usr_nm_c");
				addColumnPathMap("upd_ts_c", "upd_ts_c");
				addColumnPathMap("upd_func_id_c", "upd_func_id_c");
				addColumnPathMap("upd_srv_req_no_c", "upd_srv_req_no_c");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("itm_jnl_nm", "itm_jnl_nm");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("ac_itm_grp_nm", "ac_itm_grp_nm");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("ship_unit_nm", "ship_unit_nm");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("mfg_unit_nm", "mfg_unit_nm");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("purc_unit_nm", "purc_unit_nm");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pckg_unit_nm", "pckg_unit_nm");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("lot_no_ptn_nm", "lot_no_ptn_nm");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_nm", "sublot_no_ptn_nm");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_role_nm", "mrkt_judg_role_nm");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_nm", "mrkt_judg_upd_role_nm");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno1_ptn_nm", "sno1_ptn_nm");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno2_ptn_nm", "sno2_ptn_nm");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno3_ptn_nm", "sno3_ptn_nm");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("sno4_ptn_nm", "sno4_ptn_nm");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("cntry_org_nm", "cntry_org_nm");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ref_itm_nm", "ref_itm_nm");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("calc_ptn_nm", "calc_ptn_nm");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_usr_nm", "release_usr_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_dest, MAM_ITM_SRCH_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> dest, MCList<MAM_ITM_SRCH_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM_SRCH_R r_src : src){
				mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目マスタ（共通）の登録を行います。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0390.Upd01_CndR up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk02 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd02 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_UpdChk02 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd02 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
			up1 = mcframe.serverMABC.MABCL0390.Upd01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtItmLst_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtItmLst_Upd01();
			chk02 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtItmLst_UpdChk02();
			upd02 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtItmLst_Upd02();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ItmLst)MABCL_ItmLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_Dtl1R createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMABC.MABCL0390.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image_flg</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_only_com_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0390.Upd01_CndR
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmLst)MABCL_ItmLst_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "base_itm_nm");
				addColumnPathMap("itm_alt_nm1", "base_itm_alt_nm1");
				addColumnPathMap("itm_alt_nm2", "base_itm_alt_nm2");
				addColumnPathMap("itm_alt_nm3", "base_itm_alt_nm3");
				addColumnPathMap("itm_alt_nm4", "base_itm_alt_nm4");
				addColumnPathMap("th_image_flg", "th_image_flg");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1", "memo1_c");
				addColumnPathMap("memo2", "memo2_c");
				addColumnPathMap("memo3", "memo3_c");
				addColumnPathMap("upd_cntr", "upd_cntr_c");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src : src){
				mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "base_itm_nm");
				addColumnPathMap("itm_alt_nm1", "base_itm_alt_nm1");
				addColumnPathMap("itm_alt_nm2", "base_itm_alt_nm2");
				addColumnPathMap("itm_alt_nm3", "base_itm_alt_nm3");
				addColumnPathMap("itm_alt_nm4", "base_itm_alt_nm4");
				addColumnPathMap("th_image_flg", "th_image_flg");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1", "memo1_c");
				addColumnPathMap("memo2", "memo2_c");
				addColumnPathMap("memo3", "memo3_c");
				addColumnPathMap("upd_cntr", "upd_cntr_c");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src : src){
				mcframe.serverMABC.MABCL0390.ItmLst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src_Upd01_Dtl1){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src : src){
				mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src : src){
				mcframe.serverMABC.MABCL0390.ItmLst_UpdChk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}