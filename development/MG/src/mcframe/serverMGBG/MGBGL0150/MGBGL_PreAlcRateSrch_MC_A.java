package mcframe.serverMGBG.MGBGL0150;

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
 * "MGBGL_PreAlcRateSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_PreAlcRateSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGL0150";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_PreAlcRateSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBGL0150_Srch01_INFO;
		this.aSrch01 = ((MGBGL_PreAlcRateSrch)this).new Srch01();
	}

	public static MGBGL_PreAlcRateSrch.Srch01 crtSrch01() {
		MGBGL_PreAlcRateSrch lgc = new MGBGL_PreAlcRateSrch();
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
	public mcframe.serverMGBG.MGBGL0150.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBG.MGBGL0150.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0150.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBG.MGBGL0150.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0150.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0150.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final mcframe.serverMGBG.MGBGL0150.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0150.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0150.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0150.Srch01_RsltR.class);

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
			invoke((MGBGL_PreAlcRateSrch)MGBGL_PreAlcRateSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0150.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBG.MGBGL0150.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0150.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBG.MGBGL0150.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0150.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0150.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>typ</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>pln_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0150.Srch01_CndR
		 */
		public mcframe.serverMGBG.MGBGL0150.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term00</td></tr>
		 * 	<tr><td><br></td><td>term01</td></tr>
		 * 	<tr><td><br></td><td>term02</td></tr>
		 * 	<tr><td><br></td><td>term03</td></tr>
		 * 	<tr><td><br></td><td>term04</td></tr>
		 * 	<tr><td><br></td><td>pln00</td></tr>
		 * 	<tr><td><br></td><td>pln01</td></tr>
		 * 	<tr><td><br></td><td>pln02</td></tr>
		 * 	<tr><td><br></td><td>pln03</td></tr>
		 * 	<tr><td><br></td><td>pln04</td></tr>
		 * 	<tr><td><br></td><td>pln05</td></tr>
		 * 	<tr><td><br></td><td>pln06</td></tr>
		 * 	<tr><td><br></td><td>pln07</td></tr>
		 * 	<tr><td><br></td><td>pln08</td></tr>
		 * 	<tr><td><br></td><td>pln09</td></tr>
		 * 	<tr><td><br></td><td>pln10</td></tr>
		 * 	<tr><td><br></td><td>pln11</td></tr>
		 * 	<tr><td><br></td><td>pln12</td></tr>
		 * 	<tr><td><br></td><td>pln13</td></tr>
		 * 	<tr><td><br></td><td>pln14</td></tr>
		 * 	<tr><td><br></td><td>pln15</td></tr>
		 * 	<tr><td><br></td><td>pln16</td></tr>
		 * 	<tr><td><br></td><td>pln17</td></tr>
		 * 	<tr><td><br></td><td>pln18</td></tr>
		 * 	<tr><td><br></td><td>pln19</td></tr>
		 * 	<tr><td><br></td><td>pln20</td></tr>
		 * 	<tr><td><br></td><td>pln21</td></tr>
		 * 	<tr><td><br></td><td>pln22</td></tr>
		 * 	<tr><td><br></td><td>pln23</td></tr>
		 * 	<tr><td><br></td><td>pln24</td></tr>
		 * 	<tr><td><br></td><td>pln25</td></tr>
		 * 	<tr><td><br></td><td>pln26</td></tr>
		 * 	<tr><td><br></td><td>pln27</td></tr>
		 * 	<tr><td><br></td><td>pln28</td></tr>
		 * 	<tr><td><br></td><td>pln29</td></tr>
		 * 	<tr><td><br></td><td>pln30</td></tr>
		 * 	<tr><td><br></td><td>pln31</td></tr>
		 * 	<tr><td><br></td><td>pln32</td></tr>
		 * 	<tr><td><br></td><td>pln33</td></tr>
		 * 	<tr><td><br></td><td>pln34</td></tr>
		 * 	<tr><td><br></td><td>pln35</td></tr>
		 * 	<tr><td><br></td><td>pln36</td></tr>
		 * 	<tr><td><br></td><td>pln37</td></tr>
		 * 	<tr><td><br></td><td>pln38</td></tr>
		 * 	<tr><td><br></td><td>pln39</td></tr>
		 * 	<tr><td><br></td><td>pln40</td></tr>
		 * 	<tr><td><br></td><td>pln41</td></tr>
		 * 	<tr><td><br></td><td>pln42</td></tr>
		 * 	<tr><td><br></td><td>pln43</td></tr>
		 * 	<tr><td><br></td><td>pln44</td></tr>
		 * 	<tr><td><br></td><td>pln45</td></tr>
		 * 	<tr><td><br></td><td>pln46</td></tr>
		 * 	<tr><td><br></td><td>pln47</td></tr>
		 * 	<tr><td><br></td><td>pln48</td></tr>
		 * 	<tr><td><br></td><td>pln49</td></tr>
		 * 	<tr><td><br></td><td>pln50</td></tr>
		 * 	<tr><td><br></td><td>pln51</td></tr>
		 * 	<tr><td><br></td><td>pln52</td></tr>
		 * 	<tr><td><br></td><td>pln53</td></tr>
		 * 	<tr><td><br></td><td>pln54</td></tr>
		 * 	<tr><td><br></td><td>pln55</td></tr>
		 * 	<tr><td><br></td><td>pln56</td></tr>
		 * 	<tr><td><br></td><td>pln57</td></tr>
		 * 	<tr><td><br></td><td>pln58</td></tr>
		 * 	<tr><td><br></td><td>pln59</td></tr>
		 * 	<tr><td><br></td><td>act00</td></tr>
		 * 	<tr><td><br></td><td>act01</td></tr>
		 * 	<tr><td><br></td><td>act02</td></tr>
		 * 	<tr><td><br></td><td>act03</td></tr>
		 * 	<tr><td><br></td><td>act04</td></tr>
		 * 	<tr><td><br></td><td>act05</td></tr>
		 * 	<tr><td><br></td><td>act06</td></tr>
		 * 	<tr><td><br></td><td>act07</td></tr>
		 * 	<tr><td><br></td><td>act08</td></tr>
		 * 	<tr><td><br></td><td>act09</td></tr>
		 * 	<tr><td><br></td><td>act10</td></tr>
		 * 	<tr><td><br></td><td>act11</td></tr>
		 * 	<tr><td><br></td><td>act12</td></tr>
		 * 	<tr><td><br></td><td>act13</td></tr>
		 * 	<tr><td><br></td><td>act14</td></tr>
		 * 	<tr><td><br></td><td>act15</td></tr>
		 * 	<tr><td><br></td><td>act16</td></tr>
		 * 	<tr><td><br></td><td>act17</td></tr>
		 * 	<tr><td><br></td><td>act18</td></tr>
		 * 	<tr><td><br></td><td>act19</td></tr>
		 * 	<tr><td><br></td><td>act20</td></tr>
		 * 	<tr><td><br></td><td>act21</td></tr>
		 * 	<tr><td><br></td><td>act22</td></tr>
		 * 	<tr><td><br></td><td>act23</td></tr>
		 * 	<tr><td><br></td><td>act24</td></tr>
		 * 	<tr><td><br></td><td>act25</td></tr>
		 * 	<tr><td><br></td><td>act26</td></tr>
		 * 	<tr><td><br></td><td>act27</td></tr>
		 * 	<tr><td><br></td><td>act28</td></tr>
		 * 	<tr><td><br></td><td>act29</td></tr>
		 * 	<tr><td><br></td><td>act30</td></tr>
		 * 	<tr><td><br></td><td>act31</td></tr>
		 * 	<tr><td><br></td><td>act32</td></tr>
		 * 	<tr><td><br></td><td>act33</td></tr>
		 * 	<tr><td><br></td><td>act34</td></tr>
		 * 	<tr><td><br></td><td>act35</td></tr>
		 * 	<tr><td><br></td><td>act36</td></tr>
		 * 	<tr><td><br></td><td>act37</td></tr>
		 * 	<tr><td><br></td><td>act38</td></tr>
		 * 	<tr><td><br></td><td>act39</td></tr>
		 * 	<tr><td><br></td><td>act40</td></tr>
		 * 	<tr><td><br></td><td>act41</td></tr>
		 * 	<tr><td><br></td><td>act42</td></tr>
		 * 	<tr><td><br></td><td>act43</td></tr>
		 * 	<tr><td><br></td><td>act44</td></tr>
		 * 	<tr><td><br></td><td>act45</td></tr>
		 * 	<tr><td><br></td><td>act46</td></tr>
		 * 	<tr><td><br></td><td>act47</td></tr>
		 * 	<tr><td><br></td><td>act48</td></tr>
		 * 	<tr><td><br></td><td>act49</td></tr>
		 * 	<tr><td><br></td><td>act50</td></tr>
		 * 	<tr><td><br></td><td>act51</td></tr>
		 * 	<tr><td><br></td><td>act52</td></tr>
		 * 	<tr><td><br></td><td>act53</td></tr>
		 * 	<tr><td><br></td><td>act54</td></tr>
		 * 	<tr><td><br></td><td>act55</td></tr>
		 * 	<tr><td><br></td><td>act56</td></tr>
		 * 	<tr><td><br></td><td>act57</td></tr>
		 * 	<tr><td><br></td><td>act58</td></tr>
		 * 	<tr><td><br></td><td>act59</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBG.MGBGL0150.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PreAlcRateSrch)MGBGL_PreAlcRateSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}