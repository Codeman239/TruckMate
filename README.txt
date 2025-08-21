# TruckMate App Project Outline

Cody Hassey  
TruckMate Project for Mobile Application Development COM-437-OL01

---

## I. Project Outline

### A. Project Description
1. **App Name:** TruckMate  
2. **Purpose:** Connect customers with nearby independent food trucks via real-time location, live menus, and pre-ordering  
3. **Target Audience:** Urban foodies, busy professionals, and food truck entrepreneurs  

### B. Problem Addressing
1. Inefficient manual ordering and lack of visibility into truck location  
2. Customer frustration due to unpredictable wait times  
3. Revenue loss and low customer retention for vendors  

### C. Platform
1. **Primary:** Android (min. API Level 24+)   

### D. Front End / Back End Support
**Front End:**
- Android Studio + Kotlin + Jetpack Compose  
- Responsive UI for phones and tablets  

**Back End:**
- Firebase Authentication & Firestore Realtime Database  
- Cloud Functions for menu/inventory logic  
- Google Maps API for location services  

### E. Functionality
1. User registration/login (email, Google Sign-In)  
2. Real-time GPS map to locate nearby trucks  
3. Live menu with availability and prices  
4. In-app ordering & digital queue management  
5. Push notifications (order status, loyalty rewards)  

### F. Design (Wireframes)
1. Home screen with map & search bar  
2. Truck details screen (menu, ratings, ETA)  
3. Order flow screens (cart → payment → confirmation)  
4. Profile & rewards dashboard  
5. Admin/vendor dashboard wireframe (menu management)  

---

## II. Week 2 – Setup & Firebase Integration

### A. Project Initialization
- Jetpack Compose Android project initialized in Android Studio  
- `MainActivity.kt` created with placeholder “Hello, TruckMate!” greeting  
- Git initialized and repository connected to GitHub:  
  https://github.com/Codeman239/truckmate

### B. Firebase Configuration
- Firebase project created at https://console.firebase.google.com 

- App registered in Firebase console  
- `google-services.json` downloaded and added to `app/` module  
- Firebase tools (Authentication, Firestore) enabled  

### C. Gradle & Build Configuration
- Updated `build.gradle.kts` and `app/build.gradle.kts` to include Firebase and Google Services plugin  
- Verified `settings.gradle.kts` includes `:app`  
- Confirmed `libs.versions.toml` resolves Compose and Firebase dependencies  

### D. GitHub Wiki & Documentation
- Created **GitHub Wiki** for ongoing week-by-week progress  
  View Week 2 Wiki Page: https://github.com/Codeman239/TruckMate/wiki/Week%E2%80%AF2:-TruckMate-Project-Setup-&-Core-Architecture)

### E. Screenshot / Emulator Output
<img width="1537" height="817" alt="Week 2 HelloTruckMate" src="https://github.com/user-attachments/assets/1565f76b-f660-49c3-bfc3-6cdc79dfc20e" />
Screenshot here of emulator showing “Hello, TruckMate!” with Scaffold UI.

---

## III. Weekly Development Plan (Overview)

| Week | Goal                                     | Status   |
|------|------------------------------------------|----------|
| 1    | Project Outline, GitHub Repo Setup       | ✅ Done  |
| 2    | Project Setup, Firebase, Gradle Config   | ✅ Done  |
| 3    | Authentication & Firestore Integration   | ✅ Done  |
| 4    | Map & Location Integration               | ✅ Done  |
| 5    | Live Menu + Ordering Flow                | ✅ Done  |
| 6    | Queue Management + Notifications         | ✅ Done  |
| 7    | UI Polish, Profile & Loyalty Rewards     | ✅ Done  |
| 8    | Final Testing, CI/CD, Deployment         | ✅ Done  |

---

## IV. Week 3 Update – Authentication & Navigation

### Completed Tasks
- **MainActivity.kt**  
  - Set up as the launcher activity  
  - Implemented `setContent {}` with Compose theme  
  - Added state logic to switch between Login and Home screens  

- **LoginScreen.kt**  
  - Created in `com.codyhassey.truckmate.ui.auth`  
  - Email & password `OutlinedTextField` inputs  
  - “Sign In” & “Sign Up” buttons (placeholders for Firebase integration)  

- **HomeScreen.kt**  
  - Created in `com.codyhassey.truckmate.ui.home`  
  - Displays welcome message with user email (placeholder)  
  - “Sign Out” button resets app state  

- **Package Restructure**  
  - Refactored source tree to match `com.codyhassey.truckmate` namespace  
  - Created nested packages:  
    - `ui.auth` (LoginScreen)  
    - `ui.home` (HomeScreen)  

- **Gradle Configuration**  
  - Ensured `namespace = "com.codyhassey.truckmate"` in `app/build.gradle.kts`  
  - Verified Kotlin and Compose dependencies sync without errors  

---

## V. Week 4 Update – TruckMate Android App

### Completed Tasks:

* **Project Package Structure Finalized**

  * Updated and reorganized source directory:

    * `com.codyhassey.truckmate.auth` – handles user login/authentication logic
    * `com.codyhassey.truckmate.home` – contains logic for home screen/dashboard
    * `com.codyhassey.truckmate.ui` – for shared UI components
  * Fixed nested package issue so that new packages now generate properly within the hierarchy (e.g., `auth`, `home`).

* **UI Design and Navigation Implemented**

  * Created `LoginScreen.kt` with form inputs (email/password) and basic login button.
  * Created `HomeScreen.kt` with placeholder content to display user dashboard after login.
  * Setup navigation flow using `MainActivity.kt` as entry point with conditional screen rendering (i.e., shows Login or Home based on state).

* **AndroidManifest.xml Updated**

  * Registered `MainActivity` as the launcher activity.
  * Verified correct application `namespace` and package.

* **Build Files Cleaned**

  * Gradle builds correctly after cleaning up namespace and directory misalignment.

### In Progress:

* Connecting login screen to Firebase for real authentication
* Implementing loading animations for login
* Designing wireframes for future screens (Trips, Fuel Logs, Reports)

---

## VI. Week 5 – Navigation & Authentication

### What’s New
- Integrated AndroidX Navigation Component  
- Added **LoginFragment** & **HomeFragment**  
- Created `nav_graph.xml` to route from Login → Home  
- Updated `MainActivity` to host the NavHostFragment and handle Up navigation  
- Built three layout files under `res/layout/`:
  - `activity_main.xml` (NavHost container)
  - `fragment_login.xml` (username/password + Log In button)
  - `fragment_home.xml` (Welcome message)
- Cleaned up Kotlin‑DSL Gradle (`build.gradle.kts`) to use version‑catalog aliases and added Navigation dependencies
- Renamed project folder from **TruckMate2** → **TruckMate** and updated `settings.gradle.kts`
- Pushed clean slate to GitHub `main` branch (force‑overwrite of previous history)

---

## VII. Week 6 – Firebase Auth & Persistent Login

### What’s New
- **Firebase Authentication** integrated for real email/password sign-in and sign-up  
- **Firestore user profiles** saved on register (UID, email, displayName, photoUrl)  
- **Compose-only UI**: `LoginScreen` and `HomeScreen` replace fragments/XML  
- **Persistent login state** via `SharedPreferences` (“is_logged_in”)  
- **Input validation** and error messaging in `LoginScreen`  
- **Sign Out** button in `HomeScreen` clears session and returns to login

### Installation & Run
1. **Firebase Setup:**  
   - Created a Firebase project named **TruckMate**  
   - Registered Android app with package `com.codyhassey.truckmate`  
   - Downloaded `google-services.json` → place in `app/` folder  
2. **Gradle Plugins & Dependencies:**  
   - Project-level `build.gradle.kts`:
     plugins {
       id("com.google.gms.google-services") version "4.3.15" apply false
     }
     ```
   - App-module `build.gradle.kts`:
     plugins {
       alias(libs.plugins.android.application)
       alias(libs.plugins.kotlin.android)
       alias(libs.plugins.kotlin.compose)
       id("com.google.gms.google-services")
     }
     dependencies {
       implementation("com.google.firebase:firebase-auth-ktx:22.1.0")
       implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
     }
     ```


## VIII. Week 7 – Navigation Compose, Truck List & Real-Time Data

### What’s New
- Replaced any remaining XML/nav-graph navigation with **Jetpack Navigation Compose**.  
- Added **Truck List** screen (displays list of trucks from Firestore).  
- Added **Truck Detail** screen (view/edit truck details).  
- Implemented **real-time listeners** using Firestore to auto-update list/details.  
- Added a simple **Settings** screen (user preferences saved to `SharedPreferences`).  
- Small UI polish: improved Compose theming and consistent paddings/typography.  
- Added README & Wiki updates and a changelog entry.

---
### Dependencies Added
Make sure `app/build.gradle.kts` contains these lines:

// Navigation Compose
implementation("androidx.navigation:navigation-compose:2.7.0")

// Firestore (real-time)
implementation("com.google.firebase:firebase-firestore-ktx:24.7.0")
________________________________________
UX Notes & How Navigation Works
•	MainActivity now sets up a Compose NavHost and defines routes such as:
o	auth/login
o	home
o	trucks/list
o	trucks/detail/{truckId}
o	settings
•	Navigation actions are simple string routes and navController.navigate(...) is used to move between screens.
•	TruckDetailScreen accepts a truckId argument; the TruckRepository exposes a Flow/LiveData/callback that feeds Compose state.
________________________________________
Persistence & Settings
•	Small settings (e.g., showOfflineData, darkMode, autoSync) saved to SharedPreferences: truckmate_prefs.
•	Settings screen writes prefs and emits a small UI feedback (Toast/Snackbar).

---

## IX. Week 8 – Offline Caching, Background Sync, Maps & Tests

### What’s New
- **Offline caching** for trucks using **Room** (local DB) so the app shows last-known data when offline.  
- **Background sync** of new/edited data using **WorkManager** to push local changes to Firestore when connectivity returns.  
- **Auth route guards** so certain screens require a signed-in user.  
- **Map integration** (Google Maps) to display truck locations on a map screen.  
- **Basic tests** added: unit tests for repository logic and an instrumentation UI test for the login → truck list flow.  

---

### Gradle / Dependencies

**Project-level**: no special changes beyond existing Google Services.

**App-module (`app/build.gradle.kts`)** — add:

```kotlin
// Room
implementation("androidx.room:room-runtime:2.6.1")
kapt("androidx.room:room-compiler:2.6.1")
implementation("androidx.room:room-ktx:2.6.1")

// WorkManager
implementation("androidx.work:work-runtime-ktx:2.8.1")

// Google Maps
implementation("com.google.android.gms:play-services-maps:18.1.0")

// Jetpack Test deps (for unit & instrumentation)
testImplementation("junit:junit:4.13.2")
androidTestImplementation("androidx.test.ext:junit:1.1.5")
androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

```

Quick Setup Steps (high-level)

Add dependencies above, then Sync Project.

Implement Room:
Create TruckEntity mirroring your Truck model (id, name, status, location, lastSeen).
Add TruckDao with methods: getAll(), insert(truck), update(truck), delete(truck).
Create TruckDatabase with abstract fun truckDao(): TruckDao.

Update TruckRepository:
On Firestore snapshot updates, write data into Room (cache).
When offline, read from Room and expose Flow/StateFlow to UI.
Queue local edits in Room (or a local "outbox" table) for later sync.

WorkManager Sync:
Create SyncWorker that reads queued edits and pushes them to Firestore; on success, clear the queue.
Enqueue periodic or connectivity-triggered work (e.g., OneTimeWorkRequest on network restored).

Map Integration:
Obtain a Google Maps API key (Google Cloud Console).

Add to AndroidManifest.xml:
    android:name="com.google.android.geo.API_KEY"
    android:value="YOUR_API_KEY_HERE"/>

Add TruckMapScreen.kt which uses com.google.maps.android.compose or the Maps Compose utilities to show markers from your trucks list.

Auth Guards:
Gate navigation: if FirebaseAuth.getInstance().currentUser == null, route to Login; otherwise to protected NavGraph.

Testing:
Add unit tests for TruckRepository (use kotlinx-coroutines-test + fake Firestore or mocking).
Add at least one instrumentation test that launches the activity, logs in with a test user, and asserts that the Truck List appears.

## X. Repo Links

- **GitHub Repository:** https://github.com/Codeman239/truckmate  
- **GitHub Wiki:** https://github.com/Codeman239/truckmate/wiki